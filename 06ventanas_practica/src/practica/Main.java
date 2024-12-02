package practica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {

		JFrame ventana = new JFrame("Ventana suma");
		ventana.setSize(400, 300);
		ventana.setBounds(50, 50, 400, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // variables de clase accedemos a ella a través del
																// nombre de la clase
		ventana.setLayout(null);

		JLabel etiqueta1 = new JLabel("Número 1");
		etiqueta1.setBounds(50, 50, 150, 30);
		ventana.add(etiqueta1);

		JLabel etiqueta2 = new JLabel("Número 2");
		etiqueta2.setBounds(50, 100, 150, 30);
		ventana.add(etiqueta2);

		JTextField txtNumero1 = new JTextField();
		txtNumero1.setBounds(50, 80, 200, 30);
		ventana.add(txtNumero1);

		JTextField txtNumero2 = new JTextField();
		txtNumero2.setBounds(50, 125, 200, 30);
		ventana.add(txtNumero2);

		JButton btnSumar = new JButton("Sumar");
		btnSumar.setBounds(50, 200, 100, 30);
		ventana.add(btnSumar);

		JLabel lblresultado = new JLabel("Resultado: ");
		lblresultado.setBounds(150, 200, 150, 30);
		ventana.add(lblresultado);

		btnSumar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int numero1 = Integer.parseInt(txtNumero1.getText());
				int numero2 = Integer.parseInt(txtNumero2.getText());

				lblresultado.setText("Resultado: " + (numero1 + numero2));
			}

		});

		ventana.setVisible(true);

	}

}
