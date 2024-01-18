package Dubai;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class dubaidescription extends JPanel
{
  JLabel l1,l2;
  Icon img2;
  public dubaidescription()
  {
    setLayout(null);
    l1=new JLabel("<HTML><p>Dubai is a city in the United Arab Emirates, located within the emirate. The emirate of Dubai is located on the southeast coast of the Persian Gulf and is one of the seven emirates that make up the country. It has the largest population in the UAE (2,106,177) and the second-largest land territory by area (4,114 km2) after Abu Dhabi, the national capital. Today, Dubai has emerged as a cosmopolitan metropolis that has grown steadily to become a global city and a business and cultural hub of the Middle East and the Persian Gulf region.  It is also a major transport hub for passengers and cargo. Dubai has recently attracted world attention through many innovative large construction projects and sports events. The city has become symbolic for its skyscrapers and high-rise buildings.</p></HTML>");
    img2=new ImageIcon(getClass().getResource("/Images/burj-al-arab.jpg"));
    l2=new JLabel(img2);
    Font f2=new Font("Monotype Corsiva",Font.PLAIN,24);
    l1.setFont(f2);
    Color c1=new Color(100,100,255);
    l1.setBackground(c1);    
    l2.setBounds(20,80,img2.getIconWidth(),img2.getIconHeight());
    l1.setBounds(img2.getIconWidth()+50,80,600,400);
    add(l2);add(l1);
   }
}

    
    