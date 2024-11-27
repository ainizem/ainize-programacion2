package view;

import model.Juego;

public class Main {

	public static void main(String[] args) {

		Juego partida1 = new Juego(5);

		partida1.mostrarVidas();
		
		partida1.getVidasRestantes(); //ha habido que hacer public ese atributo
		
		Juego partida2 = new Juego(5);
		
		partida2.mostrarVidas();
		partida1.mostrarVidas();
		
		


	}

}
