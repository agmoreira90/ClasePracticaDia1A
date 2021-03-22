package test;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese n");
        int n = scanner.nextInt();
        boolean esPrimo = true;
        for (int i = 1; i < n ; i++) {
            if (i != 1 && n%i == 0) {
                esPrimo = false;
            }
        }
        System.out.println("esPrimo = " + esPrimo);
    }
}
