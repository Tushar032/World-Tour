package London;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class london_map extends Panel
{
  Icon img;
  JLabel l1;
  public london_map()
  {
    img=new ImageIcon(getClass().getResource("/Images/map-to-london.gif"));
    l1=new JLabel(img);
    l1.setBounds(500,500,img.getIconWidth(),img.getIconHeight());
    add(l1);
  }
}