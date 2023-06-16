package ejercicios;

import java.util.Arrays;

public class EjercicioArraysPares {

	public static void main(String[] args) {
		/*
		 * Programa que crea un array de 20 elementos llamado Pares y guarde los 20
		 * primeros números pares. Mostrar por pantalla el contenido del array creado.
		 */

		int[] pares = new int[20];
		int i = 0;
		int contador = 0;

		for (i = 0; i < pares.length; i++) {
			
				pares[i] = contador;
				contador +=2;
			
		}
		System.out.println(Arrays.toString(pares));
	}

}
