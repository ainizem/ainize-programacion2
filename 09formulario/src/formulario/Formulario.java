package formulario;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;

import alumno.Alumno;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;

public class Formulario extends JFrame {
	private JTextField textField;
	private JTextField textApellido;
	private JComboBox cbGrado;
	private JTextArea textArea;
	private JRadioButton rdbtn1Curso;
	private JRadioButton rdbtn2Curso;
	private ArrayList<Alumno> alumnos = new ArrayList<Alumno>();


	public Formulario() {
		// Configuración del JFrame principal
		setTitle("Formulario");
		setSize(450, 400); // Tamaño de la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar aplicación al cerrar la ventana
		setLayout(null); // Usar layout nulo para posicionar los elementos manualmente

		// Componentes
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setBounds(22, 14, 55, 14);
		add(lblNombre);

		textField = new JTextField();
		textField.setBounds(73, 11, 212, 20);
		add(textField);
		textField.setColumns(10);

		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(22, 48, 55, 14);
		add(lblApellido);

		textApellido = new JTextField();
		textApellido.setBounds(73, 45, 212, 20);
		add(textApellido);
		textApellido.setColumns(10);

		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(335, 300, 89, 23);
		add(btnEnviar);

		btnEnviar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Alumno alumno = crearAlumn();
				alumnos.add(alumno);
				System.out.println(alumnos.size());
			}
		});

		JRadioButton rdbtn1Curso = new JRadioButton("1. Curso");
		rdbtn1Curso.setSelected(true);
		rdbtn1Curso.setBounds(22, 154, 109, 23);
		add(rdbtn1Curso);

		JComboBox cbGrado = new JComboBox();
		cbGrado.setModel(new DefaultComboBoxModel(new String[] { "DAW", "ASIR", "Integración Social" }));
		cbGrado.setMaximumRowCount(4);
		cbGrado.setBounds(82, 90, 130, 22);
		add(cbGrado);

		JLabel lblGrado = new JLabel("Grado:");
		lblGrado.setBounds(22, 94, 46, 14);
		add(lblGrado);

		JRadioButton rdbtn2Curso = new JRadioButton("2. Curso");
		rdbtn2Curso.setBounds(22, 180, 109, 23);
		add(rdbtn2Curso);

		JLabel lblNewLabel = new JLabel("Curso:");
		lblNewLabel.setBounds(22, 133, 46, 14);
		add(lblNewLabel);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(22, 256, 306, 67);
		add(textArea);

		JLabel lblComentario = new JLabel("Comentarios");
		lblComentario.setBounds(22, 231, 90, 14);
		add(lblComentario);
	}

	public static void main(String[] args) {
		// Crear y mostrar la ventana
		Formulario formulario = new Formulario();
		formulario.setVisible(true); // Mostrar la ventana
	}

	public Alumno crearAlumn() {
		Alumno alumno = new Alumno();
		alumno.setNombre(textField.getText());
		alumno.setApellido(textApellido.getText());
		alumno.setGrado(cbGrado.getSelectedItem().toString());
		alumno.setComentario(textArea.getText());
		if (rdbtn1Curso.isSelected()) {
			alumno.setCurso("1");
		}
		;
		if (rdbtn2Curso.isSelected()) {
			alumno.setCurso("2");
		}
		;

		return alumno;
	}
}
