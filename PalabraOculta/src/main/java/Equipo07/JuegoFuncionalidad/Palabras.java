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
	
	public String[] palabraSplited(String palabra) {
		return palabra.split("\\a"); 
	}
	
	public boolean comprobarLetra(String palabra, char letra) {
		String[] palabraSplited = palabraSplited(palabra);
		
		boolean resultadoBusqueda = false;
		for (int i = 0; i < palabraSplited.length; i++) {
			resultadoBusqueda = (palabraSplited[i].equals(letra)) ? true : false;
		}
		
		return resultadoBusqueda;
	}
	
}
