package Zurich;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class zurichmap extends JPanel
{
  Icon img;
  JLabel l1;
  public zurichmap()
  {
    img=new ImageIcon(getClass().getResource("/Images/map-zurich.gif"));
    l1=new JLabel(img);
    l1.setBounds(500,500,img.getIconWidth(),img.getIconHeight());
    add(l1);
  }
}