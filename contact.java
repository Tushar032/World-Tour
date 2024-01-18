import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class contact extends JFrame implements ActionListener
{
   JLabel l1,l2,l3;
   JTextArea a1;
   JButton b1;
   public contact()
   {
     setLayout(new FlowLayout());
     l1=new JLabel("For any Query: ");
     Font f1=new Font("Monotype Corsiva",Font.BOLD,22);
     l1.setFont(f1);
     l2=new JLabel("E-mail us at: Tushar@gmail.com");
     l2.setFont(f1);
     l3=new JLabel("Query:");
     l3.setFont(f1);
     a1=new JTextArea(10,25);
     b1=new JButton("Submit");
     add(l1);add(l2);add(l3);add(a1);add(b1);
     b1.addActionListener(this);
     addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent w)
                    { dispose(); }
                    });
     setResizable(false);
   }
   public void actionPerformed(ActionEvent ae)
   {
      if(ae.getSource()==b1)
      {
         String s=new String();
         s=a1.getText();
         if(s.equals(""))
              JOptionPane.showMessageDialog(this,"Fill your Query in the text area.","Error Message",JOptionPane.ERROR_MESSAGE); 
         else
         {
              JOptionPane.showMessageDialog(this,"Your Query has been submitted successfully.","Query Form",JOptionPane.INFORMATION_MESSAGE);
              dispose();
         }
       }
   }
}