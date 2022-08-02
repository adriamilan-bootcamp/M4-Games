package Equipo07.JuegoFuncionalidad;

public class Vidas {

	int numVidas;
	
	public Vidas() {
		this.numVidas = 10;
	}
	
	public Vidas(int vidas) {
		this.numVidas = vidas;
	}

	/**
	 * @return the numVidas
	 */
	public int getNumVidas() {
		return numVidas;
	}
	
	public void quitarVida() {
		if (this.numVidas > 0) {
			this.numVidas--;
		}
	}
	
}
