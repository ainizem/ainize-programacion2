package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Usuario;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Enumeration;
import java.awt.event.ActionEvent;

public class Ventana_anadir extends JFrame {

	private JPanel contentPane;
	private JTextField txtDNI;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtFecha;

	private final ButtonGroup btnGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Ventana_anadir(ArrayList<Usuario> usuarios) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(20, 27, 46, 14);
		contentPane.add(lblDni);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(20, 52, 46, 14);
		contentPane.add(lblNombre);

		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(20, 84, 46, 14);
		contentPane.add(lblApellidos);

		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(20, 124, 46, 14);
		contentPane.add(lblSexo);

		JLabel lblFechaDeNacimiento = new JLabel("Fecha de Nacimiento");
		lblFechaDeNacimiento.setBounds(20, 169, 99, 14);
		contentPane.add(lblFechaDeNacimiento);

		txtDNI = new JTextField();
		txtDNI.setBounds(126, 24, 86, 20);
		contentPane.add(txtDNI);
		txtDNI.setColumns(10);

		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(126, 49, 86, 20);
		contentPane.add(txtNombre);

		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(126, 81, 86, 20);
		contentPane.add(txtApellidos);

		txtFecha = new JTextField();
		txtFecha.setBounds(132, 166, 86, 20);
		contentPane.add(txtFecha);
		txtFecha.setColumns(10);

		JButton btnTerminarAñadir = new JButton("A\u00F1adir");
		btnTerminarAñadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTerminarAñadir.setBounds(249, 205, 120, 23);
		contentPane.add(btnTerminarAñadir);

		JRadioButton rdbtnFemenino = new JRadioButton("Femenino");
		rdbtnFemenino.setBounds(127, 120, 109, 23);
		contentPane.add(rdbtnFemenino);

		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setBounds(249, 120, 109, 23);
		contentPane.add(rdbtnMasculino);

		String dni = txtDNI.getText();
		String nombre = txtNombre.getText();
		String apellidos = txtApellidos.getText();
		String fechaNacimiento = txtFecha.getText();

		String sexo = "";
		JRadioButton radioSeleccionado;

		Enumeration<AbstractButton> botones = btnGroup.getElements();

		while (botones.hasMoreElements()) {
			AbstractButton boton = botones.nextElement();

			if (boton.isSelected()) {
				radioSeleccionado = (JRadioButton) boton;
				sexo = radioSeleccionado.getText();
				break;
			}
		}

	}
}
