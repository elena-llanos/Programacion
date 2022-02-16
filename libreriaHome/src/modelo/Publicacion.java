package modelo;

public class Publicacion {
	
	protected double precio = 0.0;
	protected int unidades = 0;
	
	
	public Publicacion() {
		super();
	}
	public Publicacion(double precio, int unidades) {
		super();
		this.precio = precio;
		this.unidades = unidades;
	}
	
	public void venderUnidad() {
	
		
	}
	
	public void aumentarNumUnidades() {
		
		
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	@Override
	public String toString() {
		return "Precio y Cantidad \n" 
				+ " ** Precio:  " + precio + "€ **" + "\n"
				+ " ** Unidades: " + unidades+ "Uds **" + "\n ";
	}
	
	
	

}
