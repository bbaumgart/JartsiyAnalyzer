package ConvertingFiles.Operations;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReadWriteSheet {
    public static void create(File in, File out, String sheetName) {
        try {
            FileInputStream excellFile1 = new FileInputStream(in);
            XSSFWorkbook workbook = new XSSFWorkbook(excellFile1);
            XSSFSheet sheet = workbook.getSheet(sheetName);


            List<List<String>> listData = new ArrayList<>();

            for (Row row : sheet) {

                Iterator<Cell> cellIterator = row.cellIterator();

                List<String> rowObject = new ArrayList<>();

                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();

                    DataFormatter dataFormatter = new DataFormatter();
                    String value = dataFormatter.formatCellValue(cell);

                    rowObject.add(value);
                }
                listData.add(rowObject);
            }

//=======================================
            FileInputStream inputStream = new FileInputStream(out);
            Workbook workbook_out = WorkbookFactory.create(inputStream);
            Sheet sheet_out = workbook_out.getSheetAt(0);

            Iterator<List<String>> i = listData.iterator();
            int rownum = 0;
            int cellnum;
            while (i.hasNext()) {
                List<String> templist =  i.next();
                Iterator<String> tempIterator= templist.iterator();
                Row row = sheet_out.createRow(rownum++);
                cellnum = 0;
                while (tempIterator.hasNext()) {
                    String temp =  tempIterator.next();
                    Cell cell = row.createCell(cellnum++);
                    cell.setCellValue(temp);
                }
            }


            inputStream.close();

            FileOutputStream outputStream = new FileOutputStream(out);
            workbook_out.write(outputStream);
            workbook_out.close();
            outputStream.close();


            excellFile1.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
