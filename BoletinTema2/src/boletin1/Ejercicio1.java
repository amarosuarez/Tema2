package boletin1;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		// Definimos la variable num
				int num;
				
				// Creamos el objeto Scanner
				Scanner sc = new Scanner(System.in);
				
				// Le pedimos al usuario el número
				System.out.println("Introduzca un número:");
				num = sc.nextInt();
				
				
				// Se comprueba si el número es par o impar y se muestra por pantalla
				if (num%2==0) {
					System.out.println("Tu número es par");
				} else {
					System.out.println("Tu número es impar");
				}
				
				// Cerramos el Scanenr
				sc.close();
	}
	
}
