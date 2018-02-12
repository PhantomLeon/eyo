package H8;


import java.applet.*;
import java.awt.event.*;
import java.awt.*;

public class H801 extends Applet {
    private TextField tekstvak;
    private String schermtekst;


    public void init() {


        setSize(400, 100);
        Button knop = new Button("Ok");
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);
        add(knop);
        knop = new Button("Reset");
        ResetListener k1 = new ResetListener();
        knop.addActionListener(k1);
        add(knop);
        tekstvak = new TextField(14);
        Label label = new Label("Vul iets in het tekstvakje");
        add(tekstvak);
        add(label);
    }

    public void paint(Graphics g) {
        g.drawString(schermtekst, 20, 60);

    }


    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            schermtekst = tekstvak.getText();
            repaint();
        }
    }

    class ResetListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            schermtekst = tekstvak.getText();
            repaint();
        }
    }

}

//Button knop;

//public void init() {
//knop = new Button();
//knop.setLabel( "Klik op mij" );
//add(knop);
//}

//public void paint(Graphics g) {
//g.drawString("Doet deze knop wel iets?", 50, 60 );