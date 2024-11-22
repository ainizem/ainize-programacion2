package abstracto;

public abstract class Pieza { //de clases abstractas no se pueden crear instancias

	protected String color;
	public String posX;
	public String posY;

    public Pieza(String color) {
        this.color = color;
    }

    public abstract void mover();
    public void mostrarPosicion() {
    	System.out.println(posX+posY);
    }

    public String getColor() {
        return color;
    }
	
	
	
}
