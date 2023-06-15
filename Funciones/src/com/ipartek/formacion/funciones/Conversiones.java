package com.ipartek.formacion.funciones;

import static com.ipartek.formacion.bibliotecas.Consola.*;

import java.util.Date;
import java.util.Scanner;

import com.ipartek.formacion.bibliotecas.Utilidades;

public class Conversiones {

	public static void main(String[] args) {
		int numeroTexto = readInt("Dime un número");
		
		pl(numeroTexto + 4);

		pl(readInt("Dime un número") + 4);


		boolean bool = readBoolean("Te gusta");
		

		String boolTexto = String.valueOf(bool);

		pl(boolTexto);


		Date fecha = new Date();
		String fechaTexto = fecha.toString();

		System.out.println(fechaTexto);

		fechaTexto = String.valueOf(fecha);

		System.out.println(fechaTexto);
		
		
	}
	
	
	

}
