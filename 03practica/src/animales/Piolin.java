package animales;

import interfaces.Hablador;

public class Piolin extends Canario implements Hablador {

	int numpelis;

	public Piolin(String sexo, int edad, String canta, int numpelis) {
		super(sexo, edad, canta);
		this.numpelis = numpelis;
	}

	@Override
	public void hablar() {
		System.out.println("Soy piolin");
	}

}
