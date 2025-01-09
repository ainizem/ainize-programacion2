package model;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class TablasTienda extends JFrame {

	private JPanel contentPane;
	private JTable tblTienda;

	
	
	public TablasTienda(AccesoBDCoches bd) throws SQLException {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		String[] columnas = {"Codigo", "prenda", "precio", "talla", "color"};
		
		//modelo de la tabla
		DefaultTableModel modeloTabla = new DefaultTableModel(columnas, 0);
		
		tblTienda = new JTable(modeloTabla);
		tblTienda.setBounds(0, 0, 550, 150);
		
		
		for(int i=1; i<4; i++) {
			Ropa cpant= bd.getRopa(i);
		
		Object[] fila = {cpant.codigo,cpant.prenda, cpant.precio, cpant.talla, cpant.color};
		modeloTabla.addRow(fila);

		}
		
				
		JScrollPane scrollPane = new JScrollPane(tblTienda);
		scrollPane.setBounds(10, 187, 550, 150);
		
		getContentPane().add(scrollPane);
	}
	
	

}
