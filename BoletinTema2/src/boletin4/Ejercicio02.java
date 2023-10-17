package boletin4;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Variable donde se almacenará el contador
		int cont = 1;
		
		// Bucle que muestra los números pares entre 1 y 200
		do {
			if (cont%2==0) System.out.println(cont);
			cont++;
		} while (cont <= 200);
	}
	
}
