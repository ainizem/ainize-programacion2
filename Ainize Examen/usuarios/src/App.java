import java.awt.EventQueue;
import java.sql.SQLException;
import java.util.ArrayList;

import model.AccesoBD;
import model.Usuario;
import view.Ventana_anadir;
import view.Ventana_mostrar;
import view.Ventana_principal;

public class App {

	public static void main(String[] args) {
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		try {
			AccesoBD bd = new AccesoBD();

			Usuario prueba = bd.getUsuario(1);
		System.out.println(prueba.nombre);
			
			
		Ventana_mostrar tabla= new Ventana_mostrar(bd);
		

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana_principal frame = new Ventana_principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	/*	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana_mostrar frame = new Ventana_mostrar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Ventana_anadir frame = new Ventana_anadir(null);
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});^*/
		}
		
		
	}

