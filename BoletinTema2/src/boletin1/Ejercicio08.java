package boletin1;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// Definimos la variable donde se almacenará la nota
		double nota;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos una nota al usuario y lo guardamos
		System.out.println("Introduzca una nota:");
		nota = sc.nextDouble();
		
		// Comprobamos en que rango se encuentra la nota y mostramos el mensaje
		if (nota >= 0 && nota <= 10) {
			if	(nota >= 0 && nota < 5) {
				System.out.println("INSUFICIENTE");
			} else if (nota >= 5 && nota < 6) {
				System.out.println("SUFICIENTE");
			} else if (nota >= 6 && nota < 7) {
				System.out.println("BIEN");
			} else if (nota >= 7 && nota < 9) {
				System.out.println("NOTABLE");
			} else {
				System.out.println("SOBRESALIENTE");
			}
		} else {
			System.out.println("Esta nota no es válida");
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
