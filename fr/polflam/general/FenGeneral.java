package fr.polflam.general;

import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

import fr.polflam.panneaux.*;

public class FenGeneral extends JFrame
{
    static CardLayout cl = new CardLayout();
    static JPanel general = new JPanel();
    int indice = 0;
    static String[] tabNoms = {"Intro","Village","Chateau"};
    PanIntro panTitre = new PanIntro();
    PanVillage panVillage = new PanVillage();
    PanChateau panChateau = new PanChateau();

    public FenGeneral()
    {
//données fenetres
        this.setTitle("test");
        this.setSize(1000,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(50, 50);
        this.setResizable(false);
        this.setAlwaysOnTop(false);
        this.setUndecorated(false);

// Création JPanel
        general.setLayout(cl);

        general.add(panTitre,tabNoms[0]);
        general.add(panVillage,tabNoms[1]);
        general.add(panChateau,tabNoms[2]);
        this.setContentPane(general);
        this.setVisible(true);
    }

    public static void changementPanneau(int a)
    {
        int b = a;
        cl.show(general, tabNoms[b]);
    }

}
