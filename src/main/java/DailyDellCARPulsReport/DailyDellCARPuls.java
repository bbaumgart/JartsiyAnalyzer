package DailyDellCARPulsReport;

import BasicCarFunctions.ColumnSetter;
import BasicCarFunctions.Formater;
import BasicCarFunctions.TatCalculateNetworkDays;
import BasicCarFunctions.WarrantyByCallType;
import FILES.*;
import PNA_Part_Not_Available.AwaitingPartsDpaStatus;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

import static FilesReaders.DataBaseFromFiles.*;

public class DailyDellCARPuls {
    private static final Logger LOG = LogManager.getLogger();
    public static Map<String, ListToDailyDellCARPuls> listToDailyDellCARPulsMap = new HashMap<>();
    public static Map<String, FileDellCarReport> CarMap = new HashMap<>(carReportMap);
    public static Map<String, FileCARDispatches> CarDispatchesMap = new HashMap<>(CARDispatchesMap);
    public static Map<String, FileWIP> WipMap = new HashMap<>(fileWIPMap);
    public static Map<String, FileWI> WiMap = new HashMap<>(fileWIMap);
    public static Map<String, FileOwnerMatrix> OwnerMatrixMap = new HashMap<>(ownerMatrixMap);
    public static AwaitingPartsDpaStatus awaitingPartsDpaStatus = new AwaitingPartsDpaStatus();
    public static LocalDate today = LocalDate.now();

    public static void runDailyPulsList() throws ParseException, IOException {
        DailyDellCARPuls.createListToDailyDellCARPulsMap();
        DailyDellCARPuls.addWipToListToDailyDellCARPulsMap();
        DailyDellCARPuls.addWiToListToDailyDellCARPulsMap();
        DailyDellCARPuls.setBasicCarFunctionsToListToDailyDellCARPulsMap();
        DailyDellCARPuls.setAwpStatusFromCdmv();
        DailyDellCARPuls.setHistoricStatus();
        DailyDellCARPuls.setAgingPerStep();
        DailyDellCARPuls.agingCalculation();
        DailyDellCARPuls.setHoldDaysTotal();
    }

    public static void createListToDailyDellCARPulsMap() {
        for (FileDellCarReport dcr : CarMap.values()
        ) {
            ListToDailyDellCARPuls newObject = new ListToDailyDellCARPuls(dcr);
            listToDailyDellCARPulsMap.put(newObject.getDPS_Number(), newObject);
        }

        for (ListToDailyDellCARPuls l : listToDailyDellCARPulsMap.values()
        ) {
            if (CarDispatchesMap.get(l.getDPS_Number()) != null) {
                l.setService_Request_Number(CarDispatchesMap.get(l.getDPS_Number()).getServiceRequestNumber());
                l.setActivity_Creator_Group(CarDispatchesMap.get(l.getDPS_Number()).getActivityCreatorGroup());
            }
        }
    }

    public static void addWipToListToDailyDellCARPulsMap() {
        for (ListToDailyDellCARPuls carPuls : listToDailyDellCARPulsMap.values()) {
            if (WipMap.get(carPuls.getDPS_Number()) != null) {
                carPuls.setStorage_Hold_Code(WipMap.get(carPuls.getDPS_Number()).getSTORAGE_HOLD_CODE());
                carPuls.setStorage_Hold_Code_Desc(WipMap.get(carPuls.getDPS_Number()).getSTORAGE_HOLD_CODE_DESC());
                carPuls.setDestination_Workcenter(WipMap.get(carPuls.getDPS_Number()).getDESTINATION_WORKCENTER());
                carPuls.setCurrent_Workcenter(WipMap.get(carPuls.getDPS_Number()).getCURRENT_WORKCENTER());
                carPuls.setHold_Status(WipMap.get(carPuls.getDPS_Number()).getHOLD_STATUS());
                carPuls.setLast_Update(WipMap.get(carPuls.getDPS_Number()).getLAST_UPDATE());
                carPuls.setADDITIONAL_INFORMATION(WipMap.get(carPuls.getDPS_Number()).getADDITIONAL_INFORMATION());
                carPuls.setInvtoryNotes(WipMap.get(carPuls.getDPS_Number()).getInvtoryNotes());
                carPuls.setProcessType(WipMap.get(carPuls.getDPS_Number()).getNFF_SPEC_ACCES());
            }
        }
    }

