package aplicatie.dao;

import aplicatie.model.Departament;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DepartamentDao {

    Connection connection;
    PreparedStatement insertQuery;
    PreparedStatement selectQuery;

    public DepartamentDao(Connection connection) {
        this.connection = connection;
        try {
            insertQuery = connection.prepareStatement("INSERT INTO dapartamente VALUES (null, ?)");
            selectQuery = connection.prepareStatement("SELECT * FROM dapartamente");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean insert(String numeDepartament) {
        try {
            insertQuery.setString(1, numeDepartament);
            int numarLiniiModificate = insertQuery.executeUpdate();
            return numarLiniiModificate != 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<Departament> findAll() {
        try {
            ResultSet result = selectQuery.executeQuery();
            List<Departament> departamente = new ArrayList<>();

            while(result.next()) {
                int id = result.getInt("id");
                String nume = result.getString("nume");
                Departament departament = new Departament(id, nume);
                departamente.add(departament);
            }

            return departamente;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
}
