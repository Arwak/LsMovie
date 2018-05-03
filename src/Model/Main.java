package Model;

import javax.imageio.ImageIO;
import javax.swing.SwingUtilities;
import Controlador.ListenerBotons;
import Vista.FinestraLogin;
import Vista.FinestraPrincipal;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 *
 * <p>
 * Pràctica 2 [BBDD] <br/>
 * LsMovie - El buscador definitiu <br/>
 *
 * <b> Classe: Main </b> <br/>
 * Cervell
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
public class Main {
	
	public static void main(String[] args) {



		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Image image = null;
				try {
					URL url = new URL("https://estudy.salle.url.edu/fotos2/eac/ls25670.jpg");
					image = ImageIO.read(url);
				} catch (IOException e) {
					try {
						image = ImageIO.read(new File("./img/default_profile.png"));
					} catch (IOException e1) {
						image = null;
					}
				}

				FinestraPrincipal vista = new FinestraPrincipal(image);


				vista.setVisible(true);
			}
		});
	}
	
}
