package aplicacion;

import java.util.Scanner;

import juegos.Juego;
import numeros.JuegoAdivinaImpar;
import numeros.JuegoAdivinaNumero;
import numeros.JuegoAdivinaPar;

public class Aplicacion {

	public static void main(String[] args) {

		JuegoAdivinaNumero juego1 = new JuegoAdivinaNumero(3);
		JuegoAdivinaPar juego2 = new JuegoAdivinaPar(3);
		JuegoAdivinaImpar juego3 = new JuegoAdivinaImpar(3);

		System.out.println("Juego 1");
		juego1.muestraNombre();
		juego1.muestraInfo();
		juego1.Juega();
		juego1.actualizaRecord();

		
		System.out.println("Juego 2");
		juego2.muestraNombre();
		juego2.muestraInfo();
		juego2.Juega();
		
		
		System.out.println("Juego 3");
		juego3.muestraNombre();
		juego3.muestraInfo();
		juego3.Juega();

		

		/*
		 * Juego partida1 = new Juego(5);
		 * 
		 * partida1.mostrarVidas();
		 * 
		 * partida1.quitaVida();
		 * 
		 * partida1.mostrarVidas();
		 * 
		 * partida1.quitaVida(); partida1.mostrarVidas(); partida1.reiniciar();
		 * 
		 * partida1.actualizaRecord();
		 * 
		 * Juego partida2 = new Juego(5);
		 * 
		 * partida2.mostrarVidas();
		 */

	}

}