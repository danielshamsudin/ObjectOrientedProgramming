package oopsw;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class numbersGame2 {
    private JRadioButton sixRadioButton;
    private JRadioButton eightRadioButton;
    private JRadioButton nineRadioButton;
    private JRadioButton threeRadioButton;
    private ButtonGroup bGroup = new ButtonGroup();
    private JButton backButton;
    private JButton helpButton;
    private JButton answerButton;
    private JPanel panel_numbersGame2;

    public numbersGame2() {
        bGroup.add(sixRadioButton);
        bGroup.add(eightRadioButton);
        bGroup.add(nineRadioButton);
        bGroup.add(threeRadioButton);

        final JFrame f1 = new JFrame("Numbers: Quiz 2");
        f1.setContentPane(this.panel_numbersGame2);
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
                numbersGame1 n = new numbersGame1();
            }
        });

        answerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(eightRadioButton.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Correct answer, congratulations!!");
                    f1.dispose();
                    numbersGame3 n = new numbersGame3();
                }
                else if(sixRadioButton.isSelected() || threeRadioButton.isSelected() || nineRadioButton.isSelected())
                    JOptionPane.showMessageDialog(null, "Wrong answer!!");
                else
                    JOptionPane.showMessageDialog(null, "PLease select one answer!!");
            }
        });



    }
}
