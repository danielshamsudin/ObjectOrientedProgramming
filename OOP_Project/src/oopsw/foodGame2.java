package oopsw;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class foodGame2 {
    private JRadioButton crispsRadioButton;
    private JRadioButton noodlesRadioButton;
    private JRadioButton chipsRadioButton;
    private JRadioButton pastaRadioButton;
    private ButtonGroup bGroup = new ButtonGroup();
    private JButton backButton;
    private JButton helpButton;
    private JButton answerButton;
    private JPanel panel_foodGame2;

    public foodGame2() {
        bGroup.add(crispsRadioButton);
        bGroup.add(noodlesRadioButton);
        bGroup.add(chipsRadioButton);
        bGroup.add(pastaRadioButton);

        final JFrame f1 = new JFrame("Food: Quiz 2");
        f1.setContentPane(this.panel_foodGame2);
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
                foodGame1 f = new foodGame1();
            }
        });

        answerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(chipsRadioButton.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Correct answer, congratulations!!");
                    f1.dispose();
                    foodGame3 f = new foodGame3();
                }
                else if(pastaRadioButton.isSelected() || crispsRadioButton.isSelected() || noodlesRadioButton.isSelected())
                    JOptionPane.showMessageDialog(null, "Wrong answer, try again!!");
                else
                    JOptionPane.showMessageDialog(null, "PLease select one answer!!");
            }
        });



    }
}