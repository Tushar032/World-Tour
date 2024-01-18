package Paris;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class parisattractions extends JPanel implements ActionListener
{
  int i=1;
  JLabel l1;
  JLabel j2;
  JButton b1,b2;
  ImageIcon im1;
  public parisattractions()
  {
    setLayout(null);
    im1=new ImageIcon(getClass().getResource("/Images/eiffel.jpg"));
    j2=new JLabel(im1);
    l1=new JLabel("<HTML><br> <br>1. Eiffel Tower<p>Once the tallest structure in the world, the Eiffel Tower is probably Europe's best known landmark and Paris's most famous symbol.You couldn't possibly visit Paris without seeing the Eiffel Tower. Even if you do not want to visit this world famous structure, you will see its top from all over Paris. The tower rises 300 meters tall (984 ft),when it was completed at the end of the 19th century it was twice as high as theWashington Monument, at the time the tallest structure in the world.The Eiffel Tower was built for the World Exhibition in 1889,held in celebration of the French Revolution in 1789.and one could not imagine Paris without the Eiffel Tower, in fact it has become the symbol of the City of Light.</p></HTML>");
    Font f2=new Font("Monotype Corsiva",Font.PLAIN,24);
    l1.setFont(f2);
    b1=new JButton("Previous");
    b2=new JButton("Next");
    add(j2,BorderLayout.EAST);add(l1,BorderLayout.WEST);add(b1);add(b2);
    j2.setBounds(20,80,im1.getIconWidth(),im1.getIconHeight());
    l1.setBounds(im1.getIconWidth()+40,60,690,480);
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
    if(i==12)
            i=1;
    if(i==0)
            i=11;
    switch(i)
    {
       case 1: l1.setText("<HTML><br><br>1. Eiffel Tower<p>Once the tallest structure in the world, the Eiffel Tower is probably Europe's best known landmark and Paris's most famous symbol.You couldn't possibly visit Paris without seeing the Eiffel Tower. Even if you do not want to visit this world famous structure, you will see its top from all over Paris. The tower rises 300 meters tall (984 ft),when it was completed at the end of the 19th century it was twice as high as theWashington Monument, at the time the tallest structure in the world.The Eiffel Tower was built for the World Exhibition in 1889,held in celebration of the French Revolution in 1789.and one could not imagine Paris without the Eiffel Tower, in fact it has become the symbol of the City of Light.</p></HTML>");
               im1=new ImageIcon(getClass().getResource("/Images/eiffel.jpg"));
               j2.setIcon(im1);
               break;
      case 2: l1.setText("<HTML><br><br>2. The Louvre<p>The Louvre, originally a royal palace but now the world's most famous museum, is a must-visit for anyone with a slight interest in art. Some of the museum's most celebrated works of art include the Mona Lisa and the Venus of Milo. The collection of the Louvre Museum was first established in the 16th century as the private collection of King Francis I. One of the works of art he purchased was the now famous Mona Lisa painting. The collection grew steadily thanks to donations and purchases by the kings. In 1793, during the French Revolution, the Louvre became a national art museum and the private royal collection opened to the public.The museum has a collection of over 1 million works of art, of which about 35 000 are on display, spread out over three wings of the former palace. The museum has a diverse collection ranging from the Antiquity upto the mid 19th century.</p></HTML>");
               im1=new ImageIcon(getClass().getResource("/Images/theLouvre.jpg"));
               j2.setIcon(im1);
               break;
      case 3: l1.setText("<HTML><br><br>3. Notre Dame Cathedral<p>The site of the Notre dame is the cradle of Paris and has always been the religious center of the city. The Celts had their sacred ground here, the Romans built a temple to worship Jupiter. A Christian basilica was built in the 6th century and the last religious structure before the Notre-Dame construction started was a Romanesque church.</p></HTML>"); 
               im1=new ImageIcon(getClass().getResource("/Images/Notre-Dame-Cathedral.jpg"));
               j2.setIcon(im1);
               break;
      case 4: l1.setText("<HTML><br><br>4. Sacré-Coeur Basilica<p>The Sacré-Coeur Basilica is one of Paris's major tourist draws. The majestic building is located on top of the Montmartre hill. The project to build the Sacré-Coeur Basilica(Basilica of the Sacred Heart) was initiated by a group of influential people. Their reasons to build this monument was two-fold: they had pledged to build a church if Paris escaped unscathed from the war with the Prussians and they saw the defeat of the French at the hands of the Prussian army in 1870 as a moral condemnation of the sins of Paris.The project was authorized by the National Assembly in 1873, and a competition was organized. The goal was to build an imposing basilica true to Christian traditions.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/Sacre-Coeur-Basilica.jpg"));
	      j2.setIcon(im1);
              break;
      case 5: l1.setText("<HTML><br><br>5. Arc de Triomphe<p>The arch was commissioned by Napoleon in 1806 to commemorate his victories, but he was ousted before the arch was completed. In fact, it wasn't completed until 1836 during the reign of Louis-Philippe. The Arc de Triomphe is engraved with names of generals who commanded French troops during Napoleon's regime. The arch is located at the end of the Champs-Elysées, in the middle of the Place Charles de Gaulle, a large circular square from which no less than 12 streets emanate. The streets are named after French military leaders.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/parisfree_arc.jpg"));
              j2.setIcon(im1);
              break;
      case 6: l1.setText("<HTML><br><br>6. Versailles Palace<p>The town of Versailles sits about 20 kilometers outside of Paris. The first mention of the town and estate was in 1038, when the name appeared in a charter of the Abbey of Saint-Père de Chartres. By the end of the 11th century, Versailles was a country village enveloping a castle and the church of Saint-Julien, remaining prosperous until well into the 13th century. After the Hundred Years War, however, only a handful of people lived there. At 100 hectare (about 250 acre), the garden of the Versailles Palace is Europe's largest palace garden.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/Versailees-palace.jpg"));
              j2.setIcon(im1);
              break;
      case 7: l1.setText("<HTML><br><br>7. Jardin du Luxembourg<p>The Jardin du Luxembourg is probably the most popular park in Paris. The park, 22,45 hectare large (about 55 acres), was originally owned by the duke of Luxemburg, hence the name. The domain was purchased in 1612 by Marie de' Medici, mother of Louis XIII.The Jardin du Luxembourg features two noteworthy fountains. The most famous one is the Fontaine Médicis, a romantic Baroque fountain designed in the early 17th century. It is located at the end of a small pond at the northeast side of the park. At the southern end of the park, at an extension known as the Jardins de l'Observatoire, is another fountain.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/Luxembourg.jpg"));
              j2.setIcon(im1);
              break;
      case 8: l1.setText("<HTML><br><br>8. Pont Alexandre III<p>Most people consider the 19th century Pont Alexandre III the most beautiful bridge in Paris. It is without a doubt the city's most opulently decorated bridge. The bridge was built at the end of the 19th century as part of a series of projects undertaken for the Universal Exposition of 1900. The exposition took place on either side of the Seine river and the new bridge would enable the millions of visitors to more easily cross the river. The bridge is lavishly decorated with lampposts and sculptures of cherubs and nymphs. On each end of the Pont Alexandre III are large gilded statues on 17 meters (56 ft) high granite pillars. Each of the ornaments on the bridge was created by a different artist.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/Pont-Alexandre-III.jpg"));
              j2.setIcon(im1);
              break;
      case 9: l1.setText("<HTML><br><br>9. The Panthéon<p>The Panthéon, an imposing 19th century building, was first designed as a church, but later turned into a civil temple.As far back as 507, this site was chosen by King Clovis - the first Frankish Merovingian King - for a basilica to serve as a tomb for him and his wife Clothilde. In 512 Sainte-Geneviève, patroness of Paris was buried here.The large crypt, covering the whole surface of the building accommodates the vaults of great French public figures. Some of the most famous buried here are Victor Hugo, Voltaire, Jean Monnet, Marie and Pierre Curie and Emile Zola.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/ParisPantheon.jpg"));
              j2.setIcon(im1);
              break;
      case 10: l1.setText("<HTML><br><br>10. Place de la Concorde<p>At 8 hectares (20 acres), the octagonal Place de la Concorde is the largest square in Paris. In 1763, a large statue of king Louis XV was erected at the site to celebrate the recovery of the king after a serious illness. The square surrounding the statue was created later, in 1772, by the architect Jacques-Ange Gabriel. It was known as the place Louis XV. At each corner of the octagonal square is a statue representing a French city: Bordeaux, Brest, Lille, Lyon, Marseille, Nantes, Rouen and Strasbourg. They were installed in 1836 by Jacob Ignaz Hittorf, who redesigned the Place de la Concorde between 1833 and 1846.</p></HTML>"); 
              im1=new ImageIcon(getClass().getResource("/Images/paris1.jpg"));
              j2.setIcon(im1);
              break;
      case 11: l1.setText("<HTML><br><br>11. Musée d'Orsay<p>The Musée d'Orsay is a museum housed in a grand railway station built in 1900. Home to many sculptures and impressionist paintings, it has become one of Paris's most popular museums.When it opened the museum contained some 2300 paintings, 1500 sculptures and 1000 other objects. Most of these works of art came from other museums such as the Musée du Luxembourg. Over time the collection has expanded significantly mainly due to acquisitions and gifts. It covers a period from the mid 19th century up to 1914 and contains works from Degas, Rodin, Monet, Manet, Renoir, Cezanne, van Gogh and others.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/Musee-D-Orsay.jpg"));
	      j2.setIcon(im1);
              break;
      }
   }
}
