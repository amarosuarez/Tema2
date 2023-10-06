package boletin2;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Definimos la variable donde se almacenará la nota
		int nota;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos la nota al usuario y la guardamos
		System.out.println("Introduzca una nota");
		nota = sc.nextInt();
		
		// Comprobamos la nota y mostramos el mensaje
		switch (nota) {
			case 0, 1, 2, 3, 4 :
				System.out.println("Insuficiente");
				break;
			
			case 5 :
				System.out.println("Suficiente");
				break;
				
			case 6 :
				System.out.println("Bien");
				break;
			
			case 7, 8 :
				System.out.println("Notable");
				break;
			
			case 9, 10:
				System.out.println("Sobresaliente");
				break;
				
			default:
				System.out.println("Esa nota no es válida");
				break;
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
