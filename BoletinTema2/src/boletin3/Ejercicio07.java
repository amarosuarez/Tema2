package boletin3;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio07 {
	public static void main(String[] args) {
		// Variable donde se almacena el número random
		int numRand;
		// Variable donde se almacena el número introducido por el usuarippo
		int num;
		
		// Creamos el Random
		Random rand = new Random();
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Inicializamos numRand
		numRand = rand.nextInt(1,101);
		
		// Le preguntamos al usuario un número
		System.out.println("Intenta adivinar el número entre 1 y 100 (Usa -1 para rendirte) " );
		num = sc.nextInt();
		
		// Bucle para adivinar el número hasta 
		while (num != -1) {
			
			if (num == numRand) {
				// Si lo adivina se le muestra el mensaje
				System.out.println("¡Enhorabuena! Lo adivinaste");
				num = -1;
			} else {
				// Se le muestra el mensaje de que ha fallado
				System.out.println("Vaya.. Fallaste.");
				if (numRand < num) {
					// Se le muestra que el número a adivinar es menor que el introducido
					System.out.println("El número a adivinar es menor que " + num);
				} else {
					// Se le muestra que el número a adivinar es mayor que el introducido
					System.out.println("El número a adivinar es mayor que " + num);
				}
				
				// Le volvemos a preguntar
				System.out.println("Intenta adivinar el número entre 1 y 100 (Usa -1 para rendirte)");
				num = sc.nextInt();
			}
		}
		
		
	}
}
