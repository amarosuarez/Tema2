package boletin4;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Definimos las constantes que representan los elementos del juego
		final int PIEDRA = 1;
		final int PAPEL = 2;
		final int TIJERAS = 3;
		
		// Definimos las variables donde se almacenarán las respuestas de los jugadores 
		int player1;
		int player2;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1 para PIEDRA, 2 para PAPEL, 3 para TIJERAS");
			System.out.println("¿Cuál es tu elección jugador 1?");
			player1 = sc.nextInt();
		} while (!(player1 == PIEDRA || player1 == PAPEL || player1 == TIJERAS));
		
		do {
			System.out.println("1 para PIEDRA, 2 para PAPEL, 3 para TIJERAS");
			System.out.println("¿Cuál es tu elección jugador 2?");
			player2 = sc.nextInt();
		} while (!(player2 == PIEDRA || player2 == PAPEL || player2 == TIJERAS));
		
		
		// Comprobamos los resultados
		if ((player1 == PIEDRA && player2 == TIJERAS) || (player1 == PAPEL && player2 == PIEDRA)
				|| (player1 == TIJERAS && player2 == PAPEL)) {
			System.out.println("¡Gana Jugador 1!");
		} else {
			System.out.println("¡Gana Jugador 2!");
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
