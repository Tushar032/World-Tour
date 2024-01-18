package San;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class sanfacts extends JPanel
{
   JLabel l1;
   JLabel l2;
   Icon img;
   public sanfacts()
   {
     l1=new JLabel("<HTML><br>Continent:	North America<br>Country:	United States of America<br>Region:	San Francisco County<br>City:	San Francisco<br>Coordinates: 37:47:36N 122:33:17W<br>Altitude:	39m / 131ft<br>Currency:	US Dollar (USD)<br>Language:	English<br>Time zone:	Pacific Standard Time (PST)UTC-8</HTML>");
    img=new ImageIcon(getClass().getResource("/Images/san-flag.gif"));
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