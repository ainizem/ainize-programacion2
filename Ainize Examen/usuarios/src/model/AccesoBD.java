package model;

import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class AccesoBD extends ConexionBD{

	public AccesoBD() throws ClassNotFoundException, SQLException {
		super(ConexionBD.DRIVER_MYSQL, "usuarios", "root", "");
	}

}
