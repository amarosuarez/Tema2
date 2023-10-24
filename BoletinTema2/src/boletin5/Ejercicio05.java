package boletin5;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Variable donde se almacenarán los números
		int num;
		// Variable donde se almacenará la suma de los números
		int sum = 0;
		// Variable donde se almacenará la media
		float media;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		for (int i=1; i<=10; i++) {
			// Le pedimos el número y lo guardamos
			System.out.println(i + ". Introduce un número");
			num = sc.nextInt();
			
			// Sumamos los números
			sum += num;
		}
		
		// Calculamos la media
		media = (float) sum / 10;
		
		// Mostramos el mensaje por pantalla
		System.out.println("La media es " + media);
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
