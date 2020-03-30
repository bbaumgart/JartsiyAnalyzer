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



public class DatabaseDellCar {

    private static final String URL = "jdbc:mysql://10.106.8.116";
    private static final String PORT = "3306";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String PARAM = "/dllcar";
    private static final File pass = new File("src/main/resources/configDellCar.txt");
    private static final List<String> loginAndPassword = new ArrayList<>();
    private static String USERNAME = "";
    private static String PASSWORD = "";
    public static Connection dellCarConnection = null;
    public static Statement dellCarConnectionStatement = null;

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
            dellCarConnection = DriverManager.getConnection(getFormatedURL(), USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void createStatement() {
        try {
            dellCarConnectionStatement = dellCarConnection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void getConnection() {
        if (dellCarConnection == null) {
            readLoginAndPassword();
            loadDriver();
            loadConnection();
        }
    }

    static void closeConnection() {
        if (dellCarConnection != null) {
            try {
                dellCarConnection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    static void closeConnectionStatement() {
        if (dellCarConnectionStatement != null) {
            try {
                dellCarConnectionStatement.close();
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
