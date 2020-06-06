package builder;

public class Casa {
    private String adresa;
    private int suprafata;
    private int usi;
    private int etaje;

    public Casa(){

    }

    public static class Builder{
        private Casa casa = new Casa();


        public Builder setUsi(int usi){
            casa.usi = usi;
            return this;
        }

        public Builder setEtaje(int etaje){
            casa.etaje = etaje;
            return this;
        }

        public Builder setAdresa(String adresa){
            casa.adresa =adresa;
            return this;
        }

        public Builder setSuprafata(int suprafata){
            casa.suprafata = suprafata;
            return this;
        }

        public Casa build(){
            return casa;
        }
    }


    @Override
    public String toString() {
        return "Casa{" +
                "adresa='" + adresa + '\'' +
                ", suprafata=" + suprafata +
                ", usi=" + usi +
                ", etaje=" + etaje +
                '}';
    }
}
