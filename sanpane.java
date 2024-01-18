import San.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class sanpane extends JFrame
{
  JTabbedPane p;
  sanattractions a1;
  sandescription a2;
  sanfacts a3;
  sanmap a4;
  Container c;
  public sanpane()
  {
    p=new JTabbedPane();
    a1=new sanattractions();
    a2=new sandescription();
    a3=new sanfacts();
    a4=new sanmap();
    p.addTab("Description",a2);
    p.addTab("Facts",a3);
    p.addTab("Attractions",a1);
    p.addTab("Map",a4);
    c=getContentPane();
    c.add(p);
    pack();
    addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent w)
                    { dispose(); }
                    });
  }
}