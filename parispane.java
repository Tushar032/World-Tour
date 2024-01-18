import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import Paris.*;
public class parispane extends JFrame
{
  JTabbedPane p;
  parisattractions a1;
  parisdescription a2;
  parisfacts a3;
  parismap a4;
  Container c;
  public parispane()
  {
    p=new JTabbedPane();
    a1=new parisattractions();
    a2=new parisdescription();
    a3=new parisfacts();
    a4=new parismap();
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