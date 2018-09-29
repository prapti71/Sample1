
package form;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form extends JFrame implements ActionListener
{
JLabel fname,lname,cn,add,dob,gender,hob,ms;
JTextField t1,t2,t3;
JTextArea a1;
JComboBox b1;
JButton submit,can,reset;
JCheckBox c1,c2,c3,c4;
JRadioButton male,female,m1,m2;
ButtonGroup bg;
ButtonGroup bg1;
//String day[]={"1","2",}
        



Form()
{

fname=new JLabel("First Name:");
lname=new JLabel("Last Name:");
t1=new JTextField();
t2=new JTextField();
cn=new JLabel("Contact No:");
t3=new JTextField();
add=new JLabel("Address:");
a1=new JTextArea();
dob=new JLabel("Date of Birth:");
b1=new JComboBox();
gender=new JLabel("Gender:");
male=new JRadioButton("Male");
female=new JRadioButton("Female");
ms=new JLabel("Marital Staus:");
m1=new JRadioButton("Married");
m2=new JRadioButton("Unmarried");
hob=new JLabel("Hobbies:");
c1=new JCheckBox("Swimming");
c2=new JCheckBox("Reading");
c3=new JCheckBox("Dancing");
c4=new JCheckBox("Creativity");
submit=new JButton("Submit");
can=new JButton("Cancel");
reset=new JButton("Reset");

bg=new ButtonGroup();
//bg1=new ButtonGroup();

setSize(500,500);
setVisible(true);
setTitle("Registration Form");
setLayout(null);



fname.setBounds(50,50,100,30);
lname.setBounds(50,100,100,30);
t1.setBounds(150, 50,100,30);
t2.setBounds(150,100,100,30);
add.setBounds(50,150,100,30);
a1.setBounds(150,150,300,100);
dob.setBounds(50,300,100,30);
b1.setBounds(150,300,100, 30);
cn.setBounds(50,350,100,30);
t3.setBounds(150,350,100,30);
gender.setBounds(50,400,100,30);
male.setBounds(150,400,100,30);
female.setBounds(270,400,100,30);
ms.setBounds(50,450,100,30);
m1.setBounds(150,450,100,30);
m2.setBounds(270,450,100,30);
hob.setBounds(50,500,100,30);
c1.setBounds(150,500,100,30);
c2.setBounds(250,500,100,30);
c3.setBounds(350,500,100,30);
c4.setBounds(450,500,100,30);
submit.setBounds(50,550,100,30);
can.setBounds(200,550,100,30);
reset.setBounds(350,550,100,30);

        

add(fname);
add(lname);
add(cn);
add(t1);
add(t2);
add(t3);
add(a1);
add(b1);
add(submit);
add(can);
add(reset);
add(c1);
add(c2);
add(c3);
add(c4);
add(male);
add(female);
add(add);
add(dob);
bg.add(male);
bg.add(female);
add(gender);
add(hob);
add(ms);
bg.add(m1);
bg.add(m2);
add(m1);
add(m2);


submit.addActionListener(this);
can.addActionListener(this);
reset.addActionListener(this);
}
    
    
    public static void main(String[] args)
 {
    Form f1=new Form();
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    String s1=t1.getText();
String s2=t2.getText();
String s3=t3.getText();
String s4=a1.getText();


if(e.getSource()==submit)
{
  if(s1.equals("")||s2.equals("")||s3.equals("")||s4.equals("")||bg.isSelected(null)||(c1.isSelected()==false && c2.isSelected()==false && c3.isSelected()==false && c4.isSelected()==false)|| bg1.isSelected(null)|| bg1.isSelected(null))
  {
      JOptionPane.showMessageDialog(this,"Please fill the reqired details" );
  }
  else
  {
      JOptionPane.showMessageDialog(this,"Your form has been submitted" );
  }
}
else if(e.getSource()==can)
{
dispose();
}
else if(e.getSource()==reset)
{
t1.setText("");
t2.setText("");
t3.setText("");
a1.setText("");
//t2.setText("");
//



}       
       
    }

}
