package controller;

import dao.AngajatDAO;
import dao.DepartamentDAO;
import models.Angajat;
import models.Departament;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class MainController {
    private DepartamentDAO departamentDAO;
    private AngajatDAO angajatDAO;


    private MainController(){
        String url = "jdbc:mysql://localhost/java1pc8";

        try {
            Connection con = DriverManager.getConnection(url,"root" ,"" );
            departamentDAO = new DepartamentDAO(con);
            angajatDAO = new AngajatDAO(con);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static class MainControllerHolder{
        private static final MainController INSTANCE = new MainController();
    }

    public static MainController getInstance(){
        return MainControllerHolder.INSTANCE;
    }

    public boolean adaugaDepartament(Departament d){
        return departamentDAO.create(d);
    }

    public List<Departament> getDepartamente(){
        return departamentDAO.findAll();
    }

    public boolean adaugaAngajat (Angajat a){
        return angajatDAO.create(a);
    }

    public List<Angajat>  getAnagajati(int departementId){
      return  angajatDAO.findByDepartamentId(departementId);
    }

    public boolean removeAngajat(Angajat a){
        return angajatDAO.remove(a.getId());
    }

}
