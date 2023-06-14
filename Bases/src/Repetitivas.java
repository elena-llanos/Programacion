import java.util.Scanner;

public class Repetitivas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int c = 1;

		while (c <= 10) {
			System.out.println(c + "");
			c++;
		}
		System.out.println("END");

		String respuesta;
		do {
			System.out.println("quieres repetir? s / n");
			respuesta = sc.nextLine();

		} while (respuesta.equals("s"));{
			System.out.println("bye");
		}
		
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + "  ");
		}
		sc.close();
	}
}
