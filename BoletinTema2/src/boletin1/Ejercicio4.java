package boletin1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Variables donde guardaremos los números introducidos por el usuario
		int num1, num2;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Le pedimos al usuario el número y lo guardamos
		System.out.println("Introduzca un número");
		
		num1 = sc.nextInt();
		
		// Le pedimos al usuario otro número y lo guardamos
		System.out.println("Introduzca otro número");
	
		num2 = sc.nextInt();
		
		// Comprobamos cual es más grande
		if (num1<num2) {
			System.out.println(num1 + " < " + num2);
		} else {
			System.out.println(num2 + " < " + num1);
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
