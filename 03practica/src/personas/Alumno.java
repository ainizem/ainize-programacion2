package personas;

public class Alumno extends Persona implements Hablador{
	String carrera;
	int curso;
	
	
	public Alumno(String nombre, int edad, String carrera, int curso) {
		super(nombre, edad);
		this.carrera = carrera;
		this.curso = curso;
	}


	@Override
	public void hablar() {
		// TODO Auto-generated method stub
		
	}


	

}
