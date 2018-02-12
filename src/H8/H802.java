package H8;

import java.applet.*;
import java.awt.event.*;
import java.awt.*;


public class H802 extends Applet {
    private int Mannen = 0;
    private int Vrouwen = 0;
    private int PotentiëleVrouwelijke = 0;
    private int PotentiëleMannelijke = 0;


    public void init() {
        setSize(265, 200);

        Button man = new Button("Man");
        manListener ml = new manListener();
        man.addActionListener( ml );
        add (man);

        Button vrouw = new Button("Vrouw");
        vrouwListener vl = new vrouwListener();
        vrouw.addActionListener( vl );
        add (vrouw);

        Button man2 = new Button("Pot Man");
        man2Listener m2l = new man2Listener();
        man2.addActionListener( m2l );
        add (man2);

        Button vrouw2 = new Button("Pot Vrouw");
        vrouw2Listener v2l = new vrouw2Listener();
        vrouw2.addActionListener( v2l );
        add (vrouw2);

    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Aantal Mannen                           : "+ Mannen, 20,50);
        g.setColor(Color.magenta);
        g.drawString("Aantal Vrouwen                          : "+ Vrouwen, 20,80);
        g.setColor(Color.blue);
        g.drawString("Aantal Potentiële Mannen        : "+ PotentiëleMannelijke, 20,110);
        g.setColor(Color.magenta);
        g.drawString("Aantal Potentiële Vrouwen       : "+ PotentiëleVrouwelijke , 20,140);

        int totaal = Mannen + Vrouwen + PotentiëleVrouwelijke + PotentiëleMannelijke;

        g.setColor(Color.red);
        g.drawString("Totaal Mannen en Vrouwen     : " + totaal, 20,170);

    }

    class manListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            Mannen++ ;
            repaint();
        }

    }

    class vrouwListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            Vrouwen++ ;
            repaint();
        }

    }
    class man2Listener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            PotentiëleMannelijke++;
            repaint();
        }

    }
    class vrouw2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            PotentiëleVrouwelijke++;
            repaint();
        }
    }
}