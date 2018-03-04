package Vista;

import Controlador.ListenerBotons;

import javax.swing.*;
import java.awt.*;

/**
 * 
 * <p>
 * Pràctica 2 [BBDD] <br/>
 * LsMovie - El buscador definitiu <br/>
 * 
 * <b> Classe: FinestraRegister </b> <br/>
 * Implementa una finestra per registrar
 * </p>
 *
 * @version 1.0
 * @author  Clàudia Peiró - cpeiro@salleurl.edu
 * 			Xavier Roma - xroma@salleurl.edu <br/>
 * 			Arxius i Bases de Dades <br/>
 * 			La Salle - Universitat Ramon Llull. <br/>
 * 			<a href="http://www.salle.url.edu" target="_blank">www.salle.url.edu</a>
 *
 */
public class FinestraRegister extends JFrame {

	public final static String NEW_REG = "3";
	public final static String BACK_REG = "4";

	private JPanel jpMain;

	private JPanel jpSeeds;
	private JPanel jpUp;
	private JPanel jpMid;
	private JPanel jpCheese;
	private JPanel jpDown;

	private JButton jbBack;
	private JButton jbRegister;
	private JLabel jlUsername;
	private JTextField jtfUsername;
	private JLabel jlPass;
	private JPasswordField jpfPass;
	private JLabel jlPassC;
	private JPasswordField jpfPassC;

	public FinestraRegister () {
		jpMain = new JPanel();
		jpMain.setLayout(new GridLayout(5,1));

		jbBack = new JButton("Enrere");
		jbRegister = new JButton("Registrar");

		jpSeeds = new JPanel(new FlowLayout(FlowLayout.LEFT));
		jpSeeds.add(jbBack);

		jpUp = new JPanel(new FlowLayout(FlowLayout.CENTER));
		jlUsername = new JLabel("Usuari: ");
		jtfUsername = new JTextField();
		jtfUsername.setPreferredSize(new Dimension(150,25));
		jpUp.add(jlUsername);
		jpUp.add(jtfUsername);

		jpMid = new JPanel(new FlowLayout(FlowLayout.CENTER));
		jlPass = new JLabel("Contrassenya: ");
		jpfPass = new JPasswordField();
		jpfPass.setPreferredSize(new Dimension(150,25));
		jpMid.add(jlPass);
		jpMid.add(jpfPass);

		jpCheese = new JPanel(new FlowLayout(FlowLayout.CENTER));
		jlPassC = new JLabel("Confirmar contrassenya: ");
		jpfPassC = new JPasswordField();
		jpfPassC.setPreferredSize(new Dimension(150,25));
		jpCheese.add(jlPassC);
		jpCheese.add(jpfPassC);

		jpDown = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		jpDown.add(jbRegister);

		jpMain.add(jpSeeds);
		jpMain.add(jpUp);
		jpMain.add(jpMid);
		jpMain.add(jpCheese);
		jpMain.add(jpDown);


		
		this.getContentPane().add(jpMain, BorderLayout.CENTER);
		
		this.setSize(350, 300);
		this.setResizable(false);
		this.setTitle("LsMovie - El buscador definitiu");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}
	
	public void registreControladorBotons(ListenerBotons controladorBotons) {
		jbRegister.addActionListener(controladorBotons);
		jbRegister.setActionCommand(NEW_REG);
		jbBack.addActionListener(controladorBotons);
		jbBack.setActionCommand(BACK_REG);
	}
	
	public String getLogin() {
		return jtfUsername.getText();
	}

	public String getPassword() {
		return jpfPass.getPassword().toString();
	}

	public String getCPassword() {
		return jpfPassC.getPassword().toString();
	}

	
}
