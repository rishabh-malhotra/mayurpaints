/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package condemo;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ctfDemo extends JFrame implements ActionListener
{
	JLabel l1,l2,l3;
	Font f,f1;
	JTextField t1,t2;
	JButton b1,b2;
	public ctfDemo()
	{
	setLayout(null);
	setTitle("welcome ctfpage");
	setSize(1400,700);
	setVisible(true);
	f=new Font("monotype corsiva",Font.BOLD,50);
	f1=new Font("chiller",Font.BOLD,35);
	l1=new JLabel("WELCOME IN CALSIUS TO FAHRENHEIT CONVERTER");
	l2=new JLabel("CALSIUS:");
	l3=new JLabel("FAHRENHEIT:");
	t1=new JTextField();
	t2=new JTextField();
	t2.setEditable(false);
	b1=new JButton("..OK..");
	b2=new JButton("Back in main page");
	add(l1);add(l2);add(l3);add(b1);add(b2);add(t1);add(t2);
	l1.setFont(f);b1.setFont(f);b2.setFont(f);l2.setFont(f1);l3.setFont(f1);
	l1.setForeground(Color.blue);
	l2.setForeground(Color.pink);
	l3.setForeground(Color.cyan);
	b1.setForeground(Color.magenta);
	b2.setForeground(Color.green);
	l1.setBounds(50,20,1300,50);
	l2.setBounds(20,150,200,30);
	l3.setBounds(20,250,200,30);
	t1.setBounds(240,150,200,30);
	t2.setBounds(240,250,200,30);
	b1.setBounds(50,600,200,50);
	b2.setBounds(400,600,500,50);
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
				b=a*(33.8);
				t2.setText(String.valueOf(b));
			}
			else
			{
				welDemo1 wd1=new welDemo1();
				wd1.setVisible(true);
				this.setVisible(false);
			}
		}catch(Exception ae)
		{
			t2.setText("invalid input");
		}
	}
	public static void main(String[] arg)
	{
		ctfDemo ctfd=new ctfDemo();
	}
} 
