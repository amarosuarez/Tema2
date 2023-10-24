package boletin5;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Variable donde se almacenará la suma
		int suma = 0;
		
		// Bucle para sumar los impares hasta 10
		for (int i=0; i<20; i++) {
			// Comprueba que sea impar y lo suma
			if (i%2!=0) suma += i;
		}
		
		// Mostramos la suma de los impares hasta 10
		System.out.println(suma);
	}
	
}
