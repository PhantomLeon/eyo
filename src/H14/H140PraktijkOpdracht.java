package H14;

import java.applet.Applet;
import java.awt.*;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

public class H140PraktijkOpdracht extends Applet {

    private TextField invoer;
    private Image losefoto, winfoto, winkyfoto;;
    private int spel = 23;
    private String error = "";
    private int win;
    private int lost;

    public void init() {
        this.setSize(260, 550);
        invoer = new TextField(15);
        add(invoer);
        Button knop = new Button("Play");
        knopListener kl = new knopListener();
        knop.addActionListener(kl);
        add(knop);
        URL pad = H140PraktijkOpdracht.class.getResource("/H14/pictures/");
        winkyfoto = getImage(pad, "winky.jpg");
        losefoto = getImage(pad, "lose1.jpg");
        winfoto = getImage(pad, "win1.jpg");
    }
    public void paint(Graphics g) {
        //foto plaatsen
        int x = 20;
        int y = 150;
        int x2 = 5;
        int y2 = 10;
        int x3 = 5;
        int y3 = 140;
        // plaatjes op een rij van 4 tot 23
        for (int i = 0; i < spel; i++) {
            if (i % 4 == 0 && i != 0) {
                y += 55;
                x = 25;
            }
            Font font = new Font("Serif", Font.PLAIN, 24);
            g.setFont(font);
            g.drawRoundRect(10, 140, 240, 360, 10, 10);

            g.drawImage(winkyfoto, x, y, 60, 60, this);
            x += 50;
        }
        //gewonnen foto
        if (win >= 3) {
            g.drawImage(winfoto,x3, y3, 250, 380, this);
        }
        //verloren foto
        if (lost >= 3) {
            g.drawImage(losefoto,x2, y2, 250, 600, this);
        }
        g.drawString("☺:" + spel, 10, 60);
        g.drawString("" + error, 10, 80);
        g.drawString("Gewonnen \uD83C\uDF82     :" + win, 10, 100);
        g.drawString("Verloren ✞         :" + lost, 10, 130);
    }
    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = invoer.getText();
            int getal = Integer.parseInt(s);
            Random random = new Random();
            int computer = random.nextInt(3) + 1;

            //Magic numbers  21,17,13,9,5,1
            if (getal < 1 || getal > 3) {
                error = "FOUTE INVOER ☠";
            } else {
                //verloren
                spel -= getal;
                if (spel <= 0) {
                    lost = lost + 1;
                    spel = 23;
                }
                //gewonnen
                else if (spel == 1) {
                    win = win + 1;
                    spel = 23;
                }
                //computer
                else if (spel == 21 || spel == 17 || spel == 13 || spel == 9 || spel == 5) {
                    spel -= computer;
                } else if (spel == 20 || spel == 16 || spel == 12 || spel == 8 || spel == 4) {
                    spel -= 3;
                } else if (spel == 19 || spel == 15 || spel == 11 || spel == 7 || spel == 3) {
                    spel -= 2;
                } else if (spel == 22 || spel == 18 || spel == 14 || spel == 10 || spel == 6) {
                    spel -= 1;
                }
            }
            repaint();
        }
    }
}
