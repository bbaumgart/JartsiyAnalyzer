package FilesReaders;


import DailyDellCARPulsReport.ListToDailyDellCARPuls;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileGccListRead_excel {


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


}