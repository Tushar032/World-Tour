import HongKong.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class hongkongpane extends JFrame
{
  JTabbedPane p;
  hongkongattractions a1;
  hongkongdescription a2;
  hongkongfacts a3;
  hongkongmap a4;
  Container c;
  public hongkongpane()
  {
    p=new JTabbedPane();
    a1=new hongkongattractions();
    a2=new hongkongdescription();
    a3=new hongkongfacts();
    a4=new hongkongmap();
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