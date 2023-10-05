package boletin1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Definimos la variable donde almacenaremos el número introducido por el usuario
		int num;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario un número y lo guardamos
		System.out.println("Introduzca un número");
		num = sc.nextInt();
		
		//Comprobamos las cifras 
		if	(num >= 0 && num <= 9) {
			System.out.println("Tu número es de 1 cifra");
		} else if (num >= 10 && num <= 99) {
			System.out.println("Tu número es de 2 cifras");
		} else if (num >= 100 && num <= 999) {
			System.out.println("Tu número es de 3 cifras");
		} else if (num >= 1000 && num <= 9999) {
			System.out.println("Tu número es de 4 cifras");
		} else if (num >= 10000 && num <= 99999) {
			System.out.println("Tu número es de 5 cifras");
		} else {
			System.out.println("Este número no está permitido");
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
