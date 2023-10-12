package ClaseMath;

public class Ejercicio4 
{
	public static void main(String[] args) {
        double num1 = Math.random() * 50.0 + 1.0;
        double num2 = Math.random() * 50.0 + 1.0;
        double roundedNum1 = Math.round(num1);
        double roundedNum2 = Math.round(num2);
        double maxNum = Math.max(roundedNum1, roundedNum2);
        System.out.println("El número mayor entre " + roundedNum1 + " y " + roundedNum2 + " es: " + maxNum);
    }

}
