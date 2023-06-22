package com.ipartek.formacion.oop.vista;

import java.util.Scanner;

import com.ipartek.formacion.oop.Consola;
import com.ipartek.formacion.oop.pojos.Cuenta;
import com.ipartek.formacion.oop.pruebas.CuentaPruebas;

public class Main {
	
	static Scanner sc = new Scanner(System.in);

	static String c;
	public static void main(String[] args) {

		int opcion = 0;
		
		boolean control = true;
		
		
		do {
			System.out.print("Menú de opciones\n"

				+ "1- Nueva Cuenta  \t \r\n"
				+ "2- Ver todas las Cuentas \t \r\n"
				+ "3- Ingreso \t \r\n"
				+ "4- Reintegro \t \r\n"
				
				+ "5- Salir \n");

			opcion = Consola.leerOperandoInt();
			if (opcion !=5);

			switch (opcion) {

			case 1:
				
				CuentaPruebas.solicitarDatos();
				control = true;
				break;
			case 2:
				CuentaPruebas.verCuentas();
				control = true;
				break;
			case 3:
				CuentaPruebas.realizarIngreso(c);
				control = true;
				break;
			case 4:
				
				control = true;
				break;
			case 5:

				control = true;
			case 6:
				control = false;

			default:
				
			}

		}while (control);
		sc.close();

	}

}
