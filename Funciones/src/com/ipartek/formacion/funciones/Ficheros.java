package com.ipartek.formacion.funciones;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ficheros {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		final String FILE = ":::::prueba.txt";
		
		try {
			FileWriter fw = new FileWriter(FILE);
			PrintWriter pw = new PrintWriter(fw);
			pw.println("Hola desde el fichero");
			pw.println("Que tal???");

			System.out.println("Se ha escrito el fichero");

			pw.close();
		} catch (IOException e) {
						
			System.out.println("No se ha podido escribir");
		}

		try {
			FileReader fr = new FileReader(FILE);
			Scanner sc = new Scanner(fr);

			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println("Texto del fichero: " + line);

			}
			
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
		
			System.out.println("No se ha podido leer");
		}

	}

}
