package personas;

public class Profesor extends Persona implements Hablador{
String email;
int despacho;

	
	public Profesor(String nombre, int edad, String email, int despacho) {
	super(nombre, edad);
	this.email = email;
	this.despacho = despacho;
}


	@Override
	public void hablar() {
		// TODO Auto-generated method stub
		
	}



}