package Barcelona;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class barcelonaattractions extends JPanel implements ActionListener
{
  int i=1;
  JLabel l1;
  JLabel j2;
  JButton b1,b2;
  ImageIcon im1;
  public barcelonaattractions()
  {
    setLayout(null);
    im1=new ImageIcon(getClass().getResource("/Images/montjuic.jpg"));
    j2=new JLabel(im1);
    l1=new JLabel("<HTML><br> <br>1. Montjuïc<p>The Montjuïc is a hill located near the center of Barcelona. It features a large number of attractions including the Spanish Village, the Magic Fountain and MNAC, one of the city's most important museums. Today the Montjuïc is a mostly recreational area with a large number of sights and attractions, most of them originating from two major events that took place here: the 1929 International Exhibition and the 1992 Olympics. At the center of a plaza in front of the Palau Nacional is the Font Màgica or Magic Fountain, an impressive fountain built for the same exhibition that was held here in 1929. The oldest sight on the Montjuïc is the Castell de Montjuïc, a large 18th century fortress.</p></HTML>");
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
    if(i==8)
            i=1;
    if(i==0)
            i=7;
    switch(i)
    {
       case 1: l1.setText("<HTML><br><br>1. Montjuïc<p>The Montjuïc is a hill located near the center of Barcelona. It features a large number of attractions including the Spanish Village, the Magic Fountain and MNAC, one of the city's most important museums. Today the Montjuïc is a mostly recreational area with a large number of sights and attractions, most of them originating from two major events that took place here: the 1929 International Exhibition and the 1992 Olympics. At the center of a plaza in front of the Palau Nacional is the Font Màgica or Magic Fountain, an impressive fountain built for the same exhibition that was held here in 1929. The oldest sight on the Montjuïc is the Castell de Montjuïc, a large 18th century fortress.</p></HTML>");
               im1=new ImageIcon(getClass().getResource("/Images/montjuic.jpg"));
               j2.setIcon(im1);
               break;
      case 2: l1.setText("<HTML><br><br>2. Sagrada Família<p>The Sagrada Família, Antoni Gaudí's unfinished masterpiece, is one of Barcelona's most popular tourist attractions. Construction on this church will continue for at least another decade, but it has already become Barcelona's most important landmark. Even though the Sagrada Família is far from finished, the remarkable church is well worth a visit. You can visit the crypt were Gaudí is buried as well as the transept and central nave with its giant, tree-like pillars and spectacular vaulting. A museum narrates the history of the church and tells the story of its great architect. You can also visit the towers. An elevator and a long walk will lead you to the top of a tower from where you have a magnificent view over Barcelona. The climb is not recommended for those with fear of heights or for people with claustrophobia!</p></HTML>");
               im1=new ImageIcon(getClass().getResource("/Images/sagrada.jpg"));
               j2.setIcon(im1);
               break;
      case 3: l1.setText("<HTML><br><br>3. Casa Milà<p>Casa Milà, commonly known as La Pedrera is the largest civil building designed by Antoni Gaudí. The apartment block was constructed between 1906 and 1910. It was Gaudí's last work before devoting himself to the construction of theSagrada Família. The building does not use load-bearing walls, but rest on pillars and arches. Together with the use of steel this allowed the architect to create completely irregular floor plans. Even the height of the pillars and ceilings differ from one to another. The roof is probably the most intriguing part of the building. It features a number of surrealistic colorful chimneys. Many of them look like warriors in a science fiction movie, others look more frivolous. The roof also features a bench similar to the one in Parc Güell. From the top of Casa Milà, you have a nice view over the Eixample district.</p></HTML>"); 
               im1=new ImageIcon(getClass().getResource("/Images/casa-mila.jpg"));
               j2.setIcon(im1);
               break;
      case 4: l1.setText("<HTML><br><br>4. Plaça de Catalunya<p>The Plaça de Catalunya, a large plaza surrounded by monumental buildings, is Barcelona's busiest square. It is located between the old city (Ciutat Vella) and the nineteenth century Eixample district. Even though the square is enormous in size, it is constantly crowded with people walking to and from one of the nine streets emanating from the square. The benches at the oval shaped center of the square are ideal for people-watching. A single row of trees surrounds this area, shielding it from the traffic heavy streets. To the north are a couple of large circular fountains that are illuminated at night. The Plaça de Catalunya functions as a hub for the city's public transportation. Below the square is the main subway junction; three metro lines and a city railway line meet here.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/catalunya.jpg"));
	      j2.setIcon(im1);
              break;
      case 5: l1.setText("<HTML><br><br>5. Magic Fountain<p>The Font Màgica or Magic fountain is a large fountain built in 1929. When the fountain is active, it constantly changes color and shape. The fountain was part of a project built for the 1929 Universal Exhibition. The exhibition took place on Montjuïc, a hill just southwest of Barcelona's city center. During the summertime on selected evenings, when the fountain is activated, it attracts hundreds of visitors who watch the spectacular display of light, water and music. At the same time, the Palau National is illuminated, providing a beautiful background. The show runs for about thirty minutes. The start and end date depend on the time of the year, but the best time to see the fountain is at sunset.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/magic-fountain.jpg"));
              j2.setIcon(im1);
              break;
      case 6: l1.setText("<HTML><br><br>6. Arenas de Barcelona<p>The Arenas de Barcelona is a former bullring turned commercial complex near the Plaça d'Espanya. From the publicly accessible rooftop visitors have amazing views over the city. The arena, which has a diameter of 52 meters (171 ft), could seat up to 16,000 spectators. Besides bullfights, the arena also played host to a number of concerts; the Beatles even performed here in 1966. For decades, the arenas de Barcelona stood empty and it took until 1999 before plans were launched to turn the arena into a modern shopping and entertainment center. The new Arenas de Barcelona opened in March 2011. The original façade is mostly intact and encircles a modern domed complex with eateries, shops, movie theaters and a Rock Museum, all spread over six floors.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/arenas.jpg"));
              j2.setIcon(im1);
              break;
      case 7: l1.setText("<HTML><br><br>7. Arc de Triomf<p>The Arc de Triomf is a triumphal arch built with colorful brickwork in Mudéjar style. The arch, designed by the Modernista architect Josep Vilaseca, is adorned with a large number of statues and reliefs. The arch measures thirty meters tall and is abundantly decorated on all sides with stone carvings and ceramic tiles. The front frieze by Josep Reynés shows the city of Barcelona welcoming visitors. The other side, designed by Josep Llimona, shows a prize-giving ceremony. The arch is embellished with a stone carving of the Spanish coat of arms. It is flanked by two roaring lions an topped with a crown. The arch is also adorned with twelve allegorical statues of women, symbolizing fame. The Arc de Triomf is located at the Passeig Lluis Companys and can be easily reached via the metro stop 'Arc de Triomf'.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/arc-triomf.jpg"));
              j2.setIcon(im1);
              break;
      }
   }
}
