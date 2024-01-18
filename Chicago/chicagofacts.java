package Chicago;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class chicagofacts extends JPanel
{
   JLabel l1;
   JLabel l2;
   Icon img;
   public chicagofacts()
   {
     l1=new JLabel("<HTML><br>Continent:	North America<br>Country:	USA(United States of America)<br>Region:	Illinois (IL)<br>City:	Chicago<br>Coordinates: 41:50:13N 87:41:06W<br>Altitude:	177m / 583ft<br>Currency:	US Dollar (USD)<br>Language:	English<br>Time zone:	Central Standard Time (CST)UTC-6</HTML>");
    img=new ImageIcon(getClass().getResource("/Images/chicago-flag.gif"));
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