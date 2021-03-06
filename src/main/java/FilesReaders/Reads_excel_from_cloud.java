package FilesReaders;

import FILES.*;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static MySql.Operations.getConnection;

public class Reads_excel_from_cloud {

    private static final String username = System.getProperty("user.name").toLowerCase();
    private static final String oneDrivePath = "C:\\Users\\" + username + "\\OneDrive - Ivy Technology(1)\\Dell Automatic Reports\\CAR";
    public static final String awpRawDataPath = oneDrivePath + "\\Awaiting Parts\\";
    public static final String wipReport = oneDrivePath + "\\Work In Progres\\";
    public static final String dellCarReport = oneDrivePath + "\\Dell Car Report\\";
    public static final String wiReport = oneDrivePath + "\\Warranty Issue\\";
    public static final String carDispatches = oneDrivePath + "\\CAR Dispatches\\";
    public static final String DellCarHoldDays = oneDrivePath + "\\Dell CAR Hold days\\";
    public static final String ControlTower = oneDrivePath + "\\Control Tower\\";
    public static final String pulsReport = oneDrivePath + "\\Out Reports\\DellCarPuls\\";

    public static Map<String, FileOwnerMatrix> OwneMatrix() throws SQLException {
        Map<String, FileOwnerMatrix> OwneMatrix = new HashMap<>();
        Statement st = getConnection().createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM ownermatrix");
        while (rs.next()) {

            String Location = rs.getString("Location");
            String DeltaGroup = rs.getString("Delta_Group");
            String Warranty = rs.getString("Warranty");
            String POC = rs.getString("POC");
            OwneMatrix.put(DeltaGroup + Warranty, new FileOwnerMatrix(Location, DeltaGroup, Warranty, POC));
        }
        return OwneMatrix;
    }

    public static Map<String, FileCARDispatches> CarDispatches() throws IOException {
        return ReadFromCsv.readFileCARDispatches(carDispatches + "CAR Dispatches.csv");
    }

    public static Map<String, List<FileAwpGetSequenceLineDetails>> AWP_DETAILS_REPORT() throws IOException {
        return ReadFromExel.NewFileAwpDetailsReadFromExcel(awpRawDataPath + "AwaitingPartsCdmvRawData.xlsx");
    }

    public static Map<String, FileDellCarReport> Dell_CAR_REPORT() throws IOException {
        Map<String, FileDellCarReport> fileDellCarReportMap = ReadFromExel.NewFileDCRreadFromExcel(dellCarReport + "[RR][RT][GEO-CL-CT-OS-BTT-DT][DELL][CAR] Dell Car Report [0500].xlsx");
        Map<String, FileDellCarReport> fileDellCarReportMapNor = ReadFromExel.NewFileDCRreadFromExcel(dellCarReport + "[RR][RT][GEO-CL-CT-OS-BTT-DT][DELL][CAR] Dell Car Report [Nordics][0500].xlsx");
        fileDellCarReportMap.putAll(fileDellCarReportMapNor);
        return fileDellCarReportMap;
    }

    public static Map<String, DellCarHoldDaysQuanlity> DellCarHoldDaysQuantityReport() throws IOException {
        return ReadFromExel.NewFileHDQreadFromExcel(DellCarHoldDays + "[RR][RT][GEO-CL-CT-DT][DELL][CAR] Dell Car Hold days quantity[1500].xlsx");
    }

    public static Map<String, FileCT> ControlTowerReport() throws IOException {
        Map<String, FileCT> FileCTcurrentMonth = ReadFromExel.FileCTReadFromExcel(ControlTower + "[RR][RT][GEO-CL-CT-OS-BTT-DT] Control Tower DELL CAR logistics costs calculating [BYD_Cur_Month].xlsx");
        Map<String, FileCT> FileCTpreviousMonth = ReadFromExel.FileCTReadFromExcel(ControlTower + "[RR][RT][GEO-CL-CT-OS-BTT-DT] Control Tower DELL CAR logistics costs calculating [BYD_Prev_Month].xlsx");
        FileCTcurrentMonth.putAll(FileCTpreviousMonth);
        return FileCTcurrentMonth;
    }

    public static Map<String, FileWIP> WIP_REPORT() throws IOException {
        Map<String, FileWIP> fileWipMap = ReadFromExel.NewFileWipReadFromExcel(wipReport + "[RR][RT][GEO-UDR-CL-CN-OPTC][BYD-GLOBAL] WIP Report w Aging Info [DellCar][3h].xlsx");
        Map<String, FileWIP> fileWipMapNor = ReadFromExel.NewFileWipReadFromExcel(wipReport + "[RR][RT][GEO-UDR-CL-CN-OPTC][BYD-GLOBAL] " +
                "WIP Report " +
                "w Aging Info [DellCar Nordics][3AM].xlsx");
        fileWipMap.putAll(fileWipMapNor);
        return fileWipMap;
    }

    public static Map<String, FileWI> WI_REPORT() throws IOException {
        return ReadFromExel.FileWIReadFromExcel(wiReport + "DELL CAR Warranty Issue [Everyday every 1h].xlsx");
    }

    public static Map<String, String> GccSheetList() throws IOException {
        return ReadFromExel.FileGccSheetReadFromExcel(pulsReport + "Daily Dell CAR Puls Report.xlsx");
    }
}
