package com.ipartek.formacion.funciones;

import java.math.BigInteger;

public class Recursividad {

	public static void main(String[] args) {
		int i = Integer.MAX_VALUE;

		 System.out.println(i);
		 System.out.println(i + 1);

		// Recursividad: algo se llama a sí mismo
		BigInteger diezmil = new BigInteger("10000");
		BigInteger result = factorial(diezmil);
		String textoResultado = result.toString();
		int contadorDigitos = textoResultado.length();
		
		System.out.println(contadorDigitos);
		
		BigInteger resultlIterativo = factorialIterativo(diezmil);
		
		System.out.println(resultlIterativo.toString().length());

	}

	/*
	 * Factorial: 5! = 5* 4 * 3 * 2 * 1 : se puede hacer con un blucle 5! = 4 *4! 4!
	 * = 4 * 3! 3! = 3 * 2! 2! = 2 * 1! 1! = 1 Para calcular tiene que usar un
	 * resultado anterior que calcula an la misma funcion
	 * 
	 */

	private static BigInteger factorial(BigInteger numero) {
		if (numero.compareTo(BigInteger.ONE) == 0) {
			return BigInteger.ONE;
		}
		return numero.multiply(factorial(numero.subtract(BigInteger.ONE)));
	}
	
	private static BigInteger factorialIterativo(BigInteger numero) {
		BigInteger total = BigInteger.ONE;
		
		for(BigInteger c = BigInteger.ONE; c.compareTo(numero) <= 0; c.add(BigInteger.ONE)) {
			
		}
		
		return total;
	}

}
