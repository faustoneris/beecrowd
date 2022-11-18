package SortSimples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortSimples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        int um = scan.nextInt(); 
        int dois = scan.nextInt(); 
        int tres = scan.nextInt(); 

        ArrayList<Integer> list = new ArrayList<>(); 
        list.add(um); 
        list.add(dois); 
        list.add(tres); 

        Collections.sort(list);
        list.forEach(x -> {
            System.out.println(x);
        });
        
        System.out.println(um);
        System.out.println(dois);
        System.out.println(tres);
    }
}
