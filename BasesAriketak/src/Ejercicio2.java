import java.util.Scanner;

public class Ejercicio2 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		/*
		 * Programa java para calcular si la última cifra de dos números enteros es la
		 * misma.
		 * 
		 * La última cifra de cada número se obtiene calculando el resto de la división
		 * del número entre 10. Por ejemplo, si uno de los números es 123 su última
		 * cifra se calcula 123 % 10 = 3
		 */

		
		areEqual();

		sc.close();

	}
	private static void areEqual() {
		System.out.println("Dime un número");
		int num1 = sc.nextInt();
		sc.nextLine();

		System.out.println("Dime otro número");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		int resto1 = num1 % 10;
		int resto2 = num2 % 10;

		if (resto1 == resto2) {
			System.out.println("La última cifra es igual");
		} else {
			System.out.println("La última cifra no es igual");
		}
	}

}
