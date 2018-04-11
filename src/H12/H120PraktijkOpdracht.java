package H12;

import java.applet.Applet;
import java.awt.*;

public class H120PraktijkOpdracht extends Applet {

    private TextField nummerField;
    private TextField naamField;
    private String[] namen;
    private String[] nummer;
    private int TienKlik;
    private final static int AANTAL_INVOER = 10;

    public void init() {

        setSize(320, 270);

        naamField = new TextField(10);
        add(naamField);
        nummerField = new TextField(10);
        add(nummerField);
        namen = new String[AANTAL_INVOER];
        nummer = new String[AANTAL_INVOER];
        TienKlik = 0;

        Button button = new Button("OK");
        add(button);
        button.addActionListener(e -> {
            namen[TienKlik] = naamField.getText();
            nummer[TienKlik] = nummerField.getText();
            TienKlik++;
            if (TienKlik == AANTAL_INVOER) {
                repaint();
            }

        });
    }
    public void paint(Graphics g) {

        g.drawString("[ Vul 10 namen en nummers toe en druk op 'OK' ]", 20, 45);
        g.drawString("[ Alle namen en nummers verschijnen hieronder ]", 20, 60);
        g.drawString("10 X", 280, 20);

        if (TienKlik != 0) {
            int x1 = 50;
            int x2 = 100;
            int y = 60;
            for (int i = 0; i < AANTAL_INVOER; i++) {
                y += 20;
                g.drawString(namen[i], x1, y);
                g.drawString(nummer[i], x2, y);
            }
            TienKlik = 0;
        }
    }
}