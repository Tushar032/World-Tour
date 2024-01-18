package Paris;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class parismap extends JPanel
{
  Icon img;
  JLabel l1;
  public parismap()
  {
    img=new ImageIcon(getClass().getResource("/Images/map_eu_to_paris.gif"));
    l1=new JLabel(img);
    l1.setBounds(500,500,img.getIconWidth(),img.getIconHeight());
    add(l1);
  }
}