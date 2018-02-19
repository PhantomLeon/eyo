package H10;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H101en2 extends Applet {
    private TextField tekst;
    private int hoogstegetal;
    private int laagstegetal;

    public void init() {

        setSize(350, 100);

        tekst = new TextField("", 10);
        tekst1Listener t1 = new tekst1Listener();
        tekst.addActionListener(t1);
        add(tekst);
    }

    public void paint(Graphics g) {

        g.drawString("Vul een getal in", 20, 20);
        g.drawString("en druk op Enter", 20, 35);
        g.setColor(Color.BLUE);
        g.drawString("Hoogste getal berekend  = " + hoogstegetal, 20, 70);
        g.setColor(Color.RED);
        g.drawString("Laagste getal berekend   = " + laagstegetal, 20, 90);

    }

    class tekst1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int getal = Integer.parseInt(tekst.getText());
            if (getal > hoogstegetal) {
                hoogstegetal = getal;
                repaint();
            } else if (getal < hoogstegetal) {
                laagstegetal = getal;
                repaint();
            }

        }
    }
}