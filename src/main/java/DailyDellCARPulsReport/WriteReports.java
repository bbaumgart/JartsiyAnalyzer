package DailyDellCARPulsReport;

import BasicCarFunctions.CleanSheetAndWriteData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import static FilesReaders.Reads_excel_from_cloud.pulsReport;

public class WriteReports {

    private static final Logger LOG = LogManager.getLogger();

    public static void updateGccList(Map<String, ListToDailyDellCARPuls> listToDailyDellCARPulsMap) {

        try {
            Map<String, ListToDailyDellCARPuls> GCC_list_map = listToDailyDellCARPulsMap
                    .entrySet()
                    .stream()
                    .filter(x -> "1".equals(x.getValue().getOut_of_SLA_Flag())
                            && x.getValue().getPOD_Date().equals("")
                            && !x.getValue().getOrder_Status_DCR().equals("Cancelled")
                            && !(x.getValue().getDeliveryTracking().contains("DPS"))
                            && !(x.getValue().getDeliveryTracking().contains("dps"))
                            && !(x.getValue().getDeliveryTracking().contains("naprawy")))
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

            Map<String, Object[]> GCC_list = new TreeMap<>();
            for (Map.Entry<String, ListToDailyDellCARPuls> u : GCC_list_map.entrySet()) {

                GCC_list.put("0", new Object[]{
                        "DPS Number", "Service_Tag", "Service_Request_Number", "Country", "Process", "Warranty", "Activity_Creator_Group", "Location", "Aging_OCB",
                        "Status", "Sub_status", "Historic_iQor", "Owner", "Owner2", "Last_Update", "Incident_Number", "InvtoryNotes", "ADDITIONAL_INFORMATION",
                        "DaysOnCurrentHold", "Delivery Tracking"
                });
                GCC_list.put(u.getKey(), new Object[]{
                        u.getValue().getDPS_Number(),
                        u.getValue().getService_Tag(),
                        u.getValue().getService_Request_Number(),
                        u.getValue().getCountry(),
                        u.getValue().getWarranty(),
                        u.getValue().getWarranty2(),
                        u.getValue().getActivity_Creator_Group(),
                        u.getValue().getLocation(),
                        Integer.valueOf(u.getValue().getAging_OCB()),
                        u.getValue().getStatus(),
                        u.getValue().getSub_status(),
                        u.getValue().getHistoric_iQor(),
                        u.getValue().getOwner(),
                        u.getValue().getOwner2(),
                        u.getValue().getLast_Update(),
                        u.getValue().getIncident_Number(),
                        u.getValue().getInvtoryNotes(),
                        u.getValue().getADDITIONAL_INFORMATION(),
                        u.getValue().getDaysOnCurrentHold(),
                        u.getValue().getDeliveryTracking()
                });
            }
            CleanSheetAndWriteData.cleanAdnWrite(GCC_list, "GCC list", pulsReport + "Daily Dell CAR Puls Report.xlsx");
        } catch (Exception e) {
            LOG.error("Check GCC save List in exel :" + e);
        }
    }

    public static void updateListToDailyDellCARPuls(Map<String, ListToDailyDellCARPuls> listToDailyDellCARPulsMap) {

        try {
            Map<String, ListToDailyDellCARPuls> appOpenOrdersMap = listToDailyDellCARPulsMap
                    .entrySet()
                    .stream()
                    .filter(x -> x.getValue().getPOD_Date().equals("")
                            && !x.getValue().getOrder_Status_DCR().equals("Cancelled")
                            && !(x.getValue().getDeliveryTracking().contains("DPS"))
                            && !(x.getValue().getDeliveryTracking().contains("dps"))
                            && !(x.getValue().getDeliveryTracking().contains("naprawy")))
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

            Map<String, Object[]> dataListToDailyDellCARPuls = new TreeMap<>();
            for (Map.Entry<String, ListToDailyDellCARPuls> u : appOpenOrdersMap.entrySet()) {
                dataListToDailyDellCARPuls.put("0", new Object[]{
                        "DPS_Number", "Service_Tag", "Country", "Warranty", "Call_Type", "Status", "Sub_Status",
                        "Aging_OCB", "Aging_Backet", "Out_of_SLA_Flag", "DPS_Created_Date_By_DCR", "Unit_Arrival_To_Depot_Date",
                        "Ship_Date", "POD_Date", "Order_Status_DCR", "Hold_Status", "Exception_Code", "Location", "OCB backlog breakdown", "OCB breakdown",
                        "DaysOverSLA", "Days On Holds", "Biggest contributor of delay (with Age)"
                });
                dataListToDailyDellCARPuls.put(u.getKey(), new Object[]{

                        u.getValue().getDPS_Number(),
                        u.getValue().getService_Tag(),
                        u.getValue().getCountry(),
                        u.getValue().getWarranty(),
                        u.getValue().getCall_Type(),
                        u.getValue().getStatus(),
                        u.getValue().getSub_status(),
                        Integer.valueOf(u.getValue().getAging_OCB()),
                        u.getValue().getAging_Bucket(),
                        Integer.valueOf(u.getValue().getOut_of_SLA_Flag()),
                        u.getValue().getDPS_Created_Date_By_DCR(),
                        u.getValue().getUnit_Arrival_To_Depot_Date(),
                        u.getValue().getShip_Date(),
                        u.getValue().getPOD_Date(),
                        u.getValue().getOrder_Status_DCR(),
                        u.getValue().getHold_Status(),
                        u.getValue().getExceptionCode(),
                        u.getValue().getLocation(),
                        u.getValue().getOCB_backlog_breakdown(),
                        u.getValue().getOCB_breakdown(),
                        Integer.valueOf(u.getValue().getDaysOverSLA()),
                        u.getValue().getHoldDaysTotal(),
                        u.getValue().getBiggestContributorOfDelay()

                });
            }
            CleanSheetAndWriteData.cleanAdnWrite(dataListToDailyDellCARPuls, "ListToDailyDellCARPuls", pulsReport + "Daily Dell CAR Puls Report.xlsx");
        } catch (Exception e) {
            LOG.error("Check ListToDailyDellCARPuls save List in exel :" + e);
        }
    }

    public static void updateNeedDellSupport(Map<String, ListToDailyDellCARPuls> listToDailyDellCARPulsMap){

        try {
            Map<String, ListToDailyDellCARPuls> needDellSupportMap = listToDailyDellCARPulsMap
                    .entrySet()
                    .stream()
                    .filter(x -> "Warranty Issue".equals(x.getValue().getStorage_Hold_Code()))
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

            Map<String, Object[]> needDellSupportList = new TreeMap<>();
            for (Map.Entry<String, ListToDailyDellCARPuls> u : needDellSupportMap.entrySet()) {

                needDellSupportList.put("0", new Object[]{
                        "DPS Number", "Warranty", "Incident Number", "Incident Created Date", "Incident Aging", "Owner"
                });
                needDellSupportList.put(u.getKey(), new Object[]{
                        u.getValue().getDPS_Number(),
                        u.getValue().getWarranty(),
                        u.getValue().getIncident_Number(),
                        u.getValue().getCtpIncydentCreateDate(),
                        u.getValue().getCtpIncydentAge(),
                        u.getValue().getOwner(),
                });
            }
            CleanSheetAndWriteData.cleanAdnWrite(needDellSupportList, "Need Dell Support", pulsReport + "Daily Dell CAR Puls Report.xlsx");
        } catch (Exception e) {
            LOG.error("Check Need Dell Support save List in exel :" + e);
        }
    }

}


