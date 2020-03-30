package FilesReaders;

import FILES.DellCarHoldDaysQuanlity;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileDellCarHodlDaysQuantityReportRead_excel {

    public static Map<String, DellCarHoldDaysQuanlity> NewFileHDQreadFromExcel(String FILE_PATH) throws IOException {

        Map<String, DellCarHoldDaysQuanlity> dellCarHoldDaysQuanlityMap = new HashMap<>();
        FileInputStream fis = new FileInputStream(FILE_PATH);
        Workbook workbook = new XSSFWorkbook(fis);
//        0 oznacza jedna zakłądka itd
        Sheet sheet = workbook.getSheetAt(0);

        for (int j = 1; j <= sheet.getLastRowNum(); j++) {
            DataFormatter dataFormatter = new DataFormatter();
            DellCarHoldDaysQuanlity dellCarHoldDaysQuanlity = new DellCarHoldDaysQuanlity();

            int columnNumber = 0;

            dellCarHoldDaysQuanlity.setDPS(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setCALL_TYPE(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setCOUNTRY(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setBTT_NAME(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setORDER_STATUS(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setSERVICE_TAG(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setTECHNOLOGY(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setPROCESS_TYPE(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setDISTRESSED(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setCALL_CREATE_DATE(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setUNIT_ARRIVAL_TO_DEPOT_DATE(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setSHIP_AND_CLOSED_DATE(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setUNIT_DELIVERY_TO_CUSTOMER_DATE(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setUNIT_DELIVERY_DATE(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setTAT_WITHOUT_EXE_CODE_TO_SHIP(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setTAT_WITHOUT_EXE_CODE_TO_POD(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setAWAITING_PART(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setAWAITING_ENGINEERING_QA(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setWARRANTY_ISSUE_BER(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setAWAITING_ENGINEERING_DOA(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setAWAITING_ENGINEERING_EGH(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setAWAITING_ENGINEERING_TAG(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setCUSTOMER_DDP(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setCUSTOMER_ADM(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setCUSTOMER_MBR(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setCUSTOMER_NFF(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setCUSTOMER_NFF2(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setWARRANTY_ISSUE_CTP(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setFF1(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setFF2(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setFF3(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setFF4(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            dellCarHoldDaysQuanlity.setFF5(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));

            if (dellCarHoldDaysQuanlity.getDPS().length() == 10) {
                dellCarHoldDaysQuanlity.setDPS("0" + dellCarHoldDaysQuanlity.getDPS());
            }

            dellCarHoldDaysQuanlityMap.put(dellCarHoldDaysQuanlity.getDPS(), dellCarHoldDaysQuanlity);
        }
        fis.close();
        return dellCarHoldDaysQuanlityMap;
    }
}
