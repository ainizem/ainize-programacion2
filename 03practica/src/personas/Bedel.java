package personas;

public class Bedel extends Persona implements Hablador {
int turno;
String antiguedad;

	
	public Bedel(String nombre, int edad, int turno, String antiguedad) {
	super(nombre, edad);
	this.turno = turno;
	this.antiguedad = antiguedad;
}


	@Override
	public void hablar() {
		// TODO Auto-generated method stub
		
	}


	
}
