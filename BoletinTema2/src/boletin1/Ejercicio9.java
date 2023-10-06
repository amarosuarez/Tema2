package boletin1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Definimos las variables donde se almacenarán la elección de cada jugador
		int elec1, elec2;
		
		// Creamos el Scanner 
		Scanner sc = new Scanner(System.in);
		
		// Mostramos las opciones por pantalla
		System.out.println("PIEDRA = 1, PAPEL = 2, TIJERAS = 3");
		System.out.println();
		
		// Le pedimos la eleccion al jugador 1 y lo guardamos
		System.out.println("Jugador 1 haga su elección:");
		elec1 = sc.nextInt();
				
		// Comprobamos si la elección del jugador 1 está permitida
		if (elec1 < 1 || elec1 > 3) {
			System.out.println("Esta elección no está permitida");
		} else {
			// Le pedimos la eleccion al jugador 2 y lo guardamos
			System.out.println("Jugador 2 haga su elección:");
			elec2 = sc.nextInt();
			
			// Comprobamos si la elección del jugador 2 está permitida
			if (elec2 < 1 || elec2 > 3) {
				System.out.println("Esta elección no está permitida");
			} else {
				// Comprobamos los resultados de la partida
				if (elec1 == elec2) {
					// Ambos eligen lo mismo = empate
					System.out.println("EMPATE");
				} else if (elec1 == 1) { 
					// Jugador 1 elige piedra
					if (elec2 == 2) {
						// Jugador 2 elige papel = gana
						System.out.println("GANA JUGADOR 2");
					} else {
						// Jugador 2 elige tijeras = pierde
						System.out.println("GANA JUGADOR 1");
					}
				} else if (elec1 == 2) {
					// Jugador 1 elige papel
					if (elec2 == 1) {
						// Jugador 2 elige piedra = pierde
						System.out.println("GANA JUGADOR 1");
					} else {
						// Jugador 2 elige tijeras = gana
						System.out.println("GANA JUGADOR 2");
					}
				} else {
					// Jugador 1 elige tijeras
					if (elec2 == 1) {
						// Jugador 2 elige piedra = gana
						System.out.println("GANA JUGADOR 2");
					} else {
						// Jugador 2 elige papel = pierde
						System.out.println("GANA JUGADOR 1");
					}
				}
				
			}
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
