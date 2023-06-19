package com.ipartek.formacion.oop.pojos;

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
	
	public boolean ingresar(double num) {
		
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

}
