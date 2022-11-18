package Area;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Area {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        DecimalFormat formatador = new DecimalFormat("0.000"); 
        double a = scan.nextDouble(); 
        double b = scan.nextDouble(); 
        double c = scan.nextDouble(); 
        double pi = 3.14159; 
        
        double triangulo = (a * c) / 2; 
        double circulo = pi * (c * c); 
        double trapezio = ((a + b) * c) / 2; 
        double quadrado = b * b; 
        double retangulo = a * b; 

        System.out.println("TRIANGULO: "+ formatador.format(triangulo));
        System.out.println("CIRCULO: "+ formatador.format(circulo));
        System.out.println("TRAPEZIO: "+ formatador.format(trapezio));
        System.out.println("QUADRADO: "+ formatador.format(quadrado));
        System.out.println("RETANGULO: "+ formatador.format(retangulo));
    }
}
