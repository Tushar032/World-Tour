import Rome.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class romepane extends JFrame
{
  JTabbedPane p2;
  romeattractions a1;
  romedescription a2;
  romefacts a3;
  romemap a4;
  Container c;
  public romepane()
  {
    Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
    setSize(900,500);
    int x=(int)((d.getWidth()-900)/2);
    int y=(int)((d.getHeight()-500)/2);
    setLocation(x,y);
    setVisible(true);
    p2=new JTabbedPane();
    a1=new romeattractions();
    a2=new romedescription();
    a3=new romefacts();
    a4=new romemap();
    p2.add("Description",a2);
    p2.add("Facts",a3);
    p2.add("Attractions",a1);
    p2.add("Map",a4);
    c=getContentPane();
    c.add(p2);
    pack();
    addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent w)
                    { dispose(); }
                    });
  }
}