package boletin5;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		// Variable donde se almacenará el número introducido por el usuario
		int num;
		
		boolean isPrimo = true;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Pedimos el número y lo guardamos
		System.out.println("Introduzca un número");
		num = sc.nextInt();
		
		// Primero se comprueba si es 1
		if (num==1) {
			isPrimo = false;
		} else {
			// Si no es 1 se comprueba si es primo o no
			for (var i=2; i<num; i++) {
				 if (num%i==0) {
					isPrimo = false;
					break;
				}
			}
		}
		
		// Se muestra el mensaje por la pantalla
		System.out.println(isPrimo ? "Es primo" : "No es primo");

		
		// Cerramos el Scanner
		sc.close();
	}
	
}
