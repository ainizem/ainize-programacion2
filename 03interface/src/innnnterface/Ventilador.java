package innnnterface;

public class Ventilador implements Rotable {

	@Override
	public void rotar(int grados) {
        System.out.println("El ventilador rota " + grados + " grados.");
		
	}

}
