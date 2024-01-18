package San;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class sanmap extends JPanel
{
  Icon img;
  JLabel l1;
  public sanmap()
  {
    img=new ImageIcon(getClass().getResource("/Images/map-san.gif"));
    l1=new JLabel(img);
    l1.setBounds(500,500,img.getIconWidth(),img.getIconHeight());
    add(l1);
  }
}