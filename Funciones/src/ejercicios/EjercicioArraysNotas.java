package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioArraysNotas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sumaNotas = 0;
		int mediaNotas = 0;
		
		//solicitamos número de alumnos
		System.out.println("Cuantos alumnos hay en clase:");
		int cantidadAlumnos = sc.nextInt();

		int[] notas = new int[cantidadAlumnos];

		// introducimos las notas de cada uno
		getNotas(sc, notas);
		
		//ahora sumamos las notas 		
		
		sumaNotas = sumaNotas(sumaNotas, notas);
		
		// ahora calculamos la media
		
		mediaNotas = getNotaMedia(sumaNotas, cantidadAlumnos);
		
		// ahora cuantos alumnos está por encima de la media 
		
		getNotaSuperiorMedia(mediaNotas, notas);
		
		sc.close();
	}

	/**
	 * @param sc
	 * @param notas
	 */
	private static void getNotas(Scanner sc, int[] notas) {
		for (int i = 0; i < notas.length; i++) {

			System.out.println("Introduce las notas:" + "alumno: " + (i + (1)));

			notas[i] = sc.nextInt();

		}
		System.out.println(Arrays.toString(notas));
	}

	/**
	 * @param sumaNotas
	 * @param notas
	 * @return
	 */
	private static int sumaNotas(int sumaNotas, int[] notas) {
		for (int i = 0; i < notas.length; i++) {
			
			 sumaNotas = sumaNotas + notas[i];
			
		}
		System.out.println("la suma de las notas es : " + sumaNotas);
		return sumaNotas;
	}

	/**
	 * @param sumaNotas
	 * @param cantidadAlumnos
	 * @return
	 */
	private static int getNotaMedia(int sumaNotas, int cantidadAlumnos) {
		int mediaNotas;
		mediaNotas = sumaNotas / cantidadAlumnos;
		System.out.println("la nota media es: " + mediaNotas);
		return mediaNotas;
	}

	/**
	 * @param mediaNotas
	 * @param notas
	 */
	private static void getNotaSuperiorMedia(int mediaNotas, int[] notas) {
		System.out.println("Listado de notas superiores a la media: ");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > mediaNotas) {
                System.out.println("Alumno número " + (i + 1)+ " Nota final: " + notas[i]);
            }
        }
	}

}
