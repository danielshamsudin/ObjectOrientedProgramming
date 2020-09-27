package oopsw;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class food {


    private JButton backButton;
    private JButton helpButton;
    private JButton nextButton;
    private JPanel panel;
    private JLabel image;
    private JLabel text;

    FoodInfo Bread = new FoodInfo("/Food_icons/Bread.jpg", "Bread");
    FoodInfo Cake = new FoodInfo("/Food_icons/Cake.jpg", "Cake");
    FoodInfo Cheese = new FoodInfo("/Food_icons/Cheese.jpg", "Cheese");
    FoodInfo Chocolate = new FoodInfo("/Food_icons/Chocolate.jpg", "Chocolate");
    FoodInfo Eggs = new FoodInfo("/Food_icons/Eggs.jpg", "Eggs");
    FoodInfo Fish = new FoodInfo("/Food_icons/Fish.jpg", "Fish");
    FoodInfo Hamburger = new FoodInfo("/Food_icons/Hamburger.jpg", "Hamburger");
    FoodInfo IceCream = new FoodInfo("/Food_icons/Ice Cream.jpg", "Ice Cream");
    FoodInfo Noodles = new FoodInfo("/Food_icons/Noodles.jpg", "Noodles");
    FoodInfo Pizza = new FoodInfo("/Food_icons/Pizza.jpg", "Pizza");
    FoodInfo Rice = new FoodInfo("/Food_icons/Rice.jpg", "Rice");
    FoodInfo Sausage = new FoodInfo("/Food_icons/Sausage.jpg", "Sausage");
    FoodInfo Toast = new FoodInfo("/Food_icons/Toast.jpg", "Toast");



    Vector<FoodInfo> vect = new Vector<FoodInfo>();
    int counter = 0, threshold;


    public food() {
        vect.add(Bread);
        vect.add(Cake);
        vect.add(Cheese);
        vect.add(Chocolate);
        vect.add(Eggs);
        vect.add(Fish);
        vect.add(Hamburger);
        vect.add(IceCream);
        vect.add(Noodles);
        vect.add(Pizza);
        vect.add(Rice);
        vect.add(Sausage);
        vect.add(Toast);

        threshold = vect.size();
        final JFrame f1 = new JFrame("Food");
        f1.setContentPane(this.panel);
        f1.setVisible(true);
        f1.pack();
        f1.setLocationRelativeTo(null);
        f1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter--;
                if(counter<0)
                {
                    f1.dispose();
                    main_page m = new main_page();
                }
                else
                {
                    ImageIcon icon = new ImageIcon(getClass().getResource(((vect.get(counter)).geticonpath())));
                    icon.getImage().flush();
                    image.setIcon(icon);
                    text.setText(vect.get(counter).getname());
                }
            }
        });
        helpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Picture shows the food and its name!");
            }
        });
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter++;
                if(counter>(threshold-1))
                {
                    f1.dispose();
                    foodGame1 fg1 = new foodGame1();
                }
                else
                {
                    ImageIcon icon = new ImageIcon(getClass().getResource(((vect.get(counter)).geticonpath())));
                    icon.getImage().flush();
                    image.setIcon(icon);
                    text.setText(vect.get(counter).getname());
                }
            }
        });
    }
}

class FoodInfo{
    private String iconfilepath;
    private String name;

    FoodInfo(String iconfilepath, String name)
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