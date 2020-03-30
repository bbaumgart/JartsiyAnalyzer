package FilesReaders;

import FILES.FileWI;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileWIRead_excel {

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
}
