package model;

import java.sql.SQLException;

public class AccesoBDCoches extends ProductoDTO {

	public AccesoBDCoches() throws ClassNotFoundException, SQLException {
		super(ProductoDTO.DRIVER_MYSQL, "coches", "root", "");
	}

}
