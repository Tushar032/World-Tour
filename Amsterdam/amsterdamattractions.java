package Amsterdam;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class amsterdamattractions extends JPanel implements ActionListener
{
  int i=1;
  JLabel l1;
  JLabel j2;
  JButton b1,b2;
  ImageIcon im1;
  public amsterdamattractions()
  {
    setLayout(null);
    im1=new ImageIcon(getClass().getResource("/Images/canal.jpg"));
    j2=new JLabel(im1);
    l1=new JLabel("<HTML><br>1.	Amsterdam's Canals<p>Dubbed the Venice of the North, Amsterdam's canals are not only attractive, but they're also a great way to travel around the city, enjoying the sights of this free-thinking European metropolis. Undoubtedly, the canals and the bridges that cross them are breathtakingly beautiful and you'll want to snap tons of pictures as you walk along beside them. However, Amsterdam residents will tell you that the canals are much more than just a pretty sight. Canals are an easy way to travel around the city. A municipal canal-bus system travels three different routes throughout the city, allowing locals an easy way to get to and from work and giving visitors the opportunity to travel from one attraction to the other on the water. The canals serve as a home for those who choose to live on one of Amsterdam's many houseboats. You'll find many throughout the city and may even be able to arrange to rent one for your vacation.</p></HTML>");
    Font f2=new Font("Monotype Corsiva",Font.PLAIN,24);
    l1.setFont(f2);
    b1=new JButton("Previous");
    b2=new JButton("Next");
    add(j2);add(l1);add(b1);add(b2);
    j2.setBounds(20,80,im1.getIconWidth(),im1.getIconHeight());
    l1.setBounds(im1.getIconWidth()+40,80,550,500);
    b1.setBounds(im1.getIconWidth()+80,620,100,30);
    b2.setBounds(im1.getIconWidth()+30+300,620,100,30);
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
       case 1: l1.setText("<HTML><br>1. Amsterdam's Canal<p>Dubbed the Venice of the North, Amsterdam's canals are not only attractive, but they're also a great way to travel around the city, enjoying the sights of this free-thinking European metropolis. Undoubtedly, the canals and the bridges that cross them are breathtakingly beautiful and you'll want to snap tons of pictures as you walk along beside them. However, Amsterdam residents will tell you that the canals are much more than just a pretty sight. Canals are an easy way to travel around the city. A municipal canal-bus system travels three different routes throughout the city, allowing locals an easy way to get to and from work and giving visitors the opportunity to travel from one attraction to the other on the water. The canals serve as a home for those who choose to live on one of Amsterdam's many houseboats. You'll find many throughout the city and may even be able to arrange to rent one for your vacation.</p></HTML>");
               im1=new ImageIcon(getClass().getResource("/Images/canal.jpg"));
               j2.setIcon(im1);
               break;
      case 2:  l1.setText("<HTML><br>2. Royal Palace<p>Once the largest secular building in Europe, the Royal Palace of Amsterdam has served a number of different purposes since its construction in the mid 17th century. The entire building was made of gleaming white stone. Due to weathering, it now appears to be a brownish/gray. It was built to be the city hall for the magistrates of Amsterdam and they opened the first section in 1655. Through the centuries, the building has been known not only for its size and beautiful exterior but also for what's inside the Royal Palace. After it was built, famous sculptors and painters were brought to Amsterdam to create masterpieces to be exhibited there, so it's not unusual to find paintings by Rembrandt or other greats inside the Royal Palace. Availability of the Royal Palace to visitors varies, depending on its use. When it is open, for a small fee tourists can visit several rooms inside the palace on a guided tour.</p></HTML>");
               im1=new ImageIcon(getClass().getResource("/Images/royal-palace.jpg"));
               j2.setIcon(im1);
               break;
      case 3: l1.setText("<HTML><br>3. Rembrandt Square<p>Amsterdam's central square known as the Rembrandtplein is always bustling with activity; providing shopping, dining, and entertainment for visitors and locals alike. Rembrandtplein or Rembrandt Square, originally known as the Botermarkt (Butter Market), was established in 1668 and built from the remnants of the old city port. Things haven't changed a whole lot at Rembrandtplein over the years. The square is still surrounded by a plethora of shops and restaurants as well as a number of bars and nightclubs. It is still especially popular with young people. You'll also find a handful of Amsterdam's diamond factories around the square, a few of which offer tours. The Brasserie Schiller (next door to the café) is a lovely 100-year-old Art Nouveau building, decorated with etched-glass panels and stained-glass skylights, serving very traditional Dutch food and certainly worth a visit.</p></HTML>"); 
               im1=new ImageIcon(getClass().getResource("/Images/rembrandt-square.jpg"));
               j2.setIcon(im1);
               break;
      case 4: l1.setText("<HTML><br>4. Flower Market<p>Amsterdam's unique flower market, located at the Singel Canal near the Mint Tower, has been a city institution since 1862. Lots of cities have flower markets, but Amsterdam's is uniquely different. Since the middle of the 19th century, this city of canals has boasted a floating flower market. Situated on the Singel Canal, one of the oldest canals in Amsterdam, this unusual flower market is the most famous in Holland. Amsterdam's floating flower market is open all year long so locals and visitors can take advantage of a wide array of colorful plants no matter what the season. Of course, Dutch tulips (in an amazing array of colors) are a popular item here, and at Christmastime, the barges are covered with evergreens of all shapes, sizes, and hues. Prices are quite reasonable and many tourists enjoy taking home a few tulip bulbs they can plant in their garden when they return from their trip to Amsterdam.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/flower.jpg"));
	      j2.setIcon(im1);
              break;
      case 5: l1.setText("<HTML><br>5. Jordaan<p>Formerly a working-class quarter of Amsterdam, home to a large population of the city's immigrants, Jordaan has become one of Amsterdam's hippest places to live and work. Visitors to the city now flock to this area, which was once infamous for its tiny houses, open sewers, and less-than-pristine living conditions. In the 1970s, developers hoped to demolish a large portion of the Jordaan neighborhood but concerned citizens fought to maintain the historic area. Since that time, Jordaan has become one of Amsterdam's most desired districts, attracting aspiring artists, musicians, and writers. A stroll through the narrow streets takes you past picturesque canals, art galleries, courtyards, historic homes boasting stone tablets that attest to the inhabitant's occupation, pubs, boutiques, and small markets. Visit the Noorderkerk (North Church), the main church in the area, You'll also find a few small museums in the Jordaan, including a Pianola Museum of mechanical pianos.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/jordaan.jpg"));
              j2.setIcon(im1);
              break;
      case 6: l1.setText("<HTML><br>6. Central Station<p>The magnificent Central Station of Amsterdam is the main hub of transportation in the Netherlands. Commuter, regional, and international trains arrive and depart all day long and the station is also the transportation center for the city's trams and buses. The station was built on the banks of the IJ River. It is held up with 8,600 pilings in order to keep the building stable and avoid accidents caused by shifting soil. The exterior of the building is made of red stone. Carvings and spires are prominent on the exterior of the building as are two large clock towers. In actuality, however, only one of those is a clock. The other is a read-out for the wind vane that sits atop the station. If you're using any of the city's public transportation, you'll no doubt find yourself in the Central Station at one time or another during your visit to Amsterdam. Bring along some extra cash for shopping as well. There are many stores at the station as well as places to grab a quick bite to eat.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/central-station.jpg"));
              j2.setIcon(im1);
              break;
      case 7: l1.setText("<HTML><br>7. Waag<p>Since its construction in the late 15th century, the Waag (or Weigh House) has served a number of different purposes. At the beginning of the 19th century, when most of the guilds were disbanded, the building became empty, save for the immense collection of medical memorabilia for which the surgeon's guild could find no home. The dark period for St. Anthony's Poort came during the early 19th century, when Napoleon ordered public executions be performed here. In 1996, the Restaurant-Café In de Waag opened inside the old gate. Lit by 300 candles and high-hanging candelabras, the castle-like restaurant serves lunch and dinner and is available for special functions. A light breakfast and coffee is available as early as 10 am.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/waag.jpg"));
              j2.setIcon(im1);
              break;
      case 8: l1.setText("<HTML><br>8. Magna Plaza<p>Magna Plaza, Amsterdam’s first inner-city shopping mall, was created in 1990-1992 by converting the old Post Office Building. The building has an eye-catching neo-Gothic exterior and a magnificent neo-Renaissance interior. At first glance, visitors can tell that Magna Plaza, Amsterdam’s wonderful shopping center, wasn't always the local mall! Originally built in 1899, Magna Plaza was once Amsterdam’s Post Office building. Nevertheless, Magna Plaza is architecturally stunning to the eye - both inside and out - and is unlike your average shopping mall. If you've indeed come here for the shopping opportunities, you won't be disappointed, especially if upscale fashion is what you seek. When Magna Plaza became a shopping mall in 1992, the owners decided to spread the shops over all 4 stories. The result was the inclusion of about 40 stores and a handful of restaurants, including the 3-story Café Ovidius.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/plaza.jpg"));
              j2.setIcon(im1);
              break;
      }
   }
}
