package controlador;

import java.util.ArrayList;

import modelo.Libro;
import modelo.Publicacion;
import vista.LibreriaApp;

public class ListaPublicaciones {
	
	static private ArrayList<Publicacion>listadoPublicaciones = new ArrayList<Publicacion>();
	
	
	public static void nuevaPublicacion(Publicacion publicacion) {
		
		listadoPublicaciones.add(publicacion);
		
	}
	
	public static void mostrarPublicaciones() {
		
		for(int i=0; i < listadoPublicaciones.size(); i++) {
			System.out.println(listadoPublicaciones.get(i));
		}
		
	}
	public static boolean existeLibro(String titulo) {
		
		
		for(int i=0; i < listadoPublicaciones.size(); i++) {
			Publicacion publicacion = listadoPublicaciones.get(i);
			
			if (publicacion instanceof Libro && ((Libro) publicacion).getTitulo().equals(titulo)) {
				System.out.println("hola");
				return true;
				
			}
			
		}
		return false;
		
	}

}
