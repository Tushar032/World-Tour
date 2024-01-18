package Dubai;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class dubaiattractions extends JPanel implements ActionListener
{
  int i=1;
  JLabel l1;
  JLabel j2;
  JButton b1,b2;
  ImageIcon im1;
  public dubaiattractions()
  {
    setLayout(null);
    im1=new ImageIcon(getClass().getResource("/Images/dubai-mall2.jpg"));
    j2=new JLabel(im1);
    l1=new JLabel("<HTML><br> <br>1. The Dubai Mall<p>The Dubai Mall is the world's largest shopping mall based on total area and sixth largest by gross leasable area. The Dubai Mall recorded 60,000 tickets sold for the Dubai Aquarium and Discovery Centre in the first five days, following its opening. It also has a 250-room luxury hotel, 22 cinema screens plus 120 restaurants and cafes. The Mall has over 14,000 parking spaces across 3 car parks, with valet services and a car locator ticketing system. The Mall's Dubai Ice Rink multi-purpose venue, uses refrigeration plant technology by developing 1.5 inches (38 mm) of ice bed. The Mall's Dubai Aquarium and Discovery Centre, developed and operated by Oceanis Australia Group, officially earned the Guinness World Record for the world's Largest Acrylic Panel (32.88 m wide × 8.3 m high × 750 mm thick and weighing 245,614 kg). Its transparency gives visitors clear views of over 33,000 marine animals on display.</p></HTML>");
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
    if(i==9)
            i=1;
    if(i==0)
            i=8;
    switch(i)
    {
       case 1: l1.setText("<HTML><br><br>1. The Dubai Mall<p>The Dubai Mall is the world's largest shopping mall based on total area and sixth largest by gross leasable area. The Dubai Mall recorded 60,000 tickets sold for the Dubai Aquarium and Discovery Centre in the first five days, following its opening. It also has a 250-room luxury hotel, 22 cinema screens plus 120 restaurants and cafes. The Mall has over 14,000 parking spaces across 3 car parks, with valet services and a car locator ticketing system. The Mall's Dubai Ice Rink multi-purpose venue, uses refrigeration plant technology by developing 1.5 inches (38 mm) of ice bed. The Mall's Dubai Aquarium and Discovery Centre, developed and operated by Oceanis Australia Group, officially earned the Guinness World Record for the world's Largest Acrylic Panel (32.88 m wide × 8.3 m high × 750 mm thick and weighing 245,614 kg). Its transparency gives visitors clear views of over 33,000 marine animals on display.</p></HTML>");
               im1=new ImageIcon(getClass().getResource("/Images/dubai-mall2.jpg"));
               j2.setIcon(im1);
               break;
      case 2: l1.setText("<HTML><br><br>2. Palm Islands<p>The Palm Islands are artificial  (islands) in Dubai,  off the coast in the Persian Gulf. The islands are the Palm Jumeirah, the Palm Jebel Ali and the Palm Deira. Among the three islands, there are over 100 luxury hotels, exclusive residential beach-side villas and apartments, marinas, water theme parks, restaurants, shopping malls, sports facilities and health spas. The Palm Jumeirah consists of a tree trunk, a crown with 16 fronds, and a surrounding crescent island that forms an 11 kilometer-long breakwater. The island itself is five kilometers by five kilometers. It adds 78 kilometers to the Dubai coastline. The Palm Deira was announced for development in October 2004.  The first announced design was eight times larger than the Palm Jumeirah and five times larger than the Palm Jebel Ali. The Palm Deira is intended to house one million people. </p></HTML>");
               im1=new ImageIcon(getClass().getResource("/Images/palm-islands.jpg"));
               j2.setIcon(im1);
               break;
      case 3: l1.setText("<HTML><br><br>3. Burj Al Arab<p>Burj Al Arab is a luxury hotel located in Dubai, United Arab Emirates. At 321 m (1,053 ft), it is the fourth tallest hotel in the world. Burj Al Arab stands on an artificial island 280 m (920 ft) from Jumeirah beach and is connected to the mainland by a private curving bridge. The shape of the structure is designed to mimic the sail of a ship. Sometimes referred to as the world's only 7-Star hotel, its star rating is disputed.  Burj Al Arab holds only 28 double-story floors which accommodate 202 bedroom suites. The smallest suite occupies an area of 169 m2 (1,820 sq ft), the largest covers 780 m2 (8,400 sq ft). Al Muntaha is located 200 m (660 ft) above the Persian Gulf, offering a view of Dubai.  Burj Al Arab has attracted criticism as well a contradiction of sorts, considering how well-designed and impressive the construction ultimately proves to be. The contradiction here seems to be related to the hotel’s decor. </p></HTML>"); 
               im1=new ImageIcon(getClass().getResource("/Images/burj-al-arab.jpg"));
               j2.setIcon(im1);
               break;
      case 4: l1.setText("<HTML><br><br>4. The Dubai Fountain<p>The Dubai Fountain is the worlds largest choreographed fountain system set on the 30-acre manmade Burj Khalifa Lake, in Dubai.  Illuminated by 6,600 lights and 25 colored projectors, it is 275 m (902 ft) long and shoots water up to 500 ft (152.4 m) into the air accompanied by a range of classical to contemporary Arabic and world music. It was built at a cost of AED 800 million (USD 218 million). The Dubai Fountain consists of many high-pressure water jets and shooters: oarsmen or water robots, which can make the water seem to dance, shooters, which shoot water upwards; super shooters, which shoot water under more pressure up to 240 feet in the air, and extreme shooters, which can shoot water under the most pressure to 500 ft (152.4 m) in the air. Performances take place at 1:00 pm and at 1:30 pm as well as every 30 minutes from 6 pm to 10 pm on weekdays, and from 6 pm to 11 pm on weekends.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/dubai-fountain.jpg"));
	      j2.setIcon(im1);
              break;
      case 5: l1.setText("<HTML><br><br>5. Dubai Beaches<p>Dubai’s beaches are many but a lot of them belong to hotels so here we take a look at the best public beaches- some are free to access and some have a small charge. Ladies must wear a full bikini or a swimsuit when on the public beaches and swimming in underwear is not allowed. Mamzer Beach is massive and beautiful and it has just been awarded blue flag beach status, making Mamzer Beach Park one of the most desirable beaches to visit. Russian Beach is also known as the Open Beach or Jumeirah Open Beach and is free to use. It is just after Palm Strip Mall at the lower end of Beach Road… the opposite end to the Burj Al Arab. All the shoreline hotels have beaches and you can pay to use the beach at a resort in many places as long as they are not full. This can cost anywhere between 200 Dhs to 700 Dhs.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/beach.jpg"));
              j2.setIcon(im1);
              break;
      case 6: l1.setText("<HTML><br><br>6. Dubai desert<p>Camel safari is the traditional safari trip of Arabs, camel is known as ship of the Dubai desert. 30 to 40 years ago it is the only method of transporting goods through the Dubai desert.Camel safaris are always done in groups, otherwise known as caravans. Camels endure the strong winds in the desert thus referred to as the ‘ship of the desert. The Desert Safari give you the opportunity to experience how people in the early days cross each emirate to find a new place for dwelling and for trading. Overnight desert safari is designed for the visitors who have less time to stay at Dubai and have busy day schedules with their shopping , visiting their relatives or friends or may have some work to do . They can enjoy the overnight desert safari without disturbing their day plans and can experience wonderful activities and absolute calmness of the desert night with their loved once in an affordable package.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/desert.jpg"));
              j2.setIcon(im1);
              break;
      case 7: l1.setText("<HTML><br><br>7. Wild Wadi Water Park<p>The Wild Wadi Water Park is an outdoor water park in Dubai, United Arab Emirates. Situated in the area of Jumeirah, next to the Burj Al Arab and the Jumeirah Beach Hotel, the water park is operated by Jumeirah International, a Dubai-based hotelier. Wild Wadi has a heated/cooled wave pool, multiple water slides and two artificial surfing machines. In addition, the park had the largest water slide outside of North America, but recently it was removed to make space for two other rides . Another feature of the park is an 18 m (59 ft) waterfall that goes off every ten minutes. The water park also has two gift shops, three restaurants and two snack stands. It was featured in The Amazing Race 5 and The Amazing Race Asia 1, in which teams had to slide down a 21 m (69 ft) drop. It was later featured in The Amazing Race Australia 2, but instead, the teams had to ride the Surf Machine and use boogie boards to surf their way to the end where they will get their next clue.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/water-park.jpg"));
              j2.setIcon(im1);
              break;
      case 8: l1.setText("<HTML><br><br>8. Burj Khalifa<p>Burj Khalifa is a skyscraper in Dubai, United Arab Emirates, and is the tallest man-made structure in the world, at 829.8 m (2,722 ft). Burj Khalifa can accommodate up to 35,000 people at any one time. A total of 57 elevators and 8 escalators are installed. The elevators have a capacity of 12 to 14 people per cabin, the fastest rising and descending at up to 10 m/s (33 ft/s) for double-deck elevators. The building has 2,909 stairs from the ground floor to the 160th floor. The graphic design identity work for Burj Khalifa is the responsibility of Brash Brands, who are based in Dubai. Design of the global launch events, communications, and visitors centers for Burj Khalifa have also been created by Brash Brands as well as the roadshow exhibition for the Armani Residences, which are part of the Armani Hotel within Burj Khalifa, which toured Milan, London, Jeddah, Moscow and Delhi.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/burj-khalifa.jpg"));
              j2.setIcon(im1);
              break;
      }
   }
}
