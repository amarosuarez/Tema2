package boletin5;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Variable donde se almacena el número introducido por el usuario
		int num;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos un número al usuario y lo guardamos
		System.out.println("Introduzca un número");
		num = sc.nextInt();
		
		// Bucle que muestra los múltiplos de 3 hasta num
		for (int i=1; i<=num; i++) {
			if (i%3==0) System.out.println(i);
		}
		
		// Cerramos el Scanner 
		sc.close();
	}
	
}
