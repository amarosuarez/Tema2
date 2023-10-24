package boletin5;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// Variable donde se almacenará la nota del alumno
		float nota;
		boolean isSuspenso;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		for (int i=1; i<=5; i++) {
			// Le pedimos la nota y la guardamos
			System.out.println("Escriba la nota del alumno " +  i);
			nota = sc.nextFloat();
			
			
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
