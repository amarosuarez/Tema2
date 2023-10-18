package boletin4;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Variable donde se almacenará el número introducido por el usuario
		int n;
		// Variable donde se almacenará el contador
		int cont = 1;
		// Variable donde se almacenará la suma
		int suma = 0;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Pedimos un número positivo y mayor que 1
		do {
			// Le pedimos un número al usuario y lo guardamos
			System.out.println("Introduzca un número positivo y mayor o igual que 1");
			n = sc.nextInt();
		} while (n < 1);
		
		// Bucle que suma los números comprendidos entre 1 y n
		do {
			suma += cont;
			cont++;
		} while(cont <= n);
		
		// Mostramos el resultado por pantalla
		System.out.println("El resultado de la suma de los números comprendidos entre 1 y " + n + " es " + suma);
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
