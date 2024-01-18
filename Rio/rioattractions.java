package Rio;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class rioattractions extends JPanel implements ActionListener
{
  int i=1;
  JLabel l1;
  JLabel j2;
  JButton b1,b2;
  ImageIcon im1;
  public rioattractions()
  {
    setLayout(null);
    im1=new ImageIcon(getClass().getResource("/Images/corcovado.jpg"));
    j2=new JLabel(im1);
    l1=new JLabel("<HTML><br> <br>1. Corcovado<p>The Corcovado ,is a 710-meters (2,329 ft) mountain lying on the west side of Rio. It is one of Rio's famous icons around the world for the giant statue of the Christ Redeemer that is perched on the Corcovado's top with its arms outstretched over the bay like embracing the city of Rio. The Corcovado is Rio's most famous landmark, not only for the amazing view of the city, but also for being one of the tallest and most impressive monuments around the globe. During July 2007, the Christ Redeemer statue was voted by the public as one of the new Seven Wonders of the Modern World along with other man made structures such as the Great Wall of China and the Machu Pichu in Peru. Likewise, the statue was included in the 2009 edition of the Guiness Records as the biggest statue of Jesus in the world, mentions that make it worth a trip to see both the statue and enjoy the magnificant view of the bay and the city.</p></HTML>");
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
       case 1: l1.setText("<HTML><br><br>1. Corcovado<p>The Corcovado ,is a 710-meters (2,329 ft) mountain lying on the west side of Rio. It is one of Rio's famous icons around the world for the giant statue of the Christ Redeemer that is perched on the Corcovado's top with its arms outstretched over the bay like embracing the city of Rio. The Corcovado is Rio's most famous landmark, not only for the amazing view of the city, but also for being one of the tallest and most impressive monuments around the globe. During July 2007, the Christ Redeemer statue was voted by the public as one of the new Seven Wonders of the Modern World along with other man made structures such as the Great Wall of China and the Machu Pichu in Peru. Likewise, the statue was included in the 2009 edition of the Guiness Records as the biggest statue of Jesus in the world, mentions that make it worth a trip to see both the statue and enjoy the magnificant view of the bay and the city.</p></HTML>");
               im1=new ImageIcon(getClass().getResource("/Images/corcovado.jpg"));
               j2.setIcon(im1);
               break;
      case 2: l1.setText("<HTML><br><br>2. Sugar Loaf Mountain<p>The Sugar Loaf Mountain is one of several monolithic morros of granite and quartz that rise straight from the water's edge around Rio de Janeiro. The Sugarloaf mountain received its name due to its resemblance to the traditional shape of concentrated refined loaf of sugar and is famous around the world not only for being the second most important landmark of Rio along with the Corcovado, but also for being a challenge for rock climbers that want to experience one of the largest urban climbing areas in the world with more than 270 climbing routes of different levels of difficulty which place this mountain as one of the most relevant to the history of mountain climbing in Brazil attracting thousands of local and foreign climbers each year. From the Sugar Loaf mountain you can truly enjoy a spectacular view of one of the most beautiful sights of the world specially if you arrive an hour before the sun go down and watch a romantic sunset while the city lights up.</p></HTML>");
               im1=new ImageIcon(getClass().getResource("/Images/sugarloaf.jpg"));
               j2.setIcon(im1);
               break;
      case 3: l1.setText("<HTML><br><br>3. Rio Center<p>In Rio's downtown you can find the historic treasure of the city, as well as the financial centre as most of the cities around the world. Some of the largest companies in Brazil have their head offices here, including Petrobras and Vale (formerly Companhia Vale do Rio Doce), two of the largest Brazilian corporations. The historical center of Rio counts also with one of the most interesting spots in the city, the Floriano Square, better known as the Cinelandia Square (cine-land) as it used to be surrounded in the early 20th century by the best cinemas of the city. Most of those cinemas are close today, but this area is still an interesting active place with bars, restaurants and other important landmarks.</p></HTML>"); 
               im1=new ImageIcon(getClass().getResource("/Images/riocenter.jpg"));
               j2.setIcon(im1);
               break;
      case 4: l1.setText("<HTML><br><br>4. Rio Beaches<p>It's no secret that Rio de Janeiro is all about the beach. It is people's center of entertainment and relaxation and anyone who has ever been to Brazil will tell you there is nothing quite like it anywhere! Catching some rays, surfing, jogging, playing soccer or simply cracking open an ice cold beer while checking out some of the world's hottest bodies are the favorite activities. The beach of Copacabana has over 4 kms of white sand to relax on and plenty of beach activities including volleyball, water sports and of course, beach parties. Leblon beach is known by its beautiful houses, most of them were replaced by tall modern building but you still can find some of those beautiful complex hidden in the modern streets. Its exclusively population and a sudden commercial explosion contribute to an increase in the price of the real state converting this neighbourhood into one of the most expensive real state areas in South America which contrasts with the poverty of the favelas around the neighbourhood. </p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/riobeach.jpg"));
	      j2.setIcon(im1);
              break;
      case 5: l1.setText("<HTML><br><br>5. Santa Teresa<p>Santa Teresa neighbourhood received this name for the Santa Teresa Church and Convent. The area is being rediscovered recently as a Ourist Landmark In Rio de Janeiro even though is one of Rio's oldest neighbourhoods that features many great mansions and castles with stunning rich Portuguese, colonial and eclectic style. Santa Teresa's Hill used to be inhabited by the european elite of the city, who look to settle down long time ago high on the hill looking for fresh air and an exclusive view to the sea, the bay and the mountains just on top of the city center. Within the 60's-70's, the upper class started moving to more modern areas like Ipanema and Barra da Tijuca, while Santa Teresa stayed the favourite district of the intellectual and artistic elite.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/santa-teresa.jpg"));
              j2.setIcon(im1);
              break;
      case 6: l1.setText("<HTML><br><br>6. Rodrigo de Freitas Lagoon<p>The Lagoon Rodrigo de Freitas in Rio is a natural lagoon in the Southern Area of the city (Zona Sul). Is a wonderful place place for a walk and to enjoy the romantic-relaxing atmosphere while sharing one of the favourite places for the Cariocas. With its 204.000 m2 of extension (7800 sq feet), the Lagoon is considered the biggest gastronomical center in an open space in Latin America while is surrounded by green areas and a great cycling and jogging track where chic Cariocas work out or walk their fancily clad dogs. Kiosks serve everything from Italian to Japanese food and you can hear Brazilian music and jazz played in the evenings after 9 pm at stands around the lagoon.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/lagoon.jpg"));
              j2.setIcon(im1);
              break;
      case 7: l1.setText("<HTML><br><br>7. Lapa<p>Lapa is a neighbourhood in Rio, next to the neighbourhood of Santa Teresa. Lapa passed from having a bad reputation for being the meeting place of artists and intellectuals but right now is well known for its bars and discos of samba and forro that stay open from morning to morning, street artists that constantly singing all sort of brazilian rythms invading the streets, creating a unique atmosphere , and as one of the most authentic nightlife in Rio, nevertheless, take into account that Lapa is not the nicest place to be hanging out in Rio as most of the people will only come at night to join the samba and the party.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/lapa.jpg"));
              j2.setIcon(im1);
              break;
      }
   }
}
