package com.ipartek.formacion.oop.pruebas;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;

public class SwingPrueba   {

	public static void main(String[] args) {
	
		JFrame jf = new JFrame("Ejemplo de swing");
		JLabel jl = new JLabel("Hola mundo");
		jf.getContentPane().add(jl);
		jf.setBounds(100, 100, 300, 200);
		
		JTextField jtx = new JTextField(10);
		
		
		
		
		jf.setVisible(true);
	}

}
