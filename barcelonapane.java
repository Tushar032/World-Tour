import Barcelona.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class barcelonapane extends JFrame
{
  JTabbedPane p;
  barcelonaattractions a1;
  barcelonadescription a2;
  barcelonafacts a3;
  barcelonamap a4;
  Container c;
  public barcelonapane()
  {
    p=new JTabbedPane();
    a1=new barcelonaattractions();
    a2=new barcelonadescription();
    a3=new barcelonafacts();
    a4=new barcelonamap();
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