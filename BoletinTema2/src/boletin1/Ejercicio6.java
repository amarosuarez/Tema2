package boletin1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Definimos las variables donde se almacenarán los coeficientes y el resultado
		int a, b, c;
		double discriminante, raiz, result1, result2;
	
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
		
		// Calculamos el discriminante
		discriminante = Math.pow(b, 2)- (4*a*c);
		
		if (discriminante >= 0) {
			if (a == 0) {
				
				// Si la a vale 0 entonces tenemos una ecuación de primer grado
				result1 = (double) -c/b;
				System.out.println("El resultado es: " + result1);
			} else {
				// Calculamos la raíz
				raiz = Math.sqrt(discriminante);
				
				// Calculamos ambos resultados
				result1 = (-b + raiz)/ (2*a);
				
				result2 = (-b - raiz) / (2*a);
				System.out.println("Los resultados son: " + result1 + " y " + result2);
			}
		} else {
			// La raíz es negativa por lo que no se puede hacer la ecuación
			System.out.println("Esta ecuación no se puede hacer");
		}
		
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