    public static void addWiToListToDailyDellCARPulsMap() {
        for (ListToDailyDellCARPuls carPuls : listToDailyDellCARPulsMap.values()) {
            if (WiMap.get(carPuls.getDPS_Number()) != null) {
                carPuls.setIncident_Number(WiMap.get(carPuls.getDPS_Number()).getWI_FUSION());
                carPuls.setCtpIncydentCreateDate(WiMap.get(carPuls.getDPS_Number()).getFUSION_CREATED_DATE());
                carPuls.setCtpType(WiMap.get(carPuls.getDPS_Number()).getWI_DYSP());
            }
        }
    }

    public static void setBasicCarFunctionsToListToDailyDellCARPulsMap() throws ParseException {
        for (ListToDailyDellCARPuls StatusColumn : listToDailyDellCARPulsMap.values()) {

            StatusColumn.setDPS_Created_Date_By_DCR(Formater.dateFormater(StatusColumn.getDPS_Created_Date_By_DCR()));
            StatusColumn.setUnit_Arrival_To_Depot_Date(Formater.dateFormater(StatusColumn.getUnit_Arrival_To_Depot_Date()));
            StatusColumn.setShip_Date(Formater.dateFormater(StatusColumn.getShip_Date()));
            StatusColumn.setPOD_Date(Formater.dateFormater(StatusColumn.getPOD_Date()));
            StatusColumn.setWarranty(WarrantyByCallType.WarrantyCallType(StatusColumn));
            StatusColumn.setWarranty2(WarrantyByCallType.setWarranty2(StatusColumn));
            StatusColumn.setAging_OCB(TatCalculateNetworkDays.RepairAging(StatusColumn.getDPS_Created_Date_By_DCR()));
            StatusColumn.setAging_Bucket(ColumnSetter.setAgingBacket(StatusColumn.getAging_OCB(), StatusColumn.getDPS_Number()));
            StatusColumn.setStatus(ColumnSetter.setColumnStatus(StatusColumn));
            StatusColumn.setSub_status(ColumnSetter.setColumnsubStatus(StatusColumn));
            StatusColumn.setOut_of_SLA_Flag(ColumnSetter.setOverdueFlag(StatusColumn));
            StatusColumn.setOCB_backlog_breakdown(ColumnSetter.setOCBBacklogBreakdown(StatusColumn));
            StatusColumn.setOCB_breakdown(ColumnSetter.setOCBBreakdown(StatusColumn));
            StatusColumn.setDaysOverSLA(ColumnSetter.setDaysOverSLA(StatusColumn));
            StatusColumn.setOut_of_SLA_Flag_GCC(ColumnSetter.setOverdueFlagGCC(StatusColumn));
            StatusColumn.setDaysOnCurrentHold(TatCalculateNetworkDays.RepairAging(StatusColumn.getLast_Update()));
            StatusColumn.setOwner(ColumnSetter.setOwner(StatusColumn));
            StatusColumn.setOwner2(ColumnSetter.setOwner2(StatusColumn));
            StatusColumn.setAging_DCR(String.valueOf(Math.round(Double.parseDouble(StatusColumn.getAging_DCR()))));
            StatusColumn.setCtpIncydentAge(TatCalculateNetworkDays.IncydentAging(StatusColumn.getCtpIncydentCreateDate()));
            StatusColumn.setInboundAging(TatCalculateNetworkDays.getWorkingDaysBetweenTwoDates(StatusColumn.getDPS_Created_Date_By_DCR(), StatusColumn.getUnit_Arrival_To_Depot_Date()));
            StatusColumn.setOutboundAging(TatCalculateNetworkDays.getWorkingDaysBetweenTwoDates(StatusColumn.getShip_Date(), StatusColumn.getPOD_Date()));
            StatusColumn.setWipAging(TatCalculateNetworkDays.getWorkingDaysBetweenTwoDates(StatusColumn.getUnit_Arrival_To_Depot_Date(), StatusColumn.getShip_Date()));

            if (OwnerMatrixMap.get(StatusColumn.getActivity_Creator_Group() + StatusColumn.getWarranty2()) != null) {
                StatusColumn.setLocation(OwnerMatrixMap.get(StatusColumn.getActivity_Creator_Group() + StatusColumn.getWarranty2()).getLocation());
            }
        }
    }

    public static void setAwpStatusFromCdmv() throws IOException, ParseException {
        Map<String, List<FileAwpGetSequenceLineDetails>> awpReport = new HashMap<>(awaitingPartsDpaStatus.getAwpMap());
        for (ListToDailyDellCARPuls carPuls : listToDailyDellCARPulsMap.values()) {
            if (awpReport.get(carPuls.getDPS_Number()) != null
            ) {
                carPuls.setSub_status(awpReport.get(carPuls.getDPS_Number()).get(0).getAwpDpsStatus());
            }
        }
    }

