package dao;

import models.Angajat;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AngajatDAO {

    private Connection con;
    private PreparedStatement stmt1;
    private PreparedStatement stmt2;
    private PreparedStatement stmt3;

    public AngajatDAO(Connection con) {
        this.con = con;

        try {
            stmt1 = con.prepareStatement("INSERT INTO nagajati VALUES(null, ?, ?, ?)");
            stmt2 = con.prepareStatement("SELECT * FROM angajati WHERE departament_id = ?");
            stmt3 = con.prepareStatement("DELETE FROM angajati WHERE id = ?");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean create(Angajat a){
        try {
            stmt1.setString(1, a.getNume());
            stmt1.setInt(2, a.getVarsta());
            stmt1.setInt(3, a.getDepartamentId());
            return stmt1.executeUpdate() != 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public List<Angajat> findByDepartamentId(int departamentId){


        try {
            stmt2.setInt(1,departamentId);

            ResultSet rs = stmt2.executeQuery();

            List<Angajat> list = new ArrayList<>();

            while(rs.next()){
                 Angajat a = new Angajat(
                rs.getInt("id"),
                rs.getString("nume"),
                rs.getInt("varsta"),
                rs.getInt("departament_id")

                 );
                list.add(a);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    public boolean remove(int angajatId){
        try {
            stmt3.setInt(1, angajatId);


            return stmt3.executeUpdate() != 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }


}
