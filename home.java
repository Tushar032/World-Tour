import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import Paris.*;
import Amsterdam.*;
import London.*;
import Paris.*;
public class home extends JFrame implements ActionListener,Runnable,MenuListener
{
   JProgressBar pb;
   int j=1,i=1;
   ImageIcon img;
   JLabel j1,j2,j3;

   JMenuBar mb;
   JMenu m1,m2,m3,m4,m5,m6,m7,m8,m9;
   JMenuItem i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14,i15,i16,i17,i18,i19,i20;      
   public home()
   {
      setLayout(null);
      pb=new JProgressBar(0,100);
      pb.setStringPainted(true);
      pb.setVisible(false);




      img=new ImageIcon(getClass().getResource("/Images/collage.jpg"));
      j3=new JLabel(img);
      j1=new JLabel("WORLD TOUR");
      Font f1=new Font("Monotype Corsiva",Font.BOLD,24);
      j1.setFont(f1);
      Color c=new Color(255,150,100);
      j1.setForeground(c);
      j2=new JLabel("<HTML><p>Welcome to WORLD TOUR. This app gives information about the"+"\n"+
                    "15 most visited cities across the Globe. It includes cities"+"\n"+ "from Europe, Asia, North America, South America and Australia. A brief description which includes photos, facts, map and topmost attractions of these cities is provided. I hope you will have a wonderful experience after exploring this application!</p></HTML>");
      Font f2=new Font("Monotype Corsiva",Font.PLAIN,28);
      j2.setFont(f2);
      Color c1=new Color(100,100,255);
      j2.setBackground(c1);
      j1.setBounds(560,0,300,50);
      j3.setBounds(20,40,img.getIconWidth(),img.getIconHeight());
      j2.setBounds(img.getIconWidth()+60,80,600,500);


      add(j1);add(j3);add(j2);add(pb);
      addWindowListener(new wclose(this)); 
 
 
   mb=new JMenuBar();  
   mb.setBackground(Color.cyan);
   m1=new JMenu("Home");
   m2=new JMenu("Cities");
   m8=new JMenu("Gallery");
   m9=new JMenu("Contact Us");

   m3=new JMenu("North America");
   i1=new JMenuItem("Chicago");
   i2=new JMenuItem("New York");
   i3=new JMenuItem("San Francisco");
   m3.add(i1);m3.add(i2);m3.add(i3);m2.add(m3);

   m4=new JMenu("South America");
   i4=new JMenuItem("Rio de Janeiro");
   m4.add(i4);m2.add(m4);

   m5=new JMenu("Asia");
   i5=new JMenuItem("Dubai");
   i6=new JMenuItem("Hong Kong");
   i9=new JMenuItem("Seoul");
   m5.add(i5);m5.add(i6);m5.add(i9);
   m2.add(m5);

   m6=new JMenu("Europe");
   i12=new JMenuItem("Amsterdam");
   i13=new JMenuItem("Barcelona");
   i14=new JMenuItem("Istanbul");
   i15=new JMenuItem("London");   
   i17=new JMenuItem("Paris");
   i18=new JMenuItem("Rome");
   i19=new JMenuItem("Zurich");
   m6.add(i12);m6.add(i13);m6.add(i14);m6.add(i15);
   m6.add(i17);m6.add(i18);m6.add(i19);m2.add(m6);
  
   m7=new JMenu("Australia");
   i20=new JMenuItem("Sydney");
   m7.add(i20);m2.add(m7);

   mb.add(m1);mb.add(m2);mb.add(m8);mb.add(m9);
   setJMenuBar(mb);

  m9.addMenuListener(this);m1.addMenuListener(this);m8.addMenuListener(this);
  i17.addActionListener(this);i15.addActionListener(this);i2.addActionListener(this);
  i18.addActionListener(this);i12.addActionListener(this);i20.addActionListener(this);
  i13.addActionListener(this);i1.addActionListener(this);
  i3.addActionListener(this);i6.addActionListener(this);i5.addActionListener(this);
  i4.addActionListener(this);i19.addActionListener(this);
//i9.addActionListener(this);
//i14.addActionListener(this);
  
   }
   public class wclose extends WindowAdapter
   {
      wclose(home h)
      {
      } 
      public void windowClosing(WindowEvent w)
      {
          System.exit(0);
      }
   }
   /*public void run()
   {
     try
     {
     while(i<4)
     {
        Thread.sleep(1000);
        switch(i)
        {
          case 1:   img=new ImageIcon(getClass().getResource("/Images/collage.jpg"));
                    j3.setIcon(img);
                    break;
          case 2:   img=new ImageIcon(getClass().getResource("/Images/tower-bridge.jpg"));
                    j3.setIcon(img);
                    break;
          case 3:   img=new ImageIcon(getClass().getResource("/Images/colosseum.jpg"));
		    j3.setIcon(img);
                    break;
        }
        i++;
        if(i==4)
          i=1;
     }
     }*/

