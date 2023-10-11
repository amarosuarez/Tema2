package boletin3;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Declaramos las variables
		int num;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Pedimos un número por pantalla y lo guardamos
		System.out.println("Introduzca un número (entero o negativo). Introduzca 0 para salir");
		num = sc.nextInt();
		
		// Bucle para determinar si el número es par o impar
		while (num != 0) {
			// Mostramos si es par o impar
			System.out.println(num%2 == 0 ? "Es par" : "Es impar");
			
			// Pedimos un número por pantalla y lo guardamos
			System.out.println("Introduzca un número (entero o negativo). Introduzca 0 para salir");
			num = sc.nextInt();
		}
		
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
