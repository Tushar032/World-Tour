import Zurich.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class zurichpane extends JFrame
{
  JTabbedPane p;
  zurichattractions a1;
  zurichdescription a2;
  zurichfacts a3;
  zurichmap a4;
  Container c;
  public zurichpane()
  {
    p=new JTabbedPane();
    a1=new zurichattractions();
    a2=new zurichdescription();
    a3=new zurichfacts();
    a4=new zurichmap();
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