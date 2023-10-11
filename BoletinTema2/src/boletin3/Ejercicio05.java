package boletin3;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Declaramos las variables
		int suma = 0, contador0 = 0, contadorN = 0, num, i=0;
		float media = 0;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		while(i < 10) {
			// Le pedimos un número al usuario y lo guardamos
			System.out.println("Introduzca un número");
			num = sc.nextInt();
						
			// Contamos los ceros
			if (num == 0) {
				contador0++;
			} else if (num > 0) {
				// Calculamos la suma de los positivos
				suma += num;
			} else {
				contadorN++;
				// Sumamos los negativos para luego hacer la media
				media += num;
			}
			
			// Aumentamos el i
			i++;
		}
		
		// Calculamos la media de los negativos
		media /= contadorN;
		
		// Mostramos los resultados por pantalla
		System.out.println("Has introducido " + contador0 + " ceros.\n" + "La suma de los positivos es " + suma + "\nLa media de los negativos es " + media);
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
