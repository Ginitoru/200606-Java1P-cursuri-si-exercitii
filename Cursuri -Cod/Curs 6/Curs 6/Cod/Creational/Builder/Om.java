package Curs6.Creational.Builder;

import java.time.LocalDate;

public class Om {

    private String nume;
    private String prenume;
    private String CNP;
    private LocalDate dataNasterii;
    private int inaltime;
    private int greutate;
    private String nationalitate;

    public String getNume() { return nume; }
    public String getPrenume() { return prenume; }
    public String getCNP() { return CNP; }
    public LocalDate getDataNasterii() { return dataNasterii; }
    public int getInaltime() { return inaltime; }
    public int getGreutate() { return greutate; }
    public String getNationalitate() { return nationalitate; }

    public Om(OmBuilder builder) {
        this.nume = builder.nume;
        this.prenume = builder.prenume;
        this.CNP = builder.CNP;
        this.dataNasterii = builder.dataNasterii;
        this.inaltime = builder.inaltime;
        this.greutate = builder.greutate;
        this.nationalitate = builder.nationalitate;
    }

    public static class OmBuilder {
        private String nume;
        private String prenume;
        private String CNP;
        private LocalDate dataNasterii;
        private int inaltime;
        private int greutate;
        private String nationalitate;

        public OmBuilder(String nume, String prenume, String CNP, LocalDate dataNasterii) {
            this.nume = nume;
            this.prenume = prenume;
            this.CNP = CNP;
            this.dataNasterii = dataNasterii;
        }

        public OmBuilder withInaltime(int inaltime) {
            this.inaltime = inaltime;
            return this;
        }

        public OmBuilder withGreutate(int greutate) {
            this.greutate = greutate;
            return this;
        }

        public OmBuilder withNationalitate(String nationalitate) {
            this.nationalitate = nationalitate;
            return this;
        }

        public Om build() {
            return new Om(this);
        }
    }
}
