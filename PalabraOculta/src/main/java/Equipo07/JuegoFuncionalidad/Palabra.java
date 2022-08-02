package Equipo07.JuegoFuncionalidad;

import javax.swing.JOptionPane;

public class Palabra {
	
	private String[] palabras = new String[]{"LOBO", "CASA", "IMAN", "CERA", "ASNO", "PICA", "SECO", "RATA", "TAPA", "ACTA"}; 
	private String palabra;
	private Vidas vidas = new Vidas();
	
	public Palabra() {
		int randomNumber = (int)Math.floor(Math.random()*9);
		this.palabra = palabras[randomNumber];
	}
	
	public Palabra(String palabraUser) {
		this.palabra = palabraUser;
	}

	/**
	 * @return the palabra
	 */
	public String getPalabra() {
		return this.palabra;
	}
	
	public String[] palabraSplited() {
		return this.palabra.split("");
	}
	
}
