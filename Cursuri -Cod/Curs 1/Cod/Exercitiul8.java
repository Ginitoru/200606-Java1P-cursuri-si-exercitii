package com.company;

import java.io.*;

public class Exercitiul8 {


    public static void main(String[] args) throws Exception {

        FileInputStream fileInputStream = new FileInputStream("pisicaSerializata.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);


        Pisica pisica = (Pisica) objectInputStream.readObject();

        System.out.println(pisica.nume);
        System.out.println(pisica.varsta);
    }
}
