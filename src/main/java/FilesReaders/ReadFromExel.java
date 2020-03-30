package FilesReaders;

import BasicCarFunctions.TatCalculateNetworkDays;
import DailyDellCARPulsReport.ListToDailyDellCARPuls;
import FILES.*;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadFromExel {

    public static Map<String, List<FileAwpGetSequenceLineDetails>> NewFileAwpDetailsReadFromExcel(String FILE_PATH) throws IOException {
//        FirstAndLastRow.cut(new File(FILE_PATH), 9);


        Map<String, List<FileAwpGetSequenceLineDetails>> fileAwpGetSequenceLineDetailsMap = new HashMap<>();
        FileInputStream fis = new FileInputStream(FILE_PATH);
        Workbook workbook = new XSSFWorkbook(fis);
//        0 oznacza jedna zakłądka itd
        Sheet sheet = workbook.getSheetAt(0);


        for (int j = 0; j <= sheet.getLastRowNum(); j++) {
            DataFormatter dataFormatter = new DataFormatter();
            FileAwpGetSequenceLineDetails fileAwpGetSequenceLineDetails = new FileAwpGetSequenceLineDetails();
            int columnNumber = 0;

            fileAwpGetSequenceLineDetails.setWWL_Order_Nr(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber))); columnNumber++;
            fileAwpGetSequenceLineDetails.setOrig_Part(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber))); columnNumber++;
            fileAwpGetSequenceLineDetails.setPart_Shipped(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber))); columnNumber++;
            fileAwpGetSequenceLineDetails.setOpen_Qty_parts_line(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber))); columnNumber++;
            fileAwpGetSequenceLineDetails.setOrig_From_Depot(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber))); columnNumber++;
            fileAwpGetSequenceLineDetails.setDepot_Name(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber))); columnNumber++;
            fileAwpGetSequenceLineDetails.setETA(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber))); columnNumber++;
            fileAwpGetSequenceLineDetails.setFrom_Depot(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber))); columnNumber++;
            fileAwpGetSequenceLineDetails.setUse_Qty(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber))); columnNumber++;
            fileAwpGetSequenceLineDetails.setLine_Status(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber))); columnNumber++;
            fileAwpGetSequenceLineDetails.setTracking_Nr(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber))); columnNumber++;
            fileAwpGetSequenceLineDetails.setTandT(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber))); columnNumber++;
            fileAwpGetSequenceLineDetails.setTag_Capture(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber))); columnNumber++;
            fileAwpGetSequenceLineDetails.setShip_with_Part(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber))); columnNumber++;
            fileAwpGetSequenceLineDetails.setOriginal_Return_Indicator(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber))); columnNumber++;
            fileAwpGetSequenceLineDetails.setDPS(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber))); columnNumber++;
            fileAwpGetSequenceLineDetails.setSequence(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber))); columnNumber++;
            fileAwpGetSequenceLineDetails.setCall_Status(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber))); columnNumber++;
            fileAwpGetSequenceLineDetails.setCall_Created(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber))); columnNumber++;
            fileAwpGetSequenceLineDetails.setAge(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber))); columnNumber++;
            fileAwpGetSequenceLineDetails.setAwpLineStatus(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber))); columnNumber++;
            fileAwpGetSequenceLineDetails.setEtaOtherDayDate(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));


