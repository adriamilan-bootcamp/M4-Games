package Equipo07.JuegoFuncionalidad;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.event.MouseInputListener;

import Equipo07.Interfaz.InterfazGrafica;

public class GestorEventos implements ActionListener{
	
	private InterfazGrafica ig;
	private Vidas vidas;
	private Palabra palabra;
	private String[]letras; 
	private String[]arrayIni;

	public GestorEventos(InterfazGrafica interfaz) {
		
		// INTERFAZ INSTANCE
		this.ig = interfaz;
		this.vidas = new Vidas();
		this.palabra = new Palabra();
		this.letras = this.palabra.palabraSplited();
		this.arrayIni = new String[letras.length];
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("iniciar")) {
			ig.tFieldPalabra.setText("");
			palabra = new Palabra();
			System.out.println(palabra.getPalabra());
			letras = palabra.palabraSplited();
			for (int j = 0; j < letras.length; j++) {
				arrayIni[j] = "_ ";
			}
			imprimir();
			
		}else if(e.getActionCommand().equals("letra")) {
			JButton letra = (JButton) e.getSource();
			System.out.println(letra.getText());
			ig.tFieldPalabra.setText("");
			arrayIni = palabra.comprobarLetra(letra.getText(), arrayIni);
			imprimir();
		}else if(e.getActionCommand().equals("Salir")) {
			System.exit(0);
		}
	}
	
	public void imprimir() {
		for (int i = 0; i < arrayIni.length; i++) {
			ig.tFieldPalabra.setText(ig.tFieldPalabra.getText() + arrayIni[i]);
		}
	}


	public InterfazGrafica getPartida() {
		return ig;
	}

	public void setPartida(InterfazGrafica partida) {
		this.ig = partida;
	}

	public Vidas getVidas() {
		return vidas;
	}

	public void setVidas(Vidas vidas) {
		this.vidas = vidas;
	}

	public Palabra getPalabras() {
		return palabra;
	}

	public void setPalabras(Palabra palabras) {
		this.palabra = palabras;
	}

	
	
	
	

}