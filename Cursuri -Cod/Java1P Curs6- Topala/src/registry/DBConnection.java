package registry;

import java.util.HashMap;
import java.util.Map;

public class DBConnection {
    enum Database{
        DB_1, DB_2
    }

    private DBConnection(Database db){
        System.out.println("Ne-am conectat la " + db);

    }

    private static Map<Database, DBConnection> registry = new HashMap<>();

    public static DBConnection getInstance(Database db){
        registry.computeIfAbsent(db, database -> new DBConnection(database));

        return registry.get(db);
    }


}
