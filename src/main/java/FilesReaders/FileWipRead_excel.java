package FilesReaders;


import FILES.FileWIP;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileWipRead_excel {


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


}