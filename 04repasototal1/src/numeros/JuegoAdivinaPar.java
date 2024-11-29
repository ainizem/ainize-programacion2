package numeros;

import interfacess.Jugable;

public class JuegoAdivinaPar extends JuegoAdivinaNumero implements Jugable {

	public JuegoAdivinaPar(int vidasIniciales) {
		super(vidasIniciales);

	}

	public boolean validaNumero(int numero) {
		if (numero % 2 == 0) {
			return true;
		} else {
			System.out.println("El número tiene que ser par");
			return false;
		}
	}

	public void muestraNombre() {
		System.out.println("Adivina un número par");
	}

	public void muestraInfo() {
		System.out.println("Tendrás que adivinar un número par. Para ello tendrás 3 vidas");

	}

}
