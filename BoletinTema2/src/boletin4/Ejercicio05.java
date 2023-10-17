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
		int rand = 1;
		// Variable donde se almacenará la respuesta del usuario
		int resp = 0;
		int ant = 0;
		
		// Creamos el Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		// Creamos el Random
		Random rd = new Random();
		
		System.out.println("1 para MENOR, 2 para MAYOR, 3 para IGUAL");
		
		do {
			rand = rd.nextInt(1,101);
			
			} else if (resp == 1) {
				rand = rd.nextInt(ant)+1;
			} else {
				rand = rd.nextInt(100-ant+1)+ant;
			}
			
			ant = rand;
			System.out.println("He pensado en el " + rand + " ¿estoy en lo correcto? ");
			resp = sc.nextInt();
			
			
		} while(resp != IGUAL);
		
		System.out.println("¡Lo conseguí!");
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
