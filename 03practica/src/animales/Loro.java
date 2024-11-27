package animales;

import interfaces.Hablador;

public class Loro extends Ave implements Hablador{
	String region;
	String color;
	
	
	
public Loro(String sexo, int edad, String region, String color) {
		super(sexo, edad);
		this.region = region;
		this.color = color;
	}



@Override
public void hablar() {
System.out.println("soy loro");	
}




	
}
