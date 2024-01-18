package Rome;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class romeattractions extends JPanel implements ActionListener
{
  int i=1;
  JLabel l1;
  JLabel j2;
  JButton b1,b2;
  ImageIcon im1;
  public romeattractions()
  {
    setLayout(null);
    l1=new JLabel("<HTML><br>1. The Colosseum<p>The Colosseum is probably the most impressive building of the Roman Empire. Originally known as the Flavian Amphitheater, it was the largest building of the era. The monumental structure has fallen into ruin, but even today it is an imposing and beautiful sight. The elliptical building is immense, measuring 188m by 156m and reaching a height of more than 48 meters (159 ft). The magnificent structure was clad in marble and 160 larger-than-life statues graced the arches on the upper floors. The Colosseum could accommodate some 55,000 spectators who entered the building through no less than 80 entrances. Above the ground are four stories, the upper story contained seating for lower classes and women. The lowest story was preserved for prominent citizens. Emperors used the Colosseum to entertain the public with free games. Those games were a symbol of prestige and power and they were a way for an emperor to increase his popularity.</p></HTML>");
    Font f2=new Font("Monotype Corsiva",Font.PLAIN,24);
    l1.setFont(f2);
    Color c1=new Color(0,0,255);
    l1.setBackground(c1);
    im1=new ImageIcon(getClass().getResource("/Images/colosseum.jpg"));
    j2=new JLabel(im1);
    b1=new JButton("Previous");
    b2=new JButton("Next");
    add(j2);add(l1);add(b1);add(b2);
    j2.setBounds(20,80,im1.getIconWidth(),im1.getIconHeight());
    l1.setBounds(im1.getIconWidth()+40,80,650,450);
    b1.setBounds(im1.getIconWidth()+80,550,100,30);
    b2.setBounds(im1.getIconWidth()+80+300,550,100,30);
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
       case 1: l1.setText("<HTML><br>1. Colosseum<p>The Colosseum is probably the most impressive building of the Roman Empire. Originally known as the Flavian Amphitheater, it was the largest building of the era. The monumental structure has fallen into ruin, but even today it is an imposing and beautiful sight. The elliptical building is immense, measuring 188m by 156m and reaching a height of more than 48 meters (159 ft). The magnificent structure was clad in marble and 160 larger-than-life statues graced the arches on the upper floors. The Colosseum could accommodate some 55,000 spectators who entered the building through no less than 80 entrances. Above the ground are four stories, the upper story contained seating for lower classes and women. The lowest story was preserved for prominent citizens. Emperors used the Colosseum to entertain the public with free games. Those games were a symbol of prestige and power and they were a way for an emperor to increase his popularity.</p></HTML>");
               im1=new ImageIcon(getClass().getResource("/Images/colosseum.jpg"));
               j2.setIcon(im1);
               break;
      case 2: l1.setText("<HTML><br>2. St. Peter's Basilica<p>Saint Peter's Basilica, the world's largest church, is the center of Christianity. The imposing structure was built over a span of more than one hundred years by the greatest Italian architects of the era. The church is built on Vatican Hill, across the Tiber river from the historic center of Rome. The location is highly symbolic: this was the site where Saint Peter, the chief apostle, died a martyr and where he was buried in 64 AD. St. Peter is considered the first pope, so it made perfect sense for the papacy to build the principal shrine of the Catholic church here. The basilica has a surface area of 15,160 square meters, enough space to accommodate 60,000 visitors. It is covered by a coffered barrel vault ceiling and a huge central dome. St. Peter's is located in Vatican City, across the river Tiber, west of Rome's center. Vatican City is completely surrounded by the city of Rome. Entrance to the basilica is free but make sure you are dressed properly since a very strict dress code is enforced.</p></HTML>");
               im1=new ImageIcon(getClass().getResource("/Images/church.jpg"));
	       j2.setIcon(im1);
               break;
      case 3: l1.setText("<HTML><br>3. Trevi Fountain<p>The Fontana di Trevi or Trevi Fountain is the most famous and arguably the most beautiful fountain in all of Rome. This impressive monument dominates the small Trevi square located in the Quirinale district. The central figure of the fountain, in front of a large niche, is Neptune, god of the sea. He is riding a chariot in the shape of a shell, pulled by two sea horses. Each sea horse is guided by a Triton. One of the horses is calm and obedient, the other one restive. They symbolize the fluctuating moods of the sea. On the left hand side of Neptune is a statue representing Abundance, the statue on the right represents Salubrity. Above the sculptures are bas-reliefs, one of them shows Agrippa, the general who built the aqueduct that carries water to the fountain. The water at the bottom of the fountain represents the sea. Legend has it you will return to Rome if you throw a coin into the water. You should toss it over your shoulder with your back to the fountain.</p></HTML>"); 
               im1=new ImageIcon(getClass().getResource("/Images/fountain.jpg"));
               j2.setIcon(im1);
               break;
      case 4: l1.setText("<HTML><br>4. Piazza di Spagna<p>Piazza di Spagna is one of the most popular meeting places in Rome. It is also one of the most visually pleasing squares. The combination of a monumental staircase (the famous Spanish Steps), an obelisk and a beautiful church draws photographers to the square. The Piazza di Spagna (Spanish Square) is connected to a French church (Trinità dei Monti) on top of the hill via a long staircase, the Scalinata della Trinità dei Monti, better known as the Spanish Steps. The idea of connecting the church with the square below originates from the 17th century, when the French also planned a statue of King Louis XIV of France at the top of the staircase. At the foot of the Spanish Steps lies the Piazza di Spagna (Spanish Square). The long, triangular square is named after the Spanish Embassy to the Holy See. In the 17th century, the area around the embassy was even considered Spanish territory. In front of the Spanish Steps stands the Fontana della Barcaccia, a rather sober but elegant looking fountain.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/piazza-di-spagna.jpg"));
	      j2.setIcon(im1);
              break;
      case 5: l1.setText("<HTML><br>5. Villa Borghese Park<p>Villa Borghese is the largest public park in Rome. It offers a pleasant refuge from the often hectic streets in the city. The park features a lake, temples, fountains, statues and several museums. The park is located just north of theSpanish Steps. Main entrances are at the Piazzale Flaminio (near Piazza del Popolo) and the Porta Pinciana at the end of the Via Veneto. The area started as a vineyard in the 16th century. In 1605 cardinal Scipione Borghese, a nephew of pope Paul V, turned the vineyard into a park. Dubbed the 'park of museums', the Villa Borghese park is also home to several museums. The park also contains an amphitheater (the Piazza di Siena), an 18th century arch (the arco di Settimio Severo) and a botanical garden.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/villa-borghese.jpg"));
              j2.setIcon(im1);
              break;
      case 6: l1.setText("<HTML><br>6. Palatine Hill<p>With a past that pre-dates the city itself, Rome's Palatine Hill holds an important place in the history of the Eternal City. Today only ruins remain but during the Imperial era, the hill was completely built up with large palaces. Palatine Hill is the centremost of the famous seven hills of Rome. Located in between such attractions as the Circus Maximus, the Colosseum, and theRoman Forum, evidence from archaeological digs demonstrates that the hill was inhabited as long ago as the 10th century BC. The Palatine Hill is littered with ruins from ancient palaces and other buildings. Just north of the palace of Septimius Severus is the so-called stadium. It is not clear if this area was actually a public or private stadium, or that it was used as a private imperial garden. At the north-west end of the Palatine Hill are the ruins of the Palace of Tiberius (aka Palace of Caligula), built in the 1st century AD.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/palatine-hill.jpg"));
              j2.setIcon(im1);
              break;
      case 7: l1.setText("<HTML><br>7. Vatican Museums<p>What started as just a small collection of sculptures has, over the centuries, turned into a complex of the world's most magnificent museums featuring one of the finest collections of art on the planet. The many museums that make up the Vatican complex are quite diverse. Nonetheless, each is interesting to explore and which you enjoy most will largely depend on your artistic preferences. One of the highlights of the Vatican Museums is the famous Sistine Chapel, where visitors can enjoy not only Michelangelo's magnificent ceiling but also a host of other wonderful works of art, including the The Last Judgment on the altar wall, from the same artist. (Bring binoculars for a better view.) Before exiting the museum you have the chance to admire one of the world's most famous staircases. Designed in 1932 by Giuseppe Momo, the staircase consists of a double helix, one leading up and one leading down. The beautiful bronze staircase is decorated with papal coats of arms.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/vatican-museums.jpg"));
              j2.setIcon(im1);
              break;
      case 8: l1.setText("<HTML><br>8. Victor Emmanuel Monument<p>Officially known as the Monumento Nazionale a Vittorio Emanuele II, the enormous white marble monument that dominates Piazza Venezia was built as a tribute to the first king of a united Italy, Victor Emmanuel II. The Monument to Victor Emanuel II, also known as 'Il Vittoriano' and sometimes also referred to as the Altare della Patria (Altar of the Nation). The monument, about 80 meters high and 120 meters wide (260 x 390ft), consists of a large flight of stairs leading up to a massive colonnade. To the right and left of the main entrance - which is closed off by a gate at night - are two fountains, allegorical representations of the two seas that border Italy. The left one depicts the Adriatic Sea and the right one is the Tyrrhenian Sea. Inside the monument are large rooms; half of those are used for exhibitions. The other half houses the Museo centrale del Risorgimento, a museum dedicated to the history of the unification of Italy.</p></HTML>");
              im1=new ImageIcon(getClass().getResource("/Images/victor-emmanuel.jpg"));
              j2.setIcon(im1);
              break;
      }
   }
}
