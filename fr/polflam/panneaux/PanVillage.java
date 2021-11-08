package fr.polflam.panneaux;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import fr.polflam.general.*;

public class PanVillage extends JPanel
{
    JButton chateau = new JButton("chateau");
    int indicePanneau = 1;

    public PanVillage()
    {
        this.setBackground(Color.red);
        this.setLayout(null);

        this.add(chateau);
        chateau.setBounds(800,430,150,50);
        chateau.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                FenGeneral.changementPanneau(2);
            }
        });
    }
}