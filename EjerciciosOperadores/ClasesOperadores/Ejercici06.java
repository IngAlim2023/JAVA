package EjerciciosOperadores.ClasesOperadores;

public class Ejercici06 {
    public static void main(String[] args) {
        int ladoCuadrado = 8;

        // Calculo Área y perimetro de un cuadrado
        
        int areaCuadrado = ladoCuadrado * ladoCuadrado;
        int perimetroCuadrado = ladoCuadrado * 4;

        //Triangulo escaleno
        double baseTriangulo = 9;
        double alturaTriangulo = 8;
        double areaTriangulo = baseTriangulo * alturaTriangulo *0.5;

        //Asumo Triangulo Equilatero
        double ladoUnoTriangulo = 8;
        double ladoDosTriangulo = 8;
        double perimetroTriangulo = ladoUnoTriangulo + ladoDosTriangulo*2;

        // Calculos Rectangulo

        double baseRectangulo = 8;
        double alturaRectangulo = 6;
        double areaRectangulo = baseRectangulo * alturaRectangulo;
        double perimetroRectangulo = 2 * ( baseRectangulo + alturaRectangulo);

        // Impresión de resultados
        System.out.println("El área del cuadrado es: " + areaCuadrado + ", el perimetro es: " + perimetroCuadrado);
        System.out.println("El área del triangulo es: " + areaTriangulo + ", el perimetro es: " + perimetroTriangulo);
        System.out.println("El área del triangulo es: " + areaRectangulo + ", el perimetro es: " + perimetroRectangulo);
 

    }
}
