import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class welDemo extends JFrame implements ActionListener
{
	JLabel l1,l2,l3;
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
	l2=new JLabel("Your,Welcome in conveter app .");
	l3=new JLabel("In this app you can convert any unit's used in meth & science.");
	l1.setFont(f);l2.setFont(f1);l3.setFont(f1);
	bg=new ButtonGroup();
	r1=new JRadioButton("TEMPERATURE",false);
	r2=new JRadioButton("WEIGHT",false);
	r3=new JRadioButton("LENGTH",false);
	r4=new JRadioButton("AREA",false);
	r5=new JRadioButton("VOLUME",false);
	l2.setForeground(Color.blue);
	l3.setForeground(Color.blue);
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
	add(r1);add(r2);add(r3);add(r4);add(r5);add(l1);add(l2);add(l3);
	l1.setBounds(200,20,1000,50);
	r1.setBounds(20,150,300,30);
	r2.setBounds(20,250,300,30);
	r3.setBounds(20,350,300,30);
	r4.setBounds(20,450,300,30);
	r5.setBounds(20,550,300,30);
	l2.setBounds(350,150,850,30);
	l3.setBounds(350,200,950,30);
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