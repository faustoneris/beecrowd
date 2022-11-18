package Animal;

import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String tipo = scan.next();
            String especie = scan.next();
            String alimento = scan.next();

            takeAnimal(tipo, especie, alimento);
        }
    }

    public static void takeAnimal(String tipo, String especie, String alimento) {
        if (tipo.equals("vertebrado")) {
            if (especie.equals("mamifero")) {
                if (alimento.equals("onivoro")) {
                    System.out.println("homem");
                } else {
                    System.out.println("vaca");
                }
            } else {
                if (alimento.equals("carnivoro")) {
                    System.out.println("aguia");
                } else {
                    System.out.println("pomba");
                }
            }
        } else {
            if (especie.equals("inseto")) {
                if (alimento.equals("hematofago")) {
                    System.out.println("pulga");
                } else {
                    System.out.println("lagarta");
                }
            } else { 
                if(alimento.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else {
                    System.out.println("minhoca");
                }
            }
        }
    }
}
