package electrodomesticos;

public class Lavadora extends Aparato {

	int alto;
	int ancho;

	public Lavadora(double consumo, double precio, int alto, int ancho) {
		super(consumo, precio);
		this.alto = alto;
		this.ancho = ancho;
	}
}
