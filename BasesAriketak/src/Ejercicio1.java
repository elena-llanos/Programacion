import java.util.Scanner;

public class Ejercicio1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. Programa Java que lea dos números enteros por teclado y los muestre por
		 * pantalla.
		 */

		readNumbers();

		sc.close();

	}

	private static void readNumbers() {
		System.out.println("Introduce un número: ");
		int num1 = leerOperandoInt();
		System.out.println("Introduce otro número: ");
		int num2 = leerOperandoInt();

		System.out.println("Tus numeros son: " + num1 + " y " + num2);
	}

	private static int leerOperandoInt() {
		int ret = 0;
		do {
			try {
				System.out.print(" : ");
				ret = sc.nextInt();
				sc.nextLine();
			} catch (Exception e) {
				System.out.println("Tiene que ser un número");
				sc.nextLine();
				ret = -1;
			}
		} while (ret < 0);
		return ret;
	}

}
