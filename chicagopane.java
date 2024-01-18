import Chicago.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class chicagopane extends JFrame
{
  JTabbedPane p;
  chicagoattractions a1;
  chicagodescription a2;
  chicagofacts a3;
  chicagomap a4;
  Container c;
  public chicagopane()
  {
    p=new JTabbedPane();
    a1=new chicagoattractions();
    a2=new chicagodescription();
    a3=new chicagofacts();
    a4=new chicagomap();
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