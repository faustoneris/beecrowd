package Consumo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        DecimalFormat formatador = new DecimalFormat("0.000"); 
        int distancia = scan.nextInt(); 
        double combustivel = scan.nextDouble(); 

        double media = distancia / combustivel; 

        System.out.println(formatador.format(media) + " km/l");
    }
}
