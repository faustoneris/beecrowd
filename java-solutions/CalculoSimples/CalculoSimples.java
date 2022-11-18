package CalculoSimples;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        DecimalFormat formatador = new DecimalFormat("0.00"); 

        int codigoPecaUm = scan.nextInt(); 
        int numeroDePecas = scan.nextInt();     
        double precoPecaUm = scan.nextDouble(); 

        int codigoPecaDois = scan.nextInt(); 
        int numeroDePecasDoDois = scan.nextInt(); 
        double precoPecaDois = scan.nextDouble(); 

        double pecasSomadas = (numeroDePecas * precoPecaUm) + (numeroDePecasDoDois * precoPecaDois);

        var precoTotal = formatador.format(pecasSomadas); 

        System.out.println(precoTotal);
    }
}
