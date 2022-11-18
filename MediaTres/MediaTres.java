package MediaTres;

import java.util.Scanner;
import java.text.DecimalFormat;

public class MediaTres {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("0.0"); 

        double notaUm = scan.nextDouble() * 2;
        double notaDois = scan.nextDouble() * 3;
        double notaTres = scan.nextDouble() * 4;
        double notaQuatro = scan.nextDouble() * 1;

        double media = (notaUm + notaDois + notaTres + notaQuatro) / 10;

        if (media >= 7) {
            System.out.println("Media: " + formatador.format(media));
            System.out.println("Aluno aprovado");
        } else if (media < 5.0) {
            System.out.println("Media: " + formatador.format(media));
            System.out.println("Aluno reprovado.");
        } else if (media >= 5.0 && media <= 6.9) {
            System.out.println("Media: " + formatador.format(media));
            System.out.println("Aluno em exame.");
            double notaExame = scan.nextDouble();
            System.out.println("Nota do exame: " + notaExame);
            double novaMedia = (notaExame + media) / 2;

            if (novaMedia >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.println("Media final: " + formatador.format(novaMedia));
        } else {
            System.out.println("Media: " + media);
            System.out.println("Aluno reprovado.");
        }
    }

}
