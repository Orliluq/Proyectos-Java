package Clases;

public class Variables {
	//byte: emplea un sólo byte (8 bits) de almacenamiento
	//Esto permite almacenar valores entre [-128, 127]
	
	//byte numeroByte = 9;
	
	//short: emplea el doble de almacenamiento de (byte)
	//esto permite almacenar valores entre [-32.768, 32.767]
	
	//short numeroShort = 32767;
	
	//int: emplea un tamaño mayor, 4 bytes (32 bits)
	//esto permite almacenar valores entre [-2147483648, 2147483647]
	
//	int numeroInt = 41825;
//	
//	//long: emplea el tamaño mayor de todos los enteros, 8 bytes (64 bits)
//	//esto permite almacenar valores entre [-9223372036854775808, 9223372036854775807]
//	
//	//long numeroLong = 926465464697266565L;
//	
//	//float: emplea un tamaño de 32 bits (4 bytes)
//	//esto permite almacenar valores entre [-3.4028234E+8, 1.40239846E-45]
//	
//	//float numeroFloat = 5976464F;
//	
//	//double: emplea un tamaño de 64 bits (8 bytes)
//	//esto permite almacenar valores entre [-1.7976931348623157E+309, 4.940656458412465544E-324]
//	
//	//double numeroDouble = 2654792142478F;
//	
//	//boolean: se emplea  con la finalidad de trabajar con valores verdaderos/falsos (booleanos)
//	//se traducen sus valores en true/false
//	
//	//boolean variableBoolean = true;
//	
//	//char: se emplea para almacenar caracteres individuales (letras, aunque puede contener números)
//	//utiliza 16 bits y se codifica sobre UTF-16 Unicode
//	
//	//char numeroChar = 1;
//	//char letraChar = 'D';
//	
//	//string: se emplea creando una instancia de la clase string
//	//aunque parezca trabajar con datos primitivos
//	
//	String variableString = "Hola a todos.";
//	
//	//Vector - Arreglo: se emplea para almacenar
//	//un grupo de datos del mismo tipo
//	
//	//Forma 1:
//	int vectorNumeos1[] = new int [10];
//	//Forma 2:
//	int []vectorNumeros2 = new int[10];
//	//Forma 3:
//	int[] vectorNumeros3 = new int[10];
//	//Forma 4:
//	int vectorNumeros4[];
//	//Forma 5:
//	int vectorNumeros5[] = {};
//	//Forma 6:
//	int vectorNumeros6[] = {9,8,7,6,5,4,3,2,1,0};
//	//Forma 7:
//	int vectorNumeros7[] = new int[]{9,8,7,6,5,4,3,2,1,0};
//		
//	//Matriz: se emplea para almacenar un grupo de datos del mismo
//	//de forma bidimensional basados en [x],[y]
//	
//	//Forma 1:
//	int matrizNumeros1[][] = new int[4][5];
//	//Forma 2:
//	int [][]matrizNumeros2 = new int[4][5];
//	//Forma 3:
//	int[][] matrizNumeros3 = new int[4][5];
//	//Forma 4:
//	int matrizNumeros4[][];
//	//Forma 5:
//	int matrizNumeros5[][] = {};
//	//Forma 6:
//	int matrizNumeros6[][] = {{1,2},{3,9}};
//	//Forma 7:
//	int matrizNumeros7[][] = new int[][]{{6,2},{2,7}};
//	
//	//Variable de tipo persona (Persona es una clase);
//	Persona P;
//	//Variable de tipo animal (Animal es una clase);
//	Animal A;
//	//Variable de Java de la clase Math.
//	Math M;
//	//Variable de Java de la clase Scanner.
//	Scanner S;
//	//Variable de Java de la clase BufferedReader
//	BufferedReader B;
	
	//Estos tipos son equivalentes a los primitivos pero en forma
	//de objetos son: Byte, Short, Integer, Long, Float, Double,
	//Boolean y Character (8 igualmente)
	
	//Representación de byte en Byte
//	Byte numeroByte = 1;
//	//Representación de short en Short
//	Short numeroShort = 2416;
//	//Representación de int en Integer
//	Integer numeroInteger = 95256712;
//	//Representación de long en Long
//	Long numeroLong = 5213714121L;
//	//Representación de float en Float
//	Float numeroFloat = 6591432543251F;
//	//Representación de double en Double
//	Double numeroDouble = 9.3;
//	//Representación de boolean en Boolean
//	Boolean variableBoolean = true;
//	//Representación de char en Character
//	Character variableCharacter = 'A';
//	Character numeroCharacter = 2;
	
//	int numero1 = 12;
//	int numero2 = 2;
//	double division;
//	int suma, resta, multiplicacion;
//	double modulo;
//	double operacion;
	
	operacion = 9/3*5-3+8*2;
	System.out.println("El resultado de la operación es: "+operacion);
	division = numero1/numero2;
	System.out.println("El resultado de la división es: "+division);
	suma = numero1+numero2;
	System.out.println("El resultado de la suma es: "+suma);
	resta = numero1-numero2;
	System.out.println("El resultado de la resta es: "+resta);
	multiplicacion = numero1*numero2;
	System.out.println("El resultado de la multiplicación es: "+multiplicacion);
	modulo = numero1%numero2;
	System.out.println("El resultado del módulo es: "+modulo);
}

