package com.ipartek.formacion.oop;

import java.math.BigDecimal;
import java.time.LocalDate;
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
		boolean boolText = convertirABoolean(texto);
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

	public static boolean convertirABoolean(String boolTexto) {

		System.out.println(boolTexto);

		String boolTextoSinEspacios = boolTexto.trim();

		String boolTextoMinusculas = boolTextoSinEspacios.toLowerCase();

		char boolPrimeraLetra = boolTextoMinusculas.charAt(0);

		boolean bool = boolPrimeraLetra == 's'; // "s".equalsIgnoreCase(boolPrimeraLetra);
		return bool;
	}
	
	public static long leerLong(String mensaje) {
		String texto = leerLinea(mensaje);
		long l = Long.parseLong(texto);
		
		return l;
	}
	public static String leerLinea(String mensaje) {
		p(mensaje + ": ");
		return SC.nextLine();
	}
	public static BigDecimal leerBigDecimal(String mensaje) {
		String texto = leerLinea(mensaje);
		BigDecimal bd = new BigDecimal(texto);
		
		return bd;
	}
	public static LocalDate leerLocalDate(String mensaje) {
		String texto = leerLinea(mensaje);
		LocalDate ld = LocalDate.parse(texto);
		
		return ld;
	}
}
