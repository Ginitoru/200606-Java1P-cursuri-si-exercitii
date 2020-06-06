package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

    private Connection connection;

    private ConnectionManager() {
        String url = "jdbc:mysql://localhost/java1pc9";
        try {
            connection = DriverManager.getConnection(url,"root", "");
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);

        }
    }

    private static final class SingletonHolder{
        public static final ConnectionManager INSTACE = new ConnectionManager();
    }

    public static ConnectionManager getInstance(){
         return   SingletonHolder.INSTACE;
    }

    public Connection getConnection(){
        return connection;
    }
}
