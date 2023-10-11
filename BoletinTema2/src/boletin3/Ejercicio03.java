package boletin3;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Declaramos las variables
		int num;
		double media = 0;
		int contador = 0;
				
		// Creamos el Scanner 
		Scanner sc = new Scanner(System.in);
				
		// Le pedimos el número al usuario y lo guardamos
		System.out.println("Introduzca un número. Introduzca un número negativo para salir");
		num = sc.nextInt();
				
		// Bucle para determinar si introduce un número entero o negativo
		while(num >= 0) {
			contador++;
			media += num;
			
			// Le pedimos el número al usuario y lo guardamos
			System.out.println("Introduzca un número. Introduzca un número negativo para salir");
			num = sc.nextInt();
		}
				
		// Mostramos la media por pantalla
		System.out.println("La media es " + (media/=contador));
				
		// Cerramos el Scanner
		sc.close();
	}
	
}
