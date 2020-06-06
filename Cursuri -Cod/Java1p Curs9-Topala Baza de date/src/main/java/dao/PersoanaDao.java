package dao;

import model.Persoana;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersoanaDao {

    private Connection conection;

    private PreparedStatement createStatement;
    private PreparedStatement findAllStatement;
    private PreparedStatement findByNumeStatement;
    private PreparedStatement deleteStatement;

    public PersoanaDao(Connection conection) {
        this.conection = conection;

        try {
            createStatement = conection.prepareStatement("INSERT INTO persoana VALUES(null , ?)");

            findAllStatement = conection.prepareStatement("SELECT * FROM persoana");

            findByNumeStatement = conection.prepareStatement("SELECT * FROM persoana WHERE nume = ?");

            deleteStatement = conection.prepareStatement("DELETE FROM persoana WHERE id = ?");


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean create(Persoana p){
        //indexarea parametrilor (?) se face de la 1
        //daca in loc de null aveam (?) faceam un statement cu setInt(1, p.getId()) si
        try {
            createStatement.setString(1,p.getNume());

            // executeUpdate() returneaza nr de inregistrari modificate
            return createStatement.executeUpdate() !=0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<Persoana> findAll(){
        List<Persoana> persoane = new ArrayList<>();


        try {
            ResultSet rs = findAllStatement.executeQuery();

            while(rs.next()){
                Persoana p = new Persoana(
                rs.getInt("id"),
                rs.getString("nume")
            );
                persoane.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return persoane;
    }

    public Optional<Persoana> findByNume(String nume){
        try {
            findByNumeStatement.setString(1, nume);

            ResultSet rs = findByNumeStatement.executeQuery();
            if(rs.next()){
                return Optional.of(new Persoana(
                                    rs.getInt("id"),
                                    rs.getString("nume"))
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    public boolean delete (int id){
        try {
            deleteStatement.setInt(1,id);

            return deleteStatement.executeUpdate() !=0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }


}
