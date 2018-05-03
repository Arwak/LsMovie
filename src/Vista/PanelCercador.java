package Vista;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 * Created by xavierromacastells on 30/4/18.
 */
public class PanelCercador extends JPanel {

    public final static String[] COLUMN_NAMES = {"Movie title",
            "Genre",
            "Director",
            "Country",
            "IMDB score"};;

    private JTextField jtfMovTitle;
    private JTextField jtfGenre;
    private JTextField jtfActor;
    private JTextField jtfDirector;
    private JTextField jtfCountry;
    private JButton jbSearch;
    private JTable jtResultats;
    private DefaultTableModel dtmResultats;

    public PanelCercador () {
        JPanel jpMain = new JPanel();
        jpMain.setLayout(new BorderLayout());

        JPanel jpCenter = new JPanel(new GridLayout(6,2));
        jtfMovTitle = new JTextField();
        jtfMovTitle.setPreferredSize(new Dimension(200,5));
        jtfGenre = new JTextField();
        jtfGenre.setPreferredSize(new Dimension(200,5));
        jtfActor = new JTextField();
        jtfActor.setPreferredSize(new Dimension(200,5));
        jtfDirector = new JTextField();
        jtfDirector.setPreferredSize(new Dimension(200,5));
        jtfCountry = new JTextField();
        jtfCountry.setPreferredSize(new Dimension(200,5));
        jbSearch = new JButton("Search");

        jpCenter.add(new JLabel("Movie title: "));
        jpCenter.add(jtfMovTitle);
        jpCenter.add(new JLabel("Genre: "));
        jpCenter.add(jtfGenre);
        jpCenter.add(new JLabel("Actor: "));
        jpCenter.add(jtfActor);
        jpCenter.add(new JLabel("Director: "));
        jpCenter.add(jtfDirector);
        jpCenter.add(new JLabel("Country: "));
        jpCenter.add(jtfCountry);
        jpCenter.add(new JPanel());
        jpCenter.add(jbSearch);

        dtmResultats = new DefaultTableModel(COLUMN_NAMES, 10) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        jtResultats = new JTable(dtmResultats);

        JPanel jpSouth = new JPanel();
        jpSouth.setLayout(new BoxLayout(jpSouth, BoxLayout.Y_AXIS));

        JPanel jpTable = new JPanel(new BorderLayout());
        jpTable.add(jtResultats.getTableHeader(), BorderLayout.NORTH);
        jpTable.add(jtResultats, BorderLayout.CENTER);

        jpSouth.add(jpTable);



        jpMain.add(jpCenter, BorderLayout.EAST);

        jpSouth.setBorder(BorderFactory.createTitledBorder("Results"));

        jpMain.add(jpSouth, BorderLayout.SOUTH);

        this.add(jpMain);



    }


    public String getJtfMovTitle () {
        return jtfMovTitle.getText();
    }

    public String getJtfGenre () {
        return jtfGenre.getText();
    }

    public String getJtfActor () {
        return jtfActor.getText();
    }

    public String getJtfDirector () {
        return jtfDirector.getText();
    }

    public String getJtfCountry () {
        return jtfCountry.getText();
    }

    public void clearFields () {
        jtfActor.setText("");
        jtfCountry.setText("");
        jtfDirector.setText("");
        jtfGenre.setText("");
        jtfMovTitle.setText("");
    }

    public void addResultsRow (String [] row) {
        dtmResultats.addRow(row);
    }
}
