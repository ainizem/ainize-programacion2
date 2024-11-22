package abstracto;

public class Peon extends Pieza {

	public Peon(String color) {
		super(color);
	}

	@Override
	public void mover() { //aunke sea abstracta, se herada normal
		System.out.println("El peon se mueve una casilla");
	}

}
