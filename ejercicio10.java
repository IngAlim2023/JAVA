import java.util.Scanner;

public class ejercicio10 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1  = 4;
        
        System.out.println("El número es: "+ num1);

        System.out.println("Calculadora");
        System.out.println("Ingresa el numero 1");
        int num2 = sc.nextInt();
        System.out.println("Ingresa el numero 2");
        int num3 = sc.nextInt();

        int resultado = num2 + num3;

        System.out.println("El resultado es: " + resultado);

        sc.close();

    }
}
