package Modelo;

import processing.core.PApplet;

public class Cuadrado extends Figura {

	public Cuadrado(int posX, int posY, int tam, int dir, int valor, int r, int g, int b, int vel, boolean mover,int movimiento,
			PApplet app) {
		super(posX, posY, tam, dir, valor, r, g, b, vel, mover,movimiento, app);

	}

	@Override
	public void pintarFigura() {
		getApp().fill(getR(), getG(), getB());
		getApp().rect(getPosX(), getPosY(), getTam(), getTam());
		getApp().fill(0);
		getApp().textAlign(PApplet.CENTER);
		getApp().text(getValor(), getPosX()+getTam()/2, getPosY()+getTam()/2);

	}

}
