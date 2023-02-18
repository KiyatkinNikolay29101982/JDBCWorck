package util;

import org.postgresql.Driver;

import java.sql.*;
import java.util.Properties;

public class CreateConnection {

    private static Properties getProperties(){
        Properties properties = new Properties();
        properties.put("user", "postgres");
        properties.put("password", "postgres");
        properties.put("autoReconnect", "true");
        properties.put("characterEncoding", "UTF-8");
        properties.put("useUnicode", "true");
        //properties.put("useSSL", "true");
        properties.put("useJDBCComplientTimezoneShift", "true");
        properties.put("useLegacyDatetimeCode", "true");
        properties.put("ServerTime", "UTS");
        System.out.println("Propperty was create succefully");
        return properties;
    }

    public static Connection getConnection(){
        try {
            DriverManager.registerDriver(new Driver());
        } catch (
                SQLException e) {
            throw new RuntimeException(e);
        }

        String url = "jdbc:postgresql://localhost:5432/postgres";
        Connection connection;
        try {
             connection = DriverManager.getConnection(url, getProperties());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Connection was create succefully");
        return connection;
    }
}
