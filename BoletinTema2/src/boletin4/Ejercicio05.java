package boletin4;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Constantes para decir que es menor, mayor o igual
		final int MENOR = 1;
		final int MAYOR = 2;
		final int IGUAL = 3;
		
		// Variable donde se almacenará el número random
		int rand;
		// Variable donde se almacenará la respuesta del usuario
		int resp = 0;
		// Variables donde se almacenarán el mínimo y el máximo
		int min = 1;
		int max = 101;
		
		// Creamos el Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Creamos el Random
		Random rd = new Random();
		
		System.out.println("1 para MENOR, 2 para MAYOR, 3 para IGUAL");
		
		// Mostramos un número aleatorio hasta adivinar el número del usuario
		do {
			rand = rd.nextInt(min,max);
			System.out.println("He pensado en el " + rand + ", ¿es correcto?");
			resp = sc.nextInt();
			
			// Según la respuesta del usuario ajustamos el máximo o el mínimo
			if (resp == MENOR) {
				max = rand;
			} else if (resp == MAYOR) {
				min = rand + 1;
			}
			
		} while(resp != IGUAL && min != max);
		
		// Mostramos el mensaje por pantalla
		System.out.println("¡Lo conseguí!");
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
