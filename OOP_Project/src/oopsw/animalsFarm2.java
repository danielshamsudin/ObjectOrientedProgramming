package oopsw;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class animalsFarm2 {
    private JPanel panel_Animals;
    private JButton calfButton;
    private JButton catButton;
    private JButton cowButton;
    private JButton dogButton;
    private JButton donkeyButton;
    private JButton horseButton;
    private JButton pigButton;
    private JButton nextButton;
    private JButton backButton;
    private JButton helpButton;
    private JButton henButton;
    private JButton rabbitButton;
    private JButton turkeyButton;


    public animalsFarm2() {
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
                animalsFarm1 a = new animalsFarm1();
            }
        });

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                animalsWild a = new animalsWild();
            }
        });
        calfButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //playAudio("File Path Here");
            }
        });
        catButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //playAudio("File Path Here");
            }
        });
        cowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //playAudio("File Path Here");
            }
        });
        dogButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        donkeyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //playAudio("File Path Here");public class animalsFarm2 {

            }
        });
        horseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //playAudio("File Path Here");
            }
        });
        pigButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //playAudio("File Path Here");
            }
        });
    }
}