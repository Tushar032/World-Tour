package NewYork;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class nymap extends JPanel
{
  Icon img;
  JLabel l1;
  public nymap()
  {
    img=new ImageIcon(getClass().getResource("/Images/map-ny.gif"));
    l1=new JLabel(img);
    l1.setBounds(500,200,img.getIconWidth(),img.getIconHeight());
    add(l1);
  }
}