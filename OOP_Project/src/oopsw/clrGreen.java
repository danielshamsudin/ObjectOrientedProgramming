package oopsw;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class clrGreen {
    private JPanel panel_green;
    private JPanel panel_cardGreen;
    private JPanel panel_btn;
    private JButton backButton;
    private JButton nextButton;

    public clrGreen()
    {
        final JFrame f1 = new JFrame("Green");
        f1.setContentPane(this.panel_green);
        f1.setVisible(true);
        f1.pack();
        f1.setLocationRelativeTo(null);
        f1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                clrOrange co = new clrOrange();
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                clrBlue cblue = new clrBlue();
            }
        });
    }
}
