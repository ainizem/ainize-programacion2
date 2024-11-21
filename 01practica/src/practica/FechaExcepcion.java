package practica;

public class FechaExcepcion extends RuntimeException {
	public FechaExcepcion() {
super();
}

	public FechaExcepcion(String mensaje) {
		super(mensaje);

	}

	public FechaExcepcion(String mensaje, Throwable cause) {
		super(mensaje, cause);
}

	public FechaExcepcion(Throwable cause) {
		super(cause);
}
}