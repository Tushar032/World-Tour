package San;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class sanattractions extends JPanel implements ActionListener
{
  int i=1;
  JLabel l1;
  JLabel j2;
  JButton b1,b2;
  ImageIcon im1;
  public sanattractions()
  {
    setLayout(null);
    im1=new ImageIcon(getClass().getResource("/Images/golden-bridge.jpg"));
    j2=new JLabel(im1);
    l1=new JLabel("<HTML><br><br>1. Golden Gate Bridge<p>The Golden Gate Bridge is a technical masterpiece that can only be described in superlative terms. When the bridge was completed in 1937 it was the world's longest and tallest suspension bridge. But above all this masterly example of engineering is a magnificent monument set against a beautiful backdrop. The Golden Gate Bridge is located at the Presidio Park and can easily be reached by bus or car. The most pleasant way to reach the bridge however is by walking either from the Marina District to the east or from Baker Beach to the west of the bridge. Both routes will lead you through a park, and especially the route along the east is very popular. But the bridge is also alluring at night when the lighting makes it seem as if the spires of the towers dissolve in the darkness.</p></HTML>");
    Font f2=new Font("Monotype Corsiva",Font.PLAIN,24);
    l1.setFont(f2);
    b1=new JButton("Previous");
    b2=new JButton("Next");
    add(j2,BorderLayout.EAST);add(l1,BorderLayout.WEST);add(b1);add(b2);
    j2.setBounds(20,80,im1.getIconWidth(),im1.getIconHeight());
    l1.setBounds(im1.getIconWidth()+40,60,600,500);
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
       case 1: l1.setText("<HTML><br><br>1. Golden Gate Bridge<p>The Golden Gate Bridge is a technical masterpiece that can only be described in superlative terms. When the bridge was completed in 1937 it was the world's longest and tallest suspension bridge. But above all this masterly example of engineering is a magnificent monument set against a beautiful backdrop. The Golden Gate Bridge is located at the Presidio Park and can easily be reached by bus or car. The most pleasant way to reach the bridge however is by walking either from the Marina District to the east or from Baker Beach to the west of the bridge. Both routes will lead you through a park, and especially the route along the east is very popular. But the bridge is also alluring at night when the lighting makes it seem as if the spires of the towers dissolve in the darkness.</p></HTML>");
               im1=new ImageIcon(getClass().getResource("/Images/golden-bridge.jpg"));
               j2.setIcon(im1);
               break;
      case 2: l1.setText("<HTML><br><br>2. Cable Cars<p>San Francisco's famed cable cars are among the city's most popular attractions. Even though it may look like they were especially made for tourists, the cable cars were actually created out of a necessity. The three current operating lines are Powell-Mason, Powell-Hyde and California lines. The first two start at a turntable at Market & Powell street and the last one starts at Market & Drumm Street. The Cable Car Museum is housed in the Cable Car Barn which is also an active depot for the system. Here you can see the mechanism of engines, cables, gears and brakes that pull the cable cars. In fact the cars don't even have any drive mechanism themselves but they are pulled by cables that rotate at a constant speed. Since they are under constant strain the cables have to be replaced at least once a year.</p></HTML>");
               im1=new ImageIcon(getClass().getResource("/Images/cable-car.jpg"));
               j2.setIcon(im1);
               break;
      case 3: l1.setText("<HTML><br><br>3. Chinatown<p>San Francisco's Chinatown is not only the oldest but also the most famous and largest chinatown in the US. Thanks to the many ornamented houses, shops and eateries the area is one of the city's most popular tourist attractions. San Francisco's Chinatown was first established in the mid 19th century, attracting immigrants mostly from China's Guangdong Province. Most of these individuals had jobs with the Central Pacific Railroad. They soon established their own town within the city. Many visitors head to Chinatown to explore its unique shops, restaurants, and the overall culture of the area. Most of the shops are located around Grant Street, the central axis of Chinatown's tourist area. Another attraction for visitors are the many temples in Chinatown. The most photographed structure in Chinatown is undoubtedly the large Chinatown Gateway, also known as the Dragon Gate.</p></HTML>"); 
               im1=new ImageIcon(getClass().getResource("/Images/chinatown.jpg"));
               j2.setIcon(im1);
               break;
      case 4: l1.setText("<HTML><br><br>4. Fisherman's Wharf<p>One of San Francisco's most visited attractions, Fisherman's Wharf is a delightful outdoor area where you'll not only find many fishing boats and seafood restaurants but also a whole range of attractions such as historic boats, a submarine, several museums and plenty of shops. Many people head to Fisherman's Wharf to enjoy the wonderful seafood sold there, including hot, steaming servings of clam chowder served in fresh sourdough bread bowls. But besides shopping and dining, Fisherman's Wharf also boasts its own attractions. San Francisco Maritime National Historic Park is a favorite with visitors. The Aquarium of the Bay at Pier 39 is also fascinating, providing the opportunity to walk through clear tunnels and observe local marine life, including sharks, bat rays, and other indigenous sea animals.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/fisherman.jpg"));
	      j2.setIcon(im1);
              break;
      case 5: l1.setText("<HTML><br><br>5. Alamo Square<p>The picturesque Victorian rowhouses at Alamo Square are among the most photographed buildings in San Francisco. The buildings give a good idea of what San Francisco looked like at the end of the 19th century. The area for Alamo Square was largely chosen because of its incredible location high above the city. Locals say it's often the windiest part of the city. Others tout the incredible view - which is undeniable. Some say viewing the sunrise or sunset from the Alamo Square Park is second to none. Of course, from the right vantage point in Alamo Square Park, you can also view some of the city's other famous sites, including the Golden Gate Bridge, the Oakland Bay Bridge, the Transamerica Pyramid, City Hall, and several other notable buildings and structures.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/alamo-square.jpg"));
              j2.setIcon(im1);
              break;
      case 6: l1.setText("<HTML><br><br>6. City Hall<p>The city hall of San Francisco is one of the country's most magnificent Beaux-Arts buildings. It is an enormous building, occupying two city blocks. Its central dome is even taller than that of the United States Capitol in Washington, D.C. On October 17, 1989 an earthquake of magnitude 7.1 hit San Francisco, damaging the City Hall. Its dome had moved 4 inches (10cm) and cracks appeared in the wall. A thorough renovation, completed in 1999, not only repaired the damage; it also restored the building to its original splendor and made the building seismic-proof. This was achieved by isolating the building from its foundation by installing an isolation layer of rubber and steel discs under the building. The layer protects the historic building by absorbing the seismic shocks.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/city-hall.jpg"));
              j2.setIcon(im1);
              break;
      case 7: l1.setText("<HTML><br><br>7. Transamerica Pyramid<p>As soon the Transamerica Pyramid was built in 1972, the skyscraper's unique silhouette made it an iconic San Francisco landmark. Before its completion however many people were opposed to the construction of the tower. According to the architect, William L. Pereira, the pyramid is the ideal shape for skyscrapers, offering the practical advantage of letting more air and light in the adjacent streets. The Transamerica Pyramid was finished in 1972 and having a height of 260 meters (853ft), towers over the rest of the city. It has 48 floors with a 64 meter (210ft) high spire on top, covered with aluminum panels. The building owes its sparkling white color to the layer of crushed quartz that covers the rest of the building.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/pyramid.jpg"));
              j2.setIcon(im1);
              break;
          }
   }
}
