package practica;

public class PruebaFecha {
	public static final int MAX_FECHAS = 50;

	public static int random(int min, int max) {
		return (int) (Math.random() * (max - min + 1)) + min;
	}

	public static void main(String[] args) {
		for (int i = 0; i < MAX_FECHAS; i++) {
			try {
				Fecha f = new Fecha(random(1970, 2007), random(1, Fecha.MESES_ANO), random(1, 40));
				System.out.println("Fecha correcta: " + f.toString());

			} catch (FechaExcepcion e) {
				System.out.println("EXCEPTION: " + e.getMessage());
			}
		}
	}

}