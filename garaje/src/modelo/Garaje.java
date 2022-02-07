package modelo;

import java.util.ArrayList;
import modelo.Vehiculo;
import java.util.Arrays;

import controlador.Metodos;

public class Garaje {
	
	private Vehiculo plazasTotales [][] = new Vehiculo[10][10];
	private ArrayList<Vehiculo>cochesAveriados;
	
	
	
	
	
	
	public Garaje(Vehiculo[][] plazasTotales, ArrayList<Vehiculo> cochesAveriados) {

		this.plazasTotales = plazasTotales;
		this.cochesAveriados = cochesAveriados;
	}


	public Garaje() {
		Vehiculo[][] plazasTotales = new Vehiculo[0][0];
	}
	
	public void aparcar(Vehiculo vehiculo) {
		
				
		plazasTotales[0][0] = vehiculo;
		
		for(int i = 0; i < plazasTotales.length; i++) {
			for(int j = 0; j < plazasTotales[i].length; j++) {
				
				if(plazasTotales[i][j] == null) {
					plazasTotales[i][j] = vehiculo;
					break;
				}
				
				
			}
		}
		
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


	