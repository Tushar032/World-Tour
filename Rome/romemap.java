package Rome;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class romemap extends JPanel
{
  Icon img;
  JLabel l1;
  public romemap()
  {
    img=new ImageIcon(getClass().getResource("/Images/map-rome.gif"));
    l1=new JLabel(img);
    l1.setBounds(500,200,img.getIconWidth(),img.getIconHeight());
    add(l1);
  }
}