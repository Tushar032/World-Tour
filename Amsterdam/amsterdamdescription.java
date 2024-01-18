package Amsterdam;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class amsterdamdescription extends JPanel
{
  JLabel l1,l2;
  Icon img2;
  public amsterdamdescription()
  {
    setLayout(null);
    l1=new JLabel("<HTML><p>Amsterdam is the capital of the Netherlands, even though neither the Dutch government nor the head of state resides in Amsterdam. The largest city in the Netherlands is also the country's biggest tourist-draw. Most of Amsterdam's top attractions date from the city's heyday during the seventeenth century when it was a financial and political powerhouse. Most of the cities' famous canals and harmonious architecture stems from this era.</p></HTML>");
    img2=new ImageIcon(getClass().getResource("/Images/central-station.jpg"));
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

    
    