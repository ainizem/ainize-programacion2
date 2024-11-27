package electrodomesticos;

import interfaces.Hablador;

public class Radio extends Aparato implements Hablador {

	double potencia;
	boolean casette;

	public Radio(double consumo, double precio, double potencia, boolean casette) {
		super(consumo, precio);
		this.potencia = potencia;
		this.casette = casette;
	}

	@Override
	public void hablar() {
		System.out.println("soy radio");
	}

}
