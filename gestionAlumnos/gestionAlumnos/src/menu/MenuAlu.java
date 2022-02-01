package menu;

import java.util.Scanner;


import alumno.Alumno;
import gestor.Gestor;

// Esta clase escribe todos los menus de la aplicaciï¿½n, y lee del teclado
public class MenuAlu {

	private Scanner teclado = null;
	private Gestor gestor = null;
	private int curso = 0;

	public MenuAlu() {
		teclado = new Scanner(System.in);
		gestor = new Gestor();
	}

	// Funcion principal
	public void iniciar() {
		int opcion = 0;
		do {
			opcion = opcionMenu();
			if (opcion != 0) {
				ejecutarOpcionMenu(opcion);
				System.out.println(" ");
			}
		} while (opcion != 0);
		System.out.print("Adios!!!");
	}
	
	// Opciones del menu
	private int opcionMenu() {
		int ret = 0;
		do {
			try {
				escribirMenu();
				System.out.print("Elija una opcion: ");
				ret = teclado.nextInt();
				teclado.nextLine();
			} catch (Exception e) {
				teclado.nextLine();
				ret = -1;
			}
		} while ((ret < 0) && (ret > 3));
		return ret;
	}

	
	// Escribe los literales del menu
	private void escribirMenu() {
		System.out.println("---- MENU ----");
		System.out.println("---- 0 - SALIR ");
		System.out.println("---- 1 - Añadir  un  Alumno ");
		System.out.println("---- 2 - Visualizar todos los Alumnos ");
		System.out.println("---- 3 - Visualizar un Alumno ");
		System.out.println("---- 4 - Modificar un Alumno ");
		System.out.println("--------------");
	}

	// Ejecuta la opcion de menu elegida
	private void ejecutarOpcionMenu(int opcion) {
		switch (opcion) {
		case 1:
			System.out.println("Introduzca nuevo alumno...");
			Alumno alumno = introducirNuevoAlumno();
			gestor.anadirAlumno(alumno);
			System.out.println(alumno.getNombre() + " introducido...");
			break;
		case 2:
			System.out.println("Buscando todos los alumnos...");
			Alumno[] todosLosAlumnos = gestor.getTodosAlumnos();
			mostrarTodosLosAlumnos(todosLosAlumnos);
			break;
		case 3:
			System.out.println("Buscando por nombre...");
			System.out.print("Nombre: ");
			String nombre = leerOperandoText();
			Alumno miAlumno = gestor.getAlumno(nombre);
			mostrarAlumno(miAlumno);
		case 4:
			System.out.println("Buscando por nombre...");
			System.out.print("Nombre: ");
			String nombreAmodificar = leerOperandoText();
			Alumno miAlumno1 = gestor.getAlumno(nombreAmodificar);
			mostrarAlumno(miAlumno1);
			modificarAlumno(curso);
			break;
		}
	}
	
	// Lee del teclado un numero
	private int leerOperandoInt() {
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

	// Lee del teclado un numero
	private String leerOperandoText() {
		String ret = null;
		try {
			System.out.print(" : ");
			ret = teclado.nextLine();
		} catch (Exception e) {
			teclado.nextLine();
		}
		return ret;
	}

	// Pide al usuario los datos de un nuevo Alumno
	private Alumno introducirNuevoAlumno() {
		Alumno ret = new Alumno();
		System.out.println("-- Datos del Alumno --");
		System.out.print("Nombre - ");
		ret.setNombre(leerOperandoText());
		System.out.print("Apellido 1 - ");
		ret.setApellido1(leerOperandoText());
		System.out.print("Apellido 2 - ");
		ret.setApellido2(leerOperandoText());
		System.out.print("Fecha De Nacimiento - ");
		ret.setFechaDeNacimiento(leerOperandoText());
		System.out.print("Curso - ");
		ret.setCurso(leerOperandoInt());
		System.out.print("Clase - ");
		ret.setClase(leerOperandoInt());
		System.out.println("----------");
		return ret;
	}

	private void mostrarTodosLosAlumnos(Alumno[] todosLosAlumnos) {
		for (int i = 0; i < todosLosAlumnos.length; i++) {
			if (null != todosLosAlumnos[i]) {
				System.out.println("Alumno [" + i + "] ...");
				mostrarAlumno(todosLosAlumnos[i]);
			}
		}
	}
	
	private void mostrarAlumno(Alumno alumno) {
		System.out.println("----------");
		if (null != alumno) {
			System.out.println("Nombre: " + alumno.getNombre());
			System.out.println("Apellido 1: " + alumno.getApellido1());
			System.out.println("Apellido 2: " + alumno.getApellido2());
			System.out.println("Fecha De Nacimiento: " + alumno.getFechaDeNacimiento());
			System.out.println("Curso: " + alumno.getCurso());
			System.out.println("Clase: " + alumno.getClase());
		} else {
			System.out.println("Sin datos");
		}
		System.out.println("----------");
	}
	private Alumno modificarAlumno(int curso) {
		
		Alumno nombreAmodificar = new Alumno();
		int cursoIntroducido = 0;
		System.out.println("Introduce el curso nuevo");
		cursoIntroducido = leerOperandoInt();
		
		nombreAmodificar.setCurso(cursoIntroducido);
		
		
		
		System.out.println("Alumno modificado:  " + nombreAmodificar.toString());
		System.out.println("Nombre: " + nombreAmodificar.setNombre(nombre));
		System.out.println("Apellido 1: " + nombreAmodificar.getApellido1());
		System.out.println("Apellido 2: " + nombreAmodificar.getApellido2());
		System.out.println("Fecha De Nacimiento: " + nombreAmodificar.getFechaDeNacimiento());
		System.out.println("Curso: " + nombreAmodificar.getCurso());
		System.out.println("Clase: " + nombreAmodificar.getClase());
		return nombreAmodificar;
	}
	
}
