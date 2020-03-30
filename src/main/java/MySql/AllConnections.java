package MySql;

public class AllConnections {

    public static void open(){
        MySql.DatabaseAppLogs.getConnection();
        MySql.DatabaseAppLogs.createStatement();

        MySql.DatabaseDellCar.getConnection();
        MySql.DatabaseDellCar.createStatement();
    }
    public static void close(){
        MySql.DatabaseAppLogs.closeConnectionStatement();
        MySql.DatabaseAppLogs.closeConnection();

        MySql.DatabaseDellCar.closeConnectionStatement();
        MySql.DatabaseDellCar.closeConnection();
    }
}
