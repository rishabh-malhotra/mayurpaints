/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package condemo;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ctiDemo extends JFrame implements ActionListener
{
	JLabel l1,l2,l3;
	Font f,f1;
	JTextField t1,t2;
	JButton b1,b2;
	public ctiDemo()
	{
	setLayout(null);
	setTitle("welcome ctipage");
	setSize(1400,700);
	setVisible(true);
	f=new Font("monotype corsiva",Font.BOLD,45);
	f1=new Font("chiller",Font.BOLD,35);
	l1=new JLabel("WELCOME IN CUBE_CENTIMETRE TO CUBE_INCH CONVERTER");
	l3=new JLabel("INCH:");
	l2=new JLabel("CENTIMETRE:");
	t1=new JTextField();
	t2=new JTextField();
	t2.setEditable(false);
	b1=new JButton("..OK..");
	b2=new JButton("Back in main page");
	add(l1);add(l2);add(l3);add(b1);add(b2);add(t1);add(t2);
	l1.setFont(f);b1.setFont(f);b2.setFont(f);l2.setFont(f1);l3.setFont(f1);
	l1.setForeground(Color.blue);
	l2.setForeground(Color.pink);
	l3.setForeground(Color.blue);
	b1.setForeground(Color.red);
	b2.setForeground(Color.green);
	l1.setBounds(0,20,1400,45);
	l2.setBounds(20,150,200,30);
	l3.setBounds(20,250,200,30);
	t1.setBounds(240,150,200,30);
	t2.setBounds(240,250,200,30);
	b1.setBounds(50,600,200,45);
	b2.setBounds(400,600,500,45);
	b1.addActionListener(this);
	b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		
		try{
			double a=Double.parseDouble(t1.getText());
			double b;
			if(e.getSource()==b1)	
			{
				b=a*(0.0610237);
				t2.setText(String.valueOf(b));
			}
			else
			{
				welDemo5 wd5=new welDemo5();
				wd5.setVisible(true);
				this.setVisible(false);
			}
		}catch(Exception ae)
		{
			t2.setText("invalid input");
		}
	}
	public static void main(String[] arg)
	{
		ctiDemo ctid=new ctiDemo();
	}
} 