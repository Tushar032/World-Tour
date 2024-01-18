package Zurich;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class zurichdescription extends JPanel
{
  JLabel l1,l2;
  Icon img2;
  public zurichdescription()
  {
    setLayout(null);
    l1=new JLabel("<HTML><p>Zurich is the largest city in Switzerland and the capital of the canton of Zurich. It is located in north-central Switzerland at the northwestern tip of Lake Zurich. The municipality has approximately 390,000 inhabitants, and the Zurich metropolitan area 1.83 million. Zurich is a hub for railways, roads, and air traffic. Both Zurich Airport and railway station are the largest and busiest in the country. Zurich is a leading global city and among the world's largest financial centres. The city is home to a large number of financial institutions and banking giants. Also, most of the research and development centres are concentrated in Zurich.</p></HTML>");
    img2=new ImageIcon(getClass().getResource("/Images/lindenhof2.jpg"));
    l2=new JLabel(img2);
    Font f2=new Font("Monotype Corsiva",Font.PLAIN,24);
    l1.setFont(f2);
    Color c1=new Color(100,100,255);
    l1.setBackground(c1);    
    l2.setBounds(20,80,img2.getIconWidth(),img2.getIconHeight());
    l1.setBounds(img2.getIconWidth()+50,80,550,400);
    add(l2);add(l1);
   }
}

    
    