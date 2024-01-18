package Sydney;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class sydneydescription extends JPanel
{
  JLabel l1,l2;
  Icon img2;
  public sydneydescription()
  {
    setLayout(null);
    l1=new JLabel("<HTML><p>Sydney, Australia's oldest city, was founded in 1788 by Arthur Phillip. He lead a fleet of 11 ships with British convicts sent to this remote destination to relieve the overcrowded British jails. Few of those aboard this 'First Fleet' could have imagined their small settlement would grow into a large cosmopolitan metropolis. Today Sydney is one of Asia-Pacific's most popular tourist destinations thanks to its sunny weather, fine beaches and great landmarks like the Opera House.</p></HTML>");
    img2=new ImageIcon(getClass().getResource("/Images/opera-house.jpg"));
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

    
    