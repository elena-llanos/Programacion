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
	public static void solicitarDatos() {
		Cuenta cuenta1 = new Cuenta();

		System.out.print("Nombre : ");
		nombre = sc.nextLine();
		
		System.out.print("Número de cuenta : ");
		numero = sc.nextLine();
		
		System.out.print("Tipo de interes : ");
		tipo = sc.nextDouble();
		
		System.out.print("Saldo: ");
		importe = sc.nextDouble();
		
		

		cuenta1.setNombre(nombre);
		cuenta1.setNumeroCuenta(numero);
		cuenta1.setTipoInteres(tipo);
		cuenta1.setSaldo(importe);

		
		cuentas.add(cuenta1);
		
	}

	public static void realizarIngreso(String c) {
		
		System.out.println("Nombre de la cuenta");
		c = sc.nextLine();
		boolean containsNombre = cuentas.contains(c);

		
		
		if(containsNombre == true) {
		System.out.println("Cuanto quieres ingresar?");
		ingreso = sc.nextDouble();
		Cuenta cuenta = new Cuenta(null, null, 0, 0);
		cuenta.ingresar(ingreso);
		
		System.out.println("El nuevo saldo de la cuenta es: ");

			
		}
		
		

	}
	
	public static ArrayList<Cuenta> verCuentas(){
		
		for(int i = 0; i < cuentas.size(); i++) {
			System.out.println(cuentas.get(i));
		}
		return cuentas;
		
	}

}
