package test;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese n");
        int n = scanner.nextInt();
        System.out.println("Ingrese m");
        int m = scanner.nextInt();
        int i = 0;
        int x = 1;
        while (i < n){
            if ( x%m == 0 ){
                System.out.println(x + " es divisible entre " + m);
                x++;
                i++;
            }
            x++;
        }
    }
}
