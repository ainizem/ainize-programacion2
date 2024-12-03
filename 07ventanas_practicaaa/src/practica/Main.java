package practica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {

		JFrame ventana = new JFrame("Ventana validar número");
		ventana.setSize(400, 300);
		ventana.setBounds(50, 50, 400, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLayout(null);

		JLabel lblIntroduce = new JLabel("Introduce un número a validar:");
		lblIntroduce.setBounds(50, 50, 300, 30);
		ventana.add(lblIntroduce);

		JTextField txtNum = new JTextField();
		txtNum.setBounds(50, 100, 300, 30);
		ventana.add(txtNum);

		JLabel lblresultado = new JLabel("¿Es un número? ");
		lblresultado.setBounds(150, 200, 150, 30);
		ventana.add(lblresultado);

		JButton btnValidar = new JButton("Validar");
		btnValidar.setBounds(50, 200, 100, 30);
		ventana.add(btnValidar);

		btnValidar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					Integer.parseInt(txtNum.getText());
					lblresultado.setText("¿Es un número? SI ");

				} catch (NumberFormatException e1) {
					lblresultado.setText("¿Es un número? NO ");

				}

			}
		});

		ventana.setVisible(true);

	}

}
