package com.ipartek.formacion.oop.pojos;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Producto {

	// Constante estática o de clase, porque nunca va a variar
	// no se repite por cada objeto
	public static final BigDecimal PRECIO_POR_DEFECTO = BigDecimal.ONE;

	// clase: el prototipo de un objeto

	// variables de instancia

	private long id;
	private String nombre;
	private BigDecimal precio;
	private LocalDate fechaCaducidad;

	// Constructor vacio: crear un objeto
	public Producto() {

	}

	// Constructores de instancia

	public Producto(long id, String nombre, BigDecimal precio, LocalDate fechaCaducidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.fechaCaducidad = fechaCaducidad;
	}

	// También puedo tener un constructor sin todos los atributos
	public Producto(long id, String nombre, LocalDate fechaCaducidad) {
		this(id, nombre, PRECIO_POR_DEFECTO, fechaCaducidad);
	}
	
	// Constructor de copia
		public Producto(Producto producto) {
			this(producto.getId(), producto.getNombre(), producto.getPrecio(), producto.getFechaCaducidad());

//			this.id = producto.getId();
//			this.nombre = producto.getNombre();
//			this.precio = producto.getPrecio();
//			this.caducidad = producto.getCaducidad();
		}

	// Getter y Setter

	public long getId() {
		return id;
	}

	public void setId(long id) {
		if(id != 0 && id < 0) {
			throw new RuntimeException("No se admiten valores negativos para el id");
		}
		// this hace referencia al id que hemos definido arriba
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if(nombre == null || nombre.trim().length() == 0) {
			throw new RuntimeException("No se admiten valores nulos para nombre");
		}
		this.nombre = nombre.trim();
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		if(precio == null || precio.compareTo(BigDecimal.ZERO) < 0) {
			throw new RuntimeException("No se admiten valores negativos para precio");
		}
		this.precio = precio;
	}

	public LocalDate getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(LocalDate fechaCaducidad) {
		if(fechaCaducidad != null && fechaCaducidad.compareTo(LocalDate.now()) <= 0) {
			throw new RuntimeException("La caducidad debe ser mayor a la fecha de hoy");
			
		}
		this.fechaCaducidad = fechaCaducidad;
	}

	

	// Métodos de instancia

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", fechaCaducidad=" + fechaCaducidad
				+ "]";
	}

	public String obtenerFicha() {
		String ficha = "\nId:           " + id + 
				"\nNombre:       " + nombre + 
				"\nPrecio:       " + precio + 
				"\nCaducidad:    "	+ fechaCaducidad + 
				"\n";
		return ficha;

	}
	
	public Producto paqueteDosPorUno(Producto producto) {
		return paqueteDosPorUno(this, producto);
	}
	
	//Métodos estáticos (De clase)
	
	public static Producto  paqueteDosPorUno(Producto p1, Producto p2) {
		Producto producto = new Producto();
		
		producto.setNombre("2 X 1 " + p1.getNombre() +" y "+ p2.getNombre());
		producto.setPrecio(p1.getPrecio().max(p2.getPrecio()));
		
		LocalDate caducidad1 = p1.getFechaCaducidad();
		LocalDate caducidad2 = p2.getFechaCaducidad();
		
		LocalDate caducidad = caducidad1.compareTo(caducidad2) > 0 ? caducidad1 : caducidad2;
		
		producto.setFechaCaducidad(caducidad );
		
		return producto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fechaCaducidad, id, nombre, precio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(fechaCaducidad, other.fechaCaducidad) && id == other.id
				&& Objects.equals(nombre, other.nombre) && Objects.equals(precio, other.precio);
	}
	
	
	

}
