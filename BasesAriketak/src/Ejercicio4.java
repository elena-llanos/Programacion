import java.util.Scanner;

public class Ejercicio4 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * 
		 * Programa que lea una variable entera mes y compruebe si el valor corresponde
		 * a un mes de 30 días, de 31 o de 28. Supondremos que febrero tiene 28 días. Se
		 * mostrará además el nombre del mes. Se debe comprobar que el valor introducido
		 * esté comprendido entre 1 y 12.
		 */

		daysOfMonth();

	}

	private static void daysOfMonth() {
		boolean control = true;

		do {

			System.out.println("Introduce un mes del 1 al 12");

			int mes = leerOperandoInt();

			switch (mes) {

			case 1:
				System.out.println("Enero: 31 días");
				break;

			case 2:
				System.out.println("Febrero: 28 días");
				break;
			case 3:
				System.out.println("Marzo: 31 días");
				break;
			case 4:
				System.out.println("Abril: 30 días");
				break;
			case 5:
				System.out.println("Mayo: 31 días");
				break;
			case 6:
				System.out.println("Junio: 30 días");
				break;
			case 7:
				System.out.println("Julio: 31 días");
				break;
			case 8:
				System.out.println("Agosto: 31 días");
				break;
			case 9:
				System.out.println("Septiembre: 30 días");
				break;
			case 10:
				System.out.println("Octubre: 31 días");
				break;
			case 11:
				System.out.println("Noviembre: 30 días");
				break;
			case 12:
				System.out.println("Diciembre: 31 días");
				break;
			case 0:
				control = false;
				System.out.println("Aguur");
				break;

			default:

				System.out.println("debes introducir valor entre el 1 y el 12");

			}

		} while (control);
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