package numeros;

import interfacess.Jugable;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero implements Jugable {

	public JuegoAdivinaImpar(int vidasIniciales) {
		super(vidasIniciales);
	}
	
	public boolean validaNumero(int numero) {
		if (numero % 2 != 0) {
			return true;
		} else {
			System.out.println("El número tiene que ser par");
			return false;
		}
	}
	
	public void Juega() {
		
	}
	public void muestraNombre() {
		System.out.println("Adivina un número impar");
	}

	public void muestraInfo() {
		System.out.println("Tendrás que adivinar un número impar. Para ello tendrás 3 vidas");
	}

}
