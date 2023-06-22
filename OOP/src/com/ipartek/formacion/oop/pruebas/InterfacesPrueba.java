package com.ipartek.formacion.oop.pruebas;

import java.util.ArrayList;
import java.util.List;

import com.ipartek.formacion.oop.pojos.interfaces.Balon;
import com.ipartek.formacion.oop.pojos.interfaces.Naranja;
import com.ipartek.formacion.oop.pojos.interfaces.Rodable;

public class InterfacesPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Rodable>  rodables = new ArrayList<>();
		
		rodables.add(new Balon());
		rodables.add(new Naranja());

	}

}
