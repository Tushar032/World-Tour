package NewYork;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class nyfacts extends JPanel
{
   JLabel l1;
   JLabel l2;
   Icon img;
   public nyfacts()
   {
     l1=new JLabel("<HTML><br>Continent:	North America<br>Country:	United States of America<br>State:	New York (NY)<br>City:	New York City<br>Coordinates: 40:40:11N 73:56:38W<br>Altitude:	1m / 6ft<br>Currency:	US Dollar (USD)<br>Language:	English<br>Time zone:	Eastern Standard Time (EST)UTC-5</HTML>");
    img=new ImageIcon(getClass().getResource("/Images/newyork-city.gif"));
    l2=new JLabel(img);
    Font f2=new Font("Monotype Corsiva",Font.PLAIN,26);
    l1.setFont(f2);
    Color c1=new Color(100,100,255);
    l1.setBackground(c1);    
    l2.setBounds(20,100,img.getIconWidth(),img.getIconHeight());
    l1.setBounds(img.getIconWidth()+100,100,400,700);
    add(l2);add(l1);
   }
}