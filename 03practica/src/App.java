package personas;

public class App {

	public static void main(String[] args) {

		Alumno al1= new Alumno("Ainize", 23, "Programacion", 1);
		al1.hablar();
		
		Persona p1= new Persona("Oihane", 3);
		al1.hablar();
		
		Profesor prof1= new Profesor("Alberto", 23, "alberto@gmail.com", 1);
		al1.hablar();
		
		Bedel b1= new Bedel("Ainize", 23, 3, "premium");
		al1.hablar();
		
	}

}
