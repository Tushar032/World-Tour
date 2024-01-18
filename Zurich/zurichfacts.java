package Zurich;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class zurichfacts extends JPanel
{
   JLabel l1;
   JLabel l2;
   Icon img;
   public zurichfacts()
   {
     l1=new JLabel("<HTML><br>Continent:	Europe<br>Country:	Switzerland<br>City:	Zurich<br>Coordinates: 47.3690°N,8.5380°E<br>Currency:	Currency:  Swiss Franc (CHF)<br>Time zone:	Central European Time (CET)UTC+1</HTML>");
    img=new ImageIcon(getClass().getResource("/Images/zurich-flag.png"));
    l2=new JLabel(img);
    Font f2=new Font("Monotype Corsiva",Font.PLAIN,26);
    l1.setFont(f2);
    Color c1=new Color(100,100,255);
    l1.setBackground(c1);    
    l2.setBounds(20,100,img.getIconWidth(),img.getIconHeight());
    l1.setBounds(img.getIconWidth()+100,100,500,700);
    add(l2);add(l1);
   }
}