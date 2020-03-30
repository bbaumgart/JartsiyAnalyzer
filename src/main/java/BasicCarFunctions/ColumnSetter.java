package BasicCarFunctions;

import DailyDellCARPulsReport.ListToDailyDellCARPuls;
import FILES.FileOwnerMatrix;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

import static FilesReaders.DataBaseFromFiles.ownerMatrixMap;


public class ColumnSetter {
    private static final Logger LOG = LogManager.getLogger();

    public static String setColumnStatus(ListToDailyDellCARPuls StatusColumn) {

        String Status = "";

        if (StatusColumn.getHold_Status().equals("Released")) {
            Status = ("Repair WIP");
        }
// totaj ustawiam miss między DCR a WIP ->
        if (StatusColumn.getHold_Status().equals("")
                && !StatusColumn.getUnit_Arrival_To_Depot_Date().equals("")
                && StatusColumn.getShip_Date().equals("")
                && !StatusColumn.getCountry().equals("Switzerland")
        ) {
            Status = ("Repair WIP");
        }
        if (StatusColumn.getHold_Status().equals("")
                && !StatusColumn.getUnit_Arrival_To_Depot_Date().equals("")
                && StatusColumn.getShip_Date().equals("")
                && StatusColumn.getCountry().equals("Switzerland")
        ) {
            Status = ("Shipped To Customer");
        }
        if (StatusColumn.getStorage_Hold_Code().equals("Awaiting Part")
        ) {
            Status = ("Awaiting Parts");
        }
        if (StatusColumn.getStorage_Hold_Code().equals("Warranty Issue")
        ) {
            Status = ("Billable hold");
        }
        if (StatusColumn.getStorage_Hold_Code().equals("Awaiting Engineering")
        ) {
            Status = ("Engineering");
        }
        if (StatusColumn.getStorage_Hold_Code_Desc().equals("NFF")
        ) {
            Status = ("No foult found");
        }
        if (!StatusColumn.getStorage_Hold_Code_Desc().equals("NFF")
                && StatusColumn.getStorage_Hold_Code().equals("Customer")
        ) {
            Status = ("Customer input");
        }
        if (StatusColumn.getOrder_Status_DCR().equals("Released")
                && StatusColumn.getUnit_Arrival_To_Depot_Date().equals("")
                && StatusColumn.getHold_Status().equals("")
        ) {
            Status = ("Inbound");
        }
        if (StatusColumn.getOrder_Status_DCR().equals("Firm")
                && StatusColumn.getUnit_Arrival_To_Depot_Date().equals("")
                && StatusColumn.getHold_Status().equals("")
        ) {
            Status = ("Inbound");
        }
        if (!StatusColumn.getShip_Date().equals("")
                && StatusColumn.getPOD_Date().equals("")
                && !StatusColumn.getOrder_Status_DCR().equals("Cancelled")
        ) {
            Status = ("Shipped To Customer");
        }
        if (StatusColumn.getExceptionCode().equals("CNL - Cancelled Call")
                && StatusColumn.getHold_Status().equals("")
                && !StatusColumn.getOrder_Status_DCR().equals("Complete")
        ) {
            Status = ("Cancellation requested");
        }
        if (StatusColumn.getPOD_Date().equals("")
                && StatusColumn.getOrder_Status_DCR().equals("Cancelled")
                && !StatusColumn.getShip_Date().equals("")
        ) {
            Status = ("Closed in Ivy but not in Dell");
        }
        if (!StatusColumn.getPOD_Date().equals("")
                && StatusColumn.getOrder_Status_DCR().equals("Complete")
        ) {
            Status = ("Closed in Ivy but not in Dell");
        }
        return Status;
    }

