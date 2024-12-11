
package formulario;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;

import model.Alumno;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;

public class Formulario extends JFrame {
	private JTextField textField;
	private JTextField textApellido;
	private JComboBox cbGrado;
	private JTextArea textArea;
	private JRadioButton rdbtn1Curso;
	private JRadioButton rdbtn2Curso;
	private JCheckBox chckbxTerminos;
	private ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
	private final ButtonGroup btnGroupCurso = new ButtonGroup();

	public Formulario() {
		
		setTitle("Formulario");
		setSize(450, 400); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null); 
		
		// Componentes
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setBounds(22, 14, 55, 14);
		getContentPane().add(lblNombre);

		textField = new JTextField();
		textField.setBounds(82, 11, 203, 20);
		getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(22, 48, 55, 14);
		getContentPane().add(lblApellido);

		textApellido = new JTextField();
		textApellido.setBounds(83, 45, 202, 20);
		getContentPane().add(textApellido);
		textApellido.setColumns(10);

		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(335, 279, 89, 23);
		getContentPane().add(btnEnviar);

		btnEnviar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String nombre= textField.getText();
				String apellido=textApellido.getText();
				//String curso=btnGroupCurso;
				String grado=cbGrado.getSelectedItem().toString();//para checkbox
				boolean termino= chckbxTerminos.isSelected();//para un check de termino y condiciones por ejemplo
				String comentario=textArea.getText();
				
				
				//for (AbtractButton button : btnGroupCurso.getElements()) {
					//if (button.)
				
				
				Alumno alumno = crearAlumn();
				alumnos.add(alumno);
				System.out.println(alumnos.size());
		
				
			}
		});

			
		JRadioButton rdbtn1Curso = new JRadioButton("1. Curso");
		btnGroupCurso.add(rdbtn1Curso);
		rdbtn1Curso.setSelected(true);
		rdbtn1Curso.setBounds(32, 154, 109, 23);
		getContentPane().add(rdbtn1Curso);

		JComboBox cbGrado = new JComboBox();
		cbGrado.setModel(new DefaultComboBoxModel(new String[] { "Selecciona un curso"," DAW", "ASIR", "Integración Social" }));
		cbGrado.setMaximumRowCount(4);
		cbGrado.setBounds(82, 90, 203, 22);
		getContentPane().add(cbGrado);

		JLabel lblGrado = new JLabel("Grado:");
		lblGrado.setBounds(22, 94, 46, 14);
		getContentPane().add(lblGrado);

		JRadioButton rdbtn2Curso = new JRadioButton("2. Curso");
		btnGroupCurso.add(rdbtn2Curso);
		rdbtn2Curso.setBounds(32, 180, 109, 23);
		getContentPane().add(rdbtn2Curso);

		JLabel lblNewLabel = new JLabel("Curso:");
		lblNewLabel.setBounds(22, 133, 46, 14);
		getContentPane().add(lblNewLabel);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(22, 235, 306, 67);
		getContentPane().add(textArea);

		JLabel lblComentario = new JLabel("Comentarios");
		lblComentario.setBounds(22, 210, 90, 14);
		getContentPane().add(lblComentario);
		
		JCheckBox chckbxTerminos = new JCheckBox("Acepto terminos y condiciones");
		chckbxTerminos.setBounds(22, 316, 233, 23);
		getContentPane().add(chckbxTerminos);
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
		alumno.setGrado(cbGrado.getSelectedItem().toString() + 1);
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
