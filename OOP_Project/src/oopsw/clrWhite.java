package oopsw;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class clrWhite {
    private JPanel panel_white;
    private JPanel panel_cardWhite;
    private JPanel panel_btn;
    private JButton backButton;
    private JButton nextButton;

    public clrWhite()
    {
        final JFrame f1 = new JFrame("White");
        f1.setContentPane(this.panel_white);
        f1.setVisible(true);
        f1.pack();
        f1.setLocationRelativeTo(null);
        f1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                colors c = new colors();
            }
        });
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                clrBlack cb = new clrBlack();
            }
        });
    }
}
