/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package condemo;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class welDemo1 extends JFrame implements ActionListener
{
	JLabel l1;
	JButton b1;
	Font f,f1;
	ButtonGroup bg;
	JRadioButton r1,r2,r3,r4,r5,r6;
	public welDemo1()
	{
	setLayout(null);
	setTitle("WLCOME PAGE1");
	setVisible(true);
	setSize(1400,700);
	f=new Font("monotype corsiva",Font.BOLD,50);
	f1=new Font("chiller",Font.BOLD,35);
	l1=new JLabel("WELCOME IN TEMPERATURE CONVERTER");
	b1=new JButton("Back in welcome page");
	bg=new ButtonGroup();
	r1=new JRadioButton("FAHR. TO CELSIUS",false);
	r2=new JRadioButton("KELVIN TO FAHR",false);
	r3=new JRadioButton("KELVIN TO CELSIUS",false);
	r4=new JRadioButton("CELSIUS TO KELVIN",false);
	r5=new JRadioButton("FAHR. TO KELVIN",false);
	r6=new JRadioButton("CELSIUS TO FAHR.",false);
	l1.setFont(f);r1.setFont(f1);
	r2.setFont(f1);r3.setFont(f1);r4.setFont(f1);r5.setFont(f1);r6.setFont(f1);
	bg.add(r1);bg.add(r2);bg.add(r3);bg.add(r4);bg.add(r5);bg.add(r6);
	add(r1);add(r2);add(r3);add(r4);add(r5);add(r6);add(l1);add(b1);
	l1.setForeground(Color.green);
	b1.setForeground(Color.green);
	b1.setFont(f);
	l1.setBounds(100,20,1150,50);
	r1.setBounds(20,170,800,40);
	r2.setBounds(20,220,800,40);
	r3.setBounds(20,270,800,40);
	r4.setBounds(20,320,800,40);
	r5.setBounds(20,370,800,40);
	r6.setBounds(20,420,800,40);
	b1.setBounds(800,570,500,50);
	r1.addActionListener(this);
	r2.addActionListener(this);
	r3.addActionListener(this);
	r4.addActionListener(this);
	r5.addActionListener(this);
	r6.addActionListener(this);
	b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==r1)
		{
			ftcDemo ftcd=new ftcDemo();
			ftcd.setVisible(true);
			this.setVisible(false);
		}
		else if(e.getSource()==r2)
		{
			ktfDemo ktfd=new ktfDemo();
			ktfd.setVisible(true);
			this.setVisible(false);
		}
		else if(e.getSource()==r3)
		{
			ktcDemo ktcd=new ktcDemo();
			ktcd.setVisible(true);
			this.setVisible(false);
		}
		else if(e.getSource()==r4)
		{
			ctkDemo ctkd=new ctkDemo();
			ctkd.setVisible(true);
			this.setVisible(false);
		}
		else if(e.getSource()==r5)
		{
			ftkDemo ftkd=new ftkDemo();
			ftkd.setVisible(true);
			this.setVisible(false);
		}
		else if(e.getSource()==r6)
		{
			ctfDemo ctfd=new ctfDemo();
			ctfd.setVisible(true);
			this.setVisible(false);
		}
		else
		{
			welDemo wd=new welDemo();
			wd.setVisible(true);
			this.setVisible(false);
		}
	}	
	public static void main(String[] arg)
	{
		welDemo1 wd1=new welDemo1();
	}
}
	
