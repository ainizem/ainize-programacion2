package innnnterface;

public interface Movible { // no se pone abstract, porke al ser interface se supone ke lo es
	void mover(int distancia);
	
	default public void obtenerUbicacion() {
		System.out.println("Mi ubicacion es...");
	}
}
