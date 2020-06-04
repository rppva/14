import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class progami extends Frame implements ActionListener {

    TextField tekst1, tekst2, tekst3;
    Button knop1, knop2;
    Frame frame = new Frame();

    public progami() {

        setLayout(null);

        tekst1 = new TextField();
        tekst1.setLocation(150, 50);
        tekst1.setSize(80, 30);


        tekst2 = new TextField();
        tekst2.setLocation(150, 80);
        tekst2.setSize(80, 30);


        tekst3 = new TextField();
        tekst3.setLocation(150, 110);
        tekst3.setSize(80, 30);

        knop1 = new Button("Calculate");
        knop1.setSize(100, 20);
        knop1.setLocation(150, 250);
        knop1.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent actionEvent) {
                                        try {

                                            int a = Integer.parseInt(tekst1.getText());
                                            int b = Integer.parseInt(tekst2.getText());
                                            int c = a + b;
                                            tekst3.setText(String.valueOf(c));

                                        } catch (NumberFormatException nf) {
                                            tekst1.setText("");
                                            tekst2.setText("");
                                            tekst3.setText("Oshibka");
                                        }
                                    }
                                });

        knop2 = new Button("Clear");
        knop2.setSize(100, 20);
        knop2.setLocation(150, 300);
        knop2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                tekst1.setText("");
                tekst2.setText("");
                tekst3.setText("");
            }
        });


        add(knop1);
        add(knop2);
        add(tekst1);
        add(tekst2);
        add(tekst3);

        setSize(400, 400);
        setTitle("Warcraft3");
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setVisible(true);

    }
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getActionCommand().equals("Calculate")) {
            try {

                int a = Integer.parseInt(tekst1.getText());
                int b = Integer.parseInt(tekst2.getText());
                int c = a + b;
                tekst3.setText(String.valueOf(c));

            }
            catch (NumberFormatException nf) {
                tekst1.setText("");
                tekst2.setText("");
                tekst3.setText("Oshibka");

            }
        }
        else {

            tekst1.setText("");
            tekst2.setText("");
            tekst3.setText("");

        }
    }

    public static void main(String[] args) {
        new progami();
    }
}
