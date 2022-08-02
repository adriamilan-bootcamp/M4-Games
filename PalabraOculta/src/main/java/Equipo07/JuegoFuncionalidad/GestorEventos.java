package Equipo07.JuegoFuncionalidad;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.event.MouseInputListener;

import Equipo07.Interfaz.InterfazGrafica;

public class GestorEventos implements ActionListener{
	
	private InterfazGrafica partida;
	private Vidas vidas;
	private Palabra palabras;

	public GestorEventos() {
		
		// INTERFAZ INSTANCE
		this.partida = new InterfazGrafica();
		this.vidas = new Vidas();
		this.palabras = new Palabra();
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("inicia")) {
			Palabra palabra = new Palabra();
			partida.tFieldPalabra.setText(palabra.getPalabra());
		}else if(e.getActionCommand().equals("letra")) {
			JButton letra = (JButton) e.getSource();
			System.out.println(letra.getText());
			partida.tFieldPalabra.setText(letra.getText());
		}else if(e.getActionCommand().equals("Salir")) {
			System.exit(0);
		}
		
	}


	public InterfazGrafica getPartida() {
		return partida;
	}

	public void setPartida(InterfazGrafica partida) {
		this.partida = partida;
	}

	public Vidas getVidas() {
		return vidas;
	}

	public void setVidas(Vidas vidas) {
		this.vidas = vidas;
	}

	public Palabra getPalabras() {
		return palabras;
	}

	public void setPalabras(Palabra palabras) {
		this.palabras = palabras;
	}

	
	// cambiarImagen();
	
	
	
	

}