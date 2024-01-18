package Rome;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class romefacts extends JPanel
{
   JLabel l1;
   JLabel l2;
   Icon img;
   public romefacts()
   {
     l1=new JLabel("<HTML><br>Continent:	Europe<br>Country:	Italy<br>Region:	Lazio<br>City:	Rome<br>Coordinates: 41:53:57N 12:28:50E<br>Altitude:	14m / 49ft<br>Currency:	Euro (EUR)<br>Language:	Italian<br>Time zone:	Central European Time (CET)UTC+1</HTML>");
    img=new ImageIcon(getClass().getResource("/Images/rome.gif"));
    l2=new JLabel(img);
    Font f2=new Font("Monotype Corsiva",Font.PLAIN,26);
    l1.setFont(f2);
    Color c1=new Color(100,100,255);
    l1.setBackground(c1);    
    l2.setBounds(20,100,img.getIconWidth(),img.getIconHeight());
    l1.setBounds(img.getIconWidth()+100,100,600,600);
    add(l2);add(l1);
   }
}