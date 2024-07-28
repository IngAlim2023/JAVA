package Modulo_2;
// importacion de la función o clase? xd Random
import java.util.Random;

public class Ejer4 {
    
    public static void main(String[] args) {
        double num = 5;
        double sumatoria = 0;
        int factorial = 1;

        for (int i = 1; i <= num; i++){
            sumatoria = sumatoria + i;
        };
        System.out.println("Esta es la sumatoria: " + sumatoria);
        // Raíz cuadrada
        double raiz = Math.sqrt(sumatoria);
        System.out.println("La raiz de la suma es: " + raiz);

        //Pasos para el numero random

        //para convertir el valor sumatoria en entero
        int sumEnt = (int) sumatoria;
        //número random
        Random rand = new Random();
        int randomEntero = rand.nextInt(sumEnt);
        System.out.println("Este es el número random: " + randomEntero);

        // Divisores
        for (int j = 1; j<=sumatoria; j++){
            if (sumatoria%j == 0){
                System.out.println("Estos son los divisores de la sumatoria: " + j);
            };
        };

        //Factorial
        for (int k = 1; k<=sumatoria; k++){
            factorial = factorial * k;
        };

        System.out.println("Este es el factorial: " + factorial);

    }
}
