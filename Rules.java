import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.JLabel;

import java.awt.*;
public class Rules extends JFrame implements ActionListener {
    JButton start, back;
    String name;
    Rules(String name){
        this.name= name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);


   JLabel head = new JLabel(" Welcome " + name + " to " + " TechQuiz ");
head.setBounds(50, 20, 700, 30);
head.setFont(new Font("Viner Hand ITC", Font.BOLD, 35));
head.setForeground(new Color(30, 14, 250));
add(head);


   JLabel rules = new JLabel();
rules.setBounds(20, 90, 700, 350);
rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
rules.setText (
  "<html>"+ 
               "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
    "<html>"
);
add(rules);

  back = new JButton("Back");
back.setBounds(250, 500, 100, 30);
back.setForeground(Color.white);
back.setBackground(new Color(30, 144, 254));
back.addActionListener(this);
add(back);



 start = new JButton("Start");
start.setBounds(400, 500, 100, 30);
start.setForeground(Color.white);
start.setBackground(new Color(30, 144, 254));
start.addActionListener(this);
add(start);



        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
   if(ae.getSource()== start){
  setVisible(false);
   new Quiz(name);
   }else{

    setVisible(false);
    new App();
   }
    }
    public static void main(String[] args) {
        new Rules("User");
    }
}
