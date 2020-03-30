package FilesReaders;


import BasicCarFunctions.TatCalculateNetworkDays;
import FILES.FileOCB;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

public class FileOCBread_excel {


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

}