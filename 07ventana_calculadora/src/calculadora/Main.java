package calculadora;

import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class Main {
	public static JTextField textField;

	public static void main(String[] args) {


		JFrame ventana = new JFrame("Calculadora");
		ventana.setSize(400, 300);
		ventana.setBounds(50, 50, 400, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.getContentPane().setLayout(null);
		
		JTextField txtMostrar= new JTextField();
		txtMostrar.setBounds(69, 26, 232, 72);
		ventana.getContentPane().add(txtMostrar);
		txtMostrar.setColumns(10);
		
		JButton btnUno = new JButton("1");
		btnUno.setBounds(28, 202, 47, 23);
		ventana.getContentPane().add(btnUno);
		btnUno.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Integer.parseInt(txtMostrar.getText());
			}
		});
		
		JButton btnDos = new JButton("2");
		btnDos.setBounds(85, 202, 47, 23);
		ventana.getContentPane().add(btnDos);
		
		JButton btnTres = new JButton("3");
		btnTres.setBounds(142, 202, 47, 23);
		ventana.getContentPane().add(btnTres);
		
		JButton btnCuatro = new JButton("4");
		btnCuatro.setBounds(28, 168, 47, 23);
		ventana.getContentPane().add(btnCuatro);
		
		JButton btnCinco = new JButton("5");
		btnCinco.setBounds(85, 168, 47, 23);
		ventana.getContentPane().add(btnCinco);
		
		JButton btnSeis = new JButton("6");
		btnSeis.setBounds(142, 168, 47, 23);
		ventana.getContentPane().add(btnSeis);
		
		JButton btnSiete = new JButton("7");
		btnSiete.setBounds(28, 130, 47, 23);
		ventana.getContentPane().add(btnSiete);
		
		JButton btnOcho = new JButton("8");
		btnOcho.setBounds(85, 130, 47, 23);
		ventana.getContentPane().add(btnOcho);
		
		JButton btnNueve = new JButton("9");
		btnNueve.setBounds(142, 130, 47, 23);
		ventana.getContentPane().add(btnNueve);
		
		JButton btnCero = new JButton("0");
		btnCero.setBounds(85, 236, 47, 23);
		ventana.getContentPane().add(btnCero);
		
		JButton btnResultado = new JButton("=");
		btnResultado.setBounds(270, 217, 47, 33);
		ventana.getContentPane().add(btnResultado);
		
		
		JButton btnSumar = new JButton("+");
		btnSumar.setBounds(270, 183, 47, 23);
		ventana.getContentPane().add(btnSumar);
		
		JButton btnResta = new JButton("-");
		btnResta.setBounds(270, 143, 47, 23);
		ventana.getContentPane().add(btnResta);
		
		JButton btnDivision = new JButton("/");
		btnDivision.setBounds(270, 109, 47, 23);
		ventana.getContentPane().add(btnDivision);
		
		

	}
}
