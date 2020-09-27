package oopsw;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class clrRed {
    private JPanel panel_red;
    private JPanel panel_cardRed;
    private JPanel panel_btn;
    private JButton backButton;
    private JButton nextButton;

    public clrRed()
    {
        final JFrame f1 = new JFrame("Red");
        f1.setContentPane(this.panel_red);
        f1.setVisible(true);
        f1.pack();
        f1.setLocationRelativeTo(null);
        f1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                clrPurple cp = new clrPurple();
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                clrOrange co = new clrOrange();
            }
        });
    }
}
