package HongKong;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class hongkongdescription extends JPanel
{
  JLabel l1,l2;
  Icon img2;
  public hongkongdescription()
  {
    setLayout(null);
    l1=new JLabel("<HTML><p>In 1841 Hong Kong Island - not much more than 'a barren island with few houses' - was ceded to the British. In 1997 negotiations between Britain and China resulted in the handover of Hong Kong back to China. Under the credo 'one country, two systems', Hong Kong is now a Special Administrative Region (S.A.R.) of China. Hong Kong is a dazzling commercial city where east meets west. The lack of space in Hong Kong has led to the largest concentration of tall buildings in the world, even ahead of New York City.</p></HTML>");
    img2=new ImageIcon(getClass().getResource("/Images/skyline.jpg"));
    l2=new JLabel(img2);
    Font f2=new Font("Monotype Corsiva",Font.PLAIN,24);
    l1.setFont(f2);
    Color c1=new Color(100,100,255);
    l1.setBackground(c1);    
    l2.setBounds(20,80,img2.getIconWidth(),img2.getIconHeight());
    l1.setBounds(img2.getIconWidth()+50,80,550,400);
    add(l2);add(l1);
   }
}

    
    