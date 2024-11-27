package model;

public class Juego {
	
	private int vidasRestantes;
	private int vidasIniciales;
	private static int record=0;
	

	public Juego(int vidasIniciales) {
		this.vidasRestantes= vidasIniciales;
	}
	
	public void mostrarVidas() {
		System.out.println("Vidas restantes: "+this.vidasRestantes);
	}
	
	public void quitaVida() {
		if (this.vidasRestantes>0) {
			this.vidasRestantes--;
		if (this.vidasRestantes==0) {
			System.out.println("Se ha acabadi el juego"); //falta lo del boolean
		}
		}
		
	}
	
	
	public void reiniciar() {
		this.vidasRestantes=this.vidasIniciales;
		
	}
	

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
