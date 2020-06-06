import java.io.Serializable;

public class Pisica implements Serializable {

    public static final long serialVersionUID = 2;

    int varsta;
    String culoare;
    String nume;

    public Pisica(int varsta, String culoare, String nume) {
        this.varsta = varsta;
        this.culoare = culoare;
        this.nume = nume;
    }

    public Pisica(int varsta, String culoare) {
        this.varsta = varsta;
        this.culoare = culoare;
    }
}
