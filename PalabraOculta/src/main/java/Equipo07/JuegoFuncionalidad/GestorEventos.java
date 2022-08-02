package Equipo07.JuegoFuncionalidad;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import Equipo07.Interfaz.InterfazGrafica;

public class GestorEventos implements ActionListener {
	
	private InterfazGrafica ig;
	private Vidas vidas;
	private Palabra palabra;
	private String[]letras; 
	private String[]arrayIni;
	
	int count = 0, aciertos = 0;
	
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
			count = 0;
			aciertos = 0;
			imprimir();
			
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

}