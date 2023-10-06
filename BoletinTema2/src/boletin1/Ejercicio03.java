package boletin1;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Definimos la variable donde se almacenará el número decimal
		float num;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario el número y lo leemos
		System.out.println("Introduzca un número con decimales");
		
		num = sc.nextFloat();
		
		if (num < 1 && num > -1 && num != 0) {
			System.out.println("Tu número es casi cero");
		} else {
			System.out.println("Tu número no es casi cero");
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
