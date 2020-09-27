package oopsw;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class clrBlack {
    private JPanel panel_black;
    private JButton nextButton;
    private JButton backButton;
    private JPanel panel_btn;
    private JPanel panel_cardblack;

    public clrBlack()
    {
        final JFrame f1 = new JFrame("Black");
        f1.setContentPane(this.panel_black);
        f1.setVisible(true);
        f1.pack();
        f1.setLocationRelativeTo(null);
        f1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                clrBlue cb = new clrBlue();
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                clrWhite cw = new clrWhite();
            }
        });
    }
}
