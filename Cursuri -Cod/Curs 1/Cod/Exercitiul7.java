package com.company;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Exercitiul7 {

    public static void main(String[] args) throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream("pisicaSerializata.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        Pisica pisica = new Pisica(2, "Tom");

        objectOutputStream.writeObject(pisica);
    }
}
