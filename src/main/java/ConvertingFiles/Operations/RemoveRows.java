package ConvertingFiles.Operations;

import org.apache.poi.xssf.usermodel.XSSFSheet;

public class RemoveRows {
    public static void removeRow(XSSFSheet sheet, int rowIndex) {
        int lastRowNum = sheet.getLastRowNum();
        if (rowIndex >= 0 && rowIndex < lastRowNum) {
            sheet.shiftRows(rowIndex + 1, lastRowNum, -1);
        }
        if (rowIndex == lastRowNum) {
            sheet.shiftRows(rowIndex + 1, lastRowNum+1, -1);
        }
    }
}
