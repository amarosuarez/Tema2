package boletin3;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Declaramos las variables
		int num;
		int contador = 0;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos el número al usuario y lo guardamos
		System.out.println("Introduzca un número. Introduzca un número negativo para salir");
		num = sc.nextInt();
		
		// Bucle para determinar si introduce un número entero o negativo
		while(num >= 0) {
			contador++;
			
			// Le pedimos el número al usuario y lo guardamos
			System.out.println("Introduzca un número. Introduzca un número negativo para salir");
			num = sc.nextInt();
		}
		
		// Mostramos el contador por pantalla
		System.out.println("Ha introducido " + contador + " números");
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
