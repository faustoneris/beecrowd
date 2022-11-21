package ImpoostoDeRenda;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ImpostoRenda {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            DecimalFormat formatador = new DecimalFormat("0.00");
            
            double salario = scan.nextDouble();
            

            if (salario <= 2000.00) {
                System.out.println("Isento");
            } else if (salario <= 3000.00 || salario > 3000.01 && salario < 4000) {
                double salarioComDezoito = 0.00;
                double salarioDescontando = 0.00;
                double salarioRestoSubtracao = 0.00;
                if (salario > 3000.01) {
                    salarioDescontando = salario - 3000.00;
                    salarioComDezoito = salarioDescontando * 0.18;
                    salarioRestoSubtracao = salarioDescontando;
                }
                salario = (salario - 2000.00) - salarioRestoSubtracao;
                salario = salario * 0.08;
                salario = salario + salarioComDezoito;
                System.out.println(formatador.format(salario));
            } else if (salario <= 4500.00 || salario > 4500.01) {
                double salarioComVinteOito = 0.00;
                double salarioDescontando = 0.00;
                double salarioRestoSubtracao = 0.00;
                if (salario > 4500.01) {
                    salarioDescontando = salario - 4500.00;
                    salarioComVinteOito = salarioDescontando * 0.28; // 5.60
                    salarioRestoSubtracao = salarioDescontando;
                }
                salario = (salario - 2000.00) - salarioRestoSubtracao; //2500
                salario = salario * 0.18;  //450.00
                salario = salario + salarioComVinteOito;
                System.out.println(formatador.format(salario));
                // 4520.00
            }
        }
    }
}
