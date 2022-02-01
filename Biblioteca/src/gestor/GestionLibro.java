package gestor;

import java.util.ArrayList;

import conexion.LibroBD;
import conexion.UsuarioBD;
import main.Menu;
import misclases.Libro;
import misclases.Usuario;



public class GestionLibro {
	 
	
		static Libro libro = null;
	
		public static void insertarLibro(Libro libro) {

			boolean resultado = LibroBD.anadirLibro(libro);

			if (resultado == true) {
				System.out.println("libro registrado OK");
			}else {
				System.out.println("error");
			}
		}
	
		
		public static Libro consultarLibro() {
			
			ArrayList<Libro>ListadoLibros = LibroBD.obtenerLibros();
			
			for(int i =0; i < ListadoLibros.size(); i++) {
				
				
		}
			return libro;
		}
			
		
		
		public static Libro mostrarLibros() {
			
			LibroBD.obtenerLibros();
			
			return libro;
			
			
			
		}
	

	
	






	
}




