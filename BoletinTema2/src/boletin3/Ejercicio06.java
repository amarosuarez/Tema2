package boletin3;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Declaramos las variables
		int edad;
		int suma = 0;
		float media = 0;
		int numAlumnos = 0;
		int mayores = 0;
		
		// Creamos el Scanner 
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos la edad al usuario y la almacenamos
		System.out.println("Introduzca una edad. Número negativo para salir");
		edad = sc.nextInt();
		
		while (edad >= 0) {
			// Calculamos la suma de las edades
			suma += edad;
			
			// Contamos el número de alumnos
			numAlumnos++;
			
			// Contamos los alumnos que son mayores de edad
			mayores = edad>=18 ? ++mayores : mayores;
			
			System.out.println("Introduzca una edad. Número negativo para salir");
			edad = sc.nextInt();
		}
		
		// Calculamos la media de las edades de los alumnos
		media = (float) suma / numAlumnos;
		
		// Mostramos los datos por pantalla
		System.out.println("Suma total de las edades: " + suma + "\nMedia de edades: " + media + 
				"\nNúmero total de alumnos: " + numAlumnos + "\nAlumnos mayores de edad: " + mayores);
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
