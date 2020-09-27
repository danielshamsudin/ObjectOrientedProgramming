package oopsw;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class clrOrange {
    private JPanel panel_orange;
    private JPanel panel_cardOrange;
    private JPanel panel_btn;
    private JButton backButton;
    private JButton nextButton;

    public clrOrange()
    {
        final JFrame f1 = new JFrame("Orange");
        f1.setContentPane(this.panel_orange);
        f1.setVisible(true);
        f1.pack();
        f1.setLocationRelativeTo(null);
        f1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                clrRed cr = new clrRed();
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                clrGreen cg = new clrGreen();
            }
        });
    }
}
