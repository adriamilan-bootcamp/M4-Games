package Equipo07.Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class InterfazGrafica extends JFrame {

	private JPanel contentPane;
	private JTextField tFieldPalabra;
	/**
	 * Create the frame.
	 */
	public InterfazGrafica() {
		setTitle("EL AHORCADO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 868, 613);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Archivo");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Nueva Partida");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Salir");
		mnNewMenu.add(mntmNewMenuItem_2);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("New menu item");
		mntmNewMenuItem_1.setBounds(-21, -17, 137, 26);
		contentPane.add(mntmNewMenuItem_1);
		
		JPanel menu = new JPanel();
		menu.setToolTipText("Menu");
		menu.setBounds(10, 20, 320, 150);
		contentPane.add(menu);
		menu.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Iniciar Partida");
		btnNewButton_1.setBounds(61, 11, 188, 49);
		menu.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Resolver");
		btnNewButton_1_1.setBounds(61, 76, 188, 49);
		menu.add(btnNewButton_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 181, 320, 118);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 62, 287, 45);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		tFieldPalabra = new JTextField();
		tFieldPalabra.setBounds(10, 11, 262, 26);
		panel_2.add(tFieldPalabra);
		tFieldPalabra.setEditable(false);
		tFieldPalabra.setColumns(10);
		
		JLabel lblVida1 = new JLabel("");
		lblVida1.setBounds(10, 25, 31, 29);
		lblVida1.setIcon(new ImageIcon("D:\\Documentos\\BootCamp\\Git\\M4-Games\\PalabraOculta\\Images\\bombilla32.png"));
		panel_1.add(lblVida1);
		
		JLabel lblVida2 = new JLabel("");
		lblVida2.setIcon(new ImageIcon("D:\\Documentos\\BootCamp\\Git\\M4-Games\\PalabraOculta\\Images\\bombilla32.png"));
		lblVida2.setBounds(45, 25, 31, 29);
		panel_1.add(lblVida2);
		
		JLabel lblVida3 = new JLabel("");
		lblVida3.setIcon(new ImageIcon("D:\\Documentos\\BootCamp\\Git\\M4-Games\\PalabraOculta\\Images\\bombilla32.png"));
		lblVida3.setBounds(80, 25, 31, 29);
		panel_1.add(lblVida3);
		
		JLabel lblVida4 = new JLabel("");
		lblVida4.setIcon(new ImageIcon("D:\\Documentos\\BootCamp\\Git\\M4-Games\\PalabraOculta\\Images\\bombilla32.png"));
		lblVida4.setBounds(115, 25, 31, 29);
		panel_1.add(lblVida4);
		
		JLabel lblVida5 = new JLabel("");
		lblVida5.setIcon(new ImageIcon("D:\\Documentos\\BootCamp\\Git\\M4-Games\\PalabraOculta\\Images\\bombilla32.png"));
		lblVida5.setBounds(150, 25, 31, 29);
		panel_1.add(lblVida5);
		
		JPanel teclado = new JPanel();
		teclado.setToolTipText("");
		teclado.setBounds(10, 312, 320, 218);
		contentPane.add(teclado);
		teclado.setLayout(null);
		
		JButton btnNewButton = new JButton("A");
		btnNewButton.setBounds(10, 11, 47, 23);
		teclado.add(btnNewButton);
		
		JButton btnB = new JButton("B");
		btnB.setBounds(64, 11, 47, 23);
		teclado.add(btnB);
		
		JButton btnNewButton_2_1 = new JButton("D");
		btnNewButton_2_1.setBounds(175, 11, 47, 23);
		teclado.add(btnNewButton_2_1);
		
		JButton btnC = new JButton("C");
		btnC.setBounds(121, 11, 47, 23);
		teclado.add(btnC);
		
		JButton btnNewButton_3_1 = new JButton("E");
		btnNewButton_3_1.setBounds(232, 11, 47, 23);
		teclado.add(btnNewButton_3_1);
		
		JButton btnNewButton_4 = new JButton("F");
		btnNewButton_4.setBounds(10, 45, 47, 23);
		teclado.add(btnNewButton_4);
		
		JButton btnNewButton_2_2 = new JButton("G");
		btnNewButton_2_2.setBounds(64, 45, 47, 23);
		teclado.add(btnNewButton_2_2);
		
		JButton btnNewButton_3_2 = new JButton("H");
		btnNewButton_3_2.setBounds(121, 45, 47, 23);
		teclado.add(btnNewButton_3_2);
		
		JButton btnNewButton_2_1_1 = new JButton("I");
		btnNewButton_2_1_1.setBounds(175, 45, 47, 23);
		teclado.add(btnNewButton_2_1_1);
		
		JButton btnNewButton_3_1_1 = new JButton("J");
		btnNewButton_3_1_1.setBounds(232, 45, 47, 23);
		teclado.add(btnNewButton_3_1_1);
		
		JButton btnNewButton_5 = new JButton("K");
		btnNewButton_5.setBounds(10, 79, 47, 23);
		teclado.add(btnNewButton_5);
		
		JButton btnNewButton_2_3 = new JButton("L");
		btnNewButton_2_3.setBounds(64, 79, 47, 23);
		teclado.add(btnNewButton_2_3);
		
		JButton btnNewButton_3_3 = new JButton("M");
		btnNewButton_3_3.setBounds(121, 79, 47, 23);
		teclado.add(btnNewButton_3_3);
		
		JButton btnNewButton_2_1_2 = new JButton("N");
		btnNewButton_2_1_2.setBounds(175, 79, 47, 23);
		teclado.add(btnNewButton_2_1_2);
		
		JButton btnNewButton_3_1_2 = new JButton("O");
		btnNewButton_3_1_2.setBounds(232, 79, 47, 23);
		teclado.add(btnNewButton_3_1_2);
		
		JButton btnNewButton_6 = new JButton("P");
		btnNewButton_6.setBounds(10, 113, 47, 23);
		teclado.add(btnNewButton_6);
		
		JButton btnNewButton_2_4 = new JButton("Q");
		btnNewButton_2_4.setBounds(64, 113, 47, 23);
		teclado.add(btnNewButton_2_4);
		
		JButton btnNewButton_3_4 = new JButton("R");
		btnNewButton_3_4.setBounds(121, 113, 47, 23);
		teclado.add(btnNewButton_3_4);
		
		JButton btnNewButton_2_1_3 = new JButton("S");
		btnNewButton_2_1_3.setBounds(175, 113, 47, 23);
		teclado.add(btnNewButton_2_1_3);
		
		JButton btnNewButton_3_1_3 = new JButton("T");
		btnNewButton_3_1_3.setBounds(232, 113, 47, 23);
		teclado.add(btnNewButton_3_1_3);
		
		JButton btnNewButton_7 = new JButton("U");
		btnNewButton_7.setBounds(10, 147, 47, 23);
		teclado.add(btnNewButton_7);
		
		JButton btnNewButton_2_5 = new JButton("V");
		btnNewButton_2_5.setBounds(64, 147, 47, 23);
		teclado.add(btnNewButton_2_5);
		
		JButton btnNewButton_3_5 = new JButton("W");
		btnNewButton_3_5.setBounds(121, 147, 47, 23);
		teclado.add(btnNewButton_3_5);
		
		JButton btnNewButton_2_1_4 = new JButton("X");
		btnNewButton_2_1_4.setBounds(175, 147, 47, 23);
		teclado.add(btnNewButton_2_1_4);
		
		JButton btnNewButton_3_1_4 = new JButton("Y");
		btnNewButton_3_1_4.setBounds(232, 147, 47, 23);
		teclado.add(btnNewButton_3_1_4);
		
		JButton btnNewButton_7_1 = new JButton("Z");
		btnNewButton_7_1.setBounds(10, 181, 47, 23);
		teclado.add(btnNewButton_7_1);
		
		JButton btnNewButton_2_5_1 = new JButton("Ñ");
		btnNewButton_2_5_1.setBounds(64, 181, 47, 23);
		teclado.add(btnNewButton_2_5_1);
		
		JLabel lblImage = new JLabel("");
		lblImage.setIcon(new ImageIcon("D:\\Documentos\\BootCamp\\Git\\M4-Games\\PalabraOculta\\Images\\img.jpg"));
		lblImage.setBounds(340, 20, 502, 521);
		contentPane.add(lblImage);
	}
}
