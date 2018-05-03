package Vista;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * Created by xavierromacastells on 19/4/18.
 */



public class FinestraPrincipal extends JFrame{
    private static final Color HEADER_COLOR = new Color(25, 23, 24);
    private static final Color FONT_COLOR = Color.white;

    private JTextArea jtaResultat;
    private JPanel jpContingut;

    private JButton jbDesconectar;

    public FinestraPrincipal(Image image){
        setSize(600,600);
        setLocationRelativeTo(null);
        setTitle("InfoPelicules");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        JPanel jpCapcalera = construeixCapçalera(image);
        this.add(jpCapcalera, BorderLayout.NORTH);


        jpContingut = new JPanel(new GridBagLayout());

        jpContingut.setAlignmentX(Component.CENTER_ALIGNMENT);
        jpContingut.add(new PanelCercador());

        this.add(jpContingut, BorderLayout.CENTER);


        JScrollPane jspResultat = new JScrollPane(jtaResultat);


    }

    private JPanel construeixCapçalera (Image image){
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());



        try {
            ImageIcon  imageIcon = null;
            imageIcon = new ImageIcon(ImageIO.read(new File("./img/logo.png")));

            JLabel logoPic = new JLabel(imageIcon);
            jPanel.add(logoPic, BorderLayout.CENTER);
        } catch (IOException e) {

        }


        JPanel jpEast = new JPanel();
        jpEast.setLayout(new BoxLayout(jpEast, BoxLayout.LINE_AXIS));
        JLabel jlLogin = new JLabel("Convidat");
        jlLogin.setForeground(FONT_COLOR);
        jpEast.add(jlLogin);
        ImageIcon  imageIcon = new ImageIcon();
        imageIcon.setImage(image.getScaledInstance(48,71,0));
        JLabel fotoUsuari = new JLabel(imageIcon);
        fotoUsuari.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        jpEast.add(fotoUsuari);
        jpEast.setBackground(HEADER_COLOR);
        jPanel.add(jpEast, BorderLayout.EAST);
        jPanel.setBackground(HEADER_COLOR);
        return jPanel;
    }


}

//https://estudy.salle.url.edu/fotos2/eac/claudia.peiro.2015.jpg