package Curs6.Creational.Registry;

import java.util.HashMap;
import java.util.Map;

public class DBConnection {

    private DBConnection(Database database) {
        System.out.println("Ne-am conectat la " + database);
    }

    enum Database {
        DB_1, DB_2, DB_3;
    }

    private static Map<Database, DBConnection> registry = new HashMap<>();

    public static DBConnection getInstance(Database database) {
        if(registry.get(database) == null)
            registry.put(database, new DBConnection(database));
        return registry.get(database);
    }
}
