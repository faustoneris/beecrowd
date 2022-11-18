import java.util.Scanner;
import java.text.DecimalFormat;

public class SalarioComBonus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("0.00");

        String nomeVendedor = scan.next();
        double salarioFixo = scan.nextDouble();
        double totalVendas = scan.nextDouble();
        double bonus = totalVendas * 0.15;
        System.out.println("TOTAL = R$ " + formatador.format(salarioFixo + bonus));

    }

}