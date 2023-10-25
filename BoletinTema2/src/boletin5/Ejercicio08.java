package boletin5;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// Variable donde se almacenará la nota del alumno
		float nota;
		boolean isSuspenso = false;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		for (int i=1; i<=5; i++) {
			// Le pedimos la nota y la guardamos
			System.out.println("Escriba la nota del alumno " +  i);
			nota = sc.nextFloat();
			
			// Si es suspenso cambiamso el valor del boolean a true
			if (nota < 5) isSuspenso = true;
		}
		
		// Mostramos el mensaje por pantalla
		System.out.println(isSuspenso ? "Hay uno o más suspensos" : "Enhorabuena, no hay suspensos");
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
