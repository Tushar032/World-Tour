package Chicago;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class chicagodescription extends JPanel
{
  JLabel l1,l2;
  Icon img2;
  public chicagodescription()
  {
    setLayout(null);
    l1=new JLabel("<HTML><p>Chicago, the birthplace of the modern skyscraper is still a trendsetter in urban architecture and a must for people interested in 20th century urban architecture. But the Windy City offers a lot more than architecture alone: it is a bustling city, with a vibrant nightlife and plenty of great museums. It is also a great city to live in, especially the northern part which has a lively atmosphere and even nice beaches.</p></HTML>");
    img2=new ImageIcon(getClass().getResource("/Images/millennium.jpg"));
    l2=new JLabel(img2);
    Font f2=new Font("Monotype Corsiva",Font.PLAIN,24);
    l1.setFont(f2);
    Color c1=new Color(100,100,255);
    l1.setBackground(c1);    
    l2.setBounds(20,80,img2.getIconWidth(),img2.getIconHeight());
    l1.setBounds(img2.getIconWidth()+50,80,550,400);
    add(l2);add(l1);
   }
}

    
    