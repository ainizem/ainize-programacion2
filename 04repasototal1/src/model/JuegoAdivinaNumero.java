package model;

import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego implements Jugable {

	int vidas;
	int numAdivinar;
	Random rand = new Random();
	Scanner entrada = new Scanner(System.in);

	public JuegoAdivinaNumero(int vidasIniciales) {
		super(vidasIniciales);
		
	}
	

	public boolean validaNumero() {
		  numUsuario = entrada.nextInt();
		return true;
		
	}
	
	
	int numUsuario;
	public void Juega() {
		reiniciar();
		System.out.println("Adivina el número del 0 al 10: ");
		
		for (int i = 0; i < 10; i++) {
	
			numUsuario = entrada.nextInt();

			int valorRand = rand.nextInt(10) + 1;
			if (valorRand == numUsuario) {
				System.out.println("Has acertado!");
				actualizaRecord();
			} else if (true) {
				quitaVida();
				System.out.println("Numero incorrecto, intentalo de nuevo que te quedan vidas");
			} else {
				System.out.println("No te quedan vidas");
			}
			
		}
entrada.close();
	}


	@Override
	public void muestraNombre() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void muestraInfo() {
		// TODO Auto-generated method stub
		
	}
}
