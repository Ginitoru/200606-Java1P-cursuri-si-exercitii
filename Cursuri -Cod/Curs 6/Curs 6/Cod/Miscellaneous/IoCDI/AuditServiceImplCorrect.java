package Curs6.Miscellaneous.IoCDI;

public class AuditServiceImplCorrect implements AuditService {

    private DatabaseConnection databaseConnection;

    AuditServiceImplCorrect(DatabaseConnection databaseConnection) {
        this.databaseConnection = databaseConnection;
    }

    @Override
    public boolean audit(String message) {
        return databaseConnection.save(message);
    }
}

/*
Problems - Solutions:
1. Every AuditServiceImpl has a copy of DatabaseConnection (makes no sense to create one every single time)
    WRONG: you can share it for every AuditServiceImpl
2. AuditServiceImpl is closely coupled with DatabaseConnection. If you change the constructor, it will be broken. What
    if DatabaseConnection requires a username and a password?
    WRONG: it is now loosely coupled, constructor doesnt matter
3. No easy way to test audit(), because it is dependent on DatabaseConnection. Since you cannot mock DatabaseConnection,
    you have to rely on actual implementation, and if database actually connects to a database...
    WRONG: you can now mock a DatabaseConnection and pass it as a parameter :)
 */