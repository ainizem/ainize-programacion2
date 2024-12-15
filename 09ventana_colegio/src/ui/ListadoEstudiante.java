
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
		 
	setTitle("Listado de Estudiantes");
        setBounds(100, 100, 800, 400);
		
		table = new JTable();
		 DefaultTableModel tableModel = new DefaultTableModel(
            new Object[][] {}, // Inicialmente vacío
            new String[] { // Encabezados de las columnas
                "DNI", "Nombre", "Apellidos", "Email", "Fecha Nacimiento", "Curso", "Necesidades"
            }
        );

        // Llenar la tabla con los datos de los estudiantes
        for (Estudiante estudiante : estudiantes) {
            tableModel.addRow(new Object[] {
                estudiante.getDni(),
                estudiante.getNombre(),
                estudiante.getApellidos(),
                estudiante.getEmail(),
                estudiante.getFechaNacimiento().toString(),
                estudiante.getCurso(),
                estudiante.getNecesidadesEspeciales()
            });
        }

        // Asignar el modelo a la tabla
        table.setModel(tableModel);

        // Añadir la tabla a la ventana
        getContentPane().add(table, BorderLayout.CENTER);
    }
}
		table.getColumnModel().getColumn(0).setResizable(false);
		getContentPane().add(table, BorderLayout.CENTER);

	}


	
	
	
	
}
