package San;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class sandescription extends JPanel
{
  JLabel l1,l2;
  Icon img2;
  public sandescription()
  {
    setLayout(null);
    l1=new JLabel("<HTML><p>San Francisco came to life with the gold rush, caused by the discovery of gold in the Sierra Nevada foothills. In the 1930s with the construction of the Bay Bridge and Golden Gate Bridge, the city was connected to the bay area, now known for its numerous high-tech companies. San Francisco has a unique character with very distinct neighbourhoods, like SoMa, Chinatown, Japantown, Castro and Mission district.</p></HTML>");
    img2=new ImageIcon(getClass().getResource("/Images/golden-bridge.jpg"));
    l2=new JLabel(img2);
    Font f2=new Font("Monotype Corsiva",Font.PLAIN,24);
    l1.setFont(f2);
    Color c1=new Color(100,100,255);
    l1.setBackground(c1);    
    l2.setBounds(20,80,img2.getIconWidth(),img2.getIconHeight());
    l1.setBounds(img2.getIconWidth()+50,80,550,400);
    add(l2);add(l1);
   }
}

    
    