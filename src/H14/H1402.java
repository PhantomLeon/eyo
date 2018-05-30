package H14;

import java.applet.Applet;
import java.awt.*;
import java.util.Random;

public class H1402 extends Applet {

    private String[] namen = {"Carlijn","Leon","Tim","Bjorn"};
    private String[] soorten = {"♠","♣","♥","♦"};
    private String[] cijfers = {"Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jester","Queen","King","Ace"};
    private String[] deck;

    private String[] demi;
    private String[] leon;
    private String[] tim;
    private String[] bjorn;

    private String cijfer;
    private String naam;
    private String soort;

    public void init() {

        deck = new String[52];
        setSize(350, 400);
        leon = new String[13];
        demi = new String[13];
        tim = new String[13];
        bjorn = new String[13];

        int teller = 0;
        for (int i = 0; i < soorten.length; i++) {
            String soort = soorten[i];
            for (int j = 0; j < cijfers.length; j++) {
                String cijfer = cijfers[j];
                deck[teller] = soort + " " + cijfer;
                teller++;
            }
        }

        for (int i = 0; i < 13; i++) {
            leon[i] = deelKaart();
            tim[i] = deelKaart();
            demi[i] = deelKaart();
            bjorn[i] = deelKaart();

        }

        double n = Math.random();
        int randomNaam = (int) (n * 4);
        naam = namen[randomNaam];

        double c = Math.random();
        int randomCijfer = (int) (c * 13);
        cijfer = cijfers[randomCijfer];

        double s = Math.random();
        int randomSoort = (int) (s * 4);
        cijfer = cijfers[randomCijfer];
        soort = soorten[randomSoort];

    }

    public void paint(Graphics g) {

        int x1 = 60;
        int x2 = 120;
        int x3 = 180;
        int x4 = 240;
        int y = 80;

        g.drawString(namen[0], x1, y);
        g.drawString(namen[1], x2, y);
        g.drawString(namen[2], x3, y);
        g.drawString(namen[3], x4, y);

        y += 20;
        for (int i = 0; i < 13; i++) {
            g.drawString(bjorn[i], x1, y);
            g.drawString(demi[i], x2, y);
            g.drawString(tim[i], x3, y);
            g.drawString(leon[i], x4, y);
            y += 20;
        }

//        Font font = new Font ("Serif", Font.PLAIN, 24);
//        g.setFont (font);
//        g.drawString(naam + " got "+ cijfer +" of "+ soort,50,50);
//        g.drawString(naam + " got "+ cijfer +" of "+ soort,50,80);
//        g.drawString(naam + " got "+ cijfer +" of "+ soort,50,110);
//        g.drawString(naam + " got "+ cijfer +" of "+ soort,50,140);

    }

    private String deelKaart() {
        int random = new Random().nextInt(deck.length);
        String kaart = deck[random];

        String[] hulpLijst = new String[deck.length - 1];
        int hulpindex = 0;
        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = deck[i];
                hulpindex++;
            }
        }
        deck = hulpLijst;
        return kaart;
    }


}