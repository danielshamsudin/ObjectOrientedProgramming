package oopsw;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class clothes {
    private JPanel panel_clothes;
    private JButton backButton;
    private JButton helpButton;
    private JButton nextButton;
    private JLabel image;
    private JLabel text;

    clothesInfo cap = new clothesInfo("/clothes_icon/cap_processed.png", "Cap");
    clothesInfo dress = new clothesInfo("/clothes_icon/dress_processed.png", "Dress");
    clothesInfo gloves = new clothesInfo("/clothes_icon/gloves_processed.png", "Gloves");
    clothesInfo jeans = new clothesInfo("/clothes_icon/jeans_processed.png", "Jeans");
    clothesInfo shirt = new clothesInfo("/clothes_icon/shirt_processed.png", "Shirt");
    clothesInfo socks = new clothesInfo("/clothes_icon/socks_processed.png", "Socks");

    Vector<clothesInfo> vc = new Vector<clothesInfo>();
    int count = 0, threshold;

    public clothes()
    {
        vc.add(cap);
        vc.add(dress);
        vc.add(gloves);
        vc.add(jeans);
        vc.add(shirt);
        vc.add(socks);

        threshold = vc.size();
        final JFrame f1 = new JFrame("Clothes");
        f1.setContentPane(this.panel_clothes);
        f1.setVisible(true);
        f1.pack();
        f1.setLocationRelativeTo(null);
        f1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);


        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count--;
                if (count < 0)
                {
                    f1.dispose();
                    main_page mp = new main_page();
                }
                else
                {
                    ImageIcon ic = new ImageIcon(getClass().getResource((vc.get(count)).geticonpath()));
                    ic.getImage().flush();
                    image.setIcon(ic);
                    text.setText(vc.get(count).getname());
                }
            }
        });
        helpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Picture shows the clothes and its name!");
            }
        });
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                if(count>(threshold-1))
                {
                    f1.dispose();
                    clothesGame cg = new clothesGame();
                }
                else
                {
                    ImageIcon ic = new ImageIcon(getClass().getResource(((vc.get(count)).geticonpath())));
                    ic.getImage().flush();
                    image.setIcon(ic);
                    text.setText(vc.get(count).getname());
                }
            }
        });
    }


}

class clothesInfo
{
    private String iconfilepath;
    private String name;

    clothesInfo(String iconfilepath, String name)
    {
        this.iconfilepath = iconfilepath;
        this.name = name;
    }

    public String geticonpath()
    {
        return iconfilepath;
    }
    public String getname()
    {
        return name;
    }
}
