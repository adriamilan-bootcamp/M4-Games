package Equipo07.JuegoFuncionalidad;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;
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
	
	int count = 0, aciertos = 0;
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
			System.out.println(letra.getText());
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
			
		}else if(e.getActionCommand().equals("Salir")) {
			System.exit(0);
			
		}else if(e.getActionCommand().equals("resolver")) {
			resolverPista();
		}
	}
	
	public void iniciarPartida() {
		
		mostrarBombillas();
		ig.tFieldPalabra.setText("");
		palabra = new Palabra();
		System.out.println(palabra.getPalabra());
		letras = palabra.palabraSplited();
		for (int j = 0; j < letras.length; j++) {
			arrayIni[j] = "_ ";
		}
		count = 0;
		aciertos = 0;
		imprimir();
		
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
			vidas.quitarVida();
			cambiarImgen();
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
	public void cambiarImgen() throws FileNotFoundException, IOException {	
		count++;
		ig.lblImage.setIcon(new ImageIcon(ImageIO.read(new FileInputStream("resource/img" + count + ".jpg"))));
		ig.lblFallos.setText("Fallos: " + count);
	}
	
	//Controla el estado si ganas o pierdes
	public void estado() throws FileNotFoundException, IOException {
		if (aciertos == letras.length) {
			JOptionPane.showMessageDialog(ig, "Has ganado!!!!\nHas fallado " + count);
			ig.tFieldPalabra.setText("");
		}else if (vidas.getNumVidas() == 0) {
			JOptionPane.showMessageDialog(ig, "Has perdido :(");
			count = 0;
			ig.lblImage.setIcon(new ImageIcon(ImageIO.read(new FileInputStream("resource/img" + count + ".jpg"))));
			ig.lblFallos.setText("Fallos: " + count);
			ig.tFieldPalabra.setText("");
			vidas = new Vidas();
		}
	}
	
	// Te da una pista a cambio de un fallo
	public void resolverPista() {
		
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
		
		countBombillas--;
	}
	
	public void mostrarBombillas() {
		
		countBombillas = 5;
		
		ig.lblVida5.setVisible(true);
		ig.lblVida4.setVisible(true);
		ig.lblVida3.setVisible(true);
		ig.lblVida2.setVisible(true);
		ig.lblVida1.setVisible(true);
	
	}

}