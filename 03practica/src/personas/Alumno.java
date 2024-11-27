package personas;

import interfaces.Hablador;

public class Alumno extends Persona implements Hablador {
	String carrera;
	int curso;

	public Alumno(String nombre, int edad, String carrera, int curso) {
		super(nombre, edad);
		this.carrera = carrera;
		this.curso = curso;
	}

	@Override
	public void hablar() {
		System.out.println("Soy alumno");
	}

}