     public void run()
           {
             try
                {
                   if(j<=100)
                       {
                          Thread.sleep(50);
                          Thread t=new Thread(this);
                          t.start();
                          pb.setValue(j);
                          j+=1;
                       }
                }
     catch(Exception e)
     {
        System.out.println("Exception caught:"+e);
     }
   }
    public void menuCanceled(MenuEvent me)
    {}
    public void menuSelected(MenuEvent me)
    {
        JMenu test=(JMenu) me.getSource();
        if(test.getText()=="Contact Us")
        {
            contact co=new contact();
            co.setSize(400,370); 
            co.setTitle("Contact Us");
	    co.setVisible(true);
	    co.show();
            Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize(); 
            int x = (int) ((dimension.getWidth() - co.getWidth()) / 2);
            int y = (int) ((dimension.getHeight() - co.getHeight()) / 2);
            co.setLocation(x, y);  
        }
        if(test.getText()=="Home")
        {
     	    j1.setVisible(false);j2.setVisible(false);j3.setVisible(false);

	    pb.setVisible(true);	
	    Thread t=new Thread();
            t.start();
	    pb.setVisible(false);
            j1.setVisible(true);j2.setVisible(true);j3.setVisible(true);

        }
        if(test.getText()=="Gallery")
        {
           gallery g=new gallery();           
           g.setSize(1150,600);
           g.setTitle("Gallery");
	   g.setVisible(true);
	   g.show();
           Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
           int x=(int)((d.getWidth()-1150)/2);
           int y=(int)((d.getHeight()-600)/2);
           g.setLocation(x,y);           
        }    
   }   
   public void menuDeselected(MenuEvent me)
   {}
   
