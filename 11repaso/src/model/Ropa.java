package model;

public class Ropa{

	public String codigo,prenda, precio, talla, color;
	
	

	public Ropa(String codigo, String prenda, String precio, String talla, String color) {
		super();
		this.codigo = codigo;
		this.prenda = prenda;
		this.precio = precio;
		this.talla = talla;
		this.color = color;
	}



	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	public String getPrenda() {
		return prenda;
	}



	public void setPrenda(String prenda) {
		this.prenda = prenda;
	}



	public String getPrecio() {
		return precio;
	}



	public void setPrecio(String precio) {
		this.precio = precio;
	}



	public String getTalla() {
		return talla;
	}



	public void setTalla(String talla) {
		this.talla = talla;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}

	
	
}
