import Dubai.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class dubaipane extends JFrame
{
  JTabbedPane p;
  dubaiattractions a1;
  dubaidescription a2;
  dubaifacts a3;
  dubaimap a4;
  Container c;
  public dubaipane()
  {
    p=new JTabbedPane();
    a1=new dubaiattractions();
    a2=new dubaidescription();
    a3=new dubaifacts();
    a4=new dubaimap();
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