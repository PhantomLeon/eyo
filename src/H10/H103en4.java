package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class H103en4 extends Applet {
    private TextField tekstvak;
    private TextField tekstvak2;
    private String tekst;
    private String tekst2;


    public void init() {

        this.setSize(700,100);

        tekstvak = new TextField("", 15);
        Label label = new Label("[ Vul een Maand Nummer in en druk op Enter ]");
        tekstvak.addActionListener(new TekstvakListener());
        tekst = "";
        add (label);
        add (tekstvak);

        tekstvak2 = new TextField("", 15);
        tekstvak2.addActionListener(new TekstvakListener());
        label = new Label("[ Vul een Jaar in ]");
        tekst = "";
        add (label);
        add (tekstvak2);
    }


    public void paint(Graphics g) {

        g.setColor(Color.red);

        this.setSize(675,90);
        if (tekst != null && tekst2 != null) {
            g.drawString(tekst, 20, 80);
            g.drawString(tekst2, 170, 80);
        }


    }
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String a = tekstvak2.getText();
            int dagen_feb = 28;
            int jaartal = Integer.parseInt(a);
            if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0 ) {
                tekst2 = "   "+ jaartal + " Is een Schrikkeljaar";
                dagen_feb = 29;
            }
            else {
                tekst2 = "   "+ jaartal + " Is geen schrikkeljaar";
            }

            String b = tekstvak.getText();
            int maand = Integer.parseInt(b);
            switch (maand) {

                case 1:
                    tekst = "Januari Heeft 31 Dagen";
                    break;
                case 2:
                    tekst = "Februari Heeft "+ dagen_feb +" Dagen";
                    break;
                case 3:
                    tekst = "Maart Heeft 31 Dagen";
                    break;
                case 4:
                    tekst = "April Heeft 30 Dagen";
                    break;
                case 5:
                    tekst = "Mei Heeft 31 Dagen";
                    break;
                case 6:
                    tekst = "Juni Heeft  30 Dagen";
                    break;
                case 7:
                    tekst = "Juli Heeft 31 Dagen";
                    break;
                case 8:
                    tekst = "Augustus Heeft 31 Dagen";
                    break;
                case 9:
                    tekst = "September Heeft 30 Dagen";
                    break;
                case 10:
                    tekst = "Oktober Heeft 31 Dagen";
                    break;
                case 11:
                    tekst = "November Heeft 30 Dagen";
                    break;
                case 12:
                    tekst = "December Heeft 31 Dagen";
                    break;
                default:
                    tekst = "Nummers 1 tot 12 Alleen";
                    break;
            }
            repaint();
        }
    }

}