package Amsterdam;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class amsterdammap extends JPanel
{
  Icon img;
  JLabel l1;
  public amsterdammap()
  {
    img=new ImageIcon(getClass().getResource("/Images/map-amsterdam.gif"));
    l1=new JLabel(img);
    l1.setBounds(500,500,img.getIconWidth(),img.getIconHeight());
    add(l1);
  }
}