    public static String setColumnsubStatus(ListToDailyDellCARPuls StatusColumn) {
        String subStatus = "";

        try {
            if (StatusColumn.getStatus().equals("Engineering")
                    || StatusColumn.getStatus().equals("Customer input")
                    || StatusColumn.getStatus().equals("No foult found")
                    || StatusColumn.getStatus().equals("Billable hold"))
            // jezeli status jest nulem to wstaw puste
            {
                subStatus = StatusColumn.getStorage_Hold_Code_Desc();
            }
            if (StatusColumn.getStatus().equals("Repair WIP")) {
                if (StatusColumn.getDestination_Workcenter().equals("")
                        && StatusColumn.getCurrent_Workcenter().equals("")
                        && StatusColumn.getCountry().equals("Switzerland")
                ) {
                    subStatus = "In transit from Swiss";
                } else if (StatusColumn.getDestination_Workcenter().equals("")
                        && StatusColumn.getCurrent_Workcenter().equals("")) {
                    subStatus = "ERWC";

                } else if (StatusColumn.getDestination_Workcenter().equals("")) {
                    subStatus = StatusColumn.getCurrent_Workcenter();
                } else subStatus = StatusColumn.getDestination_Workcenter();
            }
            if (StatusColumn.getStatus().equals("Shipped To Customer")
                    && StatusColumn.getCountry().equals("Switzerland")
            ) {
                subStatus = " In transit to Swiss/ unit is on the way to Customer for a " + TatCalculateNetworkDays.RepairAging(StatusColumn.getShip_Date()) + " days";

            } else if (StatusColumn.getStatus().equals("Shipped To Customer")
                    && !StatusColumn.getCountry().equals("Switzerland")
            ) {
                subStatus = " Repair closed/ unit is on the way to Customer for a " + TatCalculateNetworkDays.RepairAging(StatusColumn.getShip_Date()) + " days";
            }
            if (StatusColumn.getExceptionCode().equals("LIT - Lost In Transit")
                    && StatusColumn.getStatus().equals("Inbound")) {
                subStatus = "Lost in Transit";
            }

        } catch (Exception e) {
            subStatus = "";
            LOG.warn("setColumnsubStatus" + e);
        }
        return subStatus;
    }

    public static String setOwner(ListToDailyDellCARPuls StatusColumn) {
//        try {

        Map<String, FileOwnerMatrix> OwnerMatrixMap = new HashMap<>(ownerMatrixMap);
        String owner = "no owner";
        if (StatusColumn.getStatus().equals("Repair WIP")) {
            owner = "Jakub.Chmara@ivytech.com";
        } else if (StatusColumn.getStatus().equals("Billable hold")
                && StatusColumn.getProcessType().startsWith("PILOT")
                && !StatusColumn.getIncident_Number().startsWith("BER")) {
            owner = "Monika.Wilczek@ivytech.com";
        } else if (StatusColumn.getStatus().equals("Billable hold")
                && StatusColumn.getProcessType().startsWith("PILOT")
                && StatusColumn.getIncident_Number().startsWith("BER")) {
            owner = OwnerMatrixMap.get(StatusColumn.getActivity_Creator_Group() + StatusColumn.getWarranty2()).getPOC();
        } else if (StatusColumn.getStatus().equals("Billable hold")
                && OwnerMatrixMap.get(StatusColumn.getActivity_Creator_Group() + StatusColumn.getWarranty2()) != null
                && !StatusColumn.getProcessType().startsWith("PILOT")) {
            owner = OwnerMatrixMap.get(StatusColumn.getActivity_Creator_Group() + StatusColumn.getWarranty2()).getPOC();
        } else if (StatusColumn.getStatus().equals("Billable hold")
                && OwnerMatrixMap.get(StatusColumn.getActivity_Creator_Group() + StatusColumn.getWarranty2()) == null
                && !StatusColumn.getProcessType().startsWith("PILOT")) {
            owner = "Check Owner Manually";
        } else if (StatusColumn.getStatus().equals("Engineering")
                && StatusColumn.getStorage_Hold_Code_Desc().equals("DOA")) {
            owner = "Andrzej_Staporek@DELL.com";
        } else if (StatusColumn.getStatus().equals("Engineering")
                && StatusColumn.getStorage_Hold_Code_Desc().equals("EGH")) {
            owner = "Remigiusz.Zerbst@ivytech.com";
        } else if (StatusColumn.getStatus().equals("Engineering")
                && StatusColumn.getStorage_Hold_Code_Desc().equals("QA")) {
            owner = "Remigiusz.Zerbst@ivytech.com";
        } else if (StatusColumn.getStatus().equals("Engineering")
                && StatusColumn.getStorage_Hold_Code_Desc().equals("OPS")) {
            owner = "Jakub.Chmara@ivytech.com";
        } else if (StatusColumn.getStatus().equals("Customer input")
                && StatusColumn.getStorage_Hold_Code_Desc().equals("ADM")) {
            owner = "Monika.Wilczek@ivytech.com";
        } else if (StatusColumn.getStatus().equals("No foult found")) {
            owner = "Monika.Wilczek@ivytech.com";
//            dodaś warunek o tym, ze jest fusion
//        } else if (StatusColumn.getStatus().equals("Customer input")
//                && OwnerMatrixMap.get(StatusColumn.getActivity_Creator_Group()+StatusColumn.getWarranty2())!=null
//                && !StatusColumn.getProcessType().startsWith("DEPO")
//                && StatusColumn.getStorage_Hold_Code_Desc().equals("NFF")
//                || StatusColumn.getStorage_Hold_Code_Desc().equals("ADM")) {
//            owner = "Jakub.Chmara@ivytech.com";
        } else if (StatusColumn.getStatus().equals("Inbound")) {
            owner = "Monika.Wilczek@ivytech.com";
        } else if (StatusColumn.getStatus().equals("Customer input")
                && StatusColumn.getStorage_Hold_Code_Desc().equals("MBR")) {
            owner = "Jakub.Chmara@ivytech.com";

        } else if (StatusColumn.getStatus().equals("Shipped To Customer")) {
            owner = "Monika.Wilczek@ivytech.com";
        } else if (StatusColumn.getStatus().equals("Awaiting Parts")) {
            owner = "Stephen.Benn@dell.com";
        } else if (StatusColumn.getStatus().equals("Cancellation requested")) {
            owner = "Magdalena.Bonczyk@dell.com";
        } else if (StatusColumn.getStatus().equals("Closed in Ivy but not in Dell")) {
            owner = "Bartosz.Baumgart@dell.com";
        }
        return owner;
//        }catch (Exception e){
//            System.out.println("set owner : "+e);
//            System.out.println("set owner : "+StatusColumn.);
//            return "";
//            }

    }

    public static String setOverdueFlag(ListToDailyDellCARPuls StatusColumn) {
        String Out_of_SLA_Flag = "0";

        if (Double.parseDouble(StatusColumn.getAging_OCB()) >= 12 && StatusColumn.getWarranty().equals("IW")
        ) {
            Out_of_SLA_Flag = "1";
        }
        if (Double.parseDouble(StatusColumn.getAging_OCB()) >= 15 && StatusColumn.getWarranty().equals("OOW")
        ) {
            Out_of_SLA_Flag = "1";
        }
        if (Double.parseDouble(StatusColumn.getAging_OCB()) >= 15 && StatusColumn.getWarranty().equals("OOP")
        ) {
            Out_of_SLA_Flag = "1";
        }
        if (Double.parseDouble(StatusColumn.getAging_OCB()) >= 5 && StatusColumn.getWarranty().equals("ARC Laptop")) {
            Out_of_SLA_Flag = "1";
        }
        if (Double.parseDouble(StatusColumn.getAging_OCB()) >= 7 && StatusColumn.getWarranty().equals("ARC Desktop")) {
            Out_of_SLA_Flag = "1";
        }
        return Out_of_SLA_Flag;
    }

    public static String setOverdueFlagGCC(ListToDailyDellCARPuls StatusColumn) {
        String Out_of_SLA_Flag_GCC = "0";

        if (Double.parseDouble(StatusColumn.getAging_OCB()) >= 11 && StatusColumn.getWarranty().equals("IW")
        ) {
            Out_of_SLA_Flag_GCC = "1";
        }
        if (Double.parseDouble(StatusColumn.getAging_OCB()) >= 14 && StatusColumn.getWarranty().equals("OOW")
        ) {
            Out_of_SLA_Flag_GCC = "1";
        }
        if (Double.parseDouble(StatusColumn.getAging_OCB()) >= 14 && StatusColumn.getWarranty().equals("OOP")
        ) {
            Out_of_SLA_Flag_GCC = "1";
        }
        if (Double.parseDouble(StatusColumn.getAging_OCB()) >= 4 && StatusColumn.getWarranty().equals("ARC Laptop")) {
            Out_of_SLA_Flag_GCC = "1";
        }
        if (Double.parseDouble(StatusColumn.getAging_OCB()) >= 6 && StatusColumn.getWarranty().equals("ARC Desktop")) {
            Out_of_SLA_Flag_GCC = "1";
        }
        return Out_of_SLA_Flag_GCC;
    }

    public static String setOCBBacklogBreakdown(ListToDailyDellCARPuls StatusColumn) {
        String OCBBacklogBreakdown = "";
        try {
            if (StatusColumn.getStatus().equals("Shipped To Customer")
                    || StatusColumn.getStatus().equals("Closed in Ivy but not in Dell")) {
                OCBBacklogBreakdown = "Outbound OCB";
            } else OCBBacklogBreakdown = "Remaining OCB";

        } catch (Exception e) {
            LOG.warn("setOCBBacklogBreakdown" + e);
        }

        return OCBBacklogBreakdown;
    }