//
//            if (fileDellCarReport.getDPS().length() == 10) {
//                fileDellCarReport.setDPS("0" + fileDellCarReport.getDPS());
//            }


            fileAwpGetSequenceLineDetailsMap.computeIfAbsent(fileAwpGetSequenceLineDetails.getDPS(),k-> new ArrayList<>()).add(fileAwpGetSequenceLineDetails);


        }
        fis.close();

        return fileAwpGetSequenceLineDetailsMap;
    }

    public static Map<String, DellCarHoldDaysQuanlity> NewFileHDQreadFromExcel(String FILE_PATH) throws IOException {

        Map<String, DellCarHoldDaysQuanlity> dellCarHoldDaysQuanlityMap = new HashMap<>();
        FileInputStream fis = new FileInputStream(FILE_PATH);
        Workbook workbook = new XSSFWorkbook(fis);
//        0 oznacza jedna zakłądka itd
        Sheet sheet = workbook.getSheetAt(0);

        for (int j = 1; j <= sheet.getLastRowNum(); j++) {
            DataFormatter dataFormatter = new DataFormatter();
            DellCarHoldDaysQuanlity dellCarHoldDaysQuanlity = new DellCarHoldDaysQuanlity();

            int columnNumber = 0;

            dellCarHoldDaysQuanlity.setDPS(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setCALL_TYPE(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setCOUNTRY(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setBTT_NAME(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setORDER_STATUS(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setSERVICE_TAG(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setTECHNOLOGY(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setPROCESS_TYPE(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setDISTRESSED(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setCALL_CREATE_DATE(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setUNIT_ARRIVAL_TO_DEPOT_DATE(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setSHIP_AND_CLOSED_DATE(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setUNIT_DELIVERY_TO_CUSTOMER_DATE(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setUNIT_DELIVERY_DATE(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setTAT_WITHOUT_EXE_CODE_TO_SHIP(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setTAT_WITHOUT_EXE_CODE_TO_POD(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setAWAITING_PART(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setAWAITING_ENGINEERING_QA(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setWARRANTY_ISSUE_BER(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setAWAITING_ENGINEERING_DOA(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setAWAITING_ENGINEERING_EGH(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setAWAITING_ENGINEERING_TAG(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setCUSTOMER_DDP(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setCUSTOMER_ADM(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setCUSTOMER_MBR(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setCUSTOMER_NFF(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setCUSTOMER_NFF2(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setWARRANTY_ISSUE_CTP(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setFF1(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setFF2(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setFF3(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setFF4(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setFF5(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));

            if (dellCarHoldDaysQuanlity.getDPS().length() == 10) {
                dellCarHoldDaysQuanlity.setDPS("0" + dellCarHoldDaysQuanlity.getDPS());
            }

            dellCarHoldDaysQuanlityMap.put(dellCarHoldDaysQuanlity.getDPS(), dellCarHoldDaysQuanlity);
        }
        fis.close();
        return dellCarHoldDaysQuanlityMap;
    }

    public static Map<String, FileDellCarReport> NewFileDCRreadFromExcel(String FILE_PATH) throws IOException {
//        FirstAndLastRow.cut(new File(FILE_PATH), 9);


        Map<String, FileDellCarReport> fileDellCarReportMap = new HashMap<>();
        FileInputStream fis = new FileInputStream(FILE_PATH);
        Workbook workbook = new XSSFWorkbook(fis);
//        0 oznacza jedna zakłądka itd
        Sheet sheet = workbook.getSheetAt(0);

        for (int j = 1; j <= sheet.getLastRowNum(); j++) {
            DataFormatter dataFormatter = new DataFormatter();
            FileDellCarReport fileDellCarReport = new FileDellCarReport();
            int columnNumber = 0;

            fileDellCarReport.setDPS(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setCallType(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setCountry(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setBTT(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setServiceTag(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setServiceTagReceived(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setTechnology(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setDellStatus(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setOrderStatus(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setModelNumber(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setRepeat(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setTATwithoutEXEcodeToDHIP(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setTATwithoutEXEcodeToPOD(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setPickUpTR(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setCallCreateDate(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setUnitCollectionDate(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setUnitArrivalToDepotDate(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setPartRequestDate(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setShipAndClosedDate(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setUnitDeliveryToCustomerDate(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setDeliveryTR(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setOrderedParts(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setPartsUsed(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setTechnicanID(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setFirstExceptionCode(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setLastExceptionCode(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setCurrentExceptionCode(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));


            if (fileDellCarReport.getDPS().length() == 10) {
                fileDellCarReport.setDPS("0" + fileDellCarReport.getDPS());
            }


            fileDellCarReportMap.put(fileDellCarReport.getDPS(), fileDellCarReport);

        }
        fis.close();

        return fileDellCarReportMap;
    }

    public static Map<String, ListToDailyDellCARPuls> FileGccListReadFromExcel(String FILE_PATH) throws IOException {
        Map<String, ListToDailyDellCARPuls> GccList_map = new HashMap<>();
        FileInputStream fis = new FileInputStream(FILE_PATH);
        Workbook workbook = new XSSFWorkbook(fis);
//        0 oznacza jedna zakłądka itd
        Sheet sheet = workbook.getSheetAt(0);

        for (int j = 1; j <= sheet.getLastRowNum(); j++) {
            DataFormatter dataFormatter = new DataFormatter();
            ListToDailyDellCARPuls listToDailyDellCARPuls = new ListToDailyDellCARPuls();
            int columnNumber = 0;

            listToDailyDellCARPuls.setDPS_Number(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            listToDailyDellCARPuls.setService_Tag(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            listToDailyDellCARPuls.setService_Request_Number(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            listToDailyDellCARPuls.setWarranty(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            listToDailyDellCARPuls.setStatus(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            listToDailyDellCARPuls.setSub_status(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            listToDailyDellCARPuls.setHistoric_iQor(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            listToDailyDellCARPuls.setOwner(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));




            if (listToDailyDellCARPuls.getDPS_Number().length() == 10) {
                listToDailyDellCARPuls.setDPS_Number("0" + listToDailyDellCARPuls.getDPS_Number());
            }


            {
                GccList_map.put(listToDailyDellCARPuls.getDPS_Number(), listToDailyDellCARPuls);
//                fileWI.setFUSION_AGING(TatCalculateNetworkDays.RepairAging(fileWI.getFUSION_CREATED_DATE()));



            }
        }
        fis.close();

        return GccList_map;
    }

    public static Map<String, String> FileGccSheetReadFromExcel(String FILE_PATH) throws IOException {
        Map<String, String> fileGccSheet_exel_map = new HashMap<>();
        FileInputStream fis = new FileInputStream(FILE_PATH);
        Workbook workbook = new XSSFWorkbook(fis);
//        0 oznacza jedna zakłądka itd
        Sheet sheet = workbook.getSheet("GCC list");

        for (int j = 1; j <= sheet.getLastRowNum(); j++) {
            DataFormatter dataFormatter = new DataFormatter();
            fileGccSheet_exel_map.put(dataFormatter.formatCellValue(sheet.getRow(j).getCell(0)),dataFormatter.formatCellValue(sheet.getRow(j).getCell(11)));
        }
        fis.close();
        return fileGccSheet_exel_map;
    }

    public static Map<String, FileOCB> NewFileOCBreadFromExcel(String FILE_PATH) throws IOException, ParseException {

        Map<String, FileOCB> fileOCB_exel_map = new HashMap<>();
        FileInputStream fis = new FileInputStream(FILE_PATH);
        Workbook workbook = new XSSFWorkbook(fis);
//        0 oznacza jedna zakłądka itd
        Sheet sheet = workbook.getSheetAt(0);

        for (int j = 1; j <= sheet.getLastRowNum(); j++) {
            DataFormatter dataFormatter = new DataFormatter();
            FileOCB fileOCB = new FileOCB();
            int columnNumber = 0;

            fileOCB.setReport_Date(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setRegion(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setSub_Region_Code(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setCountry(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setDPS_Number(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setDPS_Type(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setCall_Type(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setDSP_NAME(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setDLP_Name(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setDispatch_Approved_Date(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setService_Incident_Queue_Date(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setParts_Status(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setLabor_Status(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setBilling_Company(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setBilling_Contact(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setCity(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setService_Tag(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setWith_in_SLA_Window(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setActivity_Status(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setReporting_Age(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setOverdue_Flag(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setOverdue_Date(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setISP_Service_Window_Start(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setISP_Service_Window_End(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setSLA_END_DT(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setFSD_Overdue_Flag(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setEmployee_Group_Name(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setLocation(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setJack(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setEmployee_Manager_Badge_Number(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setLOB_Group(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setGroup_Desc(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setActivity_Alarm_Flag(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setDefer_Date(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setDefer_Call(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setDef_Preferred_Time(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setBusiness_Unit_Desc(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setBillable_Flag_B2C_or_B2D(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setISP_Reference(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setState(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setAlternate_Customer_(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setDSP_Code(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setDPS_Created_Time(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setSLA(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setResponsibility(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setCutoff(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setService_Type_Code(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setActivity_Closed_Date(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setQuote_Created(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setActivity_Creator_Group(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setCreated_By(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setTime_Zone(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setActivity_Type(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setISP_Oconus_System(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setISP_Oconus_BUID(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setActivity_Created_Date(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setLast_Upd_Date(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setDPS_CreatedLocal(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setEntitlement_Name(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setNo_Of_Holidays(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setDPS_and_Call_Type(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setTransport_DLP(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setSLA_DPS_Type(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setService_Request_Number(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setDOSD(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setSource(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setOf_Activities(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setCustomer(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setAccount_Name(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setDescription(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setLast_Exception_Code_Flag(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setLast_Exception_Description(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setDelta_Reply_Code_Descriptin(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setISP_Sequence(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setDelta_Reply_Code(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setLatest_Reply_Code(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setResponsibility_age_Carrier(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setResponsibility_age_CIS(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setResponsibility_age_CIS_Center(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setResponsibility_age_Dell_TS(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setResponsibility_age_DLP(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setResponsibility_age_DSP(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setResponsibility_age_Frieght(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setResponsibility_age_GCC(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setResponsibility_age_Parts(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setResponsibility_age_TS(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setDSP_Schedule_Windows_End_Date(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setDSP_Schedule_Windows_Start_Date(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setStrategic_Customer_Flag(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setParent_Account(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setParent_Account_Name(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileOCB.setTAM_Name(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));


            if (fileOCB.getDPS_Number().length() == 10) {
                fileOCB.setDPS_Number("0" + fileOCB.getDPS_Number());
            }

            if (fileOCB.getService_Type_Code().equals("Collect and Return")
                    && (!fileOCB.getCountry().equals("South Africa"))
                    && (!fileOCB.getCountry().equals("Greece"))
            ) {
                fileOCB_exel_map.put(fileOCB.getDPS_Number(), fileOCB);
                fileOCB.setOCB_Aging(TatCalculateNetworkDays.RepairAging(fileOCB.getDPS_Created_Time()));

            }
        }
        fis.close();

        return fileOCB_exel_map;
    }

    public static Map<String, FileWIP> NewFileWipReadFromExcel(String FILE_PATH) throws IOException {
//        FirstAndLastRow.cut( new File(FILE_PATH),6);
        Map<String, FileWIP> fileWIPMap = new HashMap<>();
        FileInputStream fis = new FileInputStream(FILE_PATH);
        Workbook workbook = new XSSFWorkbook(fis);
//        0 oznacza jedna zakłądka itd
        Sheet sheet = workbook.getSheetAt(0);

        for (int j = 0; j <= sheet.getLastRowNum(); j++) {
            DataFormatter dataFormatter = new DataFormatter();
            FileWIP fileWipReport = new FileWIP();
            int columnNumber = 0;


            fileWipReport.setCLIENT_NAME(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setCONTRACT_NAME(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setUNIT_BCN(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setSERIAL_NO(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setPART_NO(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setPART_DESC(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setHOLD_STATUS(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setREASON_FOR_HOLD(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setSTORAGE_HOLD_CODE(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setSTORAGE_HOLD_CODE_DESC(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setDAYS_ON_HOLD(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setNetDaysonHold(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setSUM_WEEKDAYS_ON_HOLD(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setCURRENT_WORKCENTER(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setDESTINATION_WORKCENTER(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setLAST_UPDATE(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setRECEIPT_TIMESTAMP(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setPart_Req_fulfillment(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setDAYS_IN_WIP(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setDAYS_IN_WIP_WEEK(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setDAYS_IN_WIP_RND(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setDAYS_IN_WIP_WEEK_RND(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setORDER_PROCESS_TYPE_CODE(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setREFERENCE_ORDER_ID(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setWORKORDER_ID(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setWO_Created_Timestamp(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setCUSTOMER_PO_NO(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setCLIENT_REFERENCE_NO1(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setCLIENT_REFERENCE_NO2(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setRouting(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setReleasedFromNPI(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setReceipt_SN(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setBIN(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setTATinPROCESS(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setPRODUCT_CLASS(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setDELIVERY(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setPUT_ON_HOLD_DATE(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setRELEASED_MOVE_FROM_HOLD_DATE(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setPrice(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setInvtoryNotes(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setRO_CREATED_TIMESTAMP(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setREVISION_LEVEL(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setCALL_TYPE(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setVIP_UNIT(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setNFF_SOFTWARE(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setNFF_OTHER_INF(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setINTERNAL_NOTES(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setCANCELLATION_REASON(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setDEVICE_INTERFACE(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setFUSION_CREATED_DATE(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setWI_FUSION(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setSERVICE_EVENT(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setSERVICE_STATUS(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setORIGINAL_COUNTRY(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setRETAILER(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setNFF_SPEC_ACCES(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setADDITIONAL_INFORMATION(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWipReport.setEXCEPTION_CODE(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));



            if (fileWipReport.getCLIENT_REFERENCE_NO1().length() == 10) {
                fileWipReport.setCLIENT_REFERENCE_NO1("0" + fileWipReport.getCLIENT_REFERENCE_NO1());
            }


            fileWIPMap.put(fileWipReport.getCLIENT_REFERENCE_NO1(), fileWipReport);

        }
        fis.close();

        return fileWIPMap;
    }

    public static Map<String, FileWI> FileWIReadFromExcel(String FILE_PATH) throws IOException {
        Map<String, FileWI> fileWI_exel_map = new HashMap<>();
        FileInputStream fis = new FileInputStream(FILE_PATH);
        Workbook workbook = new XSSFWorkbook(fis);
//        0 oznacza jedna zakłądka itd
        Sheet sheet = workbook.getSheetAt(0);

        for (int j = 1; j <= sheet.getLastRowNum(); j++) {
            DataFormatter dataFormatter = new DataFormatter();
            FileWI fileWI = new FileWI();
            int columnNumber = 0;

            fileWI.setARC(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWI.setBIN(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWI.setCall_Create_Date(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWI.setCountry_Code(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWI.setDAYS_ON_HOLD(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWI.setDPS_NO(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWI.setFUSION_CREATED_DATE(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWI.setLAST_UPDATE(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWI.setSTORAGE_HOLD_CODE(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWI.setTAT(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWI.setWI_DYSP(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileWI.setWI_FUSION(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));

            if (fileWI.getDPS_NO().length() == 10) {
                fileWI.setDPS_NO("0" + fileWI.getDPS_NO());
            }

            {
                fileWI_exel_map.put(fileWI.getDPS_NO(), fileWI);
//                fileWI.setFUSION_AGING(TatCalculateNetworkDays.RepairAging(fileWI.getFUSION_CREATED_DATE()));
            }
        }
        fis.close();

        return fileWI_exel_map;
    }

    public static Map<String, FileCT> FileCTReadFromExcel(String FILE_PATH) throws IOException {
        Map<String, FileCT> fileWI_exel_map = new HashMap<>();
        FileInputStream fis = new FileInputStream(FILE_PATH);
        Workbook workbook = new XSSFWorkbook(fis);
//        0 oznacza jedna zakłądka itd
        Sheet sheet = workbook.getSheetAt(0);

        for (int j = 1; j <= sheet.getLastRowNum(); j++) {
            DataFormatter dataFormatter = new DataFormatter();
            FileCT fileCT = new FileCT();
            int columnNumber = 0;

            fileCT.setSLlocation(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileCT.setClient(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileCT.setBusinesTrxType(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileCT.setReferenceOrder(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileCT.setClientRefNo1(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileCT.setClientRefNo2(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileCT.setOrderCreationDate(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileCT.setOrderCreationTime(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileCT.setInboundService(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileCT.setInboundService_DESC(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileCT.setCALLType(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileCT.setDPSType(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileCT.setCountryCode(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileCT.setRoStatus(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileCT.setReceiptDate(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileCT.setIB_AWB_1(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileCT.setIB_AWB_2(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileCT.setIB_AWB_3(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileCT.setIB_AWB_4(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileCT.setIB_AWB_5(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileCT.setOB_AWB_1(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileCT.setOB_AWB_2(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileCT.setSerialNumber(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileCT.setPartNo(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileCT.setPartDescription(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileCT.setBOX(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileCT.setBOX_client(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileCT.setPackingListNo(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileCT.setBCN(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileCT.setShipCondition(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileCT.setManifestDate(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileCT.setManifestDateBOX(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileCT.setReleasedROdate(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileCT.setReferenceOrder_(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileCT.setClientRefNo1_(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileCT.setRoStatus_(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileCT.setExceptionCode(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileCT.setPrimaryContactPhone(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileCT.setAlternative_contact_phone(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileCT.setType_of_contact(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileCT.setNFFspecAcces(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));


            if (fileCT.getClientRefNo1().length() == 10) {
                fileCT.setClientRefNo1("0" + fileCT.getClientRefNo1());
            }
            {
                fileWI_exel_map.put(fileCT.getClientRefNo1(), fileCT);
            }
        }
        fis.close();

        return fileWI_exel_map;
    }
}
