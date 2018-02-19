package H10;

import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;

public class H10PraktijkOpdracht extends Applet {
    private TextField tekstvak;
    private String resultaat;


    public void init() {

        setSize(300, 100);

        tekstvak = new TextField(10);
        add(tekstvak);
        Button knop = new Button("Bereken Cijfer");
        knop.addActionListener(new knopListener());
        add(knop);
        resultaat = "";
    }

    public void paint(Graphics g) {
        g.drawString("Cijfer is:  " + resultaat, 100, 60);
        this.setSize(400,100);
    }

    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String r = tekstvak.getText();
            int invoer = Integer.parseInt(r);

            if (invoer == 1 || invoer == 2 || invoer == 3) {
                resultaat = "Slecht";
            } else if (invoer == 4) {
                resultaat = "Onvoldoende";
            } else if (invoer == 5) {
                resultaat = "Matig";
            } else if (invoer == 6 || invoer == 7) {
                resultaat = "Voldoende";
            } else if (invoer == 8 || invoer == 9 || invoer == 10) {
                resultaat = "Goed";
            }
            else
                resultaat = "Een te hoog getal";
            repaint();
        }
    }
}