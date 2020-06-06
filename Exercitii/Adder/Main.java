package Adder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {


        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        try(br; isr){
            System.out.println("Enter number:\n");
            String line = br.readLine();
            double number = Double.parseDouble(line);
            double min = number, max = number, suma = 0, media =0;
            int index = 1;

            while(true){
                System.out.println("Enter number: ");
                double nextNumber = Double.parseDouble(br.readLine());
                if(nextNumber < min ){
                    min = nextNumber;
                    suma += nextNumber;
                    media += nextNumber / 2;
                    index++;
                }

                if(nextNumber > max){
                    max = nextNumber;
                    suma += nextNumber;
                    media += nextNumber / 2;
                    index++;
                }

                if(index  < 3){
                    suma  = (min+max);
                    media = (min + max) / 2;
                }

                System.out.println("MIN -> " + min + " MAX -> " + max);
                System.out.println("Sum is: " + suma);
                System.out.println("Average is: " + media);
                System.out.println("Total numbers: " + index + "\n");

            }
        }catch(IOException | NumberFormatException e){
            e.getMessage();
            System.out.println("Program has closed you entered wrong format number");
        }
    }
}
