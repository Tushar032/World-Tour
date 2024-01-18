import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
public class gallery extends JFrame implements ActionListener
{
  JTextField t1;
  JButton btn1,btn2;
  JLabel l1;
  ImageIcon img=null;
  static int i=1;
  public gallery()
  {
    setLayout(null);
    t1=new JTextField(10);
    t1.setText("1/25");
    img=new ImageIcon(getClass().getResource("/Images/tower-bridge.jpg"));
    l1=new JLabel(img);
    btn1=new JButton("Next");
    btn2=new JButton("Previous");
    l1.setBounds(350,140,img.getIconWidth(),img.getIconHeight());
    btn2.setBounds(480,80,100,30);
    t1.setBounds(650,80,90,30);
    btn1.setBounds(830,80,100,30);
    btn1.addActionListener(this);
    btn2.addActionListener(this);
    add(btn2);add(t1);add(btn1);add(l1);
  }
  public void actionPerformed(ActionEvent ae)
  {
    if(ae.getSource()==btn1)
    {
       i++;
    }
    else
    {
       i--;
    }
    if(i==26)
    {
       i=1;
    }
    if(i==0)
       i=25;
    t1.setText(i+"/25");
    switch(i)
    {
        case 1:
	img=new ImageIcon(getClass().getResource("/Images/tower-bridge.jpg"));
        l1.setIcon(img);
        break;
	case 2:
	img=new ImageIcon(getClass().getResource("/Images/royal-palace.jpg"));
	l1.setIcon(img);
	break;
	case 3:
	img=new ImageIcon(getClass().getResource("/Images/theLouvre.jpg"));
	l1.setIcon(img);
	break;
	case 4:
	img=new ImageIcon(getClass().getResource("/Images/Luxembourg.jpg"));
	l1.setIcon(img);
	break;
	case 5:
	img=new ImageIcon(getClass().getResource("/Images/colosseum.jpg"));
	l1.setIcon(img);
	break;
	case 6:
	img=new ImageIcon(getClass().getResource("/Images/times-square.jpg"));
	l1.setIcon(img);
	break;
	case 7:
	img=new ImageIcon(getClass().getResource("/Images/fountain.jpg"));
	l1.setIcon(img);
	break;
	case 8:
	img=new ImageIcon(getClass().getResource("/Images/london-eye.jpg"));
	l1.setIcon(img);
	break;
	case 9:
	img=new ImageIcon(getClass().getResource("/Images/madame-tussauds.jpg"));
	l1.setIcon(img);
	break;
	case 10:
	img=new ImageIcon(getClass().getResource("/Images/museum.jpg"));
	l1.setIcon(img);
	break;
	case 11:
	img=new ImageIcon(getClass().getResource("/Images/statue.jpg"));
	l1.setIcon(img);
	break;
	case 12:
	img=new ImageIcon(getClass().getResource("/Images/ParisPantheon.jpg"));
	l1.setIcon(img);
	break;
	case 13:
	img=new ImageIcon(getClass().getResource("/Images/piccadilly-circus.jpg"));
	l1.setIcon(img);
	break;
	case 14:
	img=new ImageIcon(getClass().getResource("/Images/alamo-square.jpg"));
        l1.setIcon(img);
        break;
	case 15:
	img=new ImageIcon(getClass().getResource("/Images/dubai-fountain.jpg"));
        l1.setIcon(img);
        break;
	case 16:
	img=new ImageIcon(getClass().getResource("/Images/city-hall.jpg"));
        l1.setIcon(img);
        break;
	case 17:
	img=new ImageIcon(getClass().getResource("/Images/dubai-mall2.jpg"));
        l1.setIcon(img);
        break;
	case 18:
	img=new ImageIcon(getClass().getResource("/Images/burj-al-arab.jpg"));
        l1.setIcon(img);
        break;
	case 19:
	img=new ImageIcon(getClass().getResource("/Images/chicago-fountain.jpg"));
        l1.setIcon(img);
        break;
	case 20:
	img=new ImageIcon(getClass().getResource("/Images/harbour-bridge.jpg"));
        l1.setIcon(img);
        break;
	case 21:
	img=new ImageIcon(getClass().getResource("/Images/lake-zurich.jpg"));
        l1.setIcon(img);
        break;
	case 22:
	img=new ImageIcon(getClass().getResource("/Images/lindenhof.jpg"));
        l1.setIcon(img);
        break;
	case 23:
	img=new ImageIcon(getClass().getResource("/Images/millennium.jpg"));
        l1.setIcon(img);
        break;
	case 24:
	img=new ImageIcon(getClass().getResource("/Images/mangkok.jpg"));
        l1.setIcon(img);
        break;
	case 25:
	img=new ImageIcon(getClass().getResource("/Images/lindenhof2.jpg"));
        l1.setIcon(img);
        break;
     }
     
  }
}