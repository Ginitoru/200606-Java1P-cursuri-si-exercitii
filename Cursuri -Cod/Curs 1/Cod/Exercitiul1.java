package com.company;

import java.io.IOException;
import java.io.InputStream;

public class Exercitiul1 {

    static InputStream inputStream = System.in;

    public static void main(String[] args){
        byte[] data = new byte[10];
        int numberOfBytesRead = 0;

        try {
            numberOfBytesRead = inputStream.read(data);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String mesajCitit = new String(data);

        System.out.println("S-au citit: " + numberOfBytesRead + " bytes");


//        for(int i = 0; i < data.length; i++) {
//            System.out.println(data[i]);
//        }

        System.out.println(mesajCitit);

    }
}
