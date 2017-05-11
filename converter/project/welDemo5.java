import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class welDemo5 extends JFrame implements ActionListener
{
	JLabel l1;
	JButton b1;
	Font f,f1;
	ButtonGroup bg;
	JRadioButton r1,r2,r3,r4,r5,r6,r7,r8;
	public welDemo5()
	{
	setLayout(null);
	setTitle("WLCOME PAGE5");
	setVisible(true);
	setSize(1400,700);
	f=new Font("monotype corsiva",Font.BOLD,50);
	f1=new Font("chiller",Font.BOLD,35);
	b1=new JButton("Back in welcome page");
	l1=new JLabel("WELCOME IN VOLUME CONVERTER.(all unit's in cube)");
	bg=new ButtonGroup();
	r1=new JRadioButton("INCH TO CM",false);
	r2=new JRadioButton("CM TO INCH",false);
	r3=new JRadioButton("METRE TO FOOT",false);
	r4=new JRadioButton("FOOT TO METRE",false);
	r5=new JRadioButton("YARD TO METRE",false);
	r6=new JRadioButton("METRE TO YARD",false);
	r7=new JRadioButton("GALLON TO LITRE",false);
	r8=new JRadioButton("LITRE TO GALLON",false);
	bg.add(r1);bg.add(r2);bg.add(r3);bg.add(r4);bg.add(r5);bg.add(r6);
	bg.add(r7);bg.add(r8);
	add(r1);add(r2);add(r3);add(r4);add(r5);add(r6);add(r7);add(r8);
	add(l1);add(b1);
	l1.setFont(f);b1.setFont(f);r1.setFont(f1);r2.setFont(f1);r3.setFont(f1);
	r4.setFont(f1);r5.setFont(f1);r6.setFont(f1);r7.setFont(f1);r8.setFont(f1);
	l1.setBounds(100,20,1300,50);
	l1.setForeground(Color.green);
	b1.setForeground(Color.green);
	r1.setBounds(20,150,800,30);
	r2.setBounds(20,200,800,30);
	r3.setBounds(20,250,800,30);
	r4.setBounds(20,300,800,30);
	r5.setBounds(20,350,800,30);
	r6.setBounds(20,400,800,30);
	r7.setBounds(20,450,800,30);
	r8.setBounds(20,500,800,30);
	b1.setBounds(800,550,500,50);
	r1.addActionListener(this);
	r2.addActionListener(this);
	r3.addActionListener(this);
	r4.addActionListener(this);
	r5.addActionListener(this);
	r6.addActionListener(this);
	r7.addActionListener(this);
	r8.addActionListener(this);
	b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==r1)
		{
			itcDemo itcd=new itcDemo();
			itcd.setVisible(true);
			this.setVisible(false);
		}
		else if(e.getSource()==r2)
		{
			ctiDemo ctid=new ctiDemo();
			ctid.setVisible(true);
			this.setVisible(false);
		}
		else if(e.getSource()==r3)
		{
			mtfDemo mtfd=new mtfDemo();
			mtfd.setVisible(true);
			this.setVisible(false);
		}
		else if(e.getSource()==r4)
		{
			ftmDemo ftmd=new ftmDemo();
			ftmd.setVisible(true);
			this.setVisible(false);
		}
		else if(e.getSource()==r5)
		{
			ytmDemo ytmd=new ytmDemo();
			ytmd.setVisible(true);
			this.setVisible(false);
		}
		else if(e.getSource()==r6)
		{
			mtyDemo mtyd=new mtyDemo();
			mtyd.setVisible(true);
			this.setVisible(false);
		}
		else if(e.getSource()==r7)
		{
			gtlDemo gtld=new gtlDemo();
			gtld.setVisible(true);
			this.setVisible(false);
		}
		else if(e.getSource()==r8)
		{
			ltgDemo ltgd=new ltgDemo();
			ltgd.setVisible(true);
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
		new welDemo5();
	}
}
	