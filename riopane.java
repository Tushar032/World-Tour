import Rio.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class riopane extends JFrame
{
  JTabbedPane p;
  rioattractions a1;
  riodescription a2;
  riofacts a3;
  riomap a4;
  Container c;
  public riopane()
  {
    p=new JTabbedPane();
    a1=new rioattractions();
    a2=new riodescription();
    a3=new riofacts();
    a4=new riomap();
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