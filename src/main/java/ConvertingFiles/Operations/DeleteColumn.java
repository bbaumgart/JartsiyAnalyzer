package ConvertingFiles.Operations;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class DeleteColumn {
    public static void deleteColumn(Sheet sheet, int columnToDelete) {
        for (int rId = 0; rId < sheet.getLastRowNum(); rId++) {
            Row row = sheet.getRow(rId);
            for (int cID = columnToDelete; cID < row.getLastCellNum(); cID++) {
                Cell cOld = row.getCell(cID);
                if (cOld != null) {
                    row.removeCell(cOld);
                }
                Cell cNext = row.getCell(cID + 1);
                if (cNext != null) {
                    Cell cNew = row.createCell(cID, cNext.getCellTypeEnum());
                    cloneCell(cNew, cNext);

                    if(rId == 0) {
                        sheet.setColumnWidth(cID, sheet.getColumnWidth(cID + 1));

                    }
                }
            }
        }
    }

    public static void cloneCell(Cell cNew, Cell cOld) {
        cNew.setCellComment(cOld.getCellComment());
        cNew.setCellStyle(cOld.getCellStyle());

        if (CellType.BOOLEAN == cNew.getCellTypeEnum()) {
            cNew.setCellValue(cOld.getBooleanCellValue());
        } else if (CellType.NUMERIC == cNew.getCellTypeEnum()) {
            cNew.setCellValue(cOld.getNumericCellValue());
        } else if (CellType.STRING == cNew.getCellTypeEnum()) {
            cNew.setCellValue(cOld.getStringCellValue());
        } else if (CellType.ERROR == cNew.getCellTypeEnum()) {
            cNew.setCellValue(cOld.getErrorCellValue());
        } else if (CellType.FORMULA == cNew.getCellTypeEnum()) {
            cNew.setCellValue(cOld.getCellFormula());
        }
    }
}
