package com.ipartek.formacion.oop.pruebas;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.formacion.oop.pojos.Cuenta;

public class CuentaPruebas {

	static Scanner sc = new Scanner(System.in);
	static String nombre, numero;
	static double tipo, importe, ingreso;
	static ArrayList<Cuenta> cuentas = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Métodos ingreso y reintegro. Un ingreso consiste en aumentar el saldo en la
		 * cantidad que se indique. Esa cantidad no puede ser negativa. Un reintegro
		 * consiste en disminuir el saldo en una cantidad pero antes se debe comprobar
		 * que hay saldo suficiente. La cantidad no puede ser negativa. Los métodos
		 * ingreso y reintegro devuelven true si la operación se ha podido realizar o
		 * false en caso contrario.
		 */

		solicitarDatos();

	}

	/**
	 * 
	 */
	private static void solicitarDatos() {
		Cuenta cuenta1 = new Cuenta();

		System.out.print("Nombre : ");
		nombre = sc.nextLine();
		sc.nextLine();
		System.out.print("Número de cuenta : ");
		numero = sc.nextLine();
		sc.nextLine();
		System.out.print("Tipo de interes : ");
		tipo = sc.nextDouble();
		sc.nextLine();
		System.out.print("Saldo: ");
		importe = sc.nextDouble();
		sc.nextLine();

		cuenta1.setNombre(nombre);
		cuenta1.setNumeroCuenta(numero);
		cuenta1.setTipoInteres(tipo);
		cuenta1.setSaldo(importe);

		System.out.println(cuenta1);
		cuentas.add(cuenta1);
		realizarIngreso(cuenta1);
	}

	public static Cuenta realizarIngreso(Cuenta c) {

		System.out.println("Cuanto quieres ingresar?");
		ingreso = sc.nextDouble();

		c.ingresar(ingreso);

		System.out.println("El nuevo saldo de la cuenta es: " + c.getSaldo());

		return c;

	}

}
