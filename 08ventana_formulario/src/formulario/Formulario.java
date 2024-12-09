package formulario;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;

public class Formulario extends JFrame {
	private JTextField textField;
	private JTextField textApellido;

	public Formulario() {
		getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setBounds(22, 14, 55, 14);
		getContentPane().add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(73, 11, 212, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(22, 48, 55, 14);
		getContentPane().add(lblApellido);
		
		textApellido = new JTextField();
		textApellido.setBounds(73, 45, 212, 20);
		getContentPane().add(textApellido);
		textApellido.setColumns(10);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.setBounds(335, 300, 89, 23);
		getContentPane().add(btnNewButton);
		
		JRadioButton rdbtn1Curso = new JRadioButton("1. Curso");
		rdbtn1Curso.setSelected(true);
		rdbtn1Curso.setBounds(22, 154, 109, 23);
		getContentPane().add(rdbtn1Curso);
		
		JComboBox cbGrado = new JComboBox();
		cbGrado.setModel(new DefaultComboBoxModel(new String[] {"DAW", "ASIR", "Integraci\u00F3n Social"}));
		cbGrado.setMaximumRowCount(4);
		cbGrado.setBounds(82, 90, 130, 22);
		getContentPane().add(cbGrado);
		
		JLabel lblGrado = new JLabel("Grado:");
		lblGrado.setBounds(22, 94, 46, 14);
		getContentPane().add(lblGrado);
		
		JRadioButton rdbtn2Curso = new JRadioButton("2. Curso");
		rdbtn2Curso.setBounds(22, 180, 109, 23);
		getContentPane().add(rdbtn2Curso);
		
		JLabel lblNewLabel = new JLabel("Curso:");
		lblNewLabel.setBounds(22, 133, 46, 14);
		getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(22, 256, 306, 67);
		getContentPane().add(textArea);
		
		JLabel lblComentario = new JLabel("Comentarios");
		lblComentario.setBounds(22, 231, 90, 14);
		getContentPane().add(lblComentario);
		
		JFrame ventana = new JFrame("Formulario");
		ventana.setSize(400, 300);
		ventana.setBounds(50, 50, 400, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ventana.getContentPane().setLayout(null);
		
		ventana.setVisible(true);

	}
}
