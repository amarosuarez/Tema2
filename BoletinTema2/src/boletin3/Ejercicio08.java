package boletin3;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// Variable donde se almacenará la altura introducida
		int altura = 0;
		// Variable donde se almacenara la altura más alta
		int masAlta = 0;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Bucle para comprobar las alturas introducidas
		while (altura != -1) {
			System.out.println("Introduce una altura (Usa -1 para salir)");
			altura = sc.nextInt();
			
			masAlta = masAlta > altura ? masAlta : altura;
		}
		
		// Mostramos la altura introducida mas alta
		System.out.println("La altura introducida más alta es " + masAlta);
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
