package London;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class london_description extends Panel
{
  JLabel l1,l2;
  Icon img2;
  public london_description()
  {
    setLayout(null);
    l1=new JLabel("<HTML><p>London, the capital of England and the United Kingdom, was founded 2000 years ago by the Romans as Londinium. The city has been Western Europe's largest city for centuries: as early as in 1700 more than 575,000 people lived in London. Today London is not only the largest city but also one of the most visited thanks to its numerous famous attractions such as the Tower Bridge and the Big Ben.</p></HTML>");
    img2=new ImageIcon(getClass().getResource("/Images/tower-bridge.jpg"));
    l2=new JLabel(img2);
    Font f2=new Font("Monotype Corsiva",Font.PLAIN,26);
    l1.setFont(f2);
    Color c1=new Color(100,100,255);
    l1.setBackground(c1);    
    l2.setBounds(20,80,img2.getIconWidth(),img2.getIconHeight());
    l1.setBounds(img2.getIconWidth()+50,80,500,500);
    add(l1);add(l2);
   }
}

    
    