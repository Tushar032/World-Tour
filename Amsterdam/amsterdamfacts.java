package Amsterdam;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class amsterdamfacts extends JPanel
{
   JLabel l1;
   JLabel l2;
   Icon img;
   public amsterdamfacts()
   {
     l1=new JLabel("<HTML><br>Continent:	Europe<br>Country:	The Netherlands<br>Region:	Noord-Holland<br>City:	Amsterdam<br>Coordinates: 52:21:00N 4:52:00E<br>Altitude:	9m / 30ft<br>Currency:	Euro (EUR)<br>Language:	Dutch<br>Time zone:	Central European Time (CET)UTC+1</HTML>");
    img=new ImageIcon(getClass().getResource("/Images/amsterdam.gif"));
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