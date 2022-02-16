package vista;


import java.util.Date;
import java.util.Scanner;

import controlador.ListaPublicaciones;
import modelo.Libro;
import modelo.Periodico;
import modelo.Publicacion;

public class LibreriaApp {
	
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		

		int opcion = 0;
		boolean control = true;
		do {
			System.out.print("Menú de opciones\n"

				+ "1- Nuevo  \t \r\n"
				+ "2- Ver todas publicaciones \t \r\n"
				+ "3- Venta de periódico o libro \t \r\n"
				+ "4- Recepción de pedido \t \r\n"
				+ "5- Facturación de libros y periódicos \t \r\n"
				+ "6- Salir \n");

			opcion = leerOperandoInt();
			if (opcion !=6);

			switch (opcion) {

			case 1:
				
				anadirPublicacion();
				control = true;
				break;
			case 2:
				verPublicaciones();
				control = true;
				break;
			case 3:
				pedirDatosPublicacion();
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
		teclado.close();

}
	
	
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
		public static void anadirPublicacion() {
			
			System.out.println("Qué tipo de publicación vas a insertar");
			System.out.println("1- Libro");
			System.out.println("2- Periódico");
			
			int opt = 0;
			opt = leerOperandoInt();
			
			
			if (opt == 1) {
				System.out.println("Indica el titulo del libro");
				String titulo = teclado.nextLine();
			
				
				System.out.println("Indica el autor del libro");
				String autor = teclado.nextLine();
				
				
				System.out.println("Indica la editorial del libro");
				String editorial = teclado.nextLine();
				
				
				System.out.println("Indica el precio del libro");
				double precio = leerOperandoInt();
				
				
				System.out.println("Indica las unidades del libro");
				int unidades = leerOperandoInt();
				
				
				Libro libro = new Libro(titulo, autor, editorial, precio, unidades);
				ListaPublicaciones.nuevaPublicacion(libro);
				
			}else if (opt == 2) {
				
				System.out.println("Indica el nombre del periódico");
				String nombre = teclado.nextLine();
				
				System.out.println("Indica la fecha de publicación");
				String fechaPublicacion = teclado.nextLine();
				
				System.out.println("Indica el precio del periódico");
				double precio = leerOperandoInt();
				
				
				System.out.println("Indica las unidades del periódico");
				int unidades = leerOperandoInt();
			
				
				Periodico periodico = new Periodico(nombre, fechaPublicacion, precio, unidades);
				ListaPublicaciones.nuevaPublicacion(periodico);
				
			}
			
		}
		
		public static void verPublicaciones() {
			ListaPublicaciones.mostrarPublicaciones();
			
		}
		
		public static void pedirDatosPublicacion() {
			
			System.out.println("Qué tipo de publicación vas a comprar?");
			System.out.println("1- Libro");
			System.out.println("2- Periódico");
			
			int opt = 0;
			opt = leerOperandoInt();
			
			
			if (opt == 1) {
				System.out.println("Indica el titulo del libro");
				String titulo = teclado.nextLine();
				ListaPublicaciones.existeLibro(titulo);
				
			}else if (opt == 2) {
				
				System.out.println("Indica el nombre del periódico");
				String nombre = teclado.nextLine();
				
				Periodico periodico = new Periodico(nombre, nombre, opt, opt);
				//ListaPublicaciones.comprobarPublicacion(periodico);
				
			}
			
		}
}
