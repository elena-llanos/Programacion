package ejercicios;

import com.ipartek.formacion.bibliotecas.Consola;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Programa Java que lee una temperatura expresada en grados centígrados y la
		 * convierte a grados kelvin.
		 * 
		 * El proceso de leer grados centígrados se debe repetir mientras que se
		 * responda ‘S’ a la pregunta: Repetir proceso? (S/N)
		 * 
		 * Para hacer la conversión de grados Centígrados a grados Kelvin hay que
		 * utilizar la fórmula:
		 * 
		 * ºK = ºC + 273
		 */
		
		convertKelvin();

	}

	private static int convertKelvin() {
		
		System.out.println("Dime un número");
		int cent = Consola.leerOperandoInt();
		
		int kelvin = cent + 273;
		
		System.out.println("Traducción a Kelvin: " + kelvin);
		
		repeatProcess();
		return kelvin;
		
	}
	
	private static boolean repeatProcess() {		
		
		String answer = Consola.rl("Repeat Process?");
		
		if (answer.equalsIgnoreCase("S")) {
			convertKelvin();
		}else {
			System.out.println("Aguuur");
		}
			
		return true;
	}

}
