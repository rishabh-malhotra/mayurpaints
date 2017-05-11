/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package condemo;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class welDemo extends JFrame implements ActionListener
{
	JLabel l1;
	Font f,f1;
	ButtonGroup bg;
	JRadioButton r1,r2,r3,r4,r5;
	public welDemo()
	{
	setLayout(null);
	setTitle("WLCOME PAGE");
	setVisible(true);
	setSize(1400,700);
	f=new Font("Monotype corsiva",Font.BOLD,60);
	f1=new Font("chiller",Font.BOLD,40);
	l1=new JLabel("WELCOME IN CONVERTER");
	l1.setFont(f);
	bg=new ButtonGroup();
	r1=new JRadioButton("TEMPERATURE",false);
	r2=new JRadioButton("WEIGHT",false);
	r3=new JRadioButton("LENGTH",false);
	r4=new JRadioButton("AREA",false);
	r5=new JRadioButton("VOLUME",false);
	r1.setForeground(Color.red);
	l1.setForeground(Color.magenta);
	r3.setForeground(Color.pink);
	r4.setForeground(Color.blue);
	r5.setForeground(Color.green);
	r2.setForeground(Color.cyan);
	r1.setFont(f1);
	r2.setFont(f1);
	r3.setFont(f1);
	r4.setFont(f1);
	r5.setFont(f1);
	bg.add(r1);bg.add(r2);bg.add(r3);bg.add(r4);bg.add(r5);
	add(r1);add(r2);add(r3);add(r4);add(r5);add(l1);
	l1.setBounds(200,20,1000,50);
	r1.setBounds(20,150,500,30);
	r2.setBounds(20,200,500,30);
	r3.setBounds(20,250,500,30);
	r4.setBounds(20,300,500,30);
	r5.setBounds(20,350,500,30);
	r1.addActionListener(this);
	r2.addActionListener(this);
	r3.addActionListener(this);
	r4.addActionListener(this);
	r5.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==r1)
		{
			welDemo1 wd1=new welDemo1();
			wd1.setVisible(true);
			this.setVisible(false);
		}
		else if(e.getSource()==r2)
		{
			welDemo2 wd2=new welDemo2();
			wd2.setVisible(true);
			this.setVisible(false);
		}
		else if(e.getSource()==r3)
		{
			welDemo3 wd3=new welDemo3();
			wd3.setVisible(true);
			this.setVisible(false);
		}
		else if(e.getSource()==r4)
		{
			welDemo4 wd4=new welDemo4();
			wd4.setVisible(true);
			this.setVisible(false);
		}
		else
		{
			welDemo5 wd5=new welDemo5();
			wd5.setVisible(true);
			this.setVisible(false);
		}
	}
	public static void main(String[] arg)
	{
		new welDemo();
	}
}   
