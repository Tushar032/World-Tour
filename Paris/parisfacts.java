package Paris;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class parisfacts extends JPanel
{
   JLabel l1;
   JLabel l2;
   Icon img;
   public parisfacts()
   {
     l1=new JLabel("<HTML><br>Continent:	Europe<br>Country:	France<br>Region:	Île de France<br>City:	Paris<br>Coordinates: 48:51:17N 2:20:12E<br>Altitude:	34m / 114ft<br>Currency:	Euro (EUR)<br>Language:	French<br>Time zone:	Central European Time (CET)UTC+1</HTML>");
    img=new ImageIcon(getClass().getResource("/Images/paris-flag.gif"));
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