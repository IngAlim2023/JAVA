package EjerciciosOperadores.ClasesOperadores;

public class Ejercici03 {
    public static void main(String[] args) {
        
        int numeroUno = 8;
        int numeroDos = 2;
        int auxili = 0;
        System.out.println("num1: "+ numeroUno );
        System.out.println("num2: "+ numeroDos );
        
        auxili =numeroUno;
        numeroUno = numeroDos;
        numeroDos = auxili;
        

        System.out.println("num1: "+ numeroUno );
        System.out.println("num2: "+ numeroDos );
    }
}
