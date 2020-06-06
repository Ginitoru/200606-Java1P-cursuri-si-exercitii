import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Produs {

    private String nume;
    private int pret;
    private String categorie;

    public Produs() {
    }

    public Produs(String nume, int pret, String categorie) {
        this.nume = nume;
        this.pret = pret;
        this.categorie = categorie;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produs produs = (Produs) o;
        return pret == produs.pret &&
                Objects.equals(nume, produs.nume) &&
                Objects.equals(categorie, produs.categorie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, pret, categorie);
    }

    @Override
    public String toString() {
        return "Produs{" +
                "nume='" + nume + '\'' +
                ", pret=" + pret +
                ", categorie='" + categorie + '\'' +
                '}';
    }

    //Produs.getList()
    public static List<Produs> getList() {
        return Arrays.asList(
                new Produs("laptop", 2000, "electronice"),
                new Produs("telefon", 1000, "electronice"),
                new Produs("bluza", 50, "textile"),
                new Produs("pantaloni", 100, "textile"),
                new Produs("frigider", 2500, "electrocasnice")
        );

        //electronice -> laptop, telefon
        //textile -> bluza, pantaloni
        //electrocasnice -> frigider
    }
}
