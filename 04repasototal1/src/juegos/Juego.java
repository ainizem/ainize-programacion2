package juegos;

import java.util.Scanner;

import interfacess.Jugable;
import numeros.JuegoAdivinaImpar;
import numeros.JuegoAdivinaNumero;
import numeros.JuegoAdivinaPar;

public abstract class Juego {

	private int vidasRestantes;
	private int vidasIniciales;
	private static int record = 0;

	public Juego(int vidasIniciales) {
		this.vidasIniciales = vidasIniciales;
		this.vidasRestantes = vidasIniciales;
	}

	public void mostrarVidas() {
		System.out.println("Vidas restantes: " + this.vidasRestantes);
	}

	public boolean quitaVida() { // mirar esto, me da 0 vidas al reiniciar
		if (this.vidasRestantes > 0) {
			this.vidasRestantes--;
			return true;
		} else {
			System.out.println("Se ha acabado el juego, no te quedan vidas");

			return false;

		}
	}

	public void reiniciar() {
		this.vidasRestantes = this.vidasIniciales;
		System.out.println("El juego se ha reiniciado. Su cantidad de vidas actual es: " + this.vidasRestantes);

	}

	public void actualizaRecord() { // el record me da 0

		if (this.vidasRestantes == record) {
			System.out.println("Has igualado el record");

		} else if (vidasRestantes > record) {

			System.out.println("Has batido el record. El record actual es: " + this.vidasRestantes);
		}

	}
	
	/*
	JuegoAdivinaNumero juego1 = new JuegoAdivinaNumero(3);
	JuegoAdivinaPar juego2 = new JuegoAdivinaPar(3);
	JuegoAdivinaImpar juego3 = new JuegoAdivinaImpar(3);

	public void eligeJuego() {
		Jugable[] array = new Jugable[3];
		array[0] = juego1;
		array[1] = juego2;
		array[2] = juego3;
		

	}
*/
	public int getVidasRestantes() {
		return this.vidasRestantes;
	}

	public void setVidasRestantes(int vidasRestantes) {
		this.vidasRestantes = vidasRestantes;
	}

	public int getVidasIniciales() {
		return this.vidasIniciales;
	}

	public void setVidasIniciales(int vidasIniciales) {
		this.vidasIniciales = vidasIniciales;
	}

}