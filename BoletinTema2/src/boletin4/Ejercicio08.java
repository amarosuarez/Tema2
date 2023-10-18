package boletin4;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// Variable donde se almacenará la tirada del usuario
		String tirada;
		
		// Variables donde se almacenan los valores de las tiradas
		int valorTirada1 = 0, valorTirada2 = 0;
		
		// Variable donde se almacena el valor de la suma
		int suma;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario la primera tirada y lo convertimos a número
		do {
			System.out.println("¿Cuál ha sido tu tirada? Introducelo en texto (Uno, dos...)");
			tirada = sc.next();
			
			if (tirada.equalsIgnoreCase("UNO")) {
				valorTirada1 = 1;
			} else if (tirada.equalsIgnoreCase("DOS")) {
				valorTirada1 = 2;
			} else if (tirada.equalsIgnoreCase("TRES")) {
				valorTirada1 = 3;
			} else if (tirada.equalsIgnoreCase("CUATRO")) {
				valorTirada1 = 4;
			} else if (tirada.equalsIgnoreCase("CINCO")) {
				valorTirada1 = 5;
			} else if (tirada.equalsIgnoreCase("SEIS")) {
				valorTirada1 = 6;
			}
			
		} while(!(tirada.equalsIgnoreCase("UNO") || tirada.equalsIgnoreCase("DOS") || tirada.equalsIgnoreCase("TRES")
				|| tirada.equalsIgnoreCase("CUATRO") || tirada.equalsIgnoreCase("CINCO") || tirada.equalsIgnoreCase("SEIS")));
		
		// Le pedimos al usuario la segunda tirada y lo convertimos a número
		do {
			System.out.println("¿Cuál ha sido tu tirada? Introducelo en texto (Uno, dos...)");
			tirada = sc.next();
			
			if (tirada.equalsIgnoreCase("UNO")) {
				valorTirada2 = 1;
			} else if (tirada.equalsIgnoreCase("DOS")) {
				valorTirada2 = 2;
			} else if (tirada.equalsIgnoreCase("TRES")) {
				valorTirada2 = 3;
			} else if (tirada.equalsIgnoreCase("CUATRO")) {
				valorTirada2 = 4;
			} else if (tirada.equalsIgnoreCase("CINCO")) {
				valorTirada2 = 5;
			} else if (tirada.equalsIgnoreCase("SEIS")) {
				valorTirada2 = 6;
			}
			
		} while(!(tirada.equalsIgnoreCase("UNO") || tirada.equalsIgnoreCase("DOS") || tirada.equalsIgnoreCase("TRES")
				|| tirada.equalsIgnoreCase("CUATRO") || tirada.equalsIgnoreCase("CINCO") || tirada.equalsIgnoreCase("SEIS")));		
		
		suma = valorTirada1+valorTirada2;
		
		System.out.println("El valor de la suma es: " + suma);
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
