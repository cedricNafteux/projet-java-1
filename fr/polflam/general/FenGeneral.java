package fr.polflam.general;

import java.awt.CardLayout;

import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

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

    private JMenuBar menuBar = new JMenuBar();
    private JMenu menJeu = new JMenu("jeu"); 
    private JMenu menStat = new JMenu("statistique");
    private JMenu menAPro = new JMenu("a propos");
    private JMenu menRes = new JMenu("ressource");
    private JMenuItem menIteChar = new JMenuItem("charger");
    private JMenuItem menIteSvg = new JMenuItem("sauvegarder");
    private JMenuItem menIteNew = new JMenuItem("nouvelle partie");
    private JMenuItem menIteQuit = new JMenuItem("quitter");
    private JMenuItem menIteTime = new JMenuItem("temps de jeu");
    private JMenuItem menIteMin = new JMenuItem("mineraux");
    private JMenuItem menIteNou = new JMenuItem("nourriture");
    private JMenuItem menIteBois = new JMenuItem("bois");
    private JMenuItem menIteDuJeu = new JMenuItem("du jeu");
    private JMenuItem menIteDuCre = new JMenuItem("du créateur");

    public FenGeneral()
    {
//données fenetres
        this.setTitle("PoliceFlamme");
        this.setSize(1400,840);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(50, 50);
        this.setResizable(false);
        this.setAlwaysOnTop(false);
        this.setUndecorated(false);

// création menu
        this.menJeu.add(menIteNew);
        this.menJeu.add(menIteChar);
        this.menJeu.add(menIteSvg);
        this.menJeu.add(menIteQuit);
        this.menStat.add(menIteTime);
        this.menStat.add(menRes);
        this.menRes.add(menIteBois);
        this.menRes.add(menIteMin);
        this.menRes.add(menIteNou);
        this.menAPro.add(menIteDuJeu);
        this.menAPro.add(menIteDuCre);
        this.menuBar.add(menJeu);
        this.menuBar.add(menStat);
        this.menuBar.add(menAPro);
        this.setJMenuBar(menuBar);

        menIteChar.setAccelerator( KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK) );
        menIteQuit.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        }) ;


// Création layout
        general.setLayout(cl);

        general.add(panTitre,tabNoms[0]);
        general.add(panVillage,tabNoms[1]);
        general.add(panChateau,tabNoms[2]);

        this.setContentPane(general);
        this.setVisible(true);

    }
// changement de panneau
    public static void changementPanneau(int a)
    {
        int b = a;
        cl.show(general, tabNoms[b]);
    }

}
