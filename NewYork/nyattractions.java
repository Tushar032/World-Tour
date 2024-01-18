package NewYork;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class nyattractions extends JPanel implements ActionListener
{
  int i=1;
  JLabel l1;
  JLabel j2;
  JButton b1,b2;
  ImageIcon im1;
  public nyattractions()
  {
    setLayout(null);
    l1=new JLabel("<HTML><br>1. Statue of Liberty<p>For the many immigrants who flocked from Europe to New York, the Statue of Liberty was the first image they saw of the USA. The statue was a gift from the French government for the 100th anniversary of America's Independence. The crown of Lady Liberty, as the statue is often affectionately called, has seven spikes, symbolizing the Seven Seas across which liberty should be spread. In her left hand she holds a tablet with the Declaration of Independence and in her right hand a torch, symbolizing Enlightenment. The statue's steel framework was made by the French engineer Gustave Eiffel, better known as the man behind the Eiffel Tower in Paris. The Statue of Liberty is 46,5 meters (151ft) tall and together with the pedestal it reaches a height of 93 meters (305ft). You can take the staircase inside the statue and walk all the way up the 354 steps to the crown from where you have a nice view over New York City.</p></HTML>");
    Font f2=new Font("Monotype Corsiva",Font.PLAIN,22);
    l1.setFont(f2);
    Color c1=new Color(0,0,255);
    l1.setBackground(c1);
    im1=new ImageIcon(getClass().getResource("/Images/statue-of-liberty.jpg"));
    j2=new JLabel(im1);
    b1=new JButton("Previous");
    b2=new JButton("Next");
    add(j2);add(l1);add(b1);add(b2);
    j2.setBounds(20,80,im1.getIconWidth(),im1.getIconHeight());
    l1.setBounds(im1.getIconWidth()+30,80,600,480);
    b1.setBounds(im1.getIconWidth()+50,530,100,30);
    b2.setBounds(im1.getIconWidth()+50+300,530,100,30);
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
    if(i==9)
            i=1;
    if(i==0)
            i=8;
    switch(i)
    {
       case 1: l1.setText("<HTML><br>1. Statue of Liberty<p>For the many immigrants who flocked from Europe to New York, the Statue of Liberty was the first image they saw of the USA. The statue was a gift from the French government for the 100th anniversary of America's Independence. The crown of Lady Liberty, as the statue is often affectionately called, has seven spikes, symbolizing the Seven Seas across which liberty should be spread. In her left hand she holds a tablet with the Declaration of Independence and in her right hand a torch, symbolizing Enlightenment. The statue's steel framework was made by the French engineer Gustave Eiffel, better known as the man behind the Eiffel Tower in Paris. The Statue of Liberty is 46,5 meters (151ft) tall and together with the pedestal it reaches a height of 93 meters (305ft). You can take the staircase inside the statue and walk all the way up the 354 steps to the crown from where you have a nice view over New York City.</p></HTML>");
               im1=new ImageIcon(getClass().getResource("/Images/statue-of-liberty.jpg"));
               j2.setIcon(im1);
               break;
      case 2: l1.setText("<HTML><br>2. Brooklyn Bridge<p>The Brooklyn Bridge, built between 1869 and 1883, connects Manhattan with New York's most populous borough, Brooklyn. The bridge is one of the most famous and magnificent landmarks in New York City. The construction of the Brooklyn Bridge started in 1869 and took 14 years to complete. The driving force behind the whole project, John Roebling, was a German immigrant. John Roebling would never get to see the bridge he had designed: he died after crushing his foot in an accident. The most noticeable feature of the Brooklyn Bridge are the two masonry towers to which the many cables are attached. The towers with large Gothic arches reach a height of 276 ft (84 meters), at the time making them some of the tallest landmarks in New York.</p></HTML>");
               im1=new ImageIcon(getClass().getResource("/Images/brooklyn-bridge.jpg"));
	       j2.setIcon(im1);
               break;
      case 3: l1.setText("<HTML><br>3. Times square<p>Times Square, the most bustling square of New York is known for its many Broadway theatres, cinemas and electronic billboards. It is one of those places that make New York a city that never sleeps. Today Times Square is a constantly buzzing tourist magnet; the square is even one of the most visited places in the world. Many people come to Times Square for the ambiance and the billboards spectacle, but there are also many restaurants and shops. The most famous building at the square is undoubtedly the iconic Paramount Building. The building was home to the Paramount theater where stars such as Fred Astaire, Bing Crosby and Frank Sinatra performed in their heyday. There's also a small museum that tells the history of Times Square.</p></HTML>"); 
               im1=new ImageIcon(getClass().getResource("/Images/times-square.jpg"));
               j2.setIcon(im1);
               break;
      case 4: l1.setText("<HTML><br>4. Empire State Building<p>More than any other building in the world, the Empire State Building represents the ambition of humans to build towers that reach for the skies. This skyscraper is probably New York's best known building and can be seen on many postcards. At the time when it was built in the early 1930s on Fifth Avenue, the Empire State Building broke all records and was dubbed 'the 8th world wonder'. The building had 64 elevators (now 73) and was constructed in only 1 year and 45 days. The Empire State Building was designed by William Frederick Lamb of the architectural firm of Shreve, Lamb, and Harmon. You can visit the Empire State Building's observation deck on the 86th floor from where you have a magnificent view over the city of New York.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/empire-state.jpg"));
	      j2.setIcon(im1);
              break; 
      case 5: l1.setText("<HTML><br>5. Central Park<p>Central Park is one of those places that make New York such a great place to live. The huge park, 341 hectare large (843 acres), is located in the center of Manhattan. Its design has served as an example for city parks around the world. The park boasts several lakes, theaters, ice rinks, fountains, tennis courts, baseball fields, many playgrounds and other facilities. It is also home to the Central Park Zoo and the Metropolitan Museum of Art. Especially during the weekends, when cars are not allowed into the park, Central Park is a welcome oasis in this hectic city. To convert the swampy area into the park the designers had envisioned, several hundred thousand trees were planted, more than 3 million cubic yards of soil was moved, roads and bridges were constructed and a large reservoir was dug out. It took more than 15 years before the 20,000 workers had completed the park.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/central-park.jpg"));
              j2.setIcon(im1);
              break;
      case 6: l1.setText("<HTML><br>6. Grand Central Terminal<p>Grand Central Terminal is one of two magnificent train stations that were built in New York in the heyday of railway transportation. The other, Penn Station, was demolished in the 1960s. The monumental railway station was constructed in 1903-1913 for the New York and Harlem Railroad company. It is a grand Beaux-Arts building which serves as a transportation hub connecting train, metro, car and pedestrian traffic in an efficient way. It has 67 train tracks on two different levels. The project included not just the new railway station, but a whole complex with office buildings and apartments, which became known as 'Terminal City'. Light enters the main concourse through six 75ft / 23m high arched windows. The floor of the concourse is of Tennessee marble, the walls of Caen stone.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/grand-central-terminal.jpg"));
              j2.setIcon(im1);
              break;
      case 7: l1.setText("<HTML><br>7. World Trade Center<p>The World Trade Center was originally a complex of seven buildings in Lower Manhattan. They were destroyed by terrorist attacks on September 11, 2001. A new complex is currently under construction. Today a new complex is rising at the site, known as the 'new WTC'. A memorial to the victims of the attacks now occupies the location of the former Twin Towers. The two towers were different in height: the first one, built in 1972, reached a height of 417 meters and the second one, finished one year later measured 415 meters.  WTC became world news was on the tragic day September 11, 2001 when 2 hijacked planes crashed into the twin towers. Not much later, the towers imploded. Almost 3000 people died in this cowardly terrorist attack by muslims. The site of the towers - a gaping wound - became known as 'ground zero'. Plans to build a new WTC were launched shortly after the destruction of the original WTC Towers. Instead of rebuilding the Twin Towers, it was decided to create a memorial at the site and build five new towers around the memorial.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/wtc.jpg"));
              j2.setIcon(im1);
              break;
      case 8: l1.setText("<HTML><br>8. Metropolitan Museum of Art<p>With more than two million works of art spanning thousands of years, the Metropolitan Museum of Art is one of the most expansive and prolific art museums in the world and it should be on everyone's New York to-do list. The original building at the Central Park location, which remains part of the complex, was designed by Calvert Vaux and Jacob Wrey Mould in the Gothic Revival Style. Currently, the two million works of art at the Metropolitan Museum of Art are divided into 22 curatorial departments spread out over about 250 rooms. Below an overview of some of the most interesting galleries in the Metropolitan Museum. There's also a rooftop sculpture garden and the amazing Robert Lehman Collection, often described as one of the most extensive and impressive private art collections in the world.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/museum.jpg"));
              j2.setIcon(im1);
              break;
      }
   }
}
