package practica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {//mirar el de alberto, esa es la correcta

	public static int numero = 0;

	public static void main(String[] args) {

		JFrame ventana = new JFrame("Ventana prueba");
		ventana.setSize(400, 300);
		ventana.setBounds(50, 50, 400, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // variables de clase accedemos a ella a través del	 nombre de la clase
		ventana.setLayout(null);

		JLabel etiqueta = new JLabel("Resultado " + numero); // etiqueta que el usuario no puede editar-donde coloca,os
																// el texto
		etiqueta.setBounds(50, 50, 200, 30);
		ventana.add(etiqueta);// hay que añadir la etiqueta a la ventana pa que se vea

		JButton boton1 = new JButton("+1");
		boton1.setBounds(50, 100, 150, 30);
		ventana.add(boton1);// hay que añadir la etiqueta a la ventana pa que se vea

		JButton boton2 = new JButton("-1");
		boton2.setBounds(200, 100, 150, 30);
		ventana.add(boton2);// hay que añadir la etiqueta a la ventana pa que se vea

		boton1.addActionListener(new ActionListener() { // lo que hace disparar la acción

			@Override
			public void actionPerformed(ActionEvent e) {
				numero++;
				etiqueta.setText("Resultado " + numero);
			}
		});
		
		boton2.addActionListener(new ActionListener() { // lo que hace disparar la acción

			@Override
			public void actionPerformed(ActionEvent e) {
				numero--;
				etiqueta.setText("Resultado " + numero);
			}
		});
		ventana.setVisible(true);

	}

}
