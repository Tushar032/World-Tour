package Dubai;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class dubaifacts extends JPanel
{
   JLabel l1;
   JLabel l2;
   Icon img;
   public dubaifacts()
   {
     l1=new JLabel("<HTML><br>Continent:	Asia<br>Country:	UAE (United Arab Emirates)<br>City:	Dubai<br>Coordinates: 25°15'00?N 55°18'00?E<br>Currency:	Dirham (Dhm)<br>Language:	Urdu<br>Time zone:	UAE standard time (UTC+4)</HTML>");
    img=new ImageIcon(getClass().getResource("/Images/dubai-flag.png"));
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