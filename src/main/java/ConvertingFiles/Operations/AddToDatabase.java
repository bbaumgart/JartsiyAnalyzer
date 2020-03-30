package ConvertingFiles.Operations;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddToDatabase {


    public static void add(File database, File dataToAdd) {

        try {
            FileInputStream inputStream = new FileInputStream(database);
            Workbook workbook = WorkbookFactory.create(inputStream);
            Sheet sheet = workbook.getSheetAt(0);
//=======================================================================================================================
            FileInputStream inputStream_daily = new FileInputStream(dataToAdd);
            Workbook workbook_daily = WorkbookFactory.create(inputStream_daily);
            Sheet sheet_daily = workbook_daily.getSheetAt(0);


            List<List<String>> listData = new ArrayList<>();

            for (Row row : sheet_daily) {

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

            Iterator<List<String>> i = listData.iterator();
            int rownum = sheet.getLastRowNum()+1;
            int cellnum;
            while (i.hasNext()) {
                List<String> templist =  i.next();
                Iterator<String> tempIterator= templist.iterator();
                Row row = sheet.createRow(rownum++);
                cellnum = 0;
                while (tempIterator.hasNext()) {
                    String temp =  tempIterator.next();
                    Cell cell = row.createCell(cellnum++);
                    cell.setCellValue(temp);
                }
            }
            inputStream.close();
            inputStream_daily.close();
            FileOutputStream outputStream = new FileOutputStream(database);
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();

        } catch (IOException | EncryptedDocumentException
                | InvalidFormatException ex) {
            ex.printStackTrace();
        }
    }
}