package Equipo07.JuegoFuncionalidad;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.event.MouseInputListener;

import Equipo07.Interfaz.InterfazGrafica;

public class GestorEventos implements ActionListener, MouseInputListener{
	
	private InterfazGrafica partida;
	private Vidas vidas;
	private Palabra palabra = new Palabra();
	private String[] letras = palabra.palabraSplited();
	private String[] arrayIni = new String[letras.length];

	public GestorEventos(InterfazGrafica partida) {
		
		// INTERFAZ INSTANCE
		this.partida = partida;
		this.vidas = new Vidas();
		this.palabra = new Palabra();
	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("iniciar")) {
			partida.tFieldPalabra.setText("");
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
			partida.tFieldPalabra.setText("");
			arrayIni = palabra.comprobarLetra(letra.getText(), arrayIni);
			imprimir();
		}else if(e.getActionCommand().equals("Salir")) {
			System.exit(0);
		}
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
	
	public void imprimir() {
		for (int i = 0; i < arrayIni.length; i++) {
			partida.tFieldPalabra.setText(partida.tFieldPalabra.getText() + arrayIni[i]);
		}
	}
	
	// cambiarImagen();
	
	
	
	

}