package Sydney;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class sydneyattractions extends JPanel implements ActionListener
{
  int i=1;
  JLabel l1;
  JLabel j2;
  JButton b1,b2;
  ImageIcon im1;
  public sydneyattractions()
  {
    setLayout(null);
    im1=new ImageIcon(getClass().getResource("/Images/opera-house.jpg"));
    j2=new JLabel(im1);
    l1=new JLabel("<HTML><br>1. Opera House<p>The Sydney Opera House is a magnificent building, rightfully considered one of the wonders of the modern world. Located at a prominent location on a peninsula near Sydney's harbour, it is reminiscent of a ship in full sail leaving harbour. The idea for the construction of an opera house arose after the Second World War, when Australians realized that the country lacked a world-class opera house. The construction was estimated to take about five years at a cost of A$7 million. Funds were largely provided by a 'Opera House Lottery'. Since public fund raising campaigns failed to produce sufficient funding, the lottery was created as an alternative source of funds in 1958, before construction had started. Sydney Opera House opened on 20 October 1973. The opera house put Sydney on the world map, both architecturally and culturally. Its events attract some two million visitors each year, making it one of the world's most popular cultural institutions.</p></HTML>");
    Font f2=new Font("Monotype Corsiva",Font.PLAIN,24);
    l1.setFont(f2);
    b1=new JButton("Previous");
    b2=new JButton("Next");
    add(j2,BorderLayout.EAST);add(l1,BorderLayout.WEST);add(b1);add(b2);
    j2.setBounds(20,80,im1.getIconWidth(),im1.getIconHeight());
    l1.setBounds(im1.getIconWidth()+40,60,650,480);
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
       case 1: l1.setText("<HTML><br>1. Opera House<p>The Sydney Opera House is a magnificent building, rightfully considered one of the wonders of the modern world. Located at a prominent location on a peninsula near Sydney's harbour, it is reminiscent of a ship in full sail leaving harbour. The idea for the construction of an opera house arose after the Second World War, when Australians realized that the country lacked a world-class opera house. The construction was estimated to take about five years at a cost of A$7 million. Funds were largely provided by a 'Opera House Lottery'. Since public fund raising campaigns failed to produce sufficient funding, the lottery was created as an alternative source of funds in 1958, before construction had started. Sydney Opera House opened on 20 October 1973. The opera house put Sydney on the world map, both architecturally and culturally. Its events attract some two million visitors each year, making it one of the world's most popular cultural institutions.</p></HTML>");
               im1=new ImageIcon(getClass().getResource("/Images/opera-house.jpg"));
               j2.setIcon(im1);
               break;
      case 2: l1.setText("<HTML><br>2. Harbour Bridge<p>The Sydney Harbour Bridge is a large steel arch bridge connecting the city center with the residential areas in the north. Thanks to its sheer size and beautiful location the bridge has become one of Australia's most famous landmarks. The design consisted of an enormous single-span bridge with four pylons. Construction of the bridge started in 1924 and by the end of 1929 construction of the arch had begun. In 1932, after 1400 men had worked on the bridge for 8 years, the bridge was finally opened. The total cost of the bridge was $A13.5 million. The loan was finally paid off by toll fees in 1988. The most spectacular way to visit the bridge is the popular BridgeClimb, a three and a half hour tour with a two hour walk to the top of the arch, 134 meter above sea level. Safety precautions and instructions include a 'Climb Simulator' and a blood alcohol reading. If you do have alcohol in your blood, you will not be able to participate and you will not get another chance so make sure you get there sober.</p></HTML>");
               im1=new ImageIcon(getClass().getResource("/Images/harbour-bridge.jpg"));
               j2.setIcon(im1);
               break;
      case 3: l1.setText("<HTML><br>3. Sydney Tower<p>The Sydney Tower, the city's tallest structure, is one of Sydney's most prominent landmarks. The 309 meter (1014ft) high tower was built in 1981 as a communications tower and tourist facility. Each year, more than a million visitors enjoy the spectacular views over Sydney. The tower is stabilized by 56 cables weighing 7 ton each. And a 162,000 liter water tank at the top of the turret acts as an enormous stabilizer. High speed elevators bring visitors in just 40 seconds to the eight floor turret. Nicknamed 'golden basket', the turret contains an observation deck, a coffee lounge and two restaurants. The enclosed observation deck offers a 360 degree view over Sydney from a height of 250 meter (820ft). For the daring there is also the skywalk, an open-air stroll on a glass-bottomed platform 268 meter above ground level. During the skywalk tour, skyguides will point out the many landmarks visible from the tower. On a clear day, visitors can see as far as 55km (34 miles).</p></HTML>"); 
               im1=new ImageIcon(getClass().getResource("/Images/sydney-tower.jpg"));
               j2.setIcon(im1);
               break;
      case 4: l1.setText("<HTML><br>4. Darling Harbour<p>Darling Harbour is a large recreational area near Sydney's Central Business District. It is home to a large number of attractions including some of Sydney's most popular museums. During the 19th century Darling Harbour was Australia's largest seaport. In 1984 the government of New South Wales decided to redevelop the area and in 1988, during Australia's Bicentennial Celebrations, Queen Elisabeth II officially opened the renovated Darling Harbour. The once industrial area is now a pedestrianized zone with plenty of hotels, restaurants and attractions. One of the most popular attractions in the area is the Sydney Aquarium. The aquarium - home to Australia's largest collection of marine animals - boasts a 145 meter (475ft) underwater tunnel from where you can see sharks, sting-rays and other fish up close. Darling Harbour is also home to the Sydney Convention Center, Star City (a hotel-casino), HarbourSide (a complex of shops, restaurants and cafes), an IMAX theatre and a beautiful Chinese Garden.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/darling-harbour.jpg"));
	      j2.setIcon(im1);
              break;
      case 5: l1.setText("<HTML><br>5. Queen Victoria Building<p>The Queen Victoria Building (QVB) is a modern shopping center located in a magnificent 19th century neo- romanesque building. The QVB was originally built as the Queen Victoria Market and replaced an existing produce market. The building was designed by city architect George McRae and constructed between 1893 and 1898. Four years and A$75 million later the Queen Victoria Building reopened as a shopping center. While the building was modernized with the installation of escalators and air conditioning, its historical restoration is exemplary. The tiled floors, stained glass windows, balustrades and arches are all restored with an eye for detail. There are four shopping floors in the building with in total about 200 shops and boutiques, including retail covering fashion, jewelry, antiques and Australian crafts.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/qvb.jpg"));
              j2.setIcon(im1);
              break;
      case 6: l1.setText("<HTML><br>6. Town Hall<p>Truly one of the grandest buildings in the city, Sydney's immense Town Hall is worth a visit, if just to admire the architecture. Made from local Sydney sandstone, the excessive ornamentation popular at the time eventually caused the Town Hall to be nicknamed 'The Wedding Cake Building'(Some Sydney-ites of the 20th century even thought it should be torn down!). Inside the Great Hall is an amazingly large pipe organ, which caused great concern as far as the sturdiness of the building materials in this room. Architects feared that ceiling panels would fall on patrons during concerts - caused by vibrations from the organ - so a special metal panel system was devised for the hall. It was an engineering marvel of its time. The Town Hall was among the first buildings in Sydney to feature Australian flora as architectural decoration and visitors to the hall can browse its magnificent stained glass windows and try to recognize native flowers and animals.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/town-hall.jpg"));
              j2.setIcon(im1);
              break;
      case 7: l1.setText("<HTML><br>7. Strand Arcade<p>When the Strand opened in downtown Sydney in 1892, crowds rushed to the shopping centre to get a look at the city's newest retail area, promised by its builders and designers to be bigger and better than anything built previously. The Strand soon became THE place to shop or even just browse, as the city's finest citizens undoubtedly headed there to purchase clothing, jewelry, and a myriad of other items. Everything was modern and state-of-the-art. The roof was made of tinted glass and the lighting system a combination of gas and new-fangled electric. Records show that even the toilets boasted the latest technology and modern hydraulic lifts carried customers from floor to floor. It's survived a few depressions, two world wars, and the threat of fire twice. Still, it's a favorite gathering place for both locals and visitors and promises to remain standing for a long time. Home to beauty salons, shoe and clothing alteration services, and stores.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/strand.jpg"));
              j2.setIcon(im1);
              break;
      }
   }
}
