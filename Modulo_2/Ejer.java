package Modulo_2;

public class Ejer {
    public static void main(String[] args) {
        int numero = 8;
        int factorial = 1;

        for (int i = 1; i<=numero; i++){
            factorial = factorial * i;
        };
        System.out.println("el factorial de: " + numero + " es: " + factorial);
    }
}
