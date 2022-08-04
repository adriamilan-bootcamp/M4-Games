package Equipo07.JuegoFuncionalidad;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Palabra {
	
	private String[] palabras = new String[]{"LOBO", "CASA", "IMAN", "CERA", "ASNO", "PICA", "SECO", "RATA", "TAPA", "ACTA"}; 
	private ArrayList<String> abecedarioSinLetras;
	private String palabra;
	private Vidas vidas = new Vidas();
	
	public Palabra() {
		int randomNumber = (int)Math.floor(Math.random()*9);
		this.palabra = palabras[randomNumber];
		abecedarioSinLetras();
	}
	
	public Palabra(String palabraUser) {
		this.palabra = palabraUser;
		abecedarioSinLetras();
	}

	/**
	 * @return the palabra
	 */
	public String getPalabra() {
		return this.palabra;
	}
	
	/**
	 * @return the abecedarioSinLetras
	 */
	public ArrayList<String> getAbecedarioSinLetras() {
		return this.abecedarioSinLetras;
	}
	
	public String[] palabraSplited() {
		return this.palabra.split("");
	}
	
	public void quitarLetraAbecedario(int letra) {
		abecedarioSinLetras.remove(letra);
	}
	
	private void abecedarioSinLetras() {
		
		final String abecedario = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		
		abecedarioSinLetras = new ArrayList<>(Arrays.asList(abecedario.split("")));
		String[] letras = palabraSplited();
		
		for (int i = 0; i < abecedarioSinLetras.size(); i++) {
			for (int x = 0; x < letras.length; x++) {
				if (abecedarioSinLetras.get(i).equals(letras[x])) {
					this.abecedarioSinLetras.remove(i);
				}
			}
		}
		
	}
	
}
