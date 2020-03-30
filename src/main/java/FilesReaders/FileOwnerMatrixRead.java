package FilesReaders;

import FILES.FileOwnerMatrix;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileOwnerMatrixRead {

    public static Map<String, FileOwnerMatrix> FileOwnerMatrixReadFromExcel(String FILE_PATH) throws IOException {
        Map<String, FileOwnerMatrix> fileWI_exel_map = new HashMap<>();
        FileInputStream fis = new FileInputStream(FILE_PATH);
        Workbook workbook = new XSSFWorkbook(fis);
//        0 oznacza jedna zakłądka itd
        Sheet sheet = workbook.getSheetAt(0);

        for (int j = 1; j <= sheet.getLastRowNum(); j++) {
            DataFormatter dataFormatter = new DataFormatter();
            FileOwnerMatrix fileOwnerMatrix = new FileOwnerMatrix();
            int columnNumber = 0;

            fileOwnerMatrix.setLocation(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileOwnerMatrix.setDeltaGroup(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileOwnerMatrix.setWarranty(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));columnNumber++;
            fileOwnerMatrix.setPOC(dataFormatter.formatCellValue(sheet.getRow(j).getCell(columnNumber)));

            {
                fileWI_exel_map.put(fileOwnerMatrix.getDeltaGroup() + fileOwnerMatrix.getWarranty(), fileOwnerMatrix);

            }
        }
        fis.close();

        return fileWI_exel_map;
    }
}
