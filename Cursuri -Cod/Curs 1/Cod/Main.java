package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> numere = new ArrayList<>();
        numere.add(5);
        numere.add(10);
        numere.add(3);
        numere.add(12);
        numere.add(7);
        numere.add(9);
        numere.add(1);

        int min = numere.get(0), max = numere.get(0);


        for(int i = 1; i < numere.size(); i++) {
            if(numere.get(i) > max)
                max = numere.get(i);
            if(numere.get(i) < min)
                min = numere.get(i);
        }



        System.out.println("Hello World!");
    }

}
