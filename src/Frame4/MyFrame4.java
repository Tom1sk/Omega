package Frame4;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame4 extends JFrame implements ActionListener{

    JFrame frame;
    JLabel label;
    JButton button;
    
    public MyFrame4(){
        label = new JLabel();
        label.setText("Login Succes");
        //label.setIcon(image2);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.CENTER);
        label.setForeground(new Color(0x04f5ff));
        label.setFont(new Font("Arial",Font.PLAIN, 80));
        //label.setIconTextGap();
        label.setBackground(new Color(0xF1F1F1));
        label.setOpaque(true);
        //label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0, 0, 640, 160);

        button = new JButton();
        button.setBounds(450, 250, 100, 40);
        button.addActionListener(this);
        button.setText("Exit app");
        button.setFocusable(false);
        this.add(button);
        this.setTitle("Login info");
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setResizable(false);
        this.setSize(640, 360);
        this.setLayout(null);
        this.add(label);
        this.setResizable(true);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            System.exit(0);
        }
    }
}