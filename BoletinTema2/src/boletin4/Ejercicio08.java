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
			System.out.println("¿Cuál ha sido tu tirada? Introducelo en texto (UNO, DOS...)");
			tirada = sc.nextLine();
			
			switch(tirada) {
				case "UNO" -> valorTirada1 = 1;
				case "DOS" -> valorTirada1 = 2;
				case "TRES" -> valorTirada1 = 3;
				case "CUATRO" -> valorTirada1 = 4;
				case "CINCO" -> valorTirada1 = 5;
				case "SEIS" -> valorTirada1 = 6;
				default -> System.out.println("Valor incorrecto (Prueba a usar mayúsculas)");
			}
			
			
		} while(!(tirada.equals("UNO") || tirada.equals("DOS") || tirada.equals("TRES")
				|| tirada.equals("CUATRO") || tirada.equals("CINCO") || tirada.equals("SEIS")));
		
		// Le pedimos al usuario la segunda tirada y lo convertimos a número
		do {
			System.out.println("¿Cuál ha sido tu tirada? Introducelo en texto (UNO, DOS...)");
			tirada = sc.nextLine();
			
			switch(tirada) {
				case "UNO" -> valorTirada2 = 1;
				case "DOS" -> valorTirada2 = 2;
				case "TRES" -> valorTirada2 = 3;
				case "CUATRO" -> valorTirada2 = 4;
				case "CINCO" -> valorTirada2 = 5;
				case "SEIS" -> valorTirada2 = 6;
				default -> System.out.println("Valor incorrecto (Prueba a usar mayúsculas)");
			}
			
		} while(!(tirada.equals("UNO") || tirada.equals("DOS") || tirada.equals("TRES")
				|| tirada.equals("CUATRO") || tirada.equals("CINCO") || tirada.equals("SEIS")));		
		
		// Realizamos la suma
		suma = valorTirada1+valorTirada2;
		
		// Mostramos la suma por pantalla
		System.out.println("El valor de la suma es: " + suma);
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
