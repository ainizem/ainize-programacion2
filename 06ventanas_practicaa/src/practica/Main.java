package practica;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {

		JFrame ventana = new JFrame("Ventana color");
		ventana.setSize(400, 300);
		ventana.setBounds(50, 50, 400, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // variables de clase accedemos a ella a través del
																// nombre de la clase
		ventana.setLayout(null);

		JButton btnRojo = new JButton("Rojo");
		btnRojo.setBounds(50, 50, 100, 30);
		ventana.add(btnRojo);
		ventana.setVisible(true);
		btnRojo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ventana.getContentPane().setBackground(Color.red);
			}
		});

		JButton btnVerde = new JButton("Verde");
		btnVerde.setBounds(50, 100, 100, 30);
		ventana.add(btnVerde);
		ventana.setVisible(true);
		btnVerde.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ventana.getContentPane().setBackground(Color.green);
			}
		});

		JButton btnAzul = new JButton("Azul");
		btnAzul.setBounds(50, 150, 100, 30);
		ventana.add(btnAzul);
		ventana.setVisible(true);
		btnAzul.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ventana.getContentPane().setBackground(Color.blue);
			}
		});

	}
}
