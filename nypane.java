import NewYork.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class nypane extends JFrame
{
  JTabbedPane p2;
  nyattractions a1;
  nydescription a2;
  nyfacts a3;
  nymap a4;
  Container c;
  public nypane()
  {
    setTitle("New York");
    Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
    setSize(900,500);
    int x=(int)((d.getWidth()-900)/2);
    int y=(int)((d.getHeight()-500)/2);
    setLocation(x,y);
    setVisible(true);
    p2=new JTabbedPane();
    a1=new nyattractions();
    a2=new nydescription();
    a3=new nyfacts();
    a4=new nymap();
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