package FilesReaders;


import FILES.FileAwpGetSequenceLineDetails;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileAwpDetailsRead_excel {


    public static Map<String, List<FileAwpGetSequenceLineDetails>> NewFileAwpDetailsReadFromExcel(String FILE_PATH) throws IOException {
//        FirstAndLastRow.cut(new File(FILE_PATH), 9);


        Map<String, List<FileAwpGetSequenceLineDetails>> fileAwpGetSequenceLineDetailsMap = new HashMap<>();
        FileInputStream fis = new FileInputStream(FILE_PATH);
        Workbook workbook = new XSSFWorkbook(fis);
//        0 oznacza jedna zakłądka itd
        Sheet sheet = workbook.getSheetAt(0);


        for (int j = 0; j <= sheet.getLastRowNum(); j++) {
            DataFormatter dataFormatter = new DataFormatter();
            FileAwpGetSequenceLineDetails fileAwpGetSequenceLineDetails = new FileAwpGetSequenceLineDetails();
            int columnNumber = 0;

            fileAwpGetSequenceLineDetails.setWWL_Order_Nr(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber))); columnNumber++;
            fileAwpGetSequenceLineDetails.setOrig_Part(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber))); columnNumber++;
            fileAwpGetSequenceLineDetails.setPart_Shipped(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber))); columnNumber++;
            fileAwpGetSequenceLineDetails.setOpen_Qty_parts_line(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber))); columnNumber++;
            fileAwpGetSequenceLineDetails.setOrig_From_Depot(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber))); columnNumber++;
            fileAwpGetSequenceLineDetails.setDepot_Name(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber))); columnNumber++;
            fileAwpGetSequenceLineDetails.setETA(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber))); columnNumber++;
            fileAwpGetSequenceLineDetails.setFrom_Depot(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber))); columnNumber++;
            fileAwpGetSequenceLineDetails.setUse_Qty(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber))); columnNumber++;
            fileAwpGetSequenceLineDetails.setLine_Status(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber))); columnNumber++;
            fileAwpGetSequenceLineDetails.setTracking_Nr(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber))); columnNumber++;
            fileAwpGetSequenceLineDetails.setTandT(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber))); columnNumber++;
            fileAwpGetSequenceLineDetails.setTag_Capture(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber))); columnNumber++;
            fileAwpGetSequenceLineDetails.setShip_with_Part(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber))); columnNumber++;
            fileAwpGetSequenceLineDetails.setOriginal_Return_Indicator(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber))); columnNumber++;
            fileAwpGetSequenceLineDetails.setDPS(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber))); columnNumber++;
            fileAwpGetSequenceLineDetails.setSequence(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber))); columnNumber++;
            fileAwpGetSequenceLineDetails.setCall_Status(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber))); columnNumber++;
            fileAwpGetSequenceLineDetails.setCall_Created(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber))); columnNumber++;
            fileAwpGetSequenceLineDetails.setAge(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber))); columnNumber++;
            fileAwpGetSequenceLineDetails.setAwpLineStatus(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber))); columnNumber++;
            fileAwpGetSequenceLineDetails.setEtaOtherDayDate(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));


//
//            if (fileDellCarReport.getDPS().length() == 10) {
//                fileDellCarReport.setDPS("0" + fileDellCarReport.getDPS());
//            }


            fileAwpGetSequenceLineDetailsMap.computeIfAbsent(fileAwpGetSequenceLineDetails.getDPS(),k-> new ArrayList<>()).add(fileAwpGetSequenceLineDetails);


        }
        fis.close();

        return fileAwpGetSequenceLineDetailsMap;
    }


}