package oopsw;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class animalsFarm1 {
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


    public animalsFarm1() {
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
                main_page m = new main_page();
            }
        });

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                animalsFarm2 a = new animalsFarm2();
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
                //playAudio("File Path Here");
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