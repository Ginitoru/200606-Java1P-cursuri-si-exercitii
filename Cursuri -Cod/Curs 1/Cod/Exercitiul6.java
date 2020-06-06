package com.company;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Exercitiul6 {


    public static void main(String[] args) throws Exception {

        //citire consola
        InputStreamReader inputStreamReader1 = new InputStreamReader(System.in);
        BufferedReader bufferedReader1 = new BufferedReader(inputStreamReader1);
        String fileName = bufferedReader1.readLine();

        //citire fisier
        FileInputStream fileInputStream = new FileInputStream(fileName);
        InputStreamReader inputStreamReader2 = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader2);
        int sum = 0, nrLines = 0;

        String line = bufferedReader2.readLine();
        while (line != null) {
            Integer nr = Integer.parseInt(line);
            sum += nr;
            nrLines++;
            line = bufferedReader2.readLine();
        }

        System.out.println("Media numerelor citite este " + sum / nrLines);
    }
}
