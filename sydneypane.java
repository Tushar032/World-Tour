import Sydney.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class sydneypane extends JFrame
{
  JTabbedPane p;
  sydneyattractions a1;
  sydneydescription a2;
  sydneyfacts a3;
  sydneymap a4;
  Container c;
  public sydneypane()
  {
    p=new JTabbedPane();
    a1=new sydneyattractions();
    a2=new sydneydescription();
    a3=new sydneyfacts();
    a4=new sydneymap();
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