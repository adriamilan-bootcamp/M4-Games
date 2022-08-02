package Ejercicio07.JuegoFuncionalidad;

public class Palabra {
	
	private String[] palabra = new String[]{"LOBO", "CASA", "IMAN", "CERA", "ASNO", "PICA", "SECO", "RATA", "TAPA", "ACTA"}; 
	
	public Palabra(String[] palabras) {
		for (int i = 0; i < palabras.length; i++) {
			this.palabra[i] = palabras[i];
		}
	}

	/**
	 * @return the palabra
	 */
	public String[] getPalabra() {
		return palabra;
	}
	
}
