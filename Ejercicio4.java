package test;

import java.util.Scanner;

public class Ejercicio4 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese n");
            int n = scanner.nextInt();
            int i = 0;
            int x = 1;
            boolean esPrimo = true;
            while (i < n) {
                if (esPrimo(x)) {
                    System.out.println(x + " Es primo");
                    x++;
                    i++;
                }
                x++;

            }
        }
        public static boolean esPrimo(int n){
            boolean esPrimo = true;
            for (int j= 1; j < n ; j++) {
                if (j != 1 && n%j == 0) {
                    esPrimo = false;
                }
            }
            return esPrimo;
        }
    }

