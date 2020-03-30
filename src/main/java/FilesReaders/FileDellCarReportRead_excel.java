package FilesReaders;


import FILES.FileDellCarReport;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileDellCarReportRead_excel {


    public static Map<String, FileDellCarReport> NewFileDCRreadFromExcel(String FILE_PATH) throws IOException {
//        FirstAndLastRow.cut(new File(FILE_PATH), 9);


        Map<String, FileDellCarReport> fileDellCarReportMap = new HashMap<>();
        FileInputStream fis = new FileInputStream(FILE_PATH);
        Workbook workbook = new XSSFWorkbook(fis);
//        0 oznacza jedna zakłądka itd
        Sheet sheet = workbook.getSheetAt(0);

        for (int j = 1; j <= sheet.getLastRowNum(); j++) {
            DataFormatter dataFormatter = new DataFormatter();
            FileDellCarReport fileDellCarReport = new FileDellCarReport();
            int columnNumber = 0;

            fileDellCarReport.setDPS(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setCallType(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setCountry(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setBTT(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setServiceTag(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setServiceTagReceived(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setTechnology(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setDellStatus(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setOrderStatus(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setModelNumber(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setRepeat(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setTATwithoutEXEcodeToDHIP(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setTATwithoutEXEcodeToPOD(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setPickUpTR(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setCallCreateDate(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setUnitCollectionDate(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setUnitArrivalToDepotDate(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setPartRequestDate(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setShipAndClosedDate(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setUnitDeliveryToCustomerDate(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setDeliveryTR(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setOrderedParts(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setPartsUsed(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setTechnicanID(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setFirstExceptionCode(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setLastExceptionCode(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));
            columnNumber++;
            fileDellCarReport.setCurrentExceptionCode(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));


            if (fileDellCarReport.getDPS().length() == 10) {
                fileDellCarReport.setDPS("0" + fileDellCarReport.getDPS());
            }


            fileDellCarReportMap.put(fileDellCarReport.getDPS(), fileDellCarReport);

        }
        fis.close();

        return fileDellCarReportMap;
    }


}