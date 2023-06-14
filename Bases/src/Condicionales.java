import java.util.Scanner;

public class Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Como te llamas?");
		String name = sc.nextLine();

//		if ("Elena".equals(name)) {
//			System.out.println("hola elena");
//		} else if ("Yeray".equals(name)) {
//			System.out.println("Hola a ti tambien");
//
//		}
//
//		else {
//			System.out.println("no tienes acceso");
//		}
//		System.out.println("hasta luego");

		//Java7 switch con String
		switch (name) {
		case "Elena":
			System.out.println("hola elena");
			break;
		case "Yerai":
			System.out.println("Hola Yerai");
			break;
		default:
			System.out.println("Hola a ti tambien");
			System.out.println("que te pasa a ti tambien");

		}

			sc.close();
	}

}
