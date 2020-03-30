package BasicCarFunctions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Map;
import java.util.Set;

public class CleanSheetAndWriteData {
    private static final Logger LOG = LogManager.getLogger();
    public static void cleanAdnWrite(Map<String, Object[]> data, String sheetName, String FILE_PATH) throws IOException {
        FileInputStream file = new FileInputStream(FILE_PATH);
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet(sheetName);



//--------------------usuwam dane z zakładki
        for (int i = sheet.getLastRowNum(); i >= 0 ; i--) {
            sheet.removeRow(sheet.getRow(i));
        }

//--------------------i zapisuję
        Set<String> keyset = data.keySet();
        int rownum = 0;
        for (String key : keyset) {
            Row row = sheet.createRow(rownum++);
            Object[] objArr = data.get(key);
            int cellnum = 0;
            for (Object obj : objArr) {
                Cell cell = row.createCell(cellnum++);
                if (obj instanceof Date)
                    cell.setCellValue((Date) obj);
                else if (obj instanceof Integer)
                    cell.setCellValue((Integer) obj);
                else if (obj instanceof String)
                    cell.setCellValue((String) obj);
            }
        }
        try {
            FileOutputStream out = new FileOutputStream(new File(FILE_PATH));
            workbook.write(out);
            out.close();
            LOG.info("Updated Sheet: " +sheetName + " in file" + FILE_PATH);

        } catch (Exception e) {
            e.printStackTrace();
            LOG.error("Sheet : " +sheetName + " in file" + FILE_PATH + "not updated");
        }

    }

}
