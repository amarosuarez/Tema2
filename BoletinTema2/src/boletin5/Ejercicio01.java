package boletin5;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Variable donde se almacena el número del usuario
		int num;
		
		// Creamos el objeto Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos un número al usuario y lo guardamos
		System.out.println("Introduce un número positivo");
		num = sc.nextInt();
		
		for (int i=1; i<=num; i++) {
			System.out.println(i);
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
