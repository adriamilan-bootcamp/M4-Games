package Equipo07.JuegoFuncionalidad;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.event.MouseInputListener;

import Equipo07.Interfaz.InterfazGrafica;

public class GestorEventos implements ActionListener, MouseInputListener{
	
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
		// TODO Auto-generated method stub
		
	}
	//MOUSE INPUT LISTENER
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
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