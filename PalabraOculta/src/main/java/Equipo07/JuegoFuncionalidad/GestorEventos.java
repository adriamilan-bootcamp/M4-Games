package Equipo07.JuegoFuncionalidad;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import Equipo07.Interfaz.InterfazGrafica;

public class GestorEventos implements ActionListener {
	
	private InterfazGrafica ig;
	private Vidas vidas;
	private Palabra palabra;
	private String[]letras; 
	private String[]arrayIni;
	
	int fallos = 0, aciertos = 0;
	int countBombillas = 5;
	
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
			
			iniciarPartida();
			
		}else if(e.getActionCommand().equals("letra")) {
			JButton letra = (JButton) e.getSource();
			ig.tFieldPalabra.setText("");
			try {
				arrayIni = comprobarLetra(letra.getText(), arrayIni);
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			letra.setEnabled(false);
			
		}else if(e.getActionCommand().equals("Salir")) {
			System.exit(0);
			
		}else if(e.getActionCommand().equals("resolver")) {
			try {
				resolverPista();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if (e.getActionCommand().equals("About")) {
			JOptionPane.showMessageDialog(ig, "Juego de LA PALABRA OCULTA v1.0\n"
					+ "Creadores:\n"
					+ "=> Josep Martorell\n"
					+ "=> Felipe Gomez\n"
					+ "=> Adrià Milan\n\n"
					+ "Agradecimientos a Jose Marín");
		}
	}
	
	public void iniciarPartida() {
		
		mostrarBombillas();
		ig.tFieldPalabra.setText("");
		palabra = new Palabra();
		letras = palabra.palabraSplited();
		for (int j = 0; j < letras.length; j++) {
			arrayIni[j] = "_ ";
		}
		fallos = 0;
		aciertos = 0;
		imprimir();
		for (Enumeration<AbstractButton> buttons = ig.botones.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            button.setEnabled(true);
        }
		
	}
	
	//Comprueba si la letra existe en la palabra
	public String[] comprobarLetra(String letra, String[] arrayIni) throws FileNotFoundException, IOException {
		
		boolean resultadoBusqueda = false;
		for (int i = 0; i < letras.length; i++) {
			if(letras[i].equals(letra)) {
				aciertos++;
				arrayIni[i] = letra;
				resultadoBusqueda = true;
			}
		}
		
		if (resultadoBusqueda == false) {
			quitarVidas();
		}
		imprimir();
		estado();
		return arrayIni;
	}
	
	//Imprime la palabra con las letras acertadas
	public void imprimir() {
		for (int i = 0; i < arrayIni.length; i++) {
			ig.tFieldPalabra.setText(ig.tFieldPalabra.getText() + arrayIni[i]);
		}
	}
	
	//Cambia la imgen de la horca y muestra los fallos
	public void quitarVidas() throws FileNotFoundException, IOException {	
		vidas.quitarVida();
		fallos++;
		ig.lblImage.setIcon(new ImageIcon(ImageIO.read(new FileInputStream("resource/img" + fallos + ".jpg"))));
		ig.lblFallos.setText("Fallos: " + fallos);
	}
	
	//Controla el estado si ganas o pierdes
	public void estado() throws FileNotFoundException, IOException {
		if (aciertos == letras.length) {
			JOptionPane.showMessageDialog(ig, "Has ganado!!!!\nHas fallado " + fallos);
			ig.tFieldPalabra.setText("");
			desactivarLetras();
		}else if (vidas.getNumVidas() == 0) {
			JOptionPane.showMessageDialog(ig, "Has perdido :(");
			fallos = 0;
			ig.lblImage.setIcon(new ImageIcon(ImageIO.read(new FileInputStream("resource/img" + fallos + ".jpg"))));
			ig.lblFallos.setText("Fallos: " + fallos);
			ig.tFieldPalabra.setText("");
			vidas = new Vidas();
			desactivarLetras();
		}
	}
	
	//Desactiva las letras para no poder clicar
	public void desactivarLetras() {
		for (Enumeration<AbstractButton> buttons = ig.botones.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            button.setEnabled(false);
        }
	}
	
	//Crea el mensaje con la pista y desactiva una letra
	public void pistaConstructor() {
		
		ArrayList<String> abecedarioSinLetras = palabra.getAbecedarioSinLetras();
		String pistaMessage = "La palabra no contiene las siguientes letras";
		
		int randomAbecedario = (int)Math.floor(Math.random()*abecedarioSinLetras.size());
		pistaMessage += "\n=> " + abecedarioSinLetras.get(randomAbecedario);
		
		for (Enumeration<AbstractButton> buttons = ig.botones.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.getText().equals(abecedarioSinLetras.get(randomAbecedario))) {
            	button.setEnabled(false);
            }
        }
		
		palabra.quitarLetraAbecedario(randomAbecedario);
		
		JOptionPane.showMessageDialog(ig, pistaMessage);
		
	}
	
	// Te da una pista a cambio de un fallo
	public void resolverPista() throws FileNotFoundException, IOException {
				
		switch (countBombillas) {
			case 5:
				ig.lblVida5.setVisible(false);
				break;
			case 4:
				ig.lblVida4.setVisible(false);
				break;
			case 3:
				ig.lblVida3.setVisible(false);
				break;
			case 2:
				ig.lblVida2.setVisible(false);
				break;
			case 1:
				ig.lblVida1.setVisible(false);
				break;
			case 0:
				JOptionPane.showMessageDialog(null, "No te quedan pistas :(");
				break;
		}
		if (countBombillas != 0) {
			pistaConstructor();
		}
		countBombillas--;
	}
	
	// Mostrar Bombillas
	public void mostrarBombillas() {
		
		countBombillas = 5;
		
		ig.lblVida5.setVisible(true);
		ig.lblVida4.setVisible(true);
		ig.lblVida3.setVisible(true);
		ig.lblVida2.setVisible(true);
		ig.lblVida1.setVisible(true);
		
	
	}
	
}