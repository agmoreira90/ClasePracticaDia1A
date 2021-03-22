package test;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese n");
        int n = scanner.nextInt();
        int i = 0;
        int x = 1;
        while (i < n){
            if ( x%2 == 0 ){
                System.out.println(x + " es par");
                x++;
                i++;
            }
            x++;
        }
    }
}
