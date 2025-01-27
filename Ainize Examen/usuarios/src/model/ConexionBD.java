package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionBD {

	 public static final String DRIVER_MYSQL = "com.mysql.cj.jdbc.Driver"; 
	 public static final String DRIVER_GENERICO = "sun.jdbc.odbc.JdbcOdbc.Driver";

	Connection con = null;
	Statement st = null;

	public String bd, user, pass;
	String tipoBD;

	public ConexionBD(String tipoBD, String pass, String bd, String user) throws ClassNotFoundException, SQLException {
		super();
		this.pass = pass;
		this.bd = bd;
		this.user = user;
		this.tipoBD = tipoBD;
		conectar();

	}

	private void conectar() throws ClassNotFoundException, SQLException {

		Class.forName(tipoBD);

		con = DriverManager.getConnection("jdbc:mysql://localhost/usuarios", "root", "");																		
		System.out.println("LA onexión se ha establecido");

		
		st = con.createStatement();
	}
	
	private void desconectar() throws SQLException {
		//	st.close();
			
		} 
	
	public Usuario getUsuario(int dni) throws SQLException {

		Usuario user = null;
		ResultSet rs = null;
		String sql = "SELECT *from usuarios where dni = " + dni + ";";
		rs = st.executeQuery(sql);

		while (rs.next()) { 
			user = new Usuario(rs.getString("dni"), rs.getString("nombre"), rs.getString("apellidos"),rs.getString("sexo"),rs.getString("fecha nacimiento"));

		}
		return user;
	}
	
	
	
}
