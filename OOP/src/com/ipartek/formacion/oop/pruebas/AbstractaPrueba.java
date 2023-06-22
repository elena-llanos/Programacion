package com.ipartek.formacion.oop.pruebas;

import java.util.ArrayList;
import java.util.Arrays;

public class AbstractaPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Number> numeros = new ArrayList<>();
		
		numeros.add(5);      //new Integer(5);
		numeros.add(5.45);  //new Double(5.45)
		
		
		for(Number numero: numeros) {
			System.out.println(numero.doubleValue());
		}
		
		
				

	}

}
