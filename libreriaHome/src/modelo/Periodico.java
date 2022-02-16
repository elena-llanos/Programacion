package modelo;

import java.sql.Date;

public class Periodico extends Publicacion {
	
	
	private String nombre;
	private String fechaPublicacion;
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Periodico : \n"
			+ " Nombre : " + nombre + "\n"
			+ " Fecha Publicacion : " + fechaPublicacion + "\n"
			+ " "  + super.toString();
	}
	public Periodico() {
		super();
	}
	public Periodico(String nombre, String fechaPublicacion, double precio, int unidades) {
		super(precio, unidades);
		this.nombre = nombre;
		this.fechaPublicacion = fechaPublicacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFechaPublicacion() {
		return fechaPublicacion;
	}
	public void setFechaPublicacion(String fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}
	
	
	
	

}
