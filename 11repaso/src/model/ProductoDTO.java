package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductoDTO {

	 public static final String DRIVER_MYSQL = "com.mysql.cj.jdbc.Driver"; 
	 public static final String DRIVER_GENERICO = "sun.jdbc.odbc.JdbcOdbc.Driver";

	Connection con = null;
	Statement st = null;

	// vars conexion
	String bd, user, pass;
	String tipoBD;

	public ProductoDTO(String tipoBD, String pass, String bd, String user) throws ClassNotFoundException, SQLException {
		super();
		this.pass = pass;
		this.bd = bd;
		this.user = user;
		this.tipoBD = tipoBD;
		conectar();

	}

	private void conectar() throws ClassNotFoundException, SQLException {
		// 0. Cargar al driver

		Class.forName(tipoBD);

		// 1. Conectar; es un metodo de instancia
		con = DriverManager.getConnection("jdbc:mysql://localhost/tienda", "root", "");// conectar a esa base con
																						// ese usuario y con esa
																						// contraseña
		System.out.println("Conexión establecida");

		// 2. Crear flujo(la autopista)
		st = con.createStatement();// se hace del con, que ya está creada la conexión
	
	}
	
	private void desconectar() throws SQLException {
		//	st.close();
			
		} 
	
//	public ArrayList<Ropa> get
	
	public Ropa getRopa(int id) throws SQLException {

		Ropa c = null;
		ResultSet rs = null;
		String sql = "SELECT *from tienda where codigo = " + id + ";";
		rs = st.executeQuery(sql);//como funciona el resultset: se va borrando segun lo recorre

		while (rs.next()) {//siempre se recorre igual, se usa if cuando sabemos que se va a hacer solo una única vuelta, con id, contraseñas, emails...
			c = new Ropa(rs.getString("codigo"), rs.getString("prenda"), rs.getString("precio"),rs.getString("talla"),rs.getString("color"));

		}
		return c;
	}
	
	
	
}
