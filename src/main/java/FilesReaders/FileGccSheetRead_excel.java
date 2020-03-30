package FilesReaders;


import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileGccSheetRead_excel {


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
}