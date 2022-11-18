import java.util.Scanner;
import java.math.BigDecimal;

public class NotasEMoedas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double number = scan.nextDouble();


        int cem = 0;
        int cinquenta = 0;
        int vinte = 0;
        int dez = 0;
        int cinco = 0;
        int dois = 0;

        int moedaUm = 0;
        int moedaCinquenta = 0;
        int moedaVinteCinco = 0;
        int moedaDez = 0;
        int moedaCinco = 0;
        int moedaUmCents = 0;

        if (number == 0 || number == 0.00) {
            System.out.println("NOTAS:");
            System.out.println(cem + " nota(s) de R$ " + 100.00);
            System.out.println(cinquenta + " nota(s) de R$ " + 50.00);
            System.out.println(vinte + " nota(s) de R$ " + 20.00);
            System.out.println(dez + " nota(s) de R$ " + 10.00);
            System.out.println(cinco + " nota(s) de R$ " + 5.00);
            System.out.println(dois + " nota(s) de R$ " + 2.00);
            System.out.println("MOEDAS:");
            System.out.println(moedaUm + " moeda(s) de R$ " + 1.00);
            System.out.println(moedaCinquenta + " moeda(s) de R$ " + 0.50);
            System.out.println(moedaVinteCinco + " moeda(s) de R$ " + 0.25);
            System.out.println(moedaDez + " moeda(s) de R$ " + 0.10);
            System.out.println(moedaCinco + " moeda(s) de R$ " + 0.05);
            System.out.println(moedaUmCents + " moeda(s) de R$ " + 0.01);

        } else {
            while (number != 0.00) {
                if (number >= 100.00) {
                    cem++;
                    number = number - 100.00;
                } else if (number >= 50.00) {
                    cinquenta++;
                    number = number - 50.00;
                } else if (number >= 20.00) {
                    vinte++;
                    number = number - 20.00;
                } else if (number >= 10.00) {
                    dez++;
                    number = number - 10.00;
                } else if (number >= 5.00) {
                    cinco++;
                    number = number - 5.00;
                } else if (number >= 2.00) {
                    dois++;
                    number = number - 2.00;
                } else if (number >= 1.00) {
                    moedaUm++;
                    number = number - 1.00;
                } else if (number >= 0.50) {
                    moedaCinquenta++;
                    number = number - 0.50;
                } else if (number >= 0.25) {
                    moedaVinteCinco++;
                    number = number - 0.25;
                } else if (number >= 0.10) {
                    moedaDez++;
                    number = number - 0.10;
                } else if (number >= 0.05) {
                    moedaCinco++;
                    number = number - 0.05;
                } else if (number >= 0.01) {
                    moedaUmCents++;
                    number = number - 0.01;
                    System.out.println(number);
                }
                 else {
                    moedaUmCents++;
                    number = 0; 
                }
            }

            System.out.println("NOTAS:");
            System.out.println(cem + " nota(s) de R$ " + 100.00);
            System.out.println(cinquenta + " nota(s) de R$ " + 50.00);
            System.out.println(vinte + " nota(s) de R$ " + 20.00);
            System.out.println(dez + " nota(s) de R$ " + 10.00);
            System.out.println(cinco + " nota(s) de R$ " + 5.00);
            System.out.println(dois + " nota(s) de R$ " + 2.00);
            System.out.println("MOEDAS:");
            System.out.println(moedaUm + " moeda(s) de R$ " + 1.00);
            System.out.println(moedaCinquenta + " moeda(s) de R$ " + 0.50);
            System.out.println(moedaVinteCinco + " moeda(s) de R$ " + 0.25);
            System.out.println(moedaDez + " moeda(s) de R$ " + 0.10);
            System.out.println(moedaCinco + " moeda(s) de R$ " + 0.05);
            System.out.println(moedaUmCents + " moeda(s) de R$ " + 0.01);
        }
    }
}