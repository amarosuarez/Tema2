package boletin4;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Definimos las constantes que representan los elementos del juego
		final String PIEDRA = "PIEDRA";
		final String PAPEL = "PAPEL";
		final String TIJERAS = "TIJERAS";
		final String S = "S";
		
		// Definimos las variables donde se almacenarán las respuestas de los jugadores 
		String player1;
		String player2;
		String nuevaPartida;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		do {
			do {
				System.out.println("1 para PIEDRA, 2 para PAPEL, 3 para TIJERAS");
				System.out.println("¿Cuál es tu elección jugador 1?");
				player1 = sc.nextLine();
			} while (!(player1.equalsIgnoreCase(PIEDRA) || player1.equalsIgnoreCase(PAPEL) || player1.equalsIgnoreCase(TIJERAS)));
			
			do {
				System.out.println("1 para PIEDRA, 2 para PAPEL, 3 para TIJERAS");
				System.out.println("¿Cuál es tu elección jugador 2?");
				player2 = sc.nextLine();
			} while (!(player2.equalsIgnoreCase(PIEDRA) || player2.equalsIgnoreCase(PAPEL) || player2.equalsIgnoreCase(TIJERAS)));
			
			
			// Comprobamos los resultados
			if (player1 == player2) {
				System.out.println("¡Empate!");
			} else if ((player1.equalsIgnoreCase(PIEDRA) && player2.equalsIgnoreCase(TIJERAS)) ||
					(player1.equalsIgnoreCase(PAPEL) && player2.equalsIgnoreCase(PIEDRA))
					|| (player1.equalsIgnoreCase(TIJERAS) && player2.equalsIgnoreCase(PAPEL))) {
				System.out.println("¡Gana Jugador 1!");
			} else {
				System.out.println("¡Gana Jugador 2!");
			}
			
			System.out.println("¿Quieres volver a jugar? (Introduce s)");
			nuevaPartida = sc.nextLine();
			
		} while(nuevaPartida.equalsIgnoreCase(S));
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
