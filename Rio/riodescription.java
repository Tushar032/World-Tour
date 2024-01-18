package Rio;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class riodescription extends JPanel
{
  JLabel l1,l2;
  Icon img2;
  public riodescription()
  {
    setLayout(null);
    l1=new JLabel("<HTML><p>Rio de Janeiro  commonly referred to simply as Rio, is the capital city of the State of Rio de Janeiro, the second largest city of Brazil, and the third largest metropolitan area and agglomeration in South America, boasting approximately 6.3 million people within the city proper, making it the 6th largest in the Americas, and 26th in the world. Rio de Janeiro is one of the most visited cities in the southern hemisphere and is known for its natural settings, carnival celebrations, samba, Bossa Nova, balneario beaches  such as Barra da Tijuca, Copacabana, Ipanema, and Leblon. The 2016 Summer Olympics and the Paralympics will take place in Rio de Janeiro.</p></HTML>");
    img2=new ImageIcon(getClass().getResource("/Images/corcovado.jpg"));
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

    
    