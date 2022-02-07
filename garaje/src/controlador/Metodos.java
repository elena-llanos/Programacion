package controlador;

import java.util.InputMismatchException;
import java.util.Scanner;

import modelo.Cliente;
import modelo.Garaje;
import modelo.Motor;
import modelo.Vehiculo;
import querys.ClienteBD;

public class Metodos {
	static Scanner teclado = new Scanner (System.in);

	

private static int leerOperandoInt() {
	int ret = 0;
	do {
		try {
			System.out.print(" : ");
			ret = teclado.nextInt();
			teclado.nextLine();
		} catch (Exception e) {
			teclado.nextLine();
			ret = -1;
		}
	} while (ret < 0);
	return ret;
}


private static String leerOperandoText() {
	String ret = null;
	try {
		System.out.print(" : ");
		ret = teclado.nextLine();
	} catch (Exception e) {
		teclado.nextLine();
	}
	return ret;
}

public static void comprobarDNI() {

	Cliente cliente = new Cliente();
	System.out.println("\t\r ***** Bienvenida a nuestro garaje ");
	System.out.println("\t\r Introduce el DNI: ");
	cliente.setDni(leerOperandoText());
	boolean resultado = ClienteBD.comprobarCliente(cliente);
	if (resultado == true) {

		System.out.println("Cliente ya registrado");
	} else {
		System.out.println("Cliente inexistente, por favor introduzca sus datos:");
		pedirDatosUsuario();
	}

}
public static void pedirDatosUsuario() {

	Cliente cliente = leerCliente();
	Vehiculo vehiculo = leerMatricula();
	cliente.setV(vehiculo);
	
	boolean resultado = ClienteBD.insertarCliente(cliente);
	if (resultado == true) {
		System.out.println("\t\r Cliente registrado con exito");
		gestionarAparcamiento(vehiculo);
	} else {
		System.out.println("\t\r Error al resgistrar el cliente");
	}

}


private static Cliente leerCliente() {
	Cliente cliente = new Cliente();
	
	System.out.println("\t\r Introduce el DNI: ");
	cliente.setDni(leerOperandoText());
	System.out.println("\t\r Introduce el nombre : ");
	cliente.setNombre(leerOperandoText());
	return cliente;
}

	public static Vehiculo leerMatricula() {
		
		Vehiculo vehiculo = new Vehiculo();
		System.out.println(" Introduce la Matricula: ");
		 String matricula = teclado.next();
		vehiculo.setMatricula(matricula);
		return  vehiculo;
		
	}

	public static Vehiculo leer() {
		System.out.println("Introduzca los datos del vehiculo: ");
		System.out.println("Litros Aceite : ");
		int litrosAceiteRestantes = teclado.nextInt();
		System.out.println("caballos: ");
		int caballos = teclado.nextInt();
		
		Motor potencia = new Motor(litrosAceiteRestantes, caballos);
		
		System.out.println("Matricula: ");
		String matricula = teclado.next();
		System.out.println("Marca: ");
		String marca = teclado.next();
		System.out.println("Modelo: ");
		String modelo= teclado.next();
		
		return new Vehiculo(potencia, marca, modelo, matricula, 0, false, 0);
	
}
	public static void gestionarAparcamiento(Vehiculo vehiculo) {
		
		int opcion = 0;
		System.out.println("1.aparcar vehículo");
		System.out.println("2.reparar vehículo");
		
		if (opcion == 1) {
		Garaje garaje = new Garaje();
		leer();
		garaje.aparcar(vehiculo);

		
		}else if (opcion == 2) {
			
		}
			}
}
	
