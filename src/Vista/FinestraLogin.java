package Vista;

import java.awt.*;
import javax.swing.*;

import Controlador.ListenerBotons;
import com.sun.org.apache.regexp.internal.RE;

/**
 * 
 * <p>
 * Pràctica 2 [BBDD] <br/>
 * LsMovie - El buscador definitiu <br/>
 * 
 * <b> Classe: FinestraLogin </b> <br/>
 * Implementa una finestra per realitzar login
 * </p>
 *
 * @version 1.0
 * @author  Clàudia Peiró - cpeiro@salleurl.edu <br/>
 * 			Xavier Roma - xroma@salleurl.edu <br/>
 * 			Arxius i Bases de Dades <br/>
 * 			La Salle - Universitat Ramon Llull. <br/>
 * 			<a href="http://www.salle.url.edu" target="_blank">www.salle.url.edu</a>
 *
 */
public class FinestraLogin extends JPanel {

	public final static String REGISTRAR = "1";
	public final static String LOGIN = "2";

	private JPanel jpMain;

	private JButton jbLogin;
	private JLabel jlUsername;
	private JTextField jtfUsername;
	private JLabel jlPass;
	private JPasswordField jpfPass;
	
	public FinestraLogin () {

		jpMain = new JPanel();
		jpMain.setLayout(new GridLayout(3,3));

		jbLogin = new JButton("Entrar");
		jbLogin.setPreferredSize(new Dimension(25,25));

		jlUsername = new JLabel("Usuari: ");
		jtfUsername = new JTextField();
		jtfUsername.setPreferredSize(new Dimension(124,25));
		jpMain.add(jlUsername);
		jpMain.add(jtfUsername);

		jlPass = new JLabel("Contrassenya: ");
		jpfPass = new JPasswordField();
		jpfPass.setPreferredSize(new Dimension(124,25));
		jpMain.add(jlPass);
		jpMain.add(jpfPass);
		jpMain.add(new Panel());
		jpMain.add(jbLogin);


		this.add(jpMain);

	}
	
	public void registreControladorBotons(ListenerBotons controladorBotons) {

		jbLogin.addActionListener(controladorBotons);
		jbLogin.setActionCommand(LOGIN);
	}
	
	public String getLogin() {
		return jtfUsername.getText();
	}

	public String getPassword() {
		return jpfPass.getPassword().toString();
	}
	
}
