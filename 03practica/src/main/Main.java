package main;

import personas.Alumno;
import animales.Ave;
import animales.Loro;
import animales.Piolin;
import interfaces.Hablador;
import personas.Bedel;
import personas.Persona;
import personas.Profesor;

public class Main {

	public static void main(String[] args) {

		Object[] array = new Object[12];

		Alumno al1 = new Alumno("Ainize", 23, "Programacion", 1);
		al1.hablar();

		Persona p1 = new Persona("Oihane", 3);
		System.out.println(p1.nombre);

		Profesor prof1 = new Profesor("Alberto", 23, "alberto@gmail.com", 1);
		prof1.hablar();

		Bedel b1 = new Bedel("Ainize", 23, 3, "premium");

		Ave[] array2 = new Ave[5];

		Piolin pio1 = new Piolin("fem", 12, "llalal", 3);

		b1.hablar();

		array[0] = p1;
		array[1] = b1;
		array[2]= pio1;
		array[3]= b1;
		
		for(int i=0; i<array.length;i++) {
			Object obj= array[i]; //creamos una variable para que se guarde y analicemos esa
			if(obj instanceof Hablador) {
				Hablador h =(Hablador) obj; //aqui hablará como habla el alumno, porke en h se guarda alumno; en la siguiente ronda piolin
				h.hablar();
			}
		}

		array2[0] = pio1;

	}

}
