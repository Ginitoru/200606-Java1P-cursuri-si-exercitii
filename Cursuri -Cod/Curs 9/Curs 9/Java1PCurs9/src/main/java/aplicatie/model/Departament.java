package aplicatie.model;

public class Departament {
    int id;
    String nume;

    public Departament(int id, String nume) {
        this.id = id;
        this.nume = nume;
    }

    public Departament() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Departament{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                '}';
    }
}