package Modulo_2;

public class Ejer3 {
    public static void main(String[] args) {
        int numero = 28;
        int sumas = 0;
        for (int i = 1; i < numero; i++){
            double resultado = numero % i;
            
            if ( resultado == 0){
                sumas = sumas + i;
            }
        };
        if (sumas == numero){
            System.out.println("El número es perfecto");
        }else{
            System.out.println("El número no es perfecto");
        }
    }
}
