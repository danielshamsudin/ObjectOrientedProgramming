package oopsw;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class foodGame1 {
    private JRadioButton cheeseRadioButton;
    private JRadioButton sausageRadioButton;
    private JRadioButton chipsRadioButton;
    private JRadioButton meatRadioButton;
    private ButtonGroup bGroup = new ButtonGroup();
    private JButton backButton;
    private JButton helpButton;
    private JButton answerButton;
    private JPanel panel_foodGame1;

    public foodGame1() {
        bGroup.add(cheeseRadioButton);
        bGroup.add(sausageRadioButton);
        bGroup.add(chipsRadioButton);
        bGroup.add(meatRadioButton);

        final JFrame f1 = new JFrame("Food: Quiz 1");
        f1.setContentPane(this.panel_foodGame1);
        f1.setVisible(true);
        f1.pack();
        f1.setLocationRelativeTo(null);
        f1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        helpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Choose one selection and answer!");
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                food f = new food();
            }
        });

        answerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(sausageRadioButton.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Correct answer, congratulations!!");
                    f1.dispose();
                    foodGame2 f = new foodGame2();
                }
                else if(meatRadioButton.isSelected() || cheeseRadioButton.isSelected() || chipsRadioButton.isSelected())
                    JOptionPane.showMessageDialog(null, "Wrong answer, try again!!");
                else
                    JOptionPane.showMessageDialog(null, "PLease select one answer!!");
            }
        });



    }
}