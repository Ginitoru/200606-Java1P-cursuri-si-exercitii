package Curs6.Miscellaneous.IoCDI;

public class TestIoC {

    public static void main(String[] args) {
        DatabaseConnection databaseConnection = new DatabaseConnection();
        AuditServiceImplCorrect auditServiceImpl1 = new AuditServiceImplCorrect(databaseConnection);

        CustomDatabaseConnection customDatabaseConnection = new CustomDatabaseConnection();
        AuditServiceImplCorrect auditServiceImpl2 = new AuditServiceImplCorrect(customDatabaseConnection);
    }
}
