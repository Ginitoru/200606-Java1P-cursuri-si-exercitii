package dao;

import models.Departament;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DepartamentDAO {

    private Connection con;
    private PreparedStatement stmt1;
    private PreparedStatement stmt2;

    public DepartamentDAO(Connection con) {
        this.con = con;



        try {
            stmt1 = con.prepareStatement("INSERT INTO departamente VALUES (null, ?)");
            stmt2 = con.prepareStatement("SELECT * FROM departamente");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean create(Departament d){
        try {
            stmt1.setString(1,d.getNume());

           return stmt1.executeUpdate()  != 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<Departament> findAll(){
        try(ResultSet rs = stmt2.executeQuery()){
            List<Departament> list = new ArrayList<>();

            while(rs.next()){
                Departament d = new Departament(rs.getInt("id"), rs.getString("nume"));
                list.add(d);
            }
            return list;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

}
