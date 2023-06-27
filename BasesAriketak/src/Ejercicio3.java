
import java.util.Scanner;


public class Ejercicio3 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		/*
		 * Programa que lea dos caracteres y compruebe si son iguales.
		 */
		
		
		areEqual();
		
		
		
		sc.close();

	}
	private static void areEqual() {
		char  car1, car2;
		System.out.print("Introduce un carácter: ");
		car1 = sc.next().charAt(0);
		
		System.out.print("Introduce otro carácter: ");
		car2 = sc.next().charAt(0);
		System.out.println("Tus char son : " + car1 +" y "+ car2);
		
		
		if(car1 == car2) {
			System.out.println("Son iguales");
			
		}else {
			System.out.println("No son iguales");
		}
	}

}
