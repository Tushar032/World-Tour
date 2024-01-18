import London.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class london_pane extends JFrame
{
  JTabbedPane p2;
  london_attractions a1;
  london_description a2;
  london_facts a3;
  london_map a4;
  Container c;
  public london_pane()
  {
    Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
    setSize(900,500);
    int x=(int)((d.getWidth()-900)/2);
    int y=(int)((d.getHeight()-500)/2);
    setLocation(x,y);
    setVisible(true);
    p2=new JTabbedPane();
    a1=new london_attractions();
    a2=new london_description();
    a3=new london_facts();
    a4=new london_map();
    p2.add("Description",a2);
    p2.add("Facts",a3);
    p2.add("Attractions",a1);
    p2.add("Map",a4);
    c=getContentPane();
    c.add(p2);
    pack();
    addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent w)
                    { dispose(); }
                    });
  }
}