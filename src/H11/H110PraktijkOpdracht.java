package H11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H110PraktijkOpdracht extends Applet {

    TextField tekstvak;
    Label label;
    int ingevuld;

    public void init() {

        setSize(280, 300);

        tekstvak = new TextField("", 20);
        label = new Label("");
        add(label);
        add(tekstvak);

        Button knop = new Button("Ok");
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);
        add(knop);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            ingevuld = Integer.parseInt(tekstvak.getText());
            repaint();
        }
    }


    public void paint(Graphics g) {
        int teller = 1;
        int y = 60;
        while(teller <= 10) {
            g.drawString(" " + teller + " x " + ingevuld + " = " + (teller * ingevuld), 50, y);
            y += 20;
            teller++;

        }
    }
}
