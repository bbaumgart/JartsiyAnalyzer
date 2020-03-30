package ConvertingFiles.Operations;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FirstAndLastRow {

    public static void cut(File dellCar, int howMuch)  {
        try {
            FileInputStream excellFile = new FileInputStream(dellCar);
            XSSFWorkbook workbook1 = new XSSFWorkbook(excellFile);
            XSSFSheet sheet = workbook1.getSheetAt(0);
//=====================================
            for (int i = howMuch; i >= 0; i--) {
                RemoveRows.removeRow(sheet, i);
            }
            RemoveRows.removeRow(sheet, sheet.getFirstRowNum());
            RemoveRows.removeRow(sheet, sheet.getLastRowNum());
//=====================================

            excellFile.close();

            FileOutputStream out = new FileOutputStream(dellCar);
            workbook1.write(out);
            out.close();
          //  System.out.println("obcielo gore i dol");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}