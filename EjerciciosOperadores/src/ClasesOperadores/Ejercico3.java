package ClasesOperadores;

public class Ejercico3 
{
	public static void main(String[] args) {
        int numeroUno = 8;
        int numeroDos = 2;
        int auxiliar = numeroUno;
        numeroUno = numeroDos;
        numeroDos = auxiliar;
        System.out.println("El valor de numeroUno es: " + numeroUno);
        System.out.println("El valor de numeroDos es: " + numeroDos);
    }

}
