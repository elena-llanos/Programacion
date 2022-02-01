package main;

import java.util.Scanner;

import conexion.LibroBD;
import conexion.UsuarioBD;
import gestor.GestionLibro;
import gestor.GestionUsuario;
import misclases.Libro;
import misclases.Usuario;

public class Menu {

	static Scanner teclado = new Scanner(System.in);
	static Usuario usuario = null;
	static boolean control = true;
	static Libro titulo = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion = 0;
		boolean control = true;
		do {
			System.out.print("Menú de opciones\n"

				+ "1-Añadir Libro  \t \r\n"
				+ "2-Consultar Libro \t \r\n"
				+ "3-Mostrar Libros \t \r\n"
				+ "4-Prestar Libro \t \r\n"
				+ "5-Devolver Libro \t \r\n"
				+ "6-Añadir Usuario \t \r\n"
				+ "7-Consultar Usuario \t \r\n"
				+"8-salir \n");

			opcion = teclado.nextInt();
			if (opcion !=0);

			switch (opcion) {

			case 1:
				anadirLibro();
				control = true;
				break;
			case 2:
				consultarLibro();
				control = true;
				break;
			case 3:
				mostrarLibros();
				control = true;
				break;
			case 4:
				
				control = true;
				break;
			case 5:

				control = true;
			case 6:
				anadirUsuario();
				control = true;
			case 7:

				control = true;
			case 8:


			default:

			}

		}while (control);
		teclado.close();

	}




//--------------------------------------------------------------------------------------------//









		public static Libro anadirLibro() {
		
			System.out.println("Indica el ISBN del libro");
			teclado.nextLine();
			String isbn = teclado.nextLine();
		
			System.out.println("Indica al título");
			teclado.nextLine();
			String titulo = teclado.nextLine();
		
			System.out.println("Indica el autor");
			teclado.nextLine();
			String autor = teclado.nextLine();
		
		
			Libro libro = new Libro (isbn, titulo, autor);
			GestionLibro.insertarLibro(libro);
			return libro;
		
		} 



		public static Libro consultarLibro() {
			System.out.println("Indica el titulo del libro");
			teclado.nextLine();
			String titulo = teclado.nextLine();
			Libro libro = new Libro ();
			GestionLibro.consultarLibro();
			return libro;
		
		}

		public static void mostrarLibros() {
			GestionLibro.mostrarLibros();
			System.out.println(LibroBD.obtenerLibros());
			
		}










		public static Usuario anadirUsuario() {
		
			System.out.println("Indica tu dni");
			teclado.nextLine();
			String dni = teclado.nextLine();
		
			System.out.println("Indica tu nombre");
			teclado.nextLine();
			String nombre = teclado.nextLine();
		
			System.out.println("Indica el apellido");
			teclado.nextLine();
			String apellido = teclado.nextLine();
		
		
			Usuario usuario = new Usuario (dni, nombre, apellido);
			GestionUsuario.insertarUsuario(usuario);
			return usuario;
		
		} 




}