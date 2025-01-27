package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.AccesoBD;
import model.Usuario;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class Ventana_mostrar extends JFrame {

	private JPanel contentPane;
	private JTable tablaUsuarios;

	/**
	 * 
	 * /** Create the frame.
	 * 
	 * @throws SQLException
	 */
	public Ventana_mostrar(AccesoBD bd) throws SQLException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		String[] columnas = { "dni", "nombre", "apellidos", "sexo", "fecha nacimiento" };

		DefaultTableModel modeloTabla = new DefaultTableModel(columnas, 0);

		tablaUsuarios = new JTable(modeloTabla);
		tablaUsuarios.setBounds(0, 0, 550, 150);

		for (int i = 1; i < 4; i++) {
			Usuario prueba2 = bd.getUsuario(i);
			if (prueba2 != null) {
				Object[] fila = { prueba2.dni, prueba2.nombre, prueba2.apellidos, prueba2.sexo,
						prueba2.fecha_nacimiento };
				modeloTabla.addRow(fila);
			} else {
				System.out.println("No se encontró un usuario con el Dni: " + i);
			}
		}

		JScrollPane scrollPane = new JScrollPane(tablaUsuarios);
		scrollPane.setBounds(10, 187, 550, 150);

		getContentPane().add(scrollPane);
	}

}
