package oopsw;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class alphabet {
    private JPanel panel_alphabet;
    private JButton btnMsg;
    private JButton btnBack;
    private JButton nextButton;
    private JPanel panel_btnAlphabets;
    private JPanel panel_btns;
    private JButton btnA;
    private JButton btnB;
    private JButton btnC;
    private JButton btnD;
    private JButton btnE;
    private JButton btnF;
    private JButton btnG;
    private JButton btnH;
    private JButton btnI;
    private JButton btnJ;
    private JButton btnK;
    private JButton btnL;
    private JButton btnM;
    private JButton btnN;
    private JButton btnO;
    private JButton btnP;
    private JButton btnQ;
    private JButton btnR;
    private JButton btnS;
    private JButton btnT;
    private JButton btnU;
    private JButton btnV;
    private JButton btnW;
    private JButton btnX;
    private JButton btnY;
    private JButton btnZ;

    public alphabet() {
        final JFrame f1 = new JFrame("Alphabets");
        f1.setContentPane(this.panel_alphabet);
        f1.setVisible(true);
        f1.pack();
        f1.setLocationRelativeTo(null);
        f1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        btnMsg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Click on each alphabet to play the sound!");
            }
        });
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                main_page m = new main_page();
            }
        });
        btnA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playAudio("C:\\Users\\User\\IdeaProjects\\OOP_Project\\src\\sound_alphabetts\\a.wav");
            }
        });
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                alphabetGame a = new alphabetGame();
            }
        });
    }

    public static void playAudio(String filepath)
    {
        InputStream music;
        try
        {
            music = new FileInputStream(new File(filepath));
            AudioStream audios = new AudioStream(music);
            AudioPlayer.player.start(audios);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error!");
        }
    }

}
