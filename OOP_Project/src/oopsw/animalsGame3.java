package oopsw;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class animalsGame3 {
    private JRadioButton sheepRadioButton;
    private JRadioButton dogRadioButton;
    private JRadioButton catRadioButton;
    private JRadioButton calfRadioButton;
    private ButtonGroup bGroup = new ButtonGroup();
    private JButton backButton;
    private JButton helpButton;
    private JButton answerButton;
    private JPanel panel_animalsGame3;
    private static boolean stateAnimal = false;

    public animalsGame3() {
        bGroup.add(sheepRadioButton);
        bGroup.add(dogRadioButton);
        bGroup.add(catRadioButton);
        bGroup.add(calfRadioButton);

        final JFrame f1 = new JFrame("Animals: Quiz 3");
        f1.setContentPane(this.panel_animalsGame3);
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
                animalsGame2 a = new animalsGame2();
            }
        });

        answerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (dogRadioButton.isSelected()) {
                    stateAnimal = true;
                    JOptionPane.showMessageDialog(null, "Congratulations!! You have completed Animals.");
                    f1.dispose();
                    main_page m = new main_page();
                } else if (sheepRadioButton.isSelected() || calfRadioButton.isSelected() || catRadioButton.isSelected())
                    JOptionPane.showMessageDialog(null, "Wrong answer, try again!!");
                else
                    JOptionPane.showMessageDialog(null, "PLease select one answer!!");
            }
        });
    }

    public static boolean getAnimalState() { return stateAnimal;}
}