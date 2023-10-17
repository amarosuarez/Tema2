package boletin4;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Variable que almacenará el número introducido
		int n;
		// Variable que almacenará el resultado de la multiplicación
		int mult;
		// Variable donde se almacenará el contador
		int cont = 0;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos un número al usuario y lo guardamos
		System.out.println("Introduzca un número");
		n = sc.nextInt();
		
		// Bucle que imprime la tabla de multiplicar de n
		do {
			mult = n*cont;
			System.out.println(n + " * " + cont + " = " + mult);
			cont++;
		} while(cont <= 10);
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
