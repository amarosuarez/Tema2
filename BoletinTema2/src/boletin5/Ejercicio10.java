package boletin5;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Variables donde se almacenarán num1 y num2
		int num1 = 0, num2;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos un número y lo guardamos
		System.out.println("Introduzca un número");
		num1 = sc.nextInt();
		
		// Le pedimos un número mayor que num1 hasta que lo introduzca
		do {
			System.out.println("Introduzca un número mayor que " + num1);
			num2 = sc.nextInt();
		} while (num2 < num1);
		
		// Imprimimos los números desde num1 hasta num2
		for (int i = num1; i <= num2; i++) {
			System.out.println(i);
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
