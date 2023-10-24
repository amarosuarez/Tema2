package boletin5;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// Variable donde se almacenará el número introducido por el usuario
		int num = 0;
		// Variable donde se almacena el factorial
		int fact = 1;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos un número al usuario y lo guardamos
		System.out.println("Introduzca un número");
		num = sc.nextInt();
	
		System.out.print("El factorial " + num+"! -> ");
	
		// Bucle para calcular el factorial de num
		for (int i=num; i>0; i--) {
			fact *= i;
			System.out.print(i!=1 ? i+"x" : i+" = ");
		}
		
		// Imprimimos el factorial por pantalla
		System.out.println(fact);
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
