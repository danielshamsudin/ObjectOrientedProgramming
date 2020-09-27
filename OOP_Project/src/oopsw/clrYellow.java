package oopsw;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class clrYellow {
    private JPanel panel_yellow;
    private JPanel panel_cardYellow;
    private JPanel panel_btn;
    private JButton backButton;
    private JButton nextButton;

    public clrYellow()
    {
        final JFrame f1 = new JFrame("Yellow");
        f1.setContentPane(this.panel_yellow);
        f1.setVisible(true);
        f1.pack();
        f1.setLocationRelativeTo(null);
        f1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                colorGame cgame = new colorGame();
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                clrPurple cp = new clrPurple();
            }
        });
    }
}
