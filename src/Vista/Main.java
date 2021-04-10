package Vista;

import Controlador.Controlador;
import processing.core.PApplet;

public class Main extends PApplet {

	private String[] infoFiguras;
	private Controlador controlador;
	

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
		
	}

	public void settings() {
		size(500, 500);

	}

	public void setup() {
		infoFiguras = loadStrings("Data/atributos.txt");
		//System.out.println(infoFiguras[0]);
		controlador = new Controlador(infoFiguras,this);
		
		
	}

	public void draw() {
		background(255);
		controlador.pintarFiguras();
		controlador.moverFiguras();
		controlador.choque();
	}
	public void mousePressed() {
		
		if (mouseButton==LEFT) {
			controlador.detenerFigura();
		}else if (mouseButton==RIGHT) {
			controlador.crearFigura();
		}
	}

}
