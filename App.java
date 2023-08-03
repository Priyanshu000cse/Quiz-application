import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class App extends JFrame implements ActionListener {

    JButton rules, back;
    JTextField tf;
    App(){
        getContentPane().setBackground(Color.white);
setLayout(null);

ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/login.jpeg"));
JLabel image = new JLabel(i1);
image.setBounds(0, 0, 600, 400);
add(image);

JLabel heading = new JLabel("Tech Quiz");
heading.setBounds(750, 60, 300, 45);
heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
heading.setForeground(new Color(30, 14, 250));
add(heading);

JLabel name = new JLabel("Enter your Name");
name.setBounds(810, 150, 300, 20);
name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
name.setForeground(new Color(30, 14, 250));
add(name);

 tf = new JTextField();
    tf.setBounds(735, 200, 300, 25);
    tf.setFont(new Font("Times New Roman", Font.BOLD, 20));
    add(tf);

 rules = new JButton("Rules");
rules.setBounds(735, 270, 120, 25);
rules.setForeground(Color.white);
rules.setBackground(new Color(30, 144, 254));
rules.addActionListener(this);
add(rules);

 back = new JButton("Back");
back.setBounds(915, 270, 120, 25);
back.setForeground(Color.white);
back.setBackground(new Color(30, 144, 254));
back.addActionListener(this);
add(back);




        setSize(1200, 450);
        setLocation(200, 150);
setVisible(true);
    }

public void actionPerformed(ActionEvent ae){
   if(ae.getSource()==rules){
    String name = tf.getText();
setVisible(false);
new Rules(name);
   }else if(ae.getSource()== back){
    setVisible(false);
   }
}
    public static void main(String[] args)  {
        new App();
        
    }
}
