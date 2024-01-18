package Chicago;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class chicagoattractions extends JPanel implements ActionListener
{
  int i=1;
  JLabel l1;
  JLabel j2;
  JButton b1,b2;
  ImageIcon im1;
  public chicagoattractions()
  {
    setLayout(null);
    im1=new ImageIcon(getClass().getResource("/Images/navy-pier.jpg"));
    j2=new JLabel(im1);
    l1=new JLabel("<HTML><br> <br>1. Navy Pier<p>Navy Pier is a large pier on Lake michigan near Streeterville, close to Chicago's downtown. Originally known as the Municipal Pier nr 2, it is one of two piers called for in Daniel Burnham's 1909 Chicago plan. The other pier was never built. The pier was designed as a shipping and entertainment area. In its first decade, the Municipal Pier was successfully attracting both visitors and ships. The two major buildings on the Navy Pier are Headhouse and Auditorium. The most western building, a brick and terra cotta building with two prominent towers is the Navy Pier Headhouse. The most eye-catching is the 148 ft (45m) high Ferris Wheel. A 7 story Shakespeare theater complex with a 525 seat theater is another recent addition to the Navy Pier. Navy Pier is also a starting point for many boat trips.</p></HTML>");
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
       case 1: l1.setText("<HTML><br><br>1. Navy Pier<p>Navy Pier is a large pier on Lake michigan near Streeterville, close to Chicago's downtown. Originally known as the Municipal Pier nr 2, it is one of two piers called for in Daniel Burnham's 1909 Chicago plan. The other pier was never built. The pier was designed as a shipping and entertainment area. In its first decade, the Municipal Pier was successfully attracting both visitors and ships. The two major buildings on the Navy Pier are Headhouse and Auditorium. The most western building, a brick and terra cotta building with two prominent towers is the Navy Pier Headhouse. The most eye-catching is the 148 ft (45m) high Ferris Wheel. A 7 story Shakespeare theater complex with a 525 seat theater is another recent addition to the Navy Pier. Navy Pier is also a starting point for many boat trips.</p></HTML>");
               im1=new ImageIcon(getClass().getResource("/Images/navy-pier.jpg"));
               j2.setIcon(im1);
               break;
      case 2: l1.setText("<HTML><br><br>2. Magnificent Mile<p>The Magnificent Mile, the northern part of Michigan Avenue between the Chicago River and Lake Shore Drive, is Chicago's version of the Champs-Elysées: a grand wide boulevard with exclusive shops, museums, restaurants and ritzy hotels. In order to connect the avenue with Pine street across the Chicago River, the Michigan Avenue bridge was built in 1920. A new building boom started in 1969 with the construction of the John Hancock Center, a 100-storey tall residential skyscraper. Another boom started at the end of the 1980s and added some more skyscrapers at the Magnificent Mile, among them the 900 N. Michigan Avenue (1989) and Park Tower (2000). The Magnificent Mile is a unique street that you shouldn't miss on your visit to Chicago.</p></HTML>");
               im1=new ImageIcon(getClass().getResource("/Images/mile.jpg"));
               j2.setIcon(im1);
               break;
      case 3: l1.setText("<HTML><br><br>3. Buckingham Fountain<p>Buckingham Fountain, officially known as the 'Clarence Buckingham Memorial Fountain' is one of Chicago's most popular landmarks. The fountain is located in Grant Park at the center of a formally laid out garden. The design of the fountain is based on the 'Bassin de Latone' at the Versailles Palace near Paris and was built by Edward H. Bennett, who had also constructed the Michigan Avenue Bridge. The fountain rises more than 7 meters high (23ft) and consists of 3 layers of bassins surrounded by four pairs of bronze seahorses. The fountain's hourly 20 minute water display starts with small sprays. While the basins are filled more and more jets are activated until it reaches its climax when the central jet pushes water up to a height of 46m/150ft. </p></HTML>"); 
               im1=new ImageIcon(getClass().getResource("/Images/chicago-fountain.jpg"));
               j2.setIcon(im1);
               break;
      case 4: l1.setText("<HTML><br><br>4. Sears Tower<p>At the time the Sears tower was constructed in 1974, it was the world's tallest building, eclipsing New York's twin-towered World Trade Center by 25 meter (83 ft). It would keep the title of tallest building in the world until the Petronas twin towers in Kuala Lumpur, Malaysia were constructed in 1997. The building consists of nine framed tubes, which are actually nine skyscrapers on themselves taken together into one building. The construction with separate tubes provides lateral strengths to withstand the strong Chicago wind loads, as each tube only needs to take a part of the pressure. The most spectacular attraction at the skydeck is 'the ledge', a glass balcony extending 4.3 ft where you can look straight down. It will make most people feel uneasy at first but the balconies offer spectacular views over Wacker Drive and the Chicago River. </p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/sears-tower.jpg"));
	      j2.setIcon(im1);
              break;
      case 5: l1.setText("<HTML><br><br>5. Millennium Park<p>Built on a site that was controlled by the Illinois Central Railroad for almost 150 years, Millennium Park is seen by many Chicagoans as the crowning glory of their city. The 24.5 acre (10 ha) Millennium Park is a magnificent modern park with state of the art facilities, unique public artwork and beautiful gardens. Kids and adults alike love the innovative Crown Fountain. The towers project video images of diverse Chicago citizens spitting out water, which Plensa claims is a reference to the traditional use of gargoyles, where faces of mythological beings were sculpted with open mouths to allow water to flow out. Cloud Gate is a bean-shaped structure which was inspired by liquid mercury and is among the largest sculpture of its kind in the world. The shiny material reflects the magnificent Chicago skyline. </p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/millennium.jpg"));
              j2.setIcon(im1);
              break;
      case 6: l1.setText("<HTML><br><br>6. Chicago River<p>Flowing through downtown Chicago, the river that bears the name of the city has an interesting history. Once a corridor of commercial activity, the river has been transformed into a recreational area with sightseeing boats and kayaks. Along the banks are pedestrian friendly promenades lined with café's and eateries. Throughout the city and its nearby suburbs, 45 movable bridges span the river, many of them well-known and quite picturesque. Several were also considered engineering marvels of their time, like the one at Michigan Avenue, one of the first fixed trunnion bascule bridges in the country, built in 1920. There are several popular river cruises you can choose from. Most either start near the Michigan Avenue Bridge or Navy Pier.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/chicago-river.jpg"));
              j2.setIcon(im1);
              break;
      case 7: l1.setText("<HTML><br><br>7. Shedd Aquarium<p>Chicago's Shedd Aquarium is located at the Museum Campus, just south of Grant Park. The campus, which also comprises the nearby Field Museum of Natural History and Max Adler Planetarium, is one of Chicago's major tourist draws. Shedd Aquarium houses some 20,000 aquatic animals representing 1,500 different species. The aquarium contains several exhibits, the most notable of which are the Caribbean Reef, the Wild Reef and the Oceanarium. The fish are fed 5 times daily by divers who give the audience some information about the animals while feeding them. The stars here are the Pacific white-sided dolphins. The dolphins have quite some room to show off their speed to the spectators. </p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/shedd-aquarium.jpg"));
              j2.setIcon(im1);
              break;
      }
   }
}
