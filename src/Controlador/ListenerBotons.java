package Controlador;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import Vista.FinestraPrincipal;
import Vista.PanelCercador;
import Vista.PanelLogin;

import javax.imageio.ImageIO;

import static Vista.PanelCercador.SEARCH;
import static Vista.PanelLogin.LOGIN;
import static Vista.PanelLogin.NEW_USER;
import static Vista.PanelRegistrar.REGISTER;

/**
 *
 * <p>
 * Pràctica 2 [BBDD] <br/>
 * LsMovie - El buscador definitiu <br/>
 *
 * <b> Classe: ListenerBotons </b> <br/>
 * Implementa el controlador de FinestraPrincipal
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

	private FinestraPrincipal finestraPrincipal;

	public ListenerBotons(FinestraPrincipal vista) {
		this.finestraPrincipal = vista;
	}

	public void actionPerformed(ActionEvent event) {

		switch (event.getActionCommand()) {

			case LOGIN:
				System.out.println(finestraPrincipal.getPassword());

				finestraPrincipal.addUser(getLoginFoto(finestraPrincipal.getLogin()), finestraPrincipal.getLogin());
				finestraPrincipal.swapToSearchPanel();
				break;

			case SEARCH:

				break;

			case NEW_USER:

				finestraPrincipal.swapToRegisterPanel();
				break;

			case REGISTER:

				finestraPrincipal.swapToLoginPanel();
				break;

		}

	}

	private static Image getLoginFoto(String login) {
		Image image = null;
		try {
			URL url = new URL("https://estudy.salle.url.edu/fotos2/eac/" + login + ".jpg");
			image = ImageIO.read(url);
		} catch (IOException e) {
			try {
				image = ImageIO.read(new File("./img/default_profile.png"));
			} catch (IOException e1) {
				image = null;
			}
		}

		return image;
	}


}