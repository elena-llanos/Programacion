package modelo;

import java.util.ArrayList;
import modelo.Vehiculo;
import java.util.Arrays;

import controlador.EntradaDatos;

public class Garaje {
	
	private Vehiculo plazasTotales [][] = new Vehiculo[10][10];
	private ArrayList<Vehiculo>cochesAveriados;
	
	
	public Garaje(Vehiculo[][] plazasTotales, ArrayList<Vehiculo> cochesAveriados) {

		this.plazasTotales = plazasTotales;
		this.cochesAveriados = cochesAveriados;
	}


	public Garaje() {
		
	}
	
	

	

	public Vehiculo[][] getPlazasTotales() {
		return plazasTotales;
	}


	public void setPlazasTotales(Vehiculo[][] plazasTotales) {
		this.plazasTotales = plazasTotales;
	}


	public ArrayList<Vehiculo> getCochesAveriados() {
		return cochesAveriados;
	}


	public void setCochesAveriados(ArrayList<Vehiculo> cochesAveriados) {
		this.cochesAveriados = cochesAveriados;
	}


	@Override
	public String toString() {
		return "Garaje [plazasTotales=" + Arrays.toString(plazasTotales) + ", cochesAveriados=" + cochesAveriados + "]";
	}
	
	
	
	
	

}


	