package FilesReaders;

import DailyDellCARPulsReport.DpsHistoryWithAging;
import FILES.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBaseFromFiles {
    private static final Logger LOG = LogManager.getLogger();
    public static Map<String, FileDellCarReport> carReportMap = new HashMap<>();
    public static Map<String, FileWIP> fileWIPMap = new HashMap<>();
    public static Map<String, FileWI> fileWIMap = new HashMap<>();
    public static Map<String, List<FileAwpGetSequenceLineDetails>> fileAwpGetSequenceLineDetailsMap = new HashMap<>();
    public static Map<String, String> GccSheetListMap = new HashMap<>();
    public static Map<String, FileOwnerMatrix> ownerMatrixMap = new HashMap<>();
    public static Map<String, FileCARDispatches> CARDispatchesMap = new HashMap<>();
    public static Map<String, DellCarHoldDaysQuanlity> daysQuanlityMap = new HashMap<>();
    public static Map<String, DpsHistoryWithAging> dpsHistoryWithAgingMap = new HashMap<>();

    public static void runReaders() throws IOException, SQLException {
        CARDispatchesMap = FilesReaders.Reads_excel_from_cloud.CarDispatches();
        carReportMap = FilesReaders.Reads_excel_from_cloud.Dell_CAR_REPORT();
        fileWIPMap = FilesReaders.Reads_excel_from_cloud.WIP_REPORT();
        fileWIMap = FilesReaders.Reads_excel_from_cloud.WI_REPORT();
        GccSheetListMap = FilesReaders.Reads_excel_from_cloud.GccSheetList();
        fileAwpGetSequenceLineDetailsMap = FilesReaders.Reads_excel_from_cloud.AWP_DETAILS_REPORT();
        ownerMatrixMap = FilesReaders.Reads_excel_from_cloud.OwneMatrix();
        daysQuanlityMap = FilesReaders.Reads_excel_from_cloud.DellCarHoldDaysQuantityReport();

    }
}