   public void actionPerformed(ActionEvent ae)
   { 
     
      if(ae.getActionCommand()=="Paris")
      {
         parispane pp1=new parispane();
         Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
         pp1.setSize(900,500);
         pp1.setTitle("Paris");
         int x=(int)((d.getWidth()-900)/2);
         int y=(int)((d.getHeight()-500)/2);
         pp1.setLocation(x,y);
         pp1.setVisible(true);
      } 
      if(ae.getActionCommand()=="London")
      { 
         london_pane pp2=new london_pane(); 
         Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
         pp2.setTitle("London");
         pp2.setSize(900,500);
         int x=(int)((d.getWidth()-900)/2);
         int y=(int)((d.getHeight()-500)/2);
         pp2.setLocation(x,y);
         pp2.setVisible(true);
      }
      if(ae.getActionCommand()=="New York")
      {
         nypane pp3=new nypane(); 
         Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
         pp3.setTitle("New York");
         pp3.setSize(900,500);
         int x=(int)((d.getWidth()-900)/2);
         int y=(int)((d.getHeight()-500)/2);
         pp3.setLocation(x,y);
         pp3.setVisible(true);
      }
      if(ae.getActionCommand()=="Amsterdam")
      {
         amsterdampane pp5=new amsterdampane();
         Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
         pp5.setSize(900,500);
         pp5.setTitle("Amsterdam");
         int x=(int)((d.getWidth()-900)/2);
         int y=(int)((d.getHeight()-500)/2);
         pp5.setLocation(x,y);
         pp5.setVisible(true);
      } 
      if(ae.getActionCommand()=="Rome")
      {
         romepane pp4=new romepane(); 
         Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
         pp4.setTitle("Rome");
         pp4.setSize(900,500);
         int x=(int)((d.getWidth()-900)/2);
         int y=(int)((d.getHeight()-500)/2);
         pp4.setLocation(x,y);
         pp4.setVisible(true);
      } 
      if(ae.getActionCommand()=="Sydney")
      {
         sydneypane pp6=new sydneypane();
         Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
         pp6.setSize(900,500);
         pp6.setTitle("Sydney");
         int x=(int)((d.getWidth()-900)/2);
         int y=(int)((d.getHeight()-500)/2);
         pp6.setLocation(x,y);
         pp6.setVisible(true);
      } 
      if(ae.getActionCommand()=="San Francisco")
      {
         sanpane pp7=new sanpane();
         Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
         pp7.setSize(900,500);
         pp7.setTitle("San Francisco");
         int x=(int)((d.getWidth()-900)/2);
         int y=(int)((d.getHeight()-500)/2);
         pp7.setLocation(x,y);
         pp7.setVisible(true);
      }
      if(ae.getActionCommand()=="Hong Kong")
      {
         hongkongpane pp8=new hongkongpane();
         Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
         pp8.setSize(900,500);
         pp8.setTitle("Hong Kong");
         int x=(int)((d.getWidth()-900)/2);
         int y=(int)((d.getHeight()-500)/2);
         pp8.setLocation(x,y);
         pp8.setVisible(true);
      }
      if(ae.getActionCommand()=="Dubai")
      {
         dubaipane pp9=new dubaipane();
         Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
         pp9.setSize(900,500);
         pp9.setTitle("Dubai");
         int x=(int)((d.getWidth()-900)/2);
         int y=(int)((d.getHeight()-500)/2);
         pp9.setLocation(x,y);
         pp9.setVisible(true);
      }
      if(ae.getActionCommand()=="Barcelona")
      {
         barcelonapane pp10=new barcelonapane();
         Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
         pp10.setSize(900,500);
         pp10.setTitle("Barcelona");
         int x=(int)((d.getWidth()-900)/2);
         int y=(int)((d.getHeight()-500)/2);
         pp10.setLocation(x,y);
         pp10.setVisible(true);
      }  
      if(ae.getActionCommand()=="Chicago")
      {
         chicagopane pp11=new chicagopane();
         Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
         pp11.setSize(900,500);
         pp11.setTitle("Chicago");
         int x=(int)((d.getWidth()-900)/2);
         int y=(int)((d.getHeight()-500)/2);
         pp11.setLocation(x,y);
         pp11.setVisible(true);
      } 
      if(ae.getActionCommand()=="Zurich")
      {
         zurichpane pp12=new zurichpane();
         Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
         pp12.setSize(900,500);
         pp12.setTitle("Zurich");
         int x=(int)((d.getWidth()-900)/2);
         int y=(int)((d.getHeight()-500)/2);
         pp12.setLocation(x,y);
         pp12.setVisible(true);
      }
      if(ae.getActionCommand()=="Rio de Janeiro")
      {
         riopane pp13=new riopane();
         Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
         pp13.setSize(900,500);
         pp13.setTitle("Rio de Janeiro");
         int x=(int)((d.getWidth()-900)/2);
         int y=(int)((d.getHeight()-500)/2);
         pp13.setLocation(x,y);
         pp13.setVisible(true);
      }                                                                                     
   }
  public static void main(String[] args)
  {
    home h=new home();
   h.setTitle("World Tour   @ Copyright:(Tushar Bagga)");
    Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
    int x=(int)d.getWidth();
    int y=(int)d.getHeight();
    h.setVisible(true);
    h.setSize(x,y);  
  }
}