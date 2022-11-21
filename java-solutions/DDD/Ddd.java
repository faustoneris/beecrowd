package DDD;

import java.util.Scanner;

public class Ddd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int ddd = scan.nextInt();

        switch (ddd) {
            case 11:
                System.out.println("sao paulo");
                break;
            case 61:
                System.out.println("Brasília");
                break;
            case 71:
                System.out.println("Salvador");
                break;
            case 21:
                System.out.println("Rio de Janeiro");
                break;
            case 32:
                System.out.println("Juiz de Fora");
                break;
            case 19:
                System.out.println("Campinas");
                break;
            case 27:
                System.out.println("Vitoria");
                break;
            case 31:
                System.out.println("Belo Horizonte");
            default:
                System.out.println("DDD nao cadastrado");
        }
    }
}
