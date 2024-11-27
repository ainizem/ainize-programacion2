package personas;

import interfaces.Hablador;

public class Profesor extends Persona implements Hablador {
	String email;
	int despacho;

	public Profesor(String nombre, int edad, String email, int despacho) {
		super(nombre, edad);
		this.email = email;
		this.despacho = despacho;
	}

	@Override
	public void hablar() {
		System.out.println("Soy profesor");
	}

}
