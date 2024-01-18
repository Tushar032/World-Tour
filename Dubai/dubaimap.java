package Dubai;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class dubaimap extends JPanel
{
  Icon img;
  JLabel l1;
  public dubaimap()
  {
    setLayout(null);
    img=new ImageIcon(getClass().getResource("/Images/dubai-map.jpg"));
    l1=new JLabel(img);
    l1.setBounds(500,200,img.getIconWidth(),img.getIconHeight());
    add(l1);
  }
}