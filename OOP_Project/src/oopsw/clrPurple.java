package oopsw;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class clrPurple {
    private JPanel panel_purple;
    private JPanel panel_cardPurple;
    private JPanel panel_btn;
    private JButton backButton;
    private JButton nextButton;

    public clrPurple()
    {
        final JFrame f1 = new JFrame("Purple");
        f1.setContentPane(this.panel_purple);
        f1.setVisible(true);
        f1.pack();
        f1.setLocationRelativeTo(null);
        f1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                clrYellow cy = new clrYellow();
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                clrRed cr = new clrRed();
            }
        });
    }
}
