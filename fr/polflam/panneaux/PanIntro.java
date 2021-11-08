package fr.polflam.panneaux;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import fr.polflam.general.*;

public class PanIntro extends JPanel
{
    JButton charger = new JButton("charger");
    JButton commencer = new JButton("commencer");
    JButton quitter = new JButton("quitter");
    int indicePanneau = 0;

    public PanIntro()
    {
        this.setBackground(Color.blue);
        this.setLayout(null);
        this.add(charger);
        charger.setBounds(800, 360, 150, 50);

        this.add(commencer);
        commencer.setBounds(800, 430, 150, 50);
        commencer.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                FenGeneral.changementPanneau(1);
            }
        });
this.add(quitter);
quitter.setBounds(800, 500, 150, 50);
quitter.addActionListener(new ActionListener()
{
    public void actionPerformed(ActionEvent arg0)
    {
        System.exit(0);
    }
});
    }
}
