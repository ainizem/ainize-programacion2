package ventanas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame ventana = new JFrame("Ventana prueba");

		ventana.setSize(400, 300);
		ventana.setBounds(50, 50, 400, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // variables de clase accedemos a ella a través del
																// nombre de la clase
		ventana.setLayout(null);

		JLabel etiqueta = new JLabel("Mi primera ventana"); // etiqueta que el usuario no puede editar-donde coloca,os
															// el texto
		etiqueta.setBounds(50, 50, 200, 30);
		ventana.add(etiqueta);// hay que añadir la etiqueta a la ventana pa que se vea

		JButton boton = new JButton("Cambiar texto");
		boton.setBounds(50, 100, 150, 30);
		ventana.add(boton);// hay que añadir la etiqueta a la ventana pa que se vea
		
		boton.addActionListener(new ActionListener() { //lo que hace disparar la acción

			@Override
			public void actionPerformed(ActionEvent e) {
				etiqueta.setText("El texto ha cambiado");
			}
		});
		ventana.setVisible(true);

	}

}
