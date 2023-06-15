package com.ipartek.formacion.bibliotecas;

import java.util.Scanner;

public class Consola {
	
	private static final Scanner SC = new Scanner(System.in);

	public static void pl(Object texto) {
		System.out.println(texto);
	}

	public static void p(Object texto) {
		System.out.println(texto);
	}

	public static String rl(String message) {
		p(message + ":");
		
		return SC.nextLine();
	}

	public static int readInt(String message) {

		String userNumber = rl(message);

		int number = Integer.parseInt(userNumber);

		return number;
	}
	
	public static boolean readBoolean(String message) {
		String texto = rl(message);
		boolean boolText = Utilidades.convertirABoolean(texto);
		return boolText;
	}
	
	public static int leerOperandoInt() {
		int ret = 0;
		do {
			try {
				System.out.print(" : ");
				ret = SC.nextInt();
				SC.nextLine();
			} catch (Exception e) {
				System.out.println("Tiene que ser un número");
				SC.nextLine();
				ret = -1;
			}
		} while (ret < 0);
		return ret;
	}

}
