import DailyDellCARPulsReport.DailyDellCARPuls;
import FilesReaders.DataBaseFromFiles;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

public class main {
    public static void main(String[] args) throws IOException, SQLException, ParseException {

        DataBaseFromFiles.runReaders();
        DailyDellCARPuls.runDailyPulsList();


    }
}
