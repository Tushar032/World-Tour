package Sydney;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class sydneyfacts extends JPanel
{
   JLabel l1;
   JLabel l2;
   Icon img;
   public sydneyfacts()
   {
     l1=new JLabel("<HTML><br>Continent:	Oceania<br>Country:	Commonwealth of Australia<br>Region:	New South Wales (NSW)<br>City:	Sydney<br>Coordinates: 33:55:00S 151:17:00E<br>Altitude:	8m / 25ft<br>Currency:	Australian Dollar (AUD)<br>Language:	English<br>Time zone:	Eastern Standard Time (EST)UTC+10</p></HTML>");
    img=new ImageIcon(getClass().getResource("/Images/sydney.gif"));
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