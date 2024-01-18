package HongKong;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class hongkongattractions extends JPanel implements ActionListener
{
  int i=1;
  JLabel l1;
  JLabel j2;
  JButton b1,b2;
  ImageIcon im1;
  public hongkongattractions()
  {
    setLayout(null);
    im1=new ImageIcon(getClass().getResource("/Images/skyline.jpg"));
    j2=new JLabel(im1);
    l1=new JLabel("<HTML><br> <br>1. Skyline and Symphony of Lights<p>Hong Kong's already impressive skyline comes to life each night thanks to the intricately choreographed Symphony of Lights. Hong Kong's skyline is impressive during the daylight hours but will really knock your socks off when all the skyscrapers are lit in the evening. Adding to the beauty of Hong Kong's skyline is a fantastic multimedia light show that began in January 2004. The show features several different kinds of lights including not only simple lighting from inside the buildings but also LEDs, lasers, searchlights, and projection lighting. Taking place each night during good weather, the show starts at 8 pm and ends about 15 minutes later. You can hear live narration and music from two locations: on the Avenue of Stars on the Tsim Sha Tsui waterfront and at the promenade outside the Golden Bauhinia Square in Wan Chai.</p></HTML>");
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
       case 1: l1.setText("<HTML><br><br>1. Skyline and Symphony of Lights<p>Hong Kong's already impressive skyline comes to life each night thanks to the intricately choreographed Symphony of Lights. Hong Kong's skyline is impressive during the daylight hours but will really knock your socks off when all the skyscrapers are lit in the evening. Adding to the beauty of Hong Kong's skyline is a fantastic multimedia light show that began in January 2004. The show features several different kinds of lights including not only simple lighting from inside the buildings but also LEDs, lasers, searchlights, and projection lighting. Taking place each night during good weather, the show starts at 8 pm and ends about 15 minutes later. You can hear live narration and music from two locations: on the Avenue of Stars on the Tsim Sha Tsui waterfront and at the promenade outside the Golden Bauhinia Square in Wan Chai.</p></HTML>");
               im1=new ImageIcon(getClass().getResource("/Images/skyline.jpg"));
               j2.setIcon(im1);
               break;
      case 2: l1.setText("<HTML><br><br>2. Star Ferry<p>The Star Ferry has been a regular piece of the fabric of Hong Kong life for more than a century. Each day, both residents and visitors use this beloved ferry system, which makes its way gently across Victoria Harbor, delivering its passengers to their intended destination with unparalleled efficiency. In the more than 100 years since its beginning, the Star Ferry Company has gone from a few single-deck coal-powered ferries to a wonderful fleet of 12 diesel-electric vessels, some that hold up to 750 passengers. All have air-conditioned upper deck cabins where passengers can ride in comfort, despite the weather. The ferries depart frequently - usually less than 20 minutes apart and as close together as every 8 minutes. The fares are quite affordable and a ride on these historic ferries is a must-do for Hong Kong visitors.</p></HTML>");
               im1=new ImageIcon(getClass().getResource("/Images/ferry.jpg"));
               j2.setIcon(im1);
               break;
      case 3: l1.setText("<HTML><br><br>3. Mongkok<p>If you thrive among crowds and lots of bright, glittering lights, you'll love Hong Kong's Mongkok district. Situated in the heart of Kowloon, Mongkok (also written as Mong Kok) is busy day and night. After all, it's the city's largest shopping district and is a favorite place for locals to hang out, especially teens and young adults. Most of the time, the streets are jammed with traffic and people on the sidewalk can hardly make their way down the streets. Not to be missed is the Mongkok Computer Centre, several floors of computers, cell phones, and all the accessories that go with them. While it might be tough to buy a computer there and bring it home, it's a great place to purchase small electronic items. Another must see is the Flower Market, where locals and visitors can purchase myriad species of plants and colorful flowers.</p></HTML>"); 
               im1=new ImageIcon(getClass().getResource("/Images/mangkok.jpg"));
               j2.setIcon(im1);
               break;
      case 4: l1.setText("<HTML><br><br>4. The Peak<p>Dubbed Hong Kong's number one tourist attraction and situated high above the sights of Hong Kong, The Peak attracts approximately six million visitors each year. The best and most enjoyable way to reach The Peak Tower is via the Peak Tram, one of Hong Kong's oldest forms of transportation. This funicular railway first went into operation in 1888 and has since become a vital transportation link as well as a popular tourist attraction. The ride from the center of town to the top of The Peak takes approximately 7 minutes. Visitors of all ages will be thrilled by the ride, especially the steep climb towards the Tower! The attractions and shops available at The Tower aren't the only thing located at the top of The Peak. Visitors can wander the area outside the tower, stopping for a visit to Mount Austin Playground and continuing on to Victoria Peak Garden, a great place for a leisurely stroll with a picturesque view of the harbour area.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/peak.jpg"));
	      j2.setIcon(im1);
              break;
      case 5: l1.setText("<HTML><br><br>5. HSBC Bank Headquarters<p>Yet another spectacular skyscraper in Hong Kong's beautiful skyline, the HSBC (Hong Kong and Shanghai Banking Corporation) headquarters is consistently acclaimed for its design and construction. Facing Victoria Harbour with a view that's unrivaled, it remains one of Hong Kong's most attractive and admired modern structures. The structure is 47-stories high (180 meters) and known for its innovative construction, boasting the absence of an internal supporting structure. The building makes excellent use of natural light in order to save energy. The HSBC Bank headquarters is one of the few tall buildings where the elevators don't stop on every floor. Instead, a series of escalators connect some of the floors with each other.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/hsbc.jpg"));
              j2.setIcon(im1);
              break;
      case 6: l1.setText("<HTML><br><br>6. Wong Tai Sin Temple<p>The only temple in Hong Kong that offers facilities for Taoist wedding services, the Wong Tai Sin Temple is one of the most famous temples in Hong Kong. Known for its fortune-tellers, visitors flock here year round so that the soothsayers that reside in the temple can inform them as to their future. It is believed that Wong Tai Sin rescues the dying, heals the wounded, and punishes all evil. Taoists also believe that he has the power to grant whatever is requested of him. The Wong Tai Sin Temple is constructed in traditional Chinese style. The temple boasts large, ornate red pillars and a magnificent gold roof. The roof is decorated with blue friezes, many carvings of various colors, and ornamental yellow latticework.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/temple.jpg"));
              j2.setIcon(im1);
              break;
      case 7: l1.setText("<HTML><br><br>7. Hong Kong Park<p>In the middle of the Central section of Hong Kong, Hong Kong Park features 8 hectares (almost 20 acres) of park-like beauty, designed to be both a leisure and educational experience for the residents of Hong Kong and for visitors as well. The park is a fine example of modern design and facilities blending with natural landscape. Water features like waterfalls, streams, and ponds are an important part of the park's natural beauty. The park has three refreshment areas including one sit-down, inside restaurant. There are also 2 smaller eateries (in the squash centre and tea ware museum) and a few kiosks for a quick bite to eat.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/hongkong-park.jpg"));
              j2.setIcon(im1);
              break;
      }
   }
}
