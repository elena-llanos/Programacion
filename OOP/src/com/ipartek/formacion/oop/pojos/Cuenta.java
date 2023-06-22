package com.ipartek.formacion.oop.pojos;

import java.util.Objects;

public class Cuenta {
	/*
	 * + Escribe una clase Cuenta para representar una cuenta bancaria. Los datos de
	 * la cuenta son: nombre del cliente (String), número de cuenta (String), tipo
	 * de interés (double) y saldo (double).
	 */

	private String nombre;
	private String numeroCuenta;
	private double tipoInteres;
	private double saldo;

	public Cuenta(String nombre, String numeroCuenta, double tipoInteres, double saldo) {
		super();
		this.nombre = nombre;
		this.numeroCuenta = numeroCuenta;
		this.tipoInteres = tipoInteres;
		this.saldo = saldo;
	}

	public Cuenta() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getTipoInteres() {
		return tipoInteres;
	}

	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cuenta" + "\n [nombre:       " + nombre 
				+ "\n " + "numeroCuenta:  " + numeroCuenta 
				+ "\n " + "tipoInteres:   " + tipoInteres 
				+ "\n " + "saldo:         " + saldo + "]";
	}
	
	public  boolean ingresar(double num) {
		
		boolean ingresoCorrecto = true;
        if (num < 0) {
            ingresoCorrecto = false;
            System.out.println("Debes ingresar una cantidad positiva");
        } else {
            saldo = saldo + num;
            System.out.println("Ingreso correcto");
        }
        return ingresoCorrecto;
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre, numeroCuenta, saldo, tipoInteres);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cuenta other = (Cuenta) obj;
		return Objects.equals(nombre, other.nombre) && Objects.equals(numeroCuenta, other.numeroCuenta)
				&& Double.doubleToLongBits(saldo) == Double.doubleToLongBits(other.saldo)
				&& Double.doubleToLongBits(tipoInteres) == Double.doubleToLongBits(other.tipoInteres);
	}

}
