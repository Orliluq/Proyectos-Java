package ClaseMath;

public class Ejercicio3 
{
	public static void main(String[] args) {
        double nota1 = Math.random() * 10.0;
        double nota2 = Math.random() * 10.0;
        double nota3 = Math.random() * 10.0;
        double nota4 = Math.random() * 10.0;
        double nota5 = Math.random() * 10.0;
        double promedio = (nota1 + nota2 + nota3 + nota4 + nota5) / 5.0;
        System.out.println("El promedio de las 5 notas es: " + promedio);
    }

}