    public static void setHistoricStatus() {
        for (ListToDailyDellCARPuls GccList : listToDailyDellCARPulsMap.values()) {
            try {
                GccList.setHistoric_iQor(GccSheetListMap.get(GccList.getDPS_Number()) + "\n" + today + " " + GccList.getStatus() + " " + GccList.getSub_status());
            } catch (Exception e) {
                GccList.setHistoric_iQor(today + " " + GccList.getStatus() + " " + GccList.getSub_status());
            }
        }
    }

    public static void setAgingPerStep() {
        Map<String, DellCarHoldDaysQuanlity> QuanlityMap = new HashMap<>(daysQuanlityMap);

        for (ListToDailyDellCARPuls u : listToDailyDellCARPulsMap.values()
        ) {
            List<DpsHistoryWithAging> listDpsHistoryWithAging = new ArrayList<>();
            if (QuanlityMap.get(u.getDPS_Number()) == null) {
                DpsHistoryWithAging dpsHistoryWithAging = new DpsHistoryWithAging();
                dpsHistoryWithAging.setAWAITING_PART("0");
                dpsHistoryWithAging.setAWAITING_ENGINEERING_QA("0");
                dpsHistoryWithAging.setAWAITING_ENGINEERING_DOA("0");
                dpsHistoryWithAging.setAWAITING_ENGINEERING_EGH("0");
                dpsHistoryWithAging.setAWAITING_ENGINEERING_TAG("0");
                dpsHistoryWithAging.setCUSTOMER_DDP("0");
                dpsHistoryWithAging.setCUSTOMER_ADM("0");
                dpsHistoryWithAging.setCUSTOMER_MBR("0");
                dpsHistoryWithAging.setCUSTOMER_NFF("0");
                dpsHistoryWithAging.setCUSTOMER_NFF2("0");
                dpsHistoryWithAging.setWARRANTY_ISSUE_BER("0");
                dpsHistoryWithAging.setWARRANTY_ISSUE_CTP("0");
                listDpsHistoryWithAging.add(dpsHistoryWithAging);
                u.setDpsHistoryWithAging(listDpsHistoryWithAging);
            } else {
                DpsHistoryWithAging dpsHistoryWithAging = new DpsHistoryWithAging();
                dpsHistoryWithAging.setAWAITING_PART(QuanlityMap.get(u.getDPS_Number()).getAWAITING_PART());
                dpsHistoryWithAging.setAWAITING_ENGINEERING_QA(QuanlityMap.get(u.getDPS_Number()).getAWAITING_ENGINEERING_QA());
                dpsHistoryWithAging.setAWAITING_ENGINEERING_DOA(QuanlityMap.get(u.getDPS_Number()).getAWAITING_ENGINEERING_DOA());
                dpsHistoryWithAging.setAWAITING_ENGINEERING_EGH(QuanlityMap.get(u.getDPS_Number()).getAWAITING_ENGINEERING_EGH());
                dpsHistoryWithAging.setAWAITING_ENGINEERING_TAG(QuanlityMap.get(u.getDPS_Number()).getAWAITING_ENGINEERING_TAG());
                dpsHistoryWithAging.setCUSTOMER_DDP(QuanlityMap.get(u.getDPS_Number()).getCUSTOMER_DDP());
                dpsHistoryWithAging.setCUSTOMER_ADM(QuanlityMap.get(u.getDPS_Number()).getCUSTOMER_ADM());
                dpsHistoryWithAging.setCUSTOMER_MBR(QuanlityMap.get(u.getDPS_Number()).getCUSTOMER_MBR());
                dpsHistoryWithAging.setCUSTOMER_NFF(QuanlityMap.get(u.getDPS_Number()).getCUSTOMER_NFF());
                dpsHistoryWithAging.setCUSTOMER_NFF2(QuanlityMap.get(u.getDPS_Number()).getCUSTOMER_NFF2());
                dpsHistoryWithAging.setWARRANTY_ISSUE_BER(QuanlityMap.get(u.getDPS_Number()).getWARRANTY_ISSUE_BER());
                dpsHistoryWithAging.setWARRANTY_ISSUE_CTP(QuanlityMap.get(u.getDPS_Number()).getWARRANTY_ISSUE_CTP());
                listDpsHistoryWithAging.add(dpsHistoryWithAging);
                u.setDpsHistoryWithAging(listDpsHistoryWithAging);
            }
        }
    }

