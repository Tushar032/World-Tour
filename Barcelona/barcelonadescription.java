package Barcelona;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class barcelonadescription extends JPanel
{
  JLabel l1,l2;
  Icon img2;
  public barcelonadescription()
  {
    setLayout(null);
    l1=new JLabel("<HTML><p>Barcelona, the capital of Catalonia, is one of the most popular tourist destinations in Europe. The city combines modern and historic architecture in a unique way. The modernist movement of which Gaudí was the most prominent exponent left its mark on the city with magnificent buildings like the Sagrada Familia,Casa Milà and Casa Batlló.</p></HTML>");
    img2=new ImageIcon(getClass().getResource("/Images/sagrada.jpg"));
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

    
    