package Modelo;

import processing.core.PApplet;

public class Triangulo extends Figura {

	public Triangulo(int posX, int posY, int tam, int dir, int valor, int r, int g, int b, int vel, boolean mover,
			int movimiento, PApplet app) {
		super(posX, posY, tam, dir, valor, r, g, b, vel, mover, movimiento, app);

	}

	@Override
	public void pintarFigura() {
		getApp().fill(getR(), getG(), getB());
		getApp().triangle(getPosX() - getTam() / 2, getPosY() + getTam() / 2, getPosX(), getPosY() - getTam() / 2,
				getPosX() + getTam() / 2, getPosY()+getTam()/2);
		getApp().fill(0);
		getApp().textAlign(PApplet.CENTER);
		getApp().text(getValor(), getPosX(), getPosY());

	}

}
