import java.util.Date;
import java.util.Scanner;

public class Conversiones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String numeroTexto = "123";

		System.out.println(numeroTexto + 4);

		int numero = Integer.parseInt(numeroTexto);
		// alternativos a los primitivos. Son funciones
		System.out.println(numero + 4);

		/*
		 * podemos parsearn numero parseInt(), parseFloat() pero en booleano y character
		 * es diferente.
		 * 
		 * En realidad es comprobar si el texto concuerda con algo.
		 * 
		 * 
		 */

		System.out.println("Si o No");
		String boolText = sc.nextLine();
		String boolTextNoSapce = boolText.trim();

		boolean bool = "si".equalsIgnoreCase(boolTextNoSapce);
		boolean boolFirst = "s".equalsIgnoreCase(boolTextNoSapce.substring(0, 1));
	// equals es un boolean que dice si o no
		String boolOtherText = String.valueOf(bool);
		Date date = new Date();
		String dateText = String.valueOf(date);
	
		System.out.println(bool);
		System.out.println(boolFirst);
		System.out.println(boolOtherText);
		System.out.println(dateText);

		sc.close();

	}

}
