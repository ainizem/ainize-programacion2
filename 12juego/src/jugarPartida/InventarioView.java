package jugarPartida;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import model.AccesoBD;
import model.ObjetoBD;
import model.ObjetoDTO;

import javax.swing.JTable;

public class InventarioView extends JFrame {

	private JPanel contentPane;
	private JTable tablaInventario;

	// private ArrayList<ObjetoDTO> objetos;

	public InventarioView() throws SQLException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 139, 664, 271);
		contentPane.add(scrollPane);

		String[] columnas = { "Nombre", "Descripción" };
		ArrayList<ObjetoDTO> objetos = getObjetos();

		Object[][] datos = new Object[objetos.size()][columnas.length];

		for (int i = 0; i < objetos.size(); i++) {
			ObjetoDTO p = objetos.get(i);

			datos[i][0] = p.getNombre();
			datos[i][1] = p.getDescripcion();
		}

		DefaultTableModel modeloTabla = new DefaultTableModel(datos, columnas);

		tablaInventario = new JTable(modeloTabla);
		scrollPane.setViewportView(tablaInventario);

	}

	private ArrayList<ObjetoDTO> getObjetos() throws SQLException {
		ArrayList<ObjetoDTO> resultado = new ArrayList<ObjetoDTO>();
		ObjetoBD objetoBD = new ObjetoBD(AccesoBD.DRIVER_MYSQL, "inventariobd", "root", "");
		resultado = objetoBD.getObjetos();

		return resultado;
	}
}

/*
 * // para añadir al arraylist public void agregarObjeto(ObjetoDTO objeto) {
 * objetos.add(objeto); System.out.println(objeto.getNombre() +
 * " ha sido agregado al inventario."); }
 * 
 * // para mostarr lo que hay en el arraylist public void mostrarInventario() {
 * if (objetos.isEmpty()) { System.out.println("Inventario vacío"); } else {
 * System.out.println("Inventario:");
 * 
 * for (ObjetoDTO objeto : objetos) {// recorremos el array de objetos para que
 * muestre todos los ke haya System.out.println(objeto.getNombre() + ":" +
 * objeto.getDescripcion());
 * 
 * } }
 * 
 * }
 * 
 * }
 */
