package Equipo07.Interfaz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;

import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import Equipo07.JuegoFuncionalidad.GestorEventos;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfazGrafica extends JFrame{

	private GestorEventos gestor = new GestorEventos(this);
	private JPanel contentPane;
	
	public ButtonGroup botones;
	public JTextField tFieldPalabra;
	public JLabel lblImage;
	public JLabel lblFallos;
	public JLabel lblVida1;
	public JLabel lblVida2;
	public JLabel lblVida3;
	public JLabel lblVida4;
	public JLabel lblVida5;
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
		
		JMenuItem mntmNewMenuItem = new JMenuItem("About");
		mntmNewMenuItem.addActionListener(gestor);
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Salir");
		mntmNewMenuItem_2.addActionListener(gestor);
		mnNewMenu.add(mntmNewMenuItem_2);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		// this line center the screen interface
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		
		JPanel menu = new JPanel();
		menu.setBounds(10, 20, 320, 150);
		contentPane.add(menu);
		menu.setLayout(null);
		
		JButton inicarButton = new JButton("Iniciar Partida");
		inicarButton.addActionListener(gestor);
		inicarButton.setActionCommand("iniciar");
		inicarButton.setBounds(61, 11, 188, 49);
		menu.add(inicarButton);
		
		JButton pistaButton = new JButton("Pista");
		pistaButton.addActionListener(gestor);
		pistaButton.setActionCommand("resolver");
		pistaButton.setBounds(61, 76, 188, 49);
		menu.add(pistaButton);
		
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
		
		lblVida1 = new JLabel("");
		lblVida1.setBounds(10, 25, 31, 29);
		lblVida1.setIcon(new ImageIcon(ImageIO.read(new FileInputStream("resource/bombilla32.png"))));
		panel_1.add(lblVida1);
		
		lblVida2 = new JLabel("");
		lblVida2.setIcon(new ImageIcon(ImageIO.read(new FileInputStream("resource/bombilla32.png"))));
		lblVida2.setBounds(45, 25, 31, 29);
		panel_1.add(lblVida2);
		
		lblVida3 =  new JLabel("");
		lblVida3.setIcon(new ImageIcon(ImageIO.read(new FileInputStream("resource/bombilla32.png"))));
		lblVida3.setBounds(80, 25, 31, 29);
		panel_1.add(lblVida3);
		
		lblVida4 = new JLabel("");
		lblVida4.setIcon(new ImageIcon(ImageIO.read(new FileInputStream("resource/bombilla32.png"))));
		lblVida4.setBounds(115, 25, 31, 29);
		panel_1.add(lblVida4);
		
		lblVida5 = new JLabel("");
		lblVida5.setIcon(new ImageIcon(ImageIO.read(new FileInputStream("resource/bombilla32.png"))));
		lblVida5.setBounds(150, 25, 31, 29);
		panel_1.add(lblVida5);
		
		lblFallos = new JLabel("Fallos: ");
		lblFallos.setForeground(Color.RED);
		lblFallos.setBounds(211, 25, 86, 14);
		panel_1.add(lblFallos);
		
		JPanel teclado = new JPanel();
		teclado.setBounds(10, 303, 320, 226);
		contentPane.add(teclado);
		teclado.setBorder( (Border) new TitledBorder("Teclado") );
		teclado.setLayout(null);
		
		botones = new ButtonGroup();
		
		
		JButton btnA = new JButton("A");
		btnA.setBounds(10, 22, 47, 23);
		btnA.setActionCommand("letra");
		btnA.addActionListener(gestor);
		botones.add(btnA);
		teclado.add(btnA);
		
		JButton btnB = new JButton("B");
		btnB.setBounds(64, 22, 47, 23);
		btnB.setActionCommand("letra");
		btnB.addActionListener(gestor);
		botones.add(btnB);
		teclado.add(btnB);
		
		JButton btnD = new JButton("D");
		btnD.setBounds(175, 22, 47, 23);
		btnD.setActionCommand("letra");
		btnD.addActionListener(gestor);
		botones.add(btnD);
		teclado.add(btnD);
		
		JButton btnC = new JButton("C");
		btnC.setBounds(121, 22, 47, 23);
		btnC.setActionCommand("letra");
		btnC.addActionListener(gestor);
		teclado.add(btnC);
		botones.add(btnC);
		
		JButton btnE = new JButton("E");
		btnE.setBounds(232, 22, 47, 23);
		btnE.setActionCommand("letra");
		btnE.addActionListener(gestor);
		teclado.add(btnE);
		botones.add(btnE);
		
		JButton btnF = new JButton("F");
		btnF.setBounds(10, 56, 47, 23);
		btnF.setActionCommand("letra");
		btnF.addActionListener(gestor);
		teclado.add(btnF);
		botones.add(btnF);
		
		JButton btnG = new JButton("G");
		btnG.setBounds(64, 56, 47, 23);
		btnG.setActionCommand("letra");
		btnG.addActionListener(gestor);
		teclado.add(btnG);
		botones.add(btnG);
		
		JButton btnH = new JButton("H");
		btnH.setBounds(121, 56, 47, 23);
		btnH.setActionCommand("letra");
		btnH.addActionListener(gestor);
		teclado.add(btnH);
		botones.add(btnH);
		
		JButton btnI = new JButton("I");
		btnI.setBounds(175, 56, 47, 23);
		btnI.setActionCommand("letra");
		btnI.addActionListener(gestor);
		teclado.add(btnI);
		botones.add(btnI);
		
		JButton btnJ = new JButton("J");
		btnJ.setBounds(232, 56, 47, 23);
		btnJ.setActionCommand("letra");
		btnJ.addActionListener(gestor);
		teclado.add(btnJ);
		botones.add(btnJ);
		
		JButton btnK = new JButton("K");
		btnK.setBounds(10, 90, 47, 23);
		btnK.setActionCommand("letra");
		btnK.addActionListener(gestor);
		teclado.add(btnK);
		botones.add(btnK);
		
		JButton btnL = new JButton("L");
		btnL.setBounds(64, 90, 47, 23);
		btnL.setActionCommand("letra");
		btnL.addActionListener(gestor);
		teclado.add(btnL);
		botones.add(btnL);
		
		JButton btnM = new JButton("M");
		btnM.setBounds(121, 90, 47, 23);
		btnM.setActionCommand("letra");
		btnM.addActionListener(gestor);
		teclado.add(btnM);
		botones.add(btnM);
		
		JButton btnN = new JButton("N");
		btnN.setBounds(175, 90, 47, 23);
		btnN.setActionCommand("letra");
		btnN.addActionListener(gestor);
		teclado.add(btnN);
		botones.add(btnN);
		
		JButton btnO = new JButton("O");
		btnO.setBounds(232, 90, 47, 23);
		btnO.setActionCommand("letra");
		btnO.addActionListener(gestor);
		teclado.add(btnO);
		botones.add(btnO);
		
		JButton btnP = new JButton("P");
		btnP.setBounds(10, 124, 47, 23);
		btnP.setActionCommand("letra");
		btnP.addActionListener(gestor);
		teclado.add(btnP);
		botones.add(btnP);
		
		JButton btnQ = new JButton("Q");
		btnQ.setBounds(64, 124, 47, 23);
		btnQ.setActionCommand("letra");
		btnQ.addActionListener(gestor);
		teclado.add(btnQ);
		botones.add(btnQ);
		
		JButton btnR = new JButton("R");
		btnR.setBounds(121, 124, 47, 23);
		btnR.setActionCommand("letra");
		btnR.addActionListener(gestor);
		teclado.add(btnR);
		botones.add(btnR);
		
		JButton btnS = new JButton("S");
		btnS.setBounds(175, 124, 47, 23);
		btnS.setActionCommand("letra");
		btnS.addActionListener(gestor);
		teclado.add(btnS);
		botones.add(btnS);
		
		JButton btnT = new JButton("T");
		btnT.setBounds(232, 124, 47, 23);
		btnT.setActionCommand("letra");
		btnT.addActionListener(gestor);
		teclado.add(btnT);
		botones.add(btnT);
		
		JButton btnU = new JButton("U");
		btnU.setBounds(10, 158, 47, 23);
		btnU.setActionCommand("letra");
		btnU.addActionListener(gestor);
		teclado.add(btnU);
		botones.add(btnU);
		
		JButton btnV = new JButton("V");
		btnV.setBounds(64, 158, 47, 23);
		btnV.setActionCommand("letra");
		btnV.addActionListener(gestor);
		teclado.add(btnV);
		botones.add(btnV);
		
		JButton btnX = new JButton("X");
		btnX.setBounds(175, 158, 47, 23);
		btnX.setActionCommand("letra");
		btnX.addActionListener(gestor);
		teclado.add(btnX);
		botones.add(btnX);
		
		JButton btnY = new JButton("Y");
		btnY.setBounds(232, 158, 47, 23);
		btnY.setActionCommand("letra");
		btnY.addActionListener(gestor);
		teclado.add(btnY);
		botones.add(btnY);
		
		JButton btnZ = new JButton("Z");
		btnZ.setBounds(10, 192, 47, 23);
		btnZ.setActionCommand("letra");
		btnZ.addActionListener(gestor);
		teclado.add(btnZ);
		botones.add(btnZ);
		
		JButton btnÑ = new JButton("Ñ");
		btnÑ.setBounds(64, 192, 47, 23);
		btnÑ.setActionCommand("letra");
		btnÑ.addActionListener(gestor);
		teclado.add(btnÑ);
		botones.add(btnÑ);
		
		JButton btnW = new JButton("W");
		btnW.setActionCommand("letra");
		btnW.setBounds(121, 157, 47, 23);
		btnW.addActionListener(gestor);
		teclado.add(btnW);
		botones.add(btnW);
		
		for (Enumeration<AbstractButton> buttons = botones.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            button.setEnabled(false);
        }
		
		lblImage = new JLabel("");
		lblImage.setIcon(new ImageIcon(ImageIO.read(new FileInputStream("resource/img0.jpg"))));
		lblImage.setBounds(340, 20, 502, 521);
		contentPane.add(lblImage);
	}
}
