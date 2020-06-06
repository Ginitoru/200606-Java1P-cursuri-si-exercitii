package aplicatie.controller;

import aplicatie.dao.AngajatDao;
import aplicatie.dao.DepartamentDao;
import aplicatie.model.Angajat;
import aplicatie.model.Departament;
import com.sun.tools.javac.Main;
import exemple.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class MainController {
    private DepartamentDao departamentDao;
    private AngajatDao angajatDao;

    public MainController() {
        Connection connection = DatabaseConnection.getConnection();
        departamentDao = new DepartamentDao(connection);
        angajatDao = new AngajatDao(connection);
    }

    public boolean adaugaDepartament(String numeDepartament) {
        return departamentDao.insert(numeDepartament);
    }

    public List<Departament> getDepartamente() {
        return departamentDao.findAll();
    }

    public boolean adaugaAngajat(Angajat angajat) {
        return angajatDao.insert(angajat);
    }

    public List<Angajat> getAngajati(int id) {
        return angajatDao.findAllById(id);
    }

    public boolean deleteAngajat(String nume) {
        return angajatDao.deleteByNume(nume);
    }
}