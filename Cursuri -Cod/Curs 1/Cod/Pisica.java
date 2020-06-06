package com.company;

import java.io.Serializable;
import java.util.Objects;

public class Pisica implements Serializable {

     int varsta;
     String nume;

    public Pisica() {
    }

    public Pisica(int varsta, String nume) {
        this.varsta = varsta;
        this.nume = nume;
    }
}
