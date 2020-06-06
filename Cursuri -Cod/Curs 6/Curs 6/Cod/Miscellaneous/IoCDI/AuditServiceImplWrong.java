package Curs6.Miscellaneous.IoCDI;

public class AuditServiceImplWrong implements AuditService {

    private DatabaseConnection databaseConnection = new DatabaseConnection();

    @Override
    public boolean audit(String message) {
        return databaseConnection.save(message);
    }
}

/*
Problems:
1. Every AuditServiceImpl has a copy of DatabaseConnection (makes no sense to create one every single time)
2. AuditServiceImpl is closely coupled with DatabaseConnection. If you change the constructor, it will be broken. What
    if DatabaseConnection requires a username and a password?
3. No easy way to test audit(), because it is dependent on DatabaseConnection. Since you cannot mock DatabaseConnection,
    you have to rely on actual implementation, and if database actually connects to a database...
 */