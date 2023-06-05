package Frame1;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class MyFrame1 extends JFrame implements ActionListener {
    JFrame frame;
    JLabel label;
    JLabel label2;
    JButton button;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    
    public MyFrame1() {

        ImageIcon image = new ImageIcon("Warehouse.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(0xFFA1F2FF, true));
        ImageIcon image2 = new ImageIcon("WarehouseLongLogo.png");
        Border border = BorderFactory.createLineBorder(Color.BLACK, 4);
        label = new JLabel("WarehouseLongLogo.png");
        label.setText("Welcome to my Restaurant!");
        label.setIcon(image2);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0x000000));
        label.setFont(new Font("MV Boli", Font.BOLD, 30));
        label.setIconTextGap(-140);
        label.setBackground(new Color(0xF1F1F1));
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0, 0, 1265, 160);

        ImageIcon pizza = new ImageIcon("Pizza.png");
        button = new JButton();
        button.setBounds(240, 250, 250, 175);
        button.addActionListener(this);
        button.setFocusable(false);
        button.setIcon(pizza);

        ImageIcon hamburger = new ImageIcon("Hamburger.png");
        button2 = new JButton();
        button2.setBounds(508, 250, 250, 175);
        button2.addActionListener(this);
        button2.setFocusable(false);
        button2.setIcon(hamburger);

        ImageIcon fries = new ImageIcon("Fries.png");
        button3 = new JButton();
        button3.setBounds(774, 250, 250, 175);
        button3.addActionListener(this);
        button3.setFocusable(false);
        button3.setIcon(fries);

        ImageIcon hotDog = new ImageIcon("HotDog.png");
        button4 = new JButton();
        button4.setBounds(240, 450, 250, 175);
        button4.addActionListener(this);
        button4.setFocusable(false);
        button4.setIcon(hotDog);

        ImageIcon iceCream = new ImageIcon("IceCream.png");
        button5 = new JButton();
        button5.setBounds(508, 450, 250, 175);
        button5.addActionListener(this);
        button5.setFocusable(false);
        button5.setIcon(iceCream);


        ImageIcon salad = new ImageIcon("Salad.png");
        button6 = new JButton();
        button6.setBounds(774, 450, 250, 175);
        button6.addActionListener(this);
        button6.setFocusable(false);
        button6.setIcon(salad);

        button7 = new JButton();
        button7.setBounds(1100, 600, 100, 40);
        button7.addActionListener(this);
        button7.setFocusable(false);

        frame = new JFrame();

        this.setTitle("Warehouse");
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setResizable(true);
        this.setSize(1280, 720);
        this.setLayout(null);
        this.setVisible(true);
        this.add(label);
        this.setResizable(false);
        this.add(button);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        this.add(button5);
        this.add(button6);
        this.add(button7);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            System.out.println("You have ordered a pizza");
        }
        else if (e.getSource() == button2){
            System.out.println("You have ordered an hamburger");
        }
        else if (e.getSource() == button3){
            System.out.println("You have ordered a fries");
        }
        else if (e.getSource() == button4){
            System.out.println("You have ordered a hot dog");
        }
        else if (e.getSource() == button5){
            System.out.println("You have ordered a ice cream");
        }
        else if (e.getSource() == button6){
            System.out.println("You have ordered a salad");
        }
        else if(e.getSource() == button7){
            System.exit(0);
        }
    }
}
