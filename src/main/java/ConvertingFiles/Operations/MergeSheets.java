package ConvertingFiles.Operations;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.util.HashMap;
import java.util.Map;

public class MergeSheets {
    public static void addSheet(XSSFSheet mergedSheet, XSSFSheet sheet) {
        // map for cell styles
        Map<Integer, XSSFCellStyle> styleMap = new HashMap<>();

        // This parameter is for appending sheet rows to mergedSheet in the end
        int len = mergedSheet.getLastRowNum();
        for (int j = sheet.getFirstRowNum(); j <= sheet.getLastRowNum(); j++) {

            XSSFRow row = sheet.getRow(j);
            XSSFRow mrow = mergedSheet.createRow(len + j + 1);

            for (int k = row.getFirstCellNum(); k < row.getLastCellNum(); k++) {
                XSSFCell cell = row.getCell(k);
                XSSFCell mcell = mrow.createCell(k);

                if (cell.getSheet().getWorkbook() == mcell.getSheet().getWorkbook()) {
                    mcell.setCellStyle(cell.getCellStyle());
                } else {
                    int stHashCode = cell.getCellStyle().hashCode();
                    XSSFCellStyle newCellStyle = styleMap.get(stHashCode);
                    if (newCellStyle == null) {
                        newCellStyle = mcell.getSheet().getWorkbook()
                                .createCellStyle();
                        newCellStyle.cloneStyleFrom(cell.getCellStyle());
                        styleMap.put(stHashCode, newCellStyle);
                    }
                    mcell.setCellStyle(newCellStyle);
                }

                switch (cell.getCellTypeEnum()) {
                    case FORMULA:
                        mcell.setCellFormula(cell.getCellFormula());
                        break;
                    case NUMERIC:
                        mcell.setCellValue(cell.getNumericCellValue());
                        break;
                    case STRING:
                        mcell.setCellValue(cell.getStringCellValue());
                        break;
                    case BLANK:
                        mcell.setCellType(XSSFCell.CELL_TYPE_BLANK);
                        break;
                    case BOOLEAN:
                        mcell.setCellValue(cell.getBooleanCellValue());
                        break;
                    case ERROR:
                        mcell.setCellErrorValue(cell.getErrorCellValue());
                        break;
                    default:
                        mcell.setCellValue(cell.getStringCellValue());
                        break;
                }
            }
        }
    }
}
