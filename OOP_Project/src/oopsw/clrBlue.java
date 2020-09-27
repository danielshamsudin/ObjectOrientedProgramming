package oopsw;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class clrBlue {
    private JPanel panel_blue;
    private JPanel panel_cardblue;
    private JPanel panel_btn;
    private JButton backButton;
    private JButton nextButton;

    public clrBlue()
    {
        final JFrame f1 = new JFrame("Blue");
        f1.setContentPane(this.panel_blue);
        f1.setVisible(true);
        f1.pack();
        f1.setLocationRelativeTo(null);
        f1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                clrGreen gr = new clrGreen();
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                clrBlack cb = new clrBlack();
            }
        });
    }
}
