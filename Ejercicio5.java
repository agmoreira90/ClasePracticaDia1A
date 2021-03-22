package test;

public class Ejercicio5 {
    public static void main(String[] args) {
        Integer n = 7;
        Integer m = 1;
        Integer d = 3;
        Integer i = 1;
        Integer x = 0;


        while (i <= n){
            Integer z = 0;
            x++;
            String numStr = x.toString();
            String dStr = d.toString();
            for (int j = 0; j < numStr.length(); j++) {
                if (dStr.charAt(0) == numStr.charAt(j) ){
                    z++;
                }
                if (z >= m ){
                    System.out.println(x);
                    i++;
                    break;
                }
            }


        }
    }
}
