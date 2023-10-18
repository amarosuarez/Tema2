package boletin4;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// Definimos la variable donde se almacenará el resultado
		double result;
		// Definimos la variable donde se almacenará la opción elegida
		String opcion;
		// Definimos las variables donde se almacenarán los números
		double num1;
		double num2;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		do {
			// Le pedimos al usuario los números y los guardamos
			System.out.println("Introduzca el primer número");
			num1 = sc.nextDouble();
			System.out.println("Introduzca el segundo número");
			num2 = sc.nextDouble();
			
			// Le pedimos al usuario que operación desea hacer
			System.out.println("¿Qué desea hacer? (A = suma, B = resta, C = multiplicación, D = división, E = salir)");
			opcion = sc.next();
			
			// Switch para realizar la opción seleccionada
			switch (opcion) {
				case "A":
					result = num1+num2;
					System.out.println("El resultado de la suma es: " + result);
					break;
				case "B":
					result = num1-num2;
					System.out.println("El resultado de la resta es: " + result);
					break;
				case "C":
					result = num1*num2;
					System.out.println("El resultado de la multiplicar es: " + result);
					break;
				case "D":
					result = num1/num2;
					System.out.println("El resultado de la división es: " + result);
					break;
				case "E":
					System.out.println("Saliendo...");
					break;
				default:
					System.out.println("Opción no válida");
			}
			
		} while(!opcion.equals("E"));
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
