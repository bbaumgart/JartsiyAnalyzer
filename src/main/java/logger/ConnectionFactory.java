package logger;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionFactory {

    private static BasicDataSource dataSource;

    private ConnectionFactory() {
    }

    public static Connection getConnection() throws SQLException {
        if (dataSource == null) {
            dataSource = new BasicDataSource();
            //logger run in company network
            dataSource.setUrl("jdbc:mysql://10.106.8.116:3306/app_logs?serverTimezone=CET");
            //logger run on server:  10.106.8.116
//            dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/app_logs");
            dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
            dataSource.setUsername("logger");
            dataSource.setPassword("logger123!");
        }
        return dataSource.getConnection();
    }
}
