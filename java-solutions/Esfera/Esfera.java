package Esfera;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Esfera {
    //formula (4/3) * pi * R3

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        DecimalFormat formatador = new DecimalFormat("0.000"); 
        double pi = 3.14159; 
    
        double raio = scan.nextDouble(); 
        
        double formula = (4.0/3) * pi * (raio * raio * raio); 
        System.out.println("VOLUME = " + formatador.format(formula));
    }
}
