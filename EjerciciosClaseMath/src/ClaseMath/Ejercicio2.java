package ClaseMath;

public class Ejercicio2 
{
	public static void main(String[] args) {
        double[] numeros = {2, 8, 9, 27, 28, 55, 121};
        for (double num : numeros) {
            double resultado = Math.sqrt(num);
            System.out.println("La raíz cuadrada de " + num + " es: " + resultado);
        }
    }

}
