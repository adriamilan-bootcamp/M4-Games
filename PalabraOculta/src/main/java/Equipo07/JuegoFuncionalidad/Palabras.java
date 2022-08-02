package Equipo07.JuegoFuncionalidad;

public class Palabras {
	
	private String[] palabras = new String[]{"LOBO", "CASA", "IMAN", "CERA", "ASNO", "PICA", "SECO", "RATA", "TAPA", "ACTA"}; 
	
	public Palabras() {
		
	}
	
	public Palabras(String[] palabrasUser) {
		for (int i = 0; i < palabrasUser.length; i++) {
			this.palabras[i] = palabrasUser[i];
		}
	}

	/**
	 * @return the palabra
	 */
	public String[] getPalabras() {
		return palabras;
	}
	
}
