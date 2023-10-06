package boletin1;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Definimos las variables donde se almacenarán los números
		int num1, num2;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario el primer número y lo leemos
		System.out.println("Introduzca un número:");
	
		num1 = sc.nextInt();
		
		// Le pedimos al usuario el segundo número y lo leemos
		System.out.println("Introduzca otro número:");
		
		num2 = sc.nextInt();
		
		// Comprobamos si son iguales y mostramos el mensaje por pantalla
		if (num1==num2) {
			System.out.println("Los números son iguales");
		} else {
			System.out.println("Los números son diferentes");
		}
		 
		// Cerramos el Scanner
		sc.close();
	}
	
}
