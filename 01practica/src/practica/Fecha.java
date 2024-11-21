package practica;

import java.time.Year;

public class Fecha {

	private int ano = 0;
	private int mes = 1;
	private int dia = 1;

	public static final int MESES_ANO = 12;

	public static boolean esBisiesto(int ano) {
		return false;
	}

	public Fecha() {
	}

	public Fecha(int ano, int mes, int dia) {
		this.ano = ano;
		setMes(mes);
		setDia(dia);
	}

	public Fecha(Fecha f) {
		this.ano = f.getAno();
		this.mes = f.getMes();
		this.dia = f.getDia();
	}

	public boolean esBisiesto() {
		if (Year.isLeap(this.ano)) {
			System.out.println("El año " + ano + " es bisiesto");
			return true;

		} else {
			System.out.println("El año " + ano + " no es bisiesto");
			return false;
		}
	}

	public void setAno(int ano) {
	}

	public int getAno() {
		return ano;
	}

	public void setMes(int mes) {
		if (mes > 0 || mes < 12) {
			this.mes = mes;

		} else {
			throw new FechaExcepcion("El mes introducido es incorrecto.");
		}
	}

	public int getMes() {
		return mes;
	}

	public void setDia(int dia) throws FechaExcepcion{
		int diasTotal;
		switch (this.mes) {
		case 1, 3, 5, 7, 8, 10, 12:
			diasTotal = 31;
			break;

		case 4, 6, 9, 11:
			diasTotal = 30;
			break;

		case 2:
			if (esBisiesto()) {
				diasTotal = 29;
			} else {
				diasTotal = 28;
			}
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + this.mes);
		}

		if (dia > 0 && dia <= diasTotal) {
			this.dia = dia;

		} else {
			throw new FechaExcepcion("El dia introducido es incorrecto.");
		}

	}

	public int getDia() {
		return dia;
	}

	public void set(int ano, int mes, int dia) {
	}

	public void set(Fecha f) {
	}

	public String toString() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}

	public boolean equals(Object obj) {
		Fecha fecha2 = (Fecha) obj;

		if (this.ano == fecha2.getAno()) {
			if (this.mes == fecha2.getMes()) {
				if (this.dia == fecha2.getDia()) {
					return true;
				}

			}

		}
		return false;
	}
}
