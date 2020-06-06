package Curs6.Creational.Registry;

public class TestRegistry {

    public static void main(String[] args) {
        DBConnection connection1 = DBConnection.getInstance(DBConnection.Database.DB_1);
        DBConnection connection2 = DBConnection.getInstance(DBConnection.Database.DB_1);

        DBConnection connection3 = DBConnection.getInstance(DBConnection.Database.DB_2);
        DBConnection connection4 = DBConnection.getInstance(DBConnection.Database.DB_3);
    }
}