    public static void setHoldDaysTotal() {

        for (ListToDailyDellCARPuls u : listToDailyDellCARPulsMap.values()
        ) {
            for (DpsHistoryWithAging qty : u.getDpsHistoryWithAging()) {
                u.setHoldDaysTotal(
                        "Inbound Age - " + u.getInboundAging() + "\n"
                                + "WIP Age - " + u.getWipAging() + "\n"
                                + "CTP - " + qty.getWARRANTY_ISSUE_CTP() + "\n"
                                + "AWP - " + qty.getAWAITING_PART() + "\n"
                                + "BER - " + qty.getWARRANTY_ISSUE_BER() + "\n"
                                + "ENG - "
                                + String.valueOf(Float.parseFloat(qty.getAWAITING_ENGINEERING_EGH())
                                + Float.parseFloat(qty.getAWAITING_ENGINEERING_DOA())
                                + Float.parseFloat(qty.getAWAITING_ENGINEERING_QA())
                                + Float.parseFloat(qty.getAWAITING_ENGINEERING_TAG()))
                                + "\n"
                                + "NFF - " + qty.getCUSTOMER_NFF() + "\n"
                                + "ADM - " + qty.getCUSTOMER_ADM() + "\n"
                                + "MBR - " + qty.getCUSTOMER_MBR() + "\n"
                                + "Outbound Age - " + u.getOutboundAging()
                );
            }
        }
    }

    public static void agingCalculation() {

        Map<String, Float> calculationMap = new HashMap<>();
        for (ListToDailyDellCARPuls u : listToDailyDellCARPulsMap.values()
        ) {
            for (DpsHistoryWithAging qty : u.getDpsHistoryWithAging()) {

                calculationMap.put("EGH", Float.parseFloat(qty.getAWAITING_ENGINEERING_EGH()));
                calculationMap.put("QA", Float.parseFloat(qty.getAWAITING_ENGINEERING_QA()));
                calculationMap.put("TAG", Float.parseFloat(qty.getAWAITING_ENGINEERING_TAG()));
                calculationMap.put("DOA", Float.parseFloat(qty.getAWAITING_ENGINEERING_DOA()));
                calculationMap.put("AWP", Float.parseFloat(qty.getAWAITING_PART()));
                calculationMap.put("ADM", Float.parseFloat(qty.getCUSTOMER_ADM()));
                calculationMap.put("MBR", Float.parseFloat(qty.getCUSTOMER_MBR()));
                calculationMap.put("NFF", Float.parseFloat(qty.getCUSTOMER_NFF()));
                calculationMap.put("NFF2", Float.parseFloat(qty.getCUSTOMER_NFF2()));
                calculationMap.put("DDP", Float.parseFloat(qty.getCUSTOMER_DDP()));
                calculationMap.put("BER", Float.parseFloat(qty.getWARRANTY_ISSUE_BER()));
                calculationMap.put("CTP", Float.parseFloat(qty.getWARRANTY_ISSUE_CTP()));
                calculationMap.put("Inbound", Float.parseFloat(u.getInboundAging()));
                calculationMap.put("Outbound", Float.parseFloat(u.getOutboundAging()));
                calculationMap.put("WIP", Float.parseFloat(u.getWipAging()));
            }

            Float totalOnHold =
                    calculationMap.get("EGH")
                            + calculationMap.get("QA")
                            + calculationMap.get("TAG")
                            + calculationMap.get("DOA")
                            + calculationMap.get("AWP")
                            + calculationMap.get("ADM")
                            + calculationMap.get("MBR")
                            + calculationMap.get("NFF")
                            + calculationMap.get("NFF2")
                            + calculationMap.get("DDP")
                            + calculationMap.get("BER")
                            + calculationMap.get("CTP");
            Float totalInWip = calculationMap.get("WIP") - totalOnHold;
            u.setWipAging(String.valueOf(totalInWip));
            calculationMap.put("WIP", totalInWip);

            Map<String, Float> result = calculationMap.entrySet().stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                            (oldValue, newValue) -> oldValue, LinkedHashMap::new));

            Map.Entry<String, Float> entry = result.entrySet().stream().findFirst().get();
            String key = entry.getKey();
            Float value = entry.getValue();
            u.setBiggestContributorOfDelay(key + " - " + value);

        }
    }
}
