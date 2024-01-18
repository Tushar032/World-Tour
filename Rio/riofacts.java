package Rio;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class riofacts extends JPanel
{
   JLabel l1;
   JLabel l2;
   Icon img;
   public riofacts()
   {
     l1=new JLabel("<HTML><br>Continent:	South America<br>Country:	Brazil<br>Region:	Latin America and the Caribbean<br>City:	Rio di Janeiro<br>Coordinates: 22:54:30:S 43:11:47:W<br>Altitude:	1,021 m ( 0 to 3,349 ft)<br>Currency:	Brazil Reais (BRL)<br>Language:	Portuguese<br></HTML>");
    img=new ImageIcon(getClass().getResource("/Images/rio-flag.png"));
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