package com.company;

import java.io.*;
import java.util.Random;

public class Exercitiul5 {

    public static void main(String[] args) {
        //p1 -> citesc n si line
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        Integer n = 0;
        String fileName = "";

        try {
            n = Integer.parseInt(bufferedReader.readLine());
            fileName = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //p2 -> scriu in fisier
        try {
            PrintStream printStream = new PrintStream(fileName);
            Random random = new Random();

            for (int i = 0; i < n; i++) {
                printStream.println(random.nextInt(999));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
