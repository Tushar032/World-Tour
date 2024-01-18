package London;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class london_attractions extends Panel implements ActionListener
{
  int i=1;
  JLabel l1;
  JLabel j2;
  JButton b1,b2;
  ImageIcon im1;
  public london_attractions()
  {
    setLayout(null);
    l1=new JLabel("<HTML><br>1. Big Ben<p>The Clock Tower of the Palace of Westminster - officially named Saint Stephen's Tower - is commonly known as the Big Ben. The tower is one of London's most famous landmarks. The clock inside the tower was the world's largest when it was installed in the middle of the 19th century. The name Big Ben actually refers to the clock's hour bell, the largest of the clock's five bells. The other four are used as quarter bells. There were two bells cast as the clock tower's hour bell. A first, 16 ton weighing bell was cast by John Warner and Sons in 1856. Since the Clock Tower was not yet completed, the bell was hung temporarily in the Palace Yard."); 
    Font f2=new Font("Monotype Corsiva",Font.PLAIN,24);
    l1.setFont(f2);
    Color c1=new Color(100,100,255);
    l1.setBackground(c1);
    im1=new ImageIcon(getClass().getResource("/Images/big-ben.jpg"));
    j2=new JLabel(im1);
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
    if(i==9)
            i=1;
    if(i==0)
            i=9;
    switch(i)
    {
       case 1: l1.setText("<HTML><br>1. Big Ben<p>The Clock Tower of the Palace of Westminster - officially named Saint Stephen's Tower - is commonly known as the Big Ben. The tower is one of London's most famous landmarks. The clock inside the tower was the world's largest when it was installed in the middle of the 19th century. The name Big Ben actually refers to the clock's hour bell, the largest of the clock's five bells. The other four are used as quarter bells. There were two bells cast as the clock tower's hour bell. A first, 16 ton weighing bell was cast by John Warner and Sons in 1856. Since the Clock Tower was not yet completed, the bell was hung temporarily in the Palace Yard.</p></HTML>"); 
               im1=new ImageIcon(getClass().getResource("/Images/big-ben.jpg"));
               j2.setIcon(im1);
               break;
      case 2: l1.setText("<HTML><p>2. Madame Tussauds<p>Touted as London's favorite tourist attraction, the statues at Madame Tussauds Wax Museum have been thrilling visitors since Tussaud opened her first permanent exhibit in 1835. Marie Tussaud (1761-1850), a native of Strasbourg, France, learned the fine art of sculpting from her mother's employer, a physician skilled in the art of wax modeling. The doctor, Philippe Curtius, was one of the first to display such works of art, opening an exhibition in 1776. Young Marie made her first sculpture at the tender age of 16, fashioning a likeness of French enlightenment writer, Francois Voltaire. Today it has expanded to many more cities including Las Vegas, New York City, Hong Kong, Shanghai, Washington DC and Hollywood. Visitors can view world leaders, actors/actresses, sports legends, famous writers and artists, religious figures, musicians, and a host of other characters.</p></HTML>");
               im1=new ImageIcon(getClass().getResource("/Images/madame-tussauds.jpg"));
	       j2.setIcon(im1);
               break;
      case 3: l1.setText("<HTML><br>3. Tower Bridge<p>London's Tower Bridge is one of the most recognizable bridges in the world. Its Victorian Gothic style stems from a law that forced the designers to create a structure that would be in harmony with the nearby Tower of London. The bridge, designed by city architect Horace Jones in collaboration with John Wolfe Barry, would eventually be completed in 1894. Taking photographs of the Tower bridge is a favorite London tourist activity, but you can also go inside the bridge, where you'll have a magnificent view over London from the walkway between the two bridge towers. Inside the bridge is the Tower bridge Exhibition, a display area that encompasses the walkway and the two famous towers where you can observe the Victorian engine room.</p></HTML>");
               im1=new ImageIcon(getClass().getResource("/Images/tower-bridge.jpg"));
               j2.setIcon(im1);
               break;
      case 4: l1.setText("<HTML><br>4. London eye<p>London Eye, is a giant observation wheel located in the Jubilee Gardens on the South Bank. The 135 meter (443ft) tall structure was built as part of London's millennium celebrations. The structure was designed by the architectural team of David Marks and Julia Barfield, husband and wife. The futuristic looking capsules, accommodating up to 25 passengers, were transported all the way from France by train through the chunnel. Each egg-shaped capsule is 8 meters long and weighs 500kg. The observation wheel turns slow enough for people to embark while it is moving. A complete turn takes about 30 minutes. Thanks to the construction of the glass capsules on the outer side of the rim, the passengers have a great 360° view over London.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/london-eye.jpg"));
	      j2.setIcon(im1);
              break;
      case 5: l1.setText("<HTML><br>5. Buckingham Palace<p>Buckingham Palace, one of several palaces owned by the British Royal family, is one of the major tourist attractions in London. The original building was constructed as a countryhouse in 1705 by the duke of Buckingham, John Sheffield. King George III bought the house in 1761 for his wife and had it altered by William Chambers.A part of the palace is still used by the Royal family. A flag is hoisted each time the Queen is in the Palace. The palace is not only home to the royal family, there are also a number of staff members living here. The palace has about 600 rooms, including a throne room, a ballroom, picture gallery and even a swimming pool. Some of these rooms can be visited during a couple of months in the summer - when the Royal Family is not in the palace.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/buckingham-palace.jpg"));
              j2.setIcon(im1);
              break;
      case 6: l1.setText("<HTML><br>6. Trafalgar Square<p>Trafalgar Square, the largest square in London, is often considered the heart of London. Ever since the Middle Ages, Trafalgar Square has been a central meeting place. At the middle of the square stands a tall column, a monument honoring admiral Nelson. At the center of the square is the tall Nelson's Column. Trafalgar square also contains a large number of statues and two fountains by Sir Edwin Lutyens, added in 1939. The square is surrounded by many great buildings. On the north side is the neo-classical National Gallery, built between 1834 and 1838. It houses a collection of more than 2300 paintings, including works by van Gogh, Renoir, Leonardo da Vinci and Claude Monet. On the east side the square is bordered by the Canada House, completed in 1827.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/trafalgar-square.jpg"));
              j2.setIcon(im1);
              break;
      case 7: l1.setText("<HTML><br>7. Palace of Westminster<p>The Houses of Parliament, also known as the Palace of Westminster is the seat of Britain's two parliamentary houses, the House of Lords and the House of Commons. In the middle of the 11th century, King Edward the Confessor had moved his court to the Palace of Westminster, situated on a central site near the river Thames. One of several lobbies in the Houses of Parliament is the Central Lobby where people can meet the Members of Parliament and persuade them to defend their interests. Hence the verb 'to lobby'. The oldest part of the Houses of Parliament is Westminster Hall, dating back to 1097. The large hammer beam roof was built in the 14th century and replaced the original roof which was supported by two rows of pillars. The hall is one of Europe's largest unsupported medieval halls. The Houses of Parliament are open to the public.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/palace-of-westminster.jpg"));
              j2.setIcon(im1);
              break;
      case 8: l1.setText("<HTML><br>8. Covent Garden<p>Covent Garden is one of the London's biggest tourist magnets. The area around the glass-covered building - a former fruit and vegetable market - is always crowded, especially during weekends and in summertime. Covent Garden is known for its many open-air cafés, restaurants, pubs, market stalls and shops. Famous are the many street performers who entertain the visitors on the pedestrianized piazza. A former floral market now houses the London Transport Museum. The Covent Garden district is also home to several theaters and the Royal Opera House.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/covent-garden.jpg"));
              j2.setIcon(im1);
              break;
      case 9: l1.setText("<HTML><br>9. Piccadilly Circus<p>Piccadilly Circus is a busy square in the heart of London. It is famous for the fountain that was installed here at the end of the 19th century and for the neon advertising that turned the square into a miniature version of Times Square. At the center of the Circus stands the Shaftesbury Memorial Fountain. It was built in 1893 to commemorate Lord Shaftesbury, a philanthropist known for his support of the poor. The seminude statue on top of the fountain depicts the Angel of Christian Charity but was later renamed Eros after the Greek god of love and beauty. The fountain was made in bronze, but the statue is made of aluminum, at the time a novel and rare material. Piccadilly Circus is now partly pedestrianized and a favorite place for people to congregate before going to the nearby shopping and entertainment areas.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/piccadilly-circus.jpg"));
              j2.setIcon(im1);
              break;
      }
   }
}
