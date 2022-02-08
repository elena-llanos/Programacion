package controlador;

import modelo.Cliente;
import modelo.Vehiculo;
import querys.ClienteBD;

public class Metodos {
	Vehiculo[][] plazasTotales = new Vehiculo[0][0];
	Vehiculo vehiculo = new Vehiculo();
	
	public void aparcar(Vehiculo vehiculo) {
		
		Vehiculo[][] plazasTotales = new Vehiculo[0][0];
		
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

	public void reparar(Vehiculo vehiculo) {
		
		
	}

	
	

}
