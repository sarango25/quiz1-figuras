package Modelo;

import processing.core.PApplet;

public abstract class Figura {

	private int posX, posY, tam, dir, valor, r, g, b, vel, movimiento;
	private PApplet app;
	private boolean mover;

	public Figura(int posX, int posY, int tam, int dir, int valor, int r, int g, int b, int vel, boolean mover,
			int movimiento, PApplet app) {

		this.posX = posX;
		this.posY = posY;
		this.tam = tam;
		this.dir = dir;
		this.valor = valor;
		this.r = r;
		this.g = g;
		this.b = b;
		this.vel = vel;
		this.mover = mover;
		this.movimiento = movimiento;
		this.app = app;

	}

	public abstract void pintarFigura();

	public void moverFigura() {
		if (mover) {

			if (movimiento == 0) {
				if (posY <= 0 || posY >= 500) {
					dir = dir * -1;
				}
				posY += vel * dir;

			} else if (movimiento == 1) {
				if (posX <= 0 || posX >= 500) {
					dir = dir * -1;
				}
				posX += vel * dir;
			}
		}

	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}

	public int getDir() {
		return dir;
	}

	public void setDir(int dir) {
		this.dir = dir;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getVel() {
		return vel;
	}

	public void setVel(int vel) {
		this.vel = vel;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public int getMovimiento() {
		return movimiento;
	}

	public void setMovimiento(int movimiento) {
		this.movimiento = movimiento;
	}

	public boolean isMover() {
		return mover;
	}

	public void setMover(boolean mover) {
		this.mover = mover;
	}

}
