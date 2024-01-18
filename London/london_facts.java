package London;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class london_facts extends Panel
{
   JLabel l1;
   JLabel l2;
   Icon img;
   public london_facts()
   {
     l1=new JLabel("<HTML><br>Continent:	Europe<br>Country:	United Kingdom<br>Region:	England<br>City:	London<br>Coordinates: 51:30:40N 0:07:31W<br>Altitude:	14m / 49ft<br>Currency:	Pound sterling (GBP)<br>Language:	English<br>Time zone:	Greenwich Mean Time (GMT) UTC+0</HTML>");
    img=new ImageIcon(getClass().getResource("/Images/england_london.gif"));
    l2=new JLabel(img);
    Font f2=new Font("Monotype Corsiva",Font.PLAIN,26);
    l1.setFont(f2);
    Color c1=new Color(100,100,255);
    l1.setBackground(c1);    
    l2.setBounds(20,150,img.getIconWidth(),img.getIconHeight());
    l1.setBounds(img.getIconWidth()+100,150,400,700);
    add(l2);add(l1);
   }
}