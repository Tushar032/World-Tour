package NewYork;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class nydescription extends JPanel
{
  JLabel l1,l2;
  Icon img2;
  public nydescription()
  {
    setLayout(null);
    l1=new JLabel("<HTML><p>New York, the largest city in the U.S., is an architectural marvel with plenty of historic monuments, magnificent buildings and countless dazzling skyscrapers. Besides the architectural delights, New York is an urban jungle that has everything to offer to visitors. The city is home to numerous museums, parks, trendy neighborhoods and shopping streets.</p></HTML>");
    img2=new ImageIcon(getClass().getResource("/Images/statue.jpg"));
    l2=new JLabel(img2);
    Font f2=new Font("Monotype Corsiva",Font.PLAIN,26);
    l1.setFont(f2);
    Color c1=new Color(100,100,255);
    l1.setBackground(c1);    
    l2.setBounds(20,80,img2.getIconWidth(),img2.getIconHeight());
    l1.setBounds(img2.getIconWidth()+60,80,600,400);
    add(l2);add(l1);
   }
}

    
    