package innnnterface;

public class Drone implements Rotable, Movible{

	@Override
	public void mover(int distancia) {
		  System.out.println("El drone vuela " + distancia + " metros.");
		
	}

	@Override
	public void rotar(int grados) {
        System.out.println("El drone rota " + grados + " grados.");

	}

}
