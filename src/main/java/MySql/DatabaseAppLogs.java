package MySql;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class DatabaseAppLogs {

    private static final String URL = "jdbc:mysql://10.106.8.116";
    private static final String PORT = "3306";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String PARAM = "/app_logs";
    private static final File pass = new File("src/main/resources/configAppLog.txt");
    private static final List<String> loginAndPassword = new ArrayList<>();
    private static String USERNAME = "";
    private static String PASSWORD = "";
    public static Connection appLogsConnection = null;
    public static Statement appLogsConnectionStatement = null;

    private static String getFormatedURL() {
        return URL + ":" + PORT + PARAM;
    }

    private static void loadDriver() {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void loadConnection() {
        try {
            appLogsConnection = DriverManager.getConnection(getFormatedURL(), USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void createStatement() {
        try {
            appLogsConnectionStatement = appLogsConnection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void getConnection() {
        if (appLogsConnection == null) {
            readLoginAndPassword();
            loadDriver();
            loadConnection();
        }
    }

    static void closeConnection() {
        if (appLogsConnection != null) {
            try {
                appLogsConnection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    static void closeConnectionStatement() {
        if (appLogsConnectionStatement != null) {
            try {
                appLogsConnectionStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private static void readLoginAndPassword() {
        try {
            Scanner sc = new Scanner(pass);
            while (sc.hasNextLine()) {
                loginAndPassword.add(sc.nextLine());
            }
            USERNAME = loginAndPassword.get(0);
            PASSWORD = loginAndPassword.get(1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
