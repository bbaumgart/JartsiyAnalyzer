package MySql;
import java.sql.*;

public class Operations {
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://10.106.8.116:3306/static_variables", "DellAutomat", "rzL85sc?BSE");
    }

}
