package Equipo07.Interfaz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Equipo07.JuegoFuncionalidad.GestorEventos;
import javax.swing.JDesktopPane;

public class InterfazGrafica extends JFrame{

	private JPanel contentPane;
	public JTextField tFieldPalabra;
	private GestorEventos eventos = new GestorEventos(this);
	
	/**
	 * Create the frame.
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public InterfazGrafica() throws FileNotFoundException, IOException {
		setTitle("EL AHORCADO");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 868, 613);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Archivo");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Nueva Partida");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Salir");
		mntmNewMenuItem_2.addActionListener(eventos);
		mnNewMenu.add(mntmNewMenuItem_2);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JPanel menu = new JPanel();
		menu.setBounds(10, 20, 320, 150);
		contentPane.add(menu);
		menu.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Iniciar Partida");
		btnNewButton_1.addActionListener(eventos);
		btnNewButton_1.setActionCommand("iniciar");
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
		lblVida1.setIcon(new ImageIcon(ImageIO.read(new FileInputStream("resource/bombilla32.png"))));
		panel_1.add(lblVida1);
		
		JLabel lblVida2 = new JLabel("");
		lblVida2.setIcon(new ImageIcon(getClass().getResource("/bombilla32.png")));
		lblVida2.setBounds(45, 25, 31, 29);
		panel_1.add(lblVida2);
		
		JLabel lblVida3 = new JLabel("");
		lblVida3.setIcon(new ImageIcon(getClass().getResource("/bombilla32.png")));
		lblVida3.setBounds(80, 25, 31, 29);
		panel_1.add(lblVida3);
		
		JLabel lblVida4 = new JLabel("");
		lblVida4.setIcon(new ImageIcon(getClass().getResource("/bombilla32.png")));
		lblVida4.setBounds(115, 25, 31, 29);
		panel_1.add(lblVida4);
		
		JLabel lblVida5 = new JLabel("");
		lblVida5.setIcon(new ImageIcon(getClass().getResource("/bombilla32.png")));
		lblVida5.setBounds(150, 25, 31, 29);
		panel_1.add(lblVida5);
		
		JPanel teclado = new JPanel();
		teclado.setBounds(10, 312, 320, 218);
		contentPane.add(teclado);
		teclado.setLayout(null);
		
		JButton btnA = new JButton("A");
		btnA.setBounds(10, 11, 47, 23);
		btnA.setActionCommand("letra");
		btnA.addActionListener(eventos);
		teclado.add(btnA);
		
		JButton btnB = new JButton("B");
		btnB.setBounds(64, 11, 47, 23);
		btnB.setActionCommand("letra");
		btnB.addActionListener(eventos);
		teclado.add(btnB);
		
		JButton btnD = new JButton("D");
		btnD.setBounds(175, 11, 47, 23);
		btnD.setActionCommand("letra");
		btnD.addActionListener(eventos);
		teclado.add(btnD);
		
		JButton btnC = new JButton("C");
		btnC.setBounds(121, 11, 47, 23);
		btnC.setActionCommand("letra");
		btnC.addActionListener(eventos);
		teclado.add(btnC);
		
		JButton btnE = new JButton("E");
		btnE.setBounds(232, 11, 47, 23);
		btnE.setActionCommand("letra");
		btnE.addActionListener(eventos);
		teclado.add(btnE);
		
		JButton btnF = new JButton("F");
		btnF.setBounds(10, 45, 47, 23);
		btnF.setActionCommand("letra");
		btnF.addActionListener(eventos);
		teclado.add(btnF);
		
		JButton btnG = new JButton("G");
		btnG.setBounds(64, 45, 47, 23);
		btnG.setActionCommand("letra");
		btnG.addActionListener(eventos);
		teclado.add(btnG);
		
		JButton btnH = new JButton("H");
		btnH.setBounds(121, 45, 47, 23);
		btnH.setActionCommand("letra");
		btnH.addActionListener(eventos);
		teclado.add(btnH);
		
		JButton btnI = new JButton("I");
		btnI.setBounds(175, 45, 47, 23);
		btnI.setActionCommand("letra");
		btnI.addActionListener(eventos);
		teclado.add(btnI);
		
		JButton btnJ = new JButton("J");
		btnJ.setBounds(232, 45, 47, 23);
		btnJ.setActionCommand("letra");
		btnJ.addActionListener(eventos);
		teclado.add(btnJ);
		
		JButton btnK = new JButton("K");
		btnK.setBounds(10, 79, 47, 23);
		btnK.setActionCommand("letra");
		btnK.addActionListener(eventos);
		teclado.add(btnK);
		
		JButton btnL = new JButton("L");
		btnL.setBounds(64, 79, 47, 23);
		btnL.setActionCommand("letra");
		btnL.addActionListener(eventos);
		teclado.add(btnL);
		
		JButton btnM = new JButton("M");
		btnM.setBounds(121, 79, 47, 23);
		btnM.setActionCommand("letra");
		btnM.addActionListener(eventos);
		teclado.add(btnM);
		
		JButton btnN = new JButton("N");
		btnN.setBounds(175, 79, 47, 23);
		btnN.setActionCommand("letra");
		btnN.addActionListener(eventos);
		teclado.add(btnN);
		
		JButton btnO = new JButton("O");
		btnO.setBounds(232, 79, 47, 23);
		btnO.setActionCommand("letra");
		btnO.addActionListener(eventos);
		teclado.add(btnO);
		
		JButton btnP = new JButton("P");
		btnP.setBounds(10, 113, 47, 23);
		btnP.setActionCommand("letra");
		btnP.addActionListener(eventos);
		teclado.add(btnP);
		
		JButton btnQ = new JButton("Q");
		btnQ.setBounds(64, 113, 47, 23);
		btnQ.setActionCommand("letra");
		btnQ.addActionListener(eventos);
		teclado.add(btnQ);
		
		JButton btnR = new JButton("R");
		btnR.setBounds(121, 113, 47, 23);
		btnR.setActionCommand("letra");
		btnR.addActionListener(eventos);
		teclado.add(btnR);
		
		JButton btnS = new JButton("S");
		btnS.setBounds(175, 113, 47, 23);
		btnS.setActionCommand("letra");
		btnS.addActionListener(eventos);
		teclado.add(btnS);
		
		JButton btnT = new JButton("T");
		btnT.setBounds(232, 113, 47, 23);
		btnT.setActionCommand("letra");
		btnT.addActionListener(eventos);
		teclado.add(btnT);
		
		JButton btnU = new JButton("U");
		btnU.setBounds(10, 147, 47, 23);
		btnU.setActionCommand("letra");
		btnU.addActionListener(eventos);
		teclado.add(btnU);
		
		JButton btnV = new JButton("V");
		btnV.setBounds(64, 147, 47, 23);
		btnV.setActionCommand("letra");
		btnV.addActionListener(eventos);
		teclado.add(btnV);
		
		JButton btnW = new JButton("W");
		btnW.setBounds(121, 147, 47, 23);
		btnW.setActionCommand("letra");
		btnW.addActionListener(eventos);
		teclado.add(btnW);
		
		JButton btnX = new JButton("X");
		btnX.setBounds(175, 147, 47, 23);
		btnX.setActionCommand("letra");
		btnX.addActionListener(eventos);
		teclado.add(btnX);
		
		JButton btnY = new JButton("Y");
		btnY.setBounds(232, 147, 47, 23);
		btnY.setActionCommand("letra");
		btnY.addActionListener(eventos);
		teclado.add(btnY);
		
		JButton btnZ = new JButton("Z");
		btnZ.setBounds(10, 181, 47, 23);
		btnZ.setActionCommand("letra");
		btnZ.addActionListener(eventos);
		teclado.add(btnZ);
		
		JButton btnÑ = new JButton("Ñ");
		btnÑ.setBounds(64, 181, 47, 23);
		btnÑ.setActionCommand("letra");
		btnÑ.addActionListener(eventos);
		teclado.add(btnÑ);
		
		JLabel lblImage = new JLabel("");
		lblImage.setIcon(new ImageIcon(getClass().getResource("/img.jpg")));
		lblImage.setBounds(340, 20, 502, 521);
		contentPane.add(lblImage);
	}
}
