public class Reteta {
    String nume;
    int nrCalorii;

    public Reteta(String nume, int nrCalorii) {
        this.nume = nume;
        this.nrCalorii = nrCalorii;
    }


    public Reteta() {
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "nume='" + nume + '\'' +
                ", nrCalorii=" + nrCalorii +
                '}';
    }
}
