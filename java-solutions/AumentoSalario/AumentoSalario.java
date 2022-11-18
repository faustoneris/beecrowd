package AumentoSalario;

import java.util.Scanner;
import java.text.DecimalFormat;

public class AumentoSalario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        DecimalFormat formatador = new DecimalFormat("0.00");
        double salario = scan.nextDouble(); 

        if (salario <= 400.00) {
            double salarioComBonus = (salario * 0.15) + salario; 
            double valorAdicionado = salario * 0.15; 
            System.out.println("Novo salario: " + formatador.format(salarioComBonus));
            System.out.println("Reajuste ganho: " + formatador.format(valorAdicionado));
            System.out.println("Em percentual: " + "15 %");
        } else if (salario <= 800.00) { 
            double salarioComBonus = (salario * 0.12) + salario; 
            double valorAdicionado = salario * 0.12; 
            System.out.println("Novo salario: " + formatador.format(salarioComBonus));
            System.out.println("Reajuste ganho: " + formatador.format(valorAdicionado));
            System.out.println("Em percentual: " + "12 %");
        } else if (salario <= 1200.00) { 
            double salarioComBonus = (salario * 0.10) + salario; 
            double valorAdicionado = salario * 0.10; 
            System.out.println("Novo salario: " + formatador.format(salarioComBonus));
            System.out.println("Reajuste ganho: " + formatador.format(valorAdicionado));
            System.out.println("Em percentual: " + "10 %");
        } else if (salario <= 2000.00) { 
            double salarioComBonus = (salario * 0.07) + salario; 
            double valorAdicionado = salario * 0.07; 
            System.out.println("Novo salario: " + formatador.format(salarioComBonus));
            System.out.println("Reajuste ganho: " + formatador.format(valorAdicionado));
            System.out.println("Em percentual: " + "7 %");
        } else {
            double salarioComBonus = (salario * 0.04) + salario; 
            double valorAdicionado = salario * 0.04; 
            System.out.println("Novo salario: " + formatador.format(salarioComBonus));
            System.out.println("Reajuste ganho: " + formatador.format(valorAdicionado));
            System.out.println("Em percentual: " + "4 %");
        }
    }
}
