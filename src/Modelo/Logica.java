package Modelo;

import java.util.ArrayList;
import processing.core.PApplet;

public class Logica {

	private ArrayList<Figura> figuras;
	private String[] infoFiguras;
	private PApplet app;

	public Logica(String[] infoFiguras, PApplet app) {
		this.infoFiguras = infoFiguras;
		figuras = new ArrayList<>();
		this.app = app;
		generarFiguras();
	}

	public void generarFiguras() {
		for (int i = 0; i < infoFiguras.length; i++) {
			int r = (int) app.random(0, 255);
			int g = (int) app.random(0, 255);
			int b = (int) app.random(0, 255);
			int vel = (int) app.random(1, 3);
			int movimiento = (int) app.random(0, 2);
			String[] infoAtributos = infoFiguras[i].split(" ");
			String tipo = infoAtributos[0];
			int tam = Integer.parseInt(infoAtributos[1]);
			int posX = Integer.parseInt(infoAtributos[2]);
			int posY = Integer.parseInt(infoAtributos[3]);
			int dir = Integer.parseInt(infoAtributos[4]);
			int valor = Integer.parseInt(infoAtributos[5]);
			if (tipo.equals("Circulo")) {
				Circulo c = new Circulo(posX, posY, tam, dir, valor, r, g, b, vel, true, movimiento, app);
				figuras.add(c);

			} else if (tipo.equals("Cuadrado")) {
				Cuadrado c = new Cuadrado(posX, posY, tam, dir, valor, r, g, b, vel, true, movimiento, app);
				figuras.add(c);
			}
			// System.out.println(infoAtributos[0]);

		}
		// System.out.println(infoFiguras[0]);

	}

	public void pintarFiguras() {
		for (int i = 0; i < figuras.size(); i++) {
			figuras.get(i).pintarFigura();

		}
	}

	public void moverFiguras() {
		for (int i = 0; i < figuras.size(); i++) {
			figuras.get(i).moverFigura();

		}
	}

	public void detenerFigura() {
		for (int i = 0; i < figuras.size(); i++) {
			if (app.mouseX > figuras.get(i).getPosX() - (figuras.get(i).getTam() / 2)
					&& app.mouseX < figuras.get(i).getPosX() + (figuras.get(i).getTam() / 2)
					&& app.mouseY > figuras.get(i).getPosY() - (figuras.get(i).getTam() / 2)
					&& app.mouseY < figuras.get(i).getPosY() + (figuras.get(i).getTam() / 2)) {
				// System.out.println("yes2");
				figuras.get(i).setMover(!figuras.get(i).isMover());
			}

		}

	}

	public void choque() {

	}

	public void generarTriangulo() {

	}

	public void crearFigura() {

		int figuraRandom = (int) app.random(0, 2);
		int r = (int) app.random(0, 255);
		int g = (int) app.random(0, 255);
		int b = (int) app.random(0, 255);
		int vel = (int) app.random(1, 3);
		int movimiento = (int) app.random(0, 2);
		int tam = (int) app.random(10, 100);
		int posX = (int) app.random(0, 500);
		int posY = (int) app.random(0, 500);
		int dir = (int) app.random(0, 2);
		if (dir == 0) {
			dir = -1;
		}
		int valor = (int) app.random(0, 50);
		if (figuraRandom == 0) {
			Circulo c = new Circulo(posX, posY, tam, dir, valor, r, g, b, vel, true, movimiento, app);
			figuras.add(c);

		} else if (figuraRandom == 1) {
			Cuadrado c = new Cuadrado(posX, posY, tam, dir, valor, r, g, b, vel, true, movimiento, app);
			figuras.add(c);
		}
	}

}
