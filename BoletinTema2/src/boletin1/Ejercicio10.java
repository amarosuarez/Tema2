package boletin1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Definimos las variables donde se almacenarán los números y la suma
		int num1, num2, num3, suma;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario el num1 y lo guardamos
		System.out.println("Introduzca un número:");
		num1 = sc.nextInt();
		
		// Le pedimos al usuario el num2 y lo guardamos
		System.out.println("Introduzca un número:");
		num2 = sc.nextInt();
				
		// Le pedimos al usuario el num3 y lo guardamos
		System.out.println("Introduzca un número:");
		num3 = sc.nextInt();
		
		// Comprobamos si la suma de dos números es igual a otro número introducido y mostramos el mensaje por pantalla
		if ((num1 + num2 == num3) || (num1 + num3 == num2) || (num2 + num3 == num1)) {
			System.out.println("La suma de dos números es igual a otro introducido");
		} else {
			System.out.println("No hay ninguna suma de dos números que sea igual a otro introducido");
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
