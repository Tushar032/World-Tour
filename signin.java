//registered user
import java.sql.*;
import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class signin extends JFrame implements ActionListener
{
JButton b1;    
JLabel l1,l2;
JTextField t1;
JPasswordField t2;
public signin()
{
setLayout(null);
l1=new JLabel("Username :");
l2=new JLabel("Password :");
t1=new JTextField(30);
t2=new JPasswordField(30);
t2.setEchoChar('*');
b1=new JButton("Sign In");
l1.setBounds(20,20,150,30);t1.setBounds(170,20,150,30);
l2.setBounds(20,50,150,30);t2.setBounds(170,50,150,30);
b1.setBounds(150,90,100,30);
add(l1);add(t1);add(l2);add(t2);add(b1);
b1.addActionListener(this);
addWindowListener(new wclose(this));
}
public class wclose extends WindowAdapter
   {
      wclose(signin h)
      {
      } 
      public void windowClosing(WindowEvent w)
      {
          dispose();
      }
   }
public void actionPerformed(ActionEvent ae)
{
  if(ae.getSource()==b1)
  {
      if((t1.getText().equals("")) || (t2.getText().equals("")))
          JOptionPane.showMessageDialog(this,"Your Text Field is empty.","Error Message",JOptionPane.ERROR_MESSAGE); 
      else
      {
          JOptionPane.showMessageDialog(this,"Your Sign-In is successful!","MESSAGE",JOptionPane.INFORMATION_MESSAGE);
          dispose();
      }
  }
}
}