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
		
		// Se comprueba que el número sea mayor que 0
		if (num > 0) {
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
		} else 
			// El número es incorrecto ya que es 0 o menor
			System.out.println("El número introducido es incorrecto");
		
		

		
		// Cerramos el Scanner
		sc.close();
	}
	
}
