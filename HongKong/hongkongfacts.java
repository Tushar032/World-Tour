package HongKong;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class hongkongfacts extends JPanel
{
   JLabel l1;
   JLabel l2;
   Icon img;
   public hongkongfacts()
   {
     l1=new JLabel("<HTML><br>Continent:	Asia<br>Country:      China<br>Region:	Hong Kong S.A.R. (Special Administrative Region)<br>City:	Hong kong<br>Coordinates: 22:15:00N 114:10:02E<br>Altitude:	10m / 33ft<br>Currency:	HK Dollar (HKD)<br>Language:	Chinese (Cantonese), English<br>Time zone:	Hong Kong Time (HKT)UTC+8</HTML>");
    img=new ImageIcon(getClass().getResource("/Images/hongkong-flag.gif"));
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