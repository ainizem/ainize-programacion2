
package ui;

import java.util.ArrayList;

import javax.swing.JFrame;

import model.Estudiante;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.table.DefaultTableModel;
import java.awt.Component;
import java.awt.Rectangle;

public class ListadoEstudiante extends JFrame{
	private JTable table;

	public ListadoEstudiante(ArrayList<Estudiante> estudiantes) {
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"Necesidades", "Fecha Nacimiento", "Email", "Curso", "Apellido", "Nombre", "DNI"
			}
		));
		table.getColumnModel().getColumn(0).setResizable(false);
		getContentPane().add(table, BorderLayout.CENTER);

	}


	
	
	
	
}
