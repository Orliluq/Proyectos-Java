package ClasesOperadores;

public class Ejercicio6 
{
	public static void main(String[] args) {
        int ladoCuadrado = 8;
        int areaCuadrado = ladoCuadrado * ladoCuadrado;
        int perimetroCuadrado = ladoCuadrado * 4;
        
        int baseTriangulo = 9;
        int alturaTriangulo = 8;
        int ladoUnoTriangulo = 8;
        int ladoDosTriangulo = 8;
        double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2.0;
        int perimetroTriangulo = baseTriangulo + ladoUnoTriangulo + ladoDosTriangulo;
        
        int baseRectangulo = 8;
        int alturaRectangulo = 6;
        int areaRectangulo = baseRectangulo * alturaRectangulo;
        int perimetroRectangulo = 2 * (baseRectangulo + alturaRectangulo);
        
        System.out.println("El área del cuadrado es: " + areaCuadrado);
        System.out.println("El perímetro del cuadrado es: " + perimetroCuadrado);
        System.out.println("El área del triángulo es: " + areaTriangulo);
        System.out.println("El perímetro del triángulo es: " + perimetroTriangulo);
        System.out.println("El área del rectángulo es: " + areaRectangulo);
        System.out.println("El perímetro del rectángulo es: " + perimetroRectangulo);
    }

}
