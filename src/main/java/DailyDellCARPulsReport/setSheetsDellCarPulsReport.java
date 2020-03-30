package DailyDellCARPulsReport;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class setSheetsDellCarPulsReport {
    private static final Logger LOG = LogManager.getLogger();

    public static void NotInDellCarReportSheetNewFile() throws IOException {
        System.out.println("formatuje na appOut");
        FileInputStream file = new FileInputStream(new File("RAPORTY OUT\\\\Daily Reports\\Daily Dell CAR Puls Report.xlsx"));

        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("ListToDailyDellCARPuls");

        CreationHelper createHelper = workbook.getCreationHelper();
        CellStyle cellStyle = workbook.createCellStyle();
        cellStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd-MM-yyyy"));

        for (int i = sheet.getLastRowNum(); i > 0; i--) {
            Row dataRow = sheet.getRow(i);

            Cell TATtoPOD = dataRow.getCell(9); //liczba
            Cell ShipAndCloseDate = dataRow.getCell(14);//data

            try {
                TATtoPOD.setCellValue(Long.parseLong(String.valueOf(TATtoPOD)));
            } catch (Exception e) {
                // System.out.println(e);
            }
            try {
                String sDate1 = String.valueOf(ShipAndCloseDate);
                Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
                ShipAndCloseDate.setCellValue(date1);
                ShipAndCloseDate.setCellStyle(cellStyle);
            } catch (Exception e) {
               ShipAndCloseDate.setCellValue("");
            }
        }
//        new File("RAPORTY OUT\\\\Daily Reports\\ListToDailyDellCARPuls.xlsx"
        try (FileOutputStream fos = new FileOutputStream(new File(String.valueOf(file)))){
            workbook.write(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void NotInDellCarReportSheet() throws IOException {
        System.out.println("formatuje zakladke Not In Dell Car Report");
        FileInputStream file = new FileInputStream(new File("RAPORTY OUT\\\\Daily Reports\\Daily Dell CAR Puls Report.xlsx"));

        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("Not In Dell Car Report");

        CreationHelper createHelper = workbook.getCreationHelper();
        CellStyle cellStyle = workbook.createCellStyle();
        cellStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd-MM-yyyy"));

        for (int i = sheet.getLastRowNum(); i > 0; i--) {
            Row dataRow = sheet.getRow(i);
            Cell OCB_Aging = dataRow.getCell(3); //liczba


            try {
                OCB_Aging.setCellValue(Long.parseLong(String.valueOf(OCB_Aging)));
            } catch (Exception e) {
                System.out.println(e);
                LOG.info("Formating OCB_Aging in Not In Dell Car Report unsuccessful");
            }
        }

        try {

//--------------------zapisuje po zmianie formatu
            FileOutputStream out = new FileOutputStream(new File(String.valueOf(file)));
            workbook.write(out);
            out.close();
            LOG.info("Updated Sheet: Not In Dell Car Report in file Daily Dell CAR Puls Report.xlsx");

        } catch (Exception e) {
            e.printStackTrace();
            LOG.error("Sheet : Not In Dell Car Report in file Daily Dell CAR Puls Report.xlsx not updated");
        }

    }

    public static void ListToDailyDellCARPuls() throws IOException, ParseException {
        System.out.println("formatuje zakladke ListToDailyDellCARPuls");
        FileInputStream file = new FileInputStream(new File("RAPORTY OUT\\\\Daily Reports\\Daily Dell CAR Puls Report.xlsx"));

        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("ListToDailyDellCARPuls");
//        XSSFDataFormat dataFormat = workbook.createDataFormat();

        CreationHelper createHelper = workbook.getCreationHelper();
        CellStyle cellStyle = workbook.createCellStyle();
        cellStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd-MM-yyyy"));

//--------------------i zapisuję
        for (int i = sheet.getLastRowNum(); i > 0; i--) {
            Row dataRow = sheet.getRow(i);

            Cell Aging_OCB = dataRow.getCell(9); //liczba
            Cell DPS_Created_Date_By_OCB = dataRow.getCell(13); //data
            Cell DPS_Created_Date_By_DCR = dataRow.getCell(14); //data
            Cell Unit_Arrival_To_Depot_Date = dataRow.getCell(15); //data
            Cell Ship_Date = dataRow.getCell(16); //data
            Cell POD_Date = dataRow.getCell(17); //data

            try {
                Aging_OCB.setCellValue(Long.valueOf(String.valueOf(Aging_OCB)));
            } catch (Exception e) {
                LOG.error("Formating number Aging_OCB unsuccessful " + e);
            }

            try {
                String sDate1 = String.valueOf(DPS_Created_Date_By_OCB);
                Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
                DPS_Created_Date_By_OCB.setCellValue(date1);
                DPS_Created_Date_By_OCB.setCellStyle(cellStyle);
            } catch (Exception e) {
                LOG.error("Formating date DPS_Created_Date_By_OCB unsuccessful " + e);
            }
//            2019-09-09 17:25:05


            try {
                String sDate1 = String.valueOf(DPS_Created_Date_By_DCR);
                Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);

                DPS_Created_Date_By_DCR.setCellValue(date1);
                DPS_Created_Date_By_DCR.setCellStyle(cellStyle);
            } catch (Exception e) {
                LOG.error("Formating date DPS_Created_Date_By_DCR unsuccessful " + e);
            }


//            try {
//                String sDate1 = String.valueOf(Unit_Arrival_To_Depot_Date);
//                Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
//                Unit_Arrival_To_Depot_Date.setCellValue(date1);
//                Unit_Arrival_To_Depot_Date.setCellStyle(cellStyle);
//            } catch (Exception e) {
//                LOG.error("Formating date Unit_Arrival_To_Depot_Date unsuccessful " + e);
//            }
//            try {
//                String sDate1 = String.valueOf(Ship_Date);
//                Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
//                Ship_Date.setCellValue(date1);
//                Ship_Date.setCellStyle(cellStyle);
//            } catch (Exception e) {
//                LOG.error("Formating date Ship_Date unsuccessful " + e);
//            }
//            try {
//                String sDate1 = String.valueOf(POD_Date);
//                Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
//                POD_Date.setCellValue(date1);
//                POD_Date.setCellStyle(cellStyle);
//            } catch (Exception e) {
//                LOG.error("Formating date POD_Date unsuccessful " + e);
//            }
//
        }
        try {


            FileOutputStream out = new FileOutputStream(new File(String.valueOf(file)));
            workbook.write(out);
            out.close();
            LOG.info("Updated Sheet: ListToDailyDellCARPuls in file Daily Dell CAR Puls Report.xlsx");

        } catch (Exception e) {
            e.printStackTrace();
            LOG.error("Sheet :  ListToDailyDellCARPuls in file Daily Dell CAR Puls Report.xlsx not updated");
        }
    }

}
