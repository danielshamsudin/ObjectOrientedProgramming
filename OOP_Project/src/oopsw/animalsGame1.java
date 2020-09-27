package oopsw;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class animalsGame1 {
    private JRadioButton gooseRadioButton;
    private JRadioButton duckRadioButton;
    private JRadioButton henRadioButton;
    private JRadioButton ducklingRadioButton;
    private ButtonGroup bGroup = new ButtonGroup();
    private JButton backButton;
    private JButton helpButton;
    private JButton answerButton;
    private JPanel panel_animalsGame1;

    public animalsGame1() {
        bGroup.add(gooseRadioButton);
        bGroup.add(duckRadioButton);
        bGroup.add(henRadioButton);
        bGroup.add(ducklingRadioButton);

        final JFrame f1 = new JFrame("Animals: Quiz 1");
        f1.setContentPane(this.panel_animalsGame1);
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
                animalsWild a = new animalsWild();
            }
        });

        answerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(gooseRadioButton.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Correct answer, congratulations!!");
                    f1.dispose();
                    animalsGame2 a = new animalsGame2();
                }
                else if(ducklingRadioButton.isSelected() || duckRadioButton.isSelected() || henRadioButton.isSelected())
                    JOptionPane.showMessageDialog(null, "Wrong answer, try again!!");
                else
                    JOptionPane.showMessageDialog(null, "PLease select one answer!!");
            }
        });



    }
}