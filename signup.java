//new user registeration form
import java.sql.*;
import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class signup extends JFrame implements ActionListener
{
String s1,s2,s3,s4,s5,s6="";
JButton b1;    
JLabel l1,ll1,l2,l3,l4,l5,l6;
JTextField t1,tt1,t2,t3,t4;
JPasswordField t5;
JRadioButton r1,r2;
ButtonGroup grp;
public signup()
{
setLayout(null);
grp=new ButtonGroup();
b1=new JButton("Submit");
l1=new JLabel("Name :");
ll1=new JLabel("Age :");
l6=new JLabel("Gender :");
l2=new JLabel("E-mail Id :");
l3=new JLabel("Occupation :");
l4=new JLabel("Username :");
l5=new JLabel("Password :");
t1=new JTextField(20);
tt1=new JTextField(20);
t2=new JTextField(20);
t3=new JTextField(20);
t4=new JTextField(20);
t5=new JPasswordField(20);
t5.setEchoChar('*');
r1=new JRadioButton("Male");
r2=new JRadioButton("Female");
l1.setBounds(20,20,100,25);t1.setBounds(130,20,180,25);
ll1.setBounds(20,50,100,25);tt1.setBounds(130,50,180,25);
l6.setBounds(20,80,100,25);
l2.setBounds(20,110,100,25);t2.setBounds(130,110,180,25);
l3.setBounds(20,140,100,25);t3.setBounds(130,140,180,25);
l4.setBounds(20,170,100,25);t4.setBounds(130,170,180,25);
l5.setBounds(20,200,100,25);t5.setBounds(130,200,180,25);
r1.setBounds(130,80,87,25);r2.setBounds(250,80,87,25);
b1.setBounds(100,240,100,25);
add(l1);add(t1);
add(ll1);add(tt1);
add(l2);add(t2);
add(l3);add(t3);
add(l4);add(t4);
add(l5);add(t5);
add(l6);
grp.add(r1);grp.add(r2);
add(b1);
add(r1);add(r2);
b1.addActionListener(this);
t1.addKeyListener(new mykey(this));
t3.addKeyListener(new mykey(this));
setResizable(false);
}
class mykey extends KeyAdapter
{
mykey(signup m)
{
}
public void keyReleased(KeyEvent ke)
{
t1.setText(t1.getText().toUpperCase());
t2.setText(t2.getText().toUpperCase());
t3.setText(t3.getText().toUpperCase());
t4.setText(t4.getText().toUpperCase());
}
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
    s1=t1.getText();s2=t2.getText();s3=t3.getText();
    s4=t4.getText();s5=t5.getText();
    if(r1.isSelected())s6=r1.getText();
    else if(r2.isSelected())s6=r2.getText();
    if((s1.equals("")) || (s2.equals(""))||(s3.equals(""))||(s4.equals(""))||(s5.equals(""))||(s6.equals("")))
          JOptionPane.showMessageDialog(this,"Your Text Field is empty.","Error Message",JOptionPane.ERROR_MESSAGE); 
      else
      {
          JOptionPane.showMessageDialog(this,"Your Sign-In is successful!","MESSAGE",JOptionPane.INFORMATION_MESSAGE);
          dispose();
      }
}
}
}