import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class welDemo2 extends JFrame implements ActionListener
{
	JLabel l1;
	JButton b1;
	Font f,f1;
	ButtonGroup bg;
	JRadioButton r1,r2,r3,r4,r5,r6,r7,r8,r9,r10;
	public welDemo2()
	{
	setLayout(null);
	setTitle("WLCOME PAGE2");
	setVisible(true);
	setSize(1400,700);
	f=new Font("monotype corsiva",Font.BOLD,50);
	f1=new Font("chiller",Font.BOLD,35);
	b1=new JButton("Back in welcome page");
	l1=new JLabel("WELCOME IN WEIGHT CONVERTER");
	bg=new ButtonGroup();
	r1=new JRadioButton("POUND TO KILO",false);
	r2=new JRadioButton("KILO TO POUND",false);
	r3=new JRadioButton("CARAT TO GRAM",false);
	r4=new JRadioButton("GRAM TO CARAT",false);
	r5=new JRadioButton("OUNCE TO GRAM",false);
	r6=new JRadioButton("GRAM TO OUNCE",false);
	r7=new JRadioButton("TROY OUNCE TO GRAM",false);
	r8=new JRadioButton("GRAM TO TROY OUNCE",false);
	r9=new JRadioButton("STONE TO KILO",false);
	r10=new JRadioButton("KILO TO STONE",false);
	bg.add(r1);bg.add(r2);bg.add(r3);bg.add(r4);bg.add(r5);bg.add(r6);
	bg.add(r7);bg.add(r8);bg.add(r9);bg.add(r10);
	add(r1);add(r2);add(r3);add(r4);add(r5);add(r6);add(r7);add(r8);
	add(r9);add(r10);add(l1);add(b1);l1.setFont(f);r1.setFont(f1);
	r2.setFont(f1);r3.setFont(f1);r4.setFont(f1);r5.setFont(f1);r6.setFont(f1);
	r7.setFont(f1);r8.setFont(f1);r9.setFont(f1);r10.setFont(f1);b1.setFont(f);
	l1.setForeground(Color.red);
	b1.setForeground(Color.red);
	l1.setBounds(200,20,1150,50);
	r1.setBounds(20,150,500,30);
	r2.setBounds(20,200,500,30);
	r3.setBounds(20,250,500,30);
	r4.setBounds(20,300,500,30);
	r5.setBounds(20,350,500,30);
	r6.setBounds(20,400,500,30);
	r7.setBounds(20,450,500,30);
	r8.setBounds(20,500,500,30);
	r9.setBounds(20,550,500,30);
	r10.setBounds(20,600,500,30);
	b1.setBounds(800,650,500,50);
	r1.addActionListener(this);
	r2.addActionListener(this);
	r3.addActionListener(this);
	r4.addActionListener(this);
	r5.addActionListener(this);
	r6.addActionListener(this);
	r7.addActionListener(this);
	r8.addActionListener(this);
	r9.addActionListener(this);
	r10.addActionListener(this);
	b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==r1)
		{
			ptkDemo ptkd=new ptkDemo();
			ptkd.setVisible(true);
			this.setVisible(false);
		}
		else if(e.getSource()==r2)
		{
			ktpDemo ktpd=new ktpDemo();
			ktpd.setVisible(true);
			this.setVisible(false);
		}
		else if(e.getSource()==r3)
		{
			ctgDemo ctgd=new ctgDemo();
			ctgd.setVisible(true);
			this.setVisible(false);
		}
		else if(e.getSource()==r4)
		{
			gtcDemo gtcd=new gtcDemo();
			gtcd.setVisible(true);
			this.setVisible(false);
		}
		else if(e.getSource()==r5)
		{
			otgDemo otgd=new otgDemo();
			otgd.setVisible(true);
			this.setVisible(false);
		}
		else if(e.getSource()==r6)
		{
			gtoDemo gtod=new gtoDemo();
			gtod.setVisible(true);
			this.setVisible(false);
		}
		else if(e.getSource()==r7)
		{
			totgDemo totgd=new totgDemo();
			totgd.setVisible(true);
			this.setVisible(false);
		}
		else if(e.getSource()==r8)
		{
			gttoDemo gttod=new gttoDemo();
			gttod.setVisible(true);
			this.setVisible(false);
		}
		else if(e.getSource()==r9)
		{
			stkDemo stkd=new stkDemo();
			stkd.setVisible(true);
			this.setVisible(false);
		}
		else if(e.getSource()==r10)
		{
			ktsDemo ktsd=new ktsDemo();
			ktsd.setVisible(true);
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
		welDemo2 wd2=new welDemo2();
	}
}
	