package com.ipartek.formacion.oop.pojos;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class ProductoMedible extends Producto {

	private Double alto;
	private Double ancho;
	private Double profundidad;

	
	//////////Constructores 
	
	public ProductoMedible() {
		super();
	}
	
	public ProductoMedible(Double alto, Double ancho, Double profundidad) {
		super();
		this.alto = alto;
		this.ancho = ancho;
		this.profundidad = profundidad;
	}
	
	
	public ProductoMedible(long id, String nombre, BigDecimal precio, LocalDate fechaCaducidad, Double alto,
			Double ancho, Double profundidad) {
		super(id, nombre, precio, fechaCaducidad);
		this.alto = alto;
		this.ancho = ancho;
		this.profundidad = profundidad;
	}


	//////////// GET y SET////////////////
	public Double getAlto() {
		return alto;
	}

	

	public void setAlto(Double alto) {
		this.alto = alto;
	}

	public Double getAncho() {
		return ancho;
	}

	public void setAncho(Double ancho) {
		this.ancho = ancho;
	}

	public Double getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(Double profundidad) {
		this.profundidad = profundidad;
	}

	///////////////////////////////////

	@Override
	public String obtenerFicha() {
		// TODO Auto-generated method stub

		String ficha = super.obtenerFicha();
		ficha += "Alto:         " + alto + "\nAncho:        " + ancho + "\nProf:         " + profundidad + "\n";

		return ficha;

	}

	@Override
	public String toString() {
		return "ProductoMedible [alto=" + alto + ", ancho=" + ancho + ", profundidad=" + profundidad + super.toString()
				+ "]";
	}

	//////////////////////////////////
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(alto, ancho, profundidad);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductoMedible other = (ProductoMedible) obj;
		return Objects.equals(alto, other.alto) && Objects.equals(ancho, other.ancho)
				&& Objects.equals(profundidad, other.profundidad);
	}

}
