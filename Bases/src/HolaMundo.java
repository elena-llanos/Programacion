import java.util.Scanner;

public class HolaMundo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 5000000;
		int b = 6;

		System.out.println("Hola Mundo, qué tal???");

		System.out.println(a);
		System.out.println(b);

		double c = 12.6, d = 12.9;
		float e = 12.5f;// le pongo la f detrás para que lo interprete como float
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);

		long l = 8123123123123123l;// l detrás para que sea long
		System.out.println(l);

		boolean g = true;

		char h = 'e';

		String name = "elena";
		System.out.println(name);

		System.out.println("dime tu nombre");

		String nombre = sc.nextLine();

		System.out.println("hola " + nombre);

		System.out.print("Dame a: ");
		a = sc.nextInt();
		System.out.print("Dame b: ");
		b = sc.nextInt();

		int suma = a + b;
		System.out.println("a + b = " + suma);

		e = sc.nextFloat();

		sc.close();

	}

}