    public static String setOCBBreakdown(ListToDailyDellCARPuls StatusColumn) {
        String OCBBreakdown = "";
        try {
            if (StatusColumn.getStatus().equals("Billable hold")
                    || StatusColumn.getStatus().equals("Engineering")
                    || StatusColumn.getStatus().equals("Awaiting Parts")
                    || StatusColumn.getStatus().equals("No foult found")
                    || StatusColumn.getStatus().equals("Customer input")) {
                OCBBreakdown = "Hold (in house)";
            } else if (StatusColumn.getStatus().equals("Repair WIP")) {
                OCBBreakdown = "Repair / WIP";
            } else if (StatusColumn.getStatus().equals("Shipped To Customer")
                    || StatusColumn.getStatus().equals("Closed in Ivy but not in Dell")) {
                OCBBreakdown = "Outbound OCB";
            } else OCBBreakdown = "Hold (external)";

        } catch (Exception e) {
            LOG.warn("setOCBBacklogBreakdown" + e);
        }

        return OCBBreakdown;
    }

    public static String setDaysOverSLA(ListToDailyDellCARPuls StatusColumn) {
        int DaysOverSLA = 0;

        if (StatusColumn.getWarranty().equals("IW")) {
            DaysOverSLA = Integer.parseInt(StatusColumn.getAging_OCB()) - Integer.parseInt("12");
            if (DaysOverSLA < 0) {
                DaysOverSLA = 0;
            }
        } else if (StatusColumn.getWarranty().equals("OOW") || StatusColumn.getWarranty().equals("OOP")) {
            DaysOverSLA = Integer.parseInt(StatusColumn.getAging_OCB()) - Integer.parseInt("15");
            if (DaysOverSLA < 0) {
                DaysOverSLA = 0;
            }
        } else if (StatusColumn.getWarranty().equals("ARC Laptop")) {
            DaysOverSLA = Integer.parseInt(StatusColumn.getAging_OCB()) - Integer.parseInt("5");
            if (DaysOverSLA < 0) {
                DaysOverSLA = 0;
            }
        } else if (StatusColumn.getWarranty().equals("ARC Desktop")) {
            DaysOverSLA = Integer.parseInt(StatusColumn.getAging_OCB()) - Integer.parseInt("7");
            if (DaysOverSLA < 0) {
                DaysOverSLA = 0;
            }
        } else {
            DaysOverSLA = 9999;
        }
        return String.valueOf(DaysOverSLA);
    }

    public static String setOwner2(ListToDailyDellCARPuls StatusColumn) {

        String owner2 = "no owner";

        if (StatusColumn.getStatus().equals("Repair WIP")) {
            owner2 = "Jakub.Chmara@ivytech.com & Remigiusz.Sawicki@ivytech.com";
        } else if (StatusColumn.getStatus().equals("Billable hold")
                && StatusColumn.getWarranty2().equals("OOW")) {
            owner2 = "Mike_Sheehy@dell.com & Stephen_Naughton@dell.com";
        } else if (StatusColumn.getStatus().equals("Billable hold")
                && StatusColumn.getWarranty2().equals("IW")) {
            owner2 = "Nasser_Benkraine@dell.com & Masetti_Massimillano@dell.com";
        } else if (StatusColumn.getStatus().equals("Awaiting Parts")
                && StatusColumn.getWarranty2().equals("IW")) {
            owner2 = "Stephen_Benn@dell.com  & Ger_Carey@dell.com ";
        } else if (StatusColumn.getStatus().equals("Awaiting Parts")
                && StatusColumn.getWarranty2().equals("OOW")) {
            owner2 = "Neeraj_Chawla@Dell.com & Erik_Parsons@Dell.com";
        } else if (StatusColumn.getStatus().equals("Engineering")) {
            owner2 = "Andrzej_Staporek@dell.com & Ray_Lopez@dell.com ";
        } else {
            owner2 = "Monika.Wilczek@ivytech.com ";
        }
        return owner2;
    }

    public static String setAgingBacket(String Aging, String DPS_Number) {
        String AgingBucket = "";
        if (Double.parseDouble(Aging) > 12.5) {
            AgingBucket = ("13+");
        } else if ((Double.parseDouble(Aging) < 12.5)
                && (Double.parseDouble(Aging) > 8.5)) {
            AgingBucket = ("9-12");
        } else if ((Double.parseDouble(Aging) < 8.5)
                && (Double.parseDouble(Aging) > 7.5)) {
            AgingBucket = ("8");
        } else if ((Double.parseDouble(Aging) < 7.5)
                && (Double.parseDouble(Aging) > 4.5)) {
            AgingBucket = ("5-7");
        } else if ((Double.parseDouble(Aging) < 4.5)
                && (Double.parseDouble(Aging) > 2.5)) {
            AgingBucket = ("3-5");
        } else if ((Double.parseDouble(Aging) < 2.5)
                && (Double.parseDouble(Aging) > 0.0)) {
            AgingBucket = ("0-2");
        }
        return AgingBucket;
    }



}
