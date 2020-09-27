package oopsw;

import javax.swing.*;

public class finalPage {
    private JPanel panel_final;
    public static JFrame f = new JFrame("Congratulations!!");

    public finalPage()
    {
        f.setContentPane(this.panel_final);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400,400);
        f.pack();
        f.setVisible(true);
        f.setLocationRelativeTo(null);
    }
}
