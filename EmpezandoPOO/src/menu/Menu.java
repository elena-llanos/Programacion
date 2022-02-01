package menu;

import java.util.Scanner;

import operaciones.Operaciones;

public class Menu {

	private Scanner teclado = null;

	public Menu() {
		teclado = new Scanner(System.in);
	}

	// Escribe los literales del menu
	private void escribirMenu() {
		System.out.println("---- MENU ----");
		System.out.println("---- 0 - SALIR ");
		System.out.println("---- 1 - SUMAR ");
		System.out.println("---- 2 - RESTAR ");
		System.out.println("---- 3 - MULTIPLICAR ");
		System.out.println("---- 4 - DIVIDIR ");
		System.out.println("---- 5 - RAIZ CUADRADA ");
		System.out.println("---- 6 - FACTORIAL ");
		System.out.println("---- 7 - SUMATORIO ");
		System.out.println("--------------");
	}

	// Opciones del menu
	private int opcionMenu() {
		int ret = 0;
		do {
			try {
				escribirMenu();
				System.out.print("Elija una opcion: ");
				ret = teclado.nextInt();
			} catch (Exception e) {
				teclado.nextLine();
				ret = -1;
			}
		} while ((ret < 0) && (ret > 7));
		return ret;
	}

	// Lee del teclado un numero
	private double leerOperando() {
		double ret = 0;
		do {
			try {
				System.out.print("Introduce un numero: ");
				ret = teclado.nextDouble();
				teclado.nextLine();
			} catch (Exception e) {
				teclado.nextLine();
				ret = -1;
			}
		} while (ret < 0);
		return ret;
	}

	// Ejecuta la opcion de menu elegida
	private double ejecutarOpcionMenu(int opcion) {
		double op1 = 0;
		double op2 = 0;
		double ret = 0;

		Operaciones operaciones = new Operaciones();

		switch (opcion) {
		case 1:
			op1 = leerOperando();
			op2 = leerOperando();
			ret = operaciones.sumar(op1, op2);
			break;
		case 2:
			op1 = leerOperando();
			op2 = leerOperando();
			ret = operaciones.restar(op1, op2);
			break;
		case 3:
			op1 = leerOperando();
			op2 = leerOperando();
			ret = operaciones.multiplicar(op1, op2);
			break;
		case 4:
			op1 = leerOperando();
			op2 = leerOperando();
			ret = operaciones.dividir(op1, op2);
			break;
		case 5:
			op1 = leerOperando();
			ret = operaciones.raizCuadrada(op1);
			break;
		case 6:
			op1 = leerOperando();
			ret = operaciones.factorial(op1);
			break;
		case 7:
			op1 = leerOperando();
			ret = operaciones.sumatorio(op1);
			break;
		}

		return ret;
	}

	// Funcion principal
	public void iniciar() {
		int opcion = 0;
		do {
			double resultado = 0;
			opcion = opcionMenu();
			if (opcion != 0) {
				resultado = ejecutarOpcionMenu(opcion);
				System.out.println("Resultado = " + resultado);
				System.out.println(" ");
			}
		} while (opcion != 0);
		System.out.print("Adios!!!");
	}

}
