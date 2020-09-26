package oopsw;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class animalsWild {
    private JPanel panel_Animals;
    private JButton deerButton;
    private JButton frogButton;
    private JButton hippoButton;
    private JButton kangarooButton;
    private JButton koalabutton;
    private JButton monkeyButton;
    private JButton turtleButton;
    private JButton owlButton;
    private JButton nextButton;
    private JButton backButton;
    private JButton helpButton;
    private JButton mouseButton;


    public animalsWild() {
        final JFrame f1 = new JFrame("Animals - Farm");
        f1.setContentPane(this.panel_Animals);
        f1.setVisible(true);
        f1.pack();
        f1.setLocationRelativeTo(null);
        f1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        helpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Click on each number to play the pronunciation!");
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                animalsFarm2 a = new animalsFarm2();
            }
        });

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                animalsGame1 a = new animalsGame1();
            }
        });
        deerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //playAudio("File Path Here");
            }
        });
        frogButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //playAudio("File Path Here");
            }
        });
        hippoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //playAudio("File Path Here");
            }
        });
        kangarooButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        monkeyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //playAudio("File Path Here");
            }
        });
        owlButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //playAudio("File Path Here");
            }
        });
        turtleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //playAudio("File Path Here");
            }
        });

    }
}