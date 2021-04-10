package Controlador;

import Modelo.Logica;
import processing.core.PApplet;

public class Controlador {
	private Logica logica;

	public Controlador(String[] infoFiguras, PApplet app) {
		logica = new Logica(infoFiguras, app);

	}

	public void pintarFiguras() {
		// TODO Auto-generated method stub
		logica.pintarFiguras();
	}

	public void moverFiguras() {
		logica.moverFiguras();

	}

	public void detenerFigura() {
		logica.detenerFigura();
		//System.out.println("yes");
	}

	public void crearFigura() {
		logica.crearFigura();
	}

}
