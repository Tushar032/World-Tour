import Amsterdam.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class amsterdampane extends JFrame
{
  JTabbedPane p;
  amsterdamattractions a1;
  amsterdamdescription a2;
  amsterdamfacts a3;
  amsterdammap a4;
  Container c;
  public amsterdampane()
  {
    p=new JTabbedPane();
    a1=new amsterdamattractions();
    a2=new amsterdamdescription();
    a3=new amsterdamfacts();
    a4=new amsterdammap();
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