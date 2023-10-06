package boletin1;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Definimos las variables donde se almacenarán los números introducidos por el usuario
		int num1, num2, num3, num0;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario el num1 y lo guardamos
		System.out.println("Introduzca un número");
		num1 = sc.nextInt();
		
		// Le pedimos al usuario el num2 y lo guardamos
		System.out.println("Introduzca un número");
		num2 = sc.nextInt();
			
		// Le pedimos al usuario el num3 y lo guardamos
		System.out.println("Introduzca un número");
		num3 = sc.nextInt();
			
		if (num1 >= num2 && num1 >= num3) {
			// num1
			System.out.print(num1 + " >= ");
			System.out.println(num2 >= num3 ? num2 + " >= " + num3
					: num3 + " >= " + num2);
			
		} else if (num2>=num1 && num2>=num3) {
			// num2
			System.out.print(num2 + " >= ");
			System.out.println(num1 >= num3 ? num1 + " >= " + num3
					: num3 + " >= " + num1);
		} else {
			//num3
			System.out.print(num3 + " >= ");
			System.out.println(num2 >= num1 ? num2 + " >= " + num1
					: num1 + " >= " + num2);
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
