package com.ipartek.formacion.oop.pruebas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CalculadoraSwing {

	private JFrame frame;
	private JTextField tfDisplay;
	private JPanel pNumeros;

	private double op1;
	private String op;
	private double op2;
	private static final String ERROR = "****ERROR****";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraSwing window = new CalculadoraSwing();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculadoraSwing() {
		initialize();

		String[] numeros = { "7", "8", "9", "4", "5", "6", "1", "2", "3", "0", ".", "E" };

		JButton boton;

		for (String numero : numeros) {
			boton = new JButton(numero);
			pNumeros.add(boton);

			boton.addActionListener(e -> tfDisplay.setText(tfDisplay.getText() + ((JButton) e.getSource()).getText()));
		}

//		for(int num = 0; num <= 9; num++) {
//			boton = new JButton(String.valueOf(num));
//			pNumeros.add(boton);
//		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		tfDisplay = new JTextField();
		tfDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		tfDisplay.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		frame.getContentPane().add(tfDisplay, BorderLayout.NORTH);
		tfDisplay.setColumns(10);

		JPanel pOperaciones = new JPanel();
		frame.getContentPane().add(pOperaciones, BorderLayout.EAST);
		pOperaciones.setLayout(new GridLayout(5, 1, 0, 0));

		JButton btnSumar = new JButton("+");
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				op1 = leerPantalla();
				op = "+";
				limpiarPantalla();
			}

		});
		pOperaciones.add(btnSumar);

		JButton btnRestar = new JButton("-");
		btnRestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				op1 = leerPantalla();
				op = "-";
				limpiarPantalla();
			}
		});
		pOperaciones.add(btnRestar);

		JButton btnMultiplicar = new JButton("X");
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				op1 = leerPantalla();
				op = "*";
				limpiarPantalla();
			}
		});
		pOperaciones.add(btnMultiplicar);

		JButton btnDividir = new JButton("/");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				op1 = leerPantalla();
				op = "/";
				limpiarPantalla();
			}
		});
		pOperaciones.add(btnDividir);

		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double res = 0.0;
				op2 = leerPantalla();

				switch (op) {
				case "+":
					res = op1 + op2;
					break;
				case "-":
					res = op1 - op2;
					break;
				case "*":
					res = op1 * op2;
					break;
				case "/":
					res = op1 / op2;
					break;
				}

				escribirEnPantalla(res);
			}
		});
		pOperaciones.add(btnIgual);

		JPanel pCentral = new JPanel();
		frame.getContentPane().add(pCentral, BorderLayout.CENTER);
		pCentral.setLayout(new BorderLayout(0, 0));

		JPanel pOperaciones2 = new JPanel();
		pCentral.add(pOperaciones2, BorderLayout.NORTH);
		pOperaciones2.setLayout(new GridLayout(1, 3, 0, 0));

		JButton btnAc = new JButton("AC");
		btnAc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfDisplay.setText("0");
			}
		});
		pOperaciones2.add(btnAc);

		JButton btnMasMenos = new JButton("+/-");
		btnMasMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double num =leerPantalla();

				num *= -1;
				escribirEnPantalla(num);
			}
		});
		pOperaciones2.add(btnMasMenos);

		JButton btnPorcentaje = new JButton("%");
		btnPorcentaje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double num = leerPantalla();

				num /= 100;

				escribirEnPantalla(num);
			}
		});
		pOperaciones2.add(btnPorcentaje);

		pNumeros = new JPanel();
		pCentral.add(pNumeros, BorderLayout.CENTER);
		pNumeros.setLayout(new GridLayout(4, 3, 0, 0));
	}

	/**
	 * @return
	 */
	private double leerPantalla() {
		String texto = tfDisplay.getText();
		String textoConPuntos = texto.replace(",", ".");
		try {
			return Double.parseDouble(textoConPuntos);
		} catch (NumberFormatException e) {
			escribirEnPantalla(ERROR);
			throw e;
		}
	}

	/**
	 * 
	 */
	private void escribirEnPantalla(Double dato) {
		String texto = String.valueOf(dato);
		String textoConComas = texto.replace(".", ",");

		if (textoConComas.endsWith(",0")) {
			textoConComas = textoConComas.replace(",0", "");
		}

		escribirEnPantalla(textoConComas);
	}

	private void escribirEnPantalla(String texto) {
		tfDisplay.setText(texto);
	}

	private void limpiarPantalla() {
		escribirEnPantalla("0");
	}
}
