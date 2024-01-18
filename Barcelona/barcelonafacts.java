package Barcelona;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class barcelonafacts extends JPanel
{
   JLabel l1;
   JLabel l2;
   Icon img;
   public barcelonafacts()
   {
     l1=new JLabel("<HTML><br>Continent:	Europe<br>Country:	Spain<br>Region:	Catalonia<br>City:	Barcelona<br>Coordinates: 41:18:07N 2:05:31E<br>Altitude:	1m / 3ft<br>Currency:	Euro (EUR)<br>Language:	Catalan, Spanish<br>Time zone:	Central European Time (CET)UTC+1</HTML>");
    img=new ImageIcon(getClass().getResource("/Images/barcelona-flag.gif"));
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