package Rome;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class romedescription extends JPanel
{
  JLabel l1,l2;
  Icon img2;
  public romedescription()
  {
    setLayout(null);
    l1=new JLabel("<HTML><p>No city in the world equals the history of the Eternal City. Founded 2700 years ago, Rome long reigned as Caput Mundi, or Capital of the World. Monumental buildings like the Colosseum are reminiscent of the era when emperors like Nero and Trajan ruled the Roman Empire. But today's Rome owes much of its attractiveness to the Renaissance period when new squares such as the Piazza del Campidoglio were created and new buildings were constructed including the world's largest church, the Saint Peter's Basilica.</p></HTML>");
    img2=new ImageIcon(getClass().getResource("/Images/church.jpg"));
    l2=new JLabel(img2);
    Font f2=new Font("Monotype Corsiva",Font.PLAIN,26);
    l1.setFont(f2);
    Color c1=new Color(100,100,255);
    l1.setBackground(c1);    
    l2.setBounds(20,80,img2.getIconWidth(),img2.getIconHeight());
    l1.setBounds(img2.getIconWidth()+60,80,500,500);
    add(l2);add(l1);
   }
}

    
    