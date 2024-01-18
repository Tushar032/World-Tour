package Paris;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class parisdescription extends JPanel
{
  JLabel l1,l2;
  Icon img2;
  public parisdescription()
  {
    setLayout(null);
    l1=new JLabel("<HTML><p>Paris is the capital and largest city in France, situated on the river Seine, in northern France. Today it is one of the world’s leading business and cultural centers, and its infl uences in politics,education, entertainment, media, fashion,science and the arts all contribute to its status as one of the world’s major global cities. Paris has many nicknames, but its most famous is “La Ville-Lumière”(“The City of Light”), a name it owes first to its fame as a centre of education and ideas during the Age of Enlightenment, and later to its early adoption of street lighting. September in Paris–everything comes out of summer vacation mode and a surge of energy falls over the city. The weather will still be lovely for the most part.</p></HTML>");
    img2=new ImageIcon(getClass().getResource("/Images/eiffel.jpg"));
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

    
    