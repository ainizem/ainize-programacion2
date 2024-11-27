package electrodomesticos;

import interfaces.Hablador;

public class Tv extends Aparato implements Hablador {
	boolean teletexto;
	String antiguedad;

	public Tv(double consumo, double precio, boolean teletexto, String antiguedad) {
		super(consumo, precio);
		this.teletexto = teletexto;
		this.antiguedad = antiguedad;
	}

	@Override
	public void hablar() {
		System.out.println("soy tv");
	}

}
