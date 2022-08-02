package Equipo07.PalabraOculta;

import java.awt.EventQueue;

import Equipo07.Interfaz.InterfazGrafica;

/**
 * Hello world!
 *
 */
public class App 
{

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazGrafica frame = new InterfazGrafica();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
