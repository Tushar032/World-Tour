package Zurich;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class zurichattractions extends JPanel implements ActionListener
{
  int i=1;
  JLabel l1;
  JLabel j2;
  JButton b1,b2;
  ImageIcon im1;
  public zurichattractions()
  {
    setLayout(null);
    im1=new ImageIcon(getClass().getResource("/Images/lindenhof.jpg"));
    j2=new JLabel(im1);
    l1=new JLabel("<HTML><br> <br>1. Lindenhof<p>The Lindenhof in the old town of Zürich is the historical site of the Roman castle, and the later Carolingian Kaiserpfalz. It is situated on the Lindenhof hill, on the left side of the Limmat River at the Schipfe. The Lindenhof remained a place of civil assembly into modern times. In 1798, the citizens of Zurich swore the oath to the constitution of the Helvetic Republic on the Lindenhof. In 1851 the Masonic Lodge 'Modestia cum Libertate' (1771) bought the residence 'Zum Paradies' and built a masonic building on the southern end of the square. In the early 21st century, it serves as a recreational space, a green oasis, and automobile free space in the old historic city center. Its elevated position makes it a favorite point for tourists to get an overview of the geography of old Zurich. During the local holiday of Sechselauten in April, the Lindenhof serves as the base of operations for whichever canton is the 'guest-Canton' for that year.</p></HTML>");
    Font f2=new Font("Monotype Corsiva",Font.PLAIN,24);
    l1.setFont(f2);
    b1=new JButton("Previous");
    b2=new JButton("Next");
    add(j2,BorderLayout.EAST);add(l1,BorderLayout.WEST);add(b1);add(b2);
    j2.setBounds(20,80,im1.getIconWidth(),im1.getIconHeight());
    l1.setBounds(im1.getIconWidth()+40,60,650,500);
    b1.setBounds(im1.getIconWidth()+80,550,100,30);
    b2.setBounds(im1.getIconWidth()+80+400,550,100,30);
    b1.addActionListener(this);
    b2.addActionListener(this);    
  }
  public void actionPerformed(ActionEvent ae)
  {
    if(ae.getSource()==b2)
    {
       i++;
    }
    if(ae.getSource()==b1)
    {
       i--;
    }
    if(i==7)
            i=1;
    if(i==0)
            i=6;
    switch(i)
    {
       case 1: l1.setText("<HTML><br><br>1. Lindenhof<p>The Lindenhof in the old town of Zürich is the historical site of the Roman castle, and the later Carolingian Kaiserpfalz. It is situated on the Lindenhof hill, on the left side of the Limmat River at the Schipfe. The Lindenhof remained a place of civil assembly into modern times. In 1798, the citizens of Zurich swore the oath to the constitution of the Helvetic Republic on the Lindenhof. In 1851 the Masonic Lodge 'Modestia cum Libertate' (1771) bought the residence 'Zum Paradies' and built a masonic building on the southern end of the square. In the early 21st century, it serves as a recreational space, a green oasis, and automobile free space in the old historic city center. Its elevated position makes it a favorite point for tourists to get an overview of the geography of old Zurich. During the local holiday of Sechselauten in April, the Lindenhof serves as the base of operations for whichever canton is the 'guest-Canton' for that year.</p></HTML>");
               im1=new ImageIcon(getClass().getResource("/Images/lindenhof.jpg"));
               j2.setIcon(im1);
               break;
      case 2: l1.setText("<HTML><br><br>2. Kunsthaus<p>The Kunsthaus Zurich houses one of the most important art collections in Switzerland and Europe,  assembled over the years by the local art association called Zurcher Kunstgesellschaft. The collection spans from the Middle Ages to contemporary art, with an emphasis on Swiss art. Kunsthaus is also the name of the tram stop next to the museum, properly on Pfauenplatz, between the museum building and the Schauspielhaus Zurich. The museum's collection includes works from Edvard Munch, Jacques Lipchitz and Alberto Giacometti. Swiss artists such as Johann Heinrich Fussli, Ferdinand Hodler or from recent times, Pipilotti Rist and Peter Fischli are also represented.</p></HTML>");
               im1=new ImageIcon(getClass().getResource("/Images/kunsthaus.jpg"));
               j2.setIcon(im1);
               break;
      case 3: l1.setText("<HTML><br><br>3. Fraumunster<p>The Fraumunster Church in Zurich is built on the remains of a former abbey for aristocratical women which was founded in 853 by Louis the German for his daughter Hildegard. The choir of the abbey includes 5 large stained glass windows designed by artist Marc Chagall and installed in 1970. Each of the 5 has a dominant color and depicts a Christian story. From left (northern wall) to right, the 5 works are:<br>• Prophets, depicting Elijah's ascent to heaven<br>• Jacob, displaying his combat, and dreams of heaven<br>• Christ, illustrating various scenes of Christ's life<br>• Zion, showing an angel trumpeting the end of the world<br>• Law, with Moses looking down upon the suffering of his people</p></HTML>"); 
               im1=new ImageIcon(getClass().getResource("/Images/zurich-church.jpg"));
               j2.setIcon(im1);
               break;
      case 4: l1.setText("<HTML><br><br>4. St. Peter, Zurich<p>St. Peter is one of the four main churches of the old town of Zurich, Switzerland, besides Grossmunster, Fraumunster and Predigerkirche. Located next to the Lindenhof hill, site of the former Roman castle, it was built on the site of a temple to Jupiter. An early church of 10 by 7 metres is archaeologically attested for the 8th or 9th century. This building was replaced by an early Romanesque church around AD 1000, in turn replaced in 1230 by a late romanesque structure, parts of which survive. Rudolf Brun, first independent mayor of the town, was buried here in 1360. The nave was rebuilt in 1460 in Gothic style. Prior to the reformation, St. Peter was the only parish church of the town, the rest being part of monasteries.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/stpeter.jpg"));
	      j2.setIcon(im1);
              break;
      case 5: l1.setText("<HTML><br><br>5. Lake Zurich<p>Lake Zurich is a lake in Switzerland, extending southeast of the city of Zurich. It lies approximately at co-ordinates 47:15:N 8:41:E / 47:250:N 8:683:E. The large masonry dam (the Seedamm), carrying a railway line and road from Rapperswil to Pfaffikon, divides the lake. The eastern section of the lake is known as the Obersee, German for 'upper lake'. West of this dam lie the small islands of Lutzelau and Ufenau, where in 1523 Ulrich von Hutten took refuge and died. Both shores are well cultivated and fertile. Lake Zurich's water is very clean and reaches, during summer, temperatures well beyond 20 degree C. Swimming in the public baths andbeaches is very popular. The lake's water is purified and fed into Zurich's water system, it is potable.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/lake-zurich.jpg"));
              j2.setIcon(im1);
              break;
      case 6: l1.setText("<HTML><br><br>6. Rhine Falls<p>The Rhine Falls (Rheinfall in German) is the largest plain waterfall in Europe. The falls are located on the Upper Rhine between the municipalities of Neuhausen am Rheinfall and Laufen-Uhwiesen, near the town of Schaffhausen in northern Switzerland, between the cantons of Schaffhausen and Zurich. They are 150 m (450 ft) wide and 23 m (75 ft) high. In the winter months, the average water flow is 250 m3/s, while in the summer, the average water flow is 700 m3/s. The highest flow ever measured was 1,250 m2/s in 1965 and the lowest, 95 m3/s in 1921.The falls cannot be climbed by fish, except by eels that are able to worm their way up over the rocks.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/rhein-falls.jpg"));
              j2.setIcon(im1);
              break;
      }
   }
}
