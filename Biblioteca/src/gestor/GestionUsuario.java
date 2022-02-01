package gestor;

import java.util.Scanner;
import conexion.UsuarioBD;
import misclases.Libro;
import misclases.Usuario;

import java.util.ArrayList;
import java.util.Scanner;




		public class GestionUsuario {
			
			static Usuario usuario = null;
			
			public static void insertarUsuario(Usuario usuario) {
				
				boolean resultado = UsuarioBD.anadirUsuario(usuario);
				
				if (resultado == true) {
					System.out.println("usuario registrado OK");
				}else {
					System.out.println("error");
				}
				
					
			}
	 
	
	
	
	
}