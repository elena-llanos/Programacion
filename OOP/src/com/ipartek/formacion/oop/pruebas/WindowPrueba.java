package com.ipartek.formacion.oop.pruebas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WindowPrueba {

	private JFrame frame;
	private JTextField txtName;
	private JTextField txtSurname;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowPrueba window = new WindowPrueba();
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
	public WindowPrueba() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 443, 128);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Nombre");
		lblName.setBounds(22, 11, 46, 33);
		frame.getContentPane().add(lblName);
		
		JLabel lblSurname = new JLabel("Apellidos");
		lblSurname.setBounds(22, 55, 60, 14);
		frame.getContentPane().add(lblSurname);
		
		txtName = new JTextField();
		txtName.setBounds(92, 17, 86, 20);
		frame.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		txtSurname = new JTextField();
		txtSurname.setBounds(92, 52, 200, 20);
		frame.getContentPane().add(txtSurname);
		txtSurname.setColumns(10);
		
		JButton btnSend = new JButton("Enviar");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JLabel lblEnviado = new JLabel("Enviado");
				frame.getContentPane().add(lblEnviado);
				lblEnviado.setVisible(true);
				lblEnviado.setBounds(328, 51, 89, 23);
				btnSend.setVisible(false);
				txtName.setText(null);
				txtSurname.setText(null);
				
				
			}
		});
		btnSend.setBounds(328, 51, 89, 23);
		frame.getContentPane().add(btnSend);
	}
}
