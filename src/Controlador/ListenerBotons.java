package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vista.FinestraLogin;
import Vista.FinestraRegister;

import static Vista.FinestraLogin.LOGIN;
import static Vista.FinestraLogin.REGISTRAR;
import static Vista.FinestraRegister.BACK_REG;
import static Vista.FinestraRegister.NEW_REG;


/**
 *
 * <p>
 * Pràctica 2 [BBDD] <br/>
 * LsMovie - El buscador definitiu <br/>
 *
 * <b> Classe: ListenerBotons </b> <br/>
 * Implementa el controlador de les FinestraLogin i FinestraRegister
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
public class ListenerBotons implements ActionListener {
	
	private FinestraLogin vistaPrincipal;
	private FinestraRegister vistaR;
	
	public ListenerBotons(FinestraLogin vista) {
		this.vistaPrincipal = vista;
	}

	public void actionPerformed(ActionEvent event) {

		switch (event.getActionCommand()) {

			case REGISTRAR:

				vistaPrincipal.setVisible(false);
				vistaR = new FinestraRegister();
				vistaR.setVisible(true);
				vistaR.registreControladorBotons(this);

				break;

			case LOGIN:

				break;

			case NEW_REG:

				break;

			case BACK_REG:

				vistaPrincipal.setVisible(true);
				vistaR.setVisible(false);

				break;

		}

	}


}