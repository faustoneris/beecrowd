package Cedulas;

import java.util.Scanner;

public class Cedulas {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        int cem = 0;
        int cinquenta = 0;
        int vinte = 0;
        int dez = 0;
        int cinco = 0;
        int dois = 0;
        int um = 0; 

        System.out.println(number);
        while (number != 0) {
            if (number >= 100) {
                cem++;
                number = number - 100;
            } else if (number >= 50) {
                cinquenta++;
                number = number - 50;
            } else if (number >= 20) {
                vinte++;
                number = number - 20;
            } else if (number >= 10) {
                dez++;
                number = number - 10;
            } else if (number >= 5) {
                cinco++;
                number = number - 5;
            } else if (number >= 2) {
                dois++;
                number = number - 2;
            } else if (number >= 1) {
                um++;
                number = number - 1;
            } else {
                number = 0; 
            }
        }

        System.out.println(cem + " nota(s) de R$ 100,00");
        System.out.println(cinquenta + " nota(s) de R$ 50,00");
        System.out.println(vinte + " nota(s) de R$ 20,00");
        System.out.println(dez + " nota(s) de R$ 10,00");
        System.out.println(cinco + " nota(s) de R$ 5,00");
        System.out.println(dois + " nota(s) de R$ 2,00");
        System.out.println(um + " nota(s) de R$ 1,00");

    }
}
