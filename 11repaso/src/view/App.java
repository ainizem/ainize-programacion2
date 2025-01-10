package view;

import java.sql.SQLException;

import model.AccesoBD;
import model.Ropa;
import model.TablasTienda;
import model.ProductoDTO;

public class App {

	public static void main(String[] args) {


		try {
			AccesoBD bd = new AccesoBD(); //si ya tenemos creado eso, aquí queda mas limpio
		Ropa cpant= bd.getRopa(1);
		System.out.println(cpant.prenda+", "+ cpant.precio+ "€");
		
		
		
		TablasTienda t= new TablasTienda(bd);
		t.setVisible(true);
		
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el driver");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Error al conectar con la bd");
			e.printStackTrace();
		}

	}
	
	

}
