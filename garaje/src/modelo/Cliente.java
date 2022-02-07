package modelo;

public class Cliente {
	
	private String nombre;
	private String dni;
	private Vehiculo v;
	

	public Cliente(String nombre, String dni, String matricula, Vehiculo v) {
		
		this.nombre = nombre;
		this.dni = dni;
		this.v = v;
	}
	
	
	public Cliente() {
	
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getDni() {
		return dni;
	}




	public void setDni(String dni) {
		this.dni = dni;
	}




	public Vehiculo getV() {
		return v;
	}




	public void setV(Vehiculo v) {
		this.v = v;
	}


	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", dni=" + dni + ", v=" + v + "]";
	}




	
	
	
	
	

}
