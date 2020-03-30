package ConvertingFiles.Operations;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;

import java.util.Iterator;

public class ClearDataInColumn {

    public static void clear(Sheet sheet, int columnToDelete) {


        Iterator rowIter = sheet.iterator();
        while (rowIter.hasNext()) {
            XSSFRow row = (XSSFRow) rowIter.next();
            XSSFCell cell = row.getCell(columnToDelete);
            row.removeCell(cell);
        }

    }
}
