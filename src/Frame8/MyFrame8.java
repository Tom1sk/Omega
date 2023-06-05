package Frame8;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Frame6.MyFrame6;

public class MyFrame8 extends JFrame implements ActionListener{

    JFrame frame;
    JLabel label;
    JButton button;
    public static int vysledek1;

    public MyFrame8(){
        label = new JLabel();
        String vysledekDone = Integer.toString(MyFrame6.vysledek2);
        System.out.println(vysledekDone);
        label.setText(vysledekDone);
        //label.setIcon(image2);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.CENTER);
        label.setForeground(new Color(0x000000));
        label.setFont(new Font("MV Boli",Font.BOLD, 30));
        //label.setIconTextGap();
        label.setBackground(new Color(0xF1F1F1));
        label.setOpaque(true);
        //label.setBorder(border);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0, 0, 200, 40);

        button = new JButton();
        button = new JButton();
        button.setBounds(175, 100, 100, 40);
        button.addActionListener(this);
        button.setText("Exit app");
        button.setFocusable(false);
        this.add(button);

        this.setTitle("Vysledek");
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setResizable(false);
        this.setSize(300, 200);
        this.setLayout(null);
        //this.add(label2);
        this.add(label);
        this.setResizable(true);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            System.exit(0);
        }
    }
}