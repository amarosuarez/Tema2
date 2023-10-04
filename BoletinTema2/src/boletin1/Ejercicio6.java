package boletin1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Definimos las variables donde se almacenarán los coeficientes y el resultado
		int a, b, c;
		double pot, result1, result2;
	
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario el valor de a y lo guardamos
		System.out.println("Introduce el valor de a");
		a = sc.nextInt();
		
		// Le pedimos al usuario el valor de b y lo guardamos
		System.out.println("Introduce el valor de b");
		b = sc.nextInt();
		
		// Le pedimos al usuario el valor de c y lo guardamos
		System.out.println("Introduce el valor de c");
		c = sc.nextInt();
		
		// Calculamos la potencia
		pot = Math.pow(b, 2);
		
		// Calculamos ambos resultados
		result1 = (-b + Math.sqrt(pot-4*a*c)) / 2*a;
		
		result2 = (-b - Math.sqrt(pot-4*a*c)) / 2*a;
		
		
		System.out.println("Los resultados son: " + result1 + " y " + result2);
		
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
