package model;

import java.sql.SQLException;

public class AccesoBD extends ProductoDTO {

	public AccesoBD() throws ClassNotFoundException, SQLException {
		super(ProductoDTO.DRIVER_MYSQL, "tienda", "root", "");
	}

}
