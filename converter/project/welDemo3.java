import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class welDemo3 extends JFrame implements ActionListener
{
	JLabel l1;
	JButton b1;
	Font f,f1;
	ButtonGroup bg;
	JRadioButton r1,r2,r3,r4,r5,r6,r7,r8,r9,r10;
	public welDemo3()
	{
	setLayout(null);
	setTitle("WLCOME PAGE1");
	setVisible(true);
	setSize(1400,700);
	b1=new JButton("Back in welcome page");
	l1=new JLabel("WELCOME IN LENGTH CONVERTER");
	f=new Font("monotype corsiva",Font.BOLD,50);
	f1=new Font("chiller",Font.BOLD,35);
	bg=new ButtonGroup();
	r1=new JRadioButton("MILE TO KM",false);
	r2=new JRadioButton("KM TO MILE",false);
	r3=new JRadioButton("YARD TO METRE",false);
	r4=new JRadioButton("METRE TO YARD",false);
	r5=new JRadioButton("METRE TO FOOT",false);
	r6=new JRadioButton("FOOT TO METRE",false);
	r7=new JRadioButton("FOOT TO CM",false);
	r8=new JRadioButton("CM TO FOOT",false);
	r9=new JRadioButton("INCH TO CM",false);
	r10=new JRadioButton("CM TO INCH",false);
	bg.add(r1);bg.add(r2);bg.add(r3);bg.add(r4);bg.add(r5);bg.add(r6);
	bg.add(r7);bg.add(r8);bg.add(r9);bg.add(r10);
	add(r1);add(r2);add(r3);add(r4);add(r5);add(r6);add(r7);add(r8);
	add(r9);add(r10);add(l1);add(b1);
	l1.setFont(f);b1.setFont(f);r1.setFont(f1);r2.setFont(f1);r3.setFont(f1);
	r4.setFont(f1);r5.setFont(f1);r6.setFont(f1);r7.setFont(f1);r8.setFont(f1);
	r9.setFont(f1);r10.setFont(f1);
	l1.setForeground(Color.pink);
	b1.setForeground(Color.pink);
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
			mtk3Demo mtk3d=new mtk3Demo();
			mtk3d.setVisible(true);
			this.setVisible(false);
		}
		else if(e.getSource()==r2)
		{
			ktm3Demo ktm3d=new ktm3Demo();
			ktm3d.setVisible(true);
			this.setVisible(false);
		}
		else if(e.getSource()==r3)
		{
			ytm3Demo ytm3d=new ytm3Demo();
			ytm3d.setVisible(true);
			this.setVisible(false);
		}
		else if(e.getSource()==r4)
		{
			mty3Demo mty3d=new mty3Demo();
			mty3d.setVisible(true);
			this.setVisible(false);
		}
		else if(e.getSource()==r5)
		{
			mtf3Demo mtf3d=new mtf3Demo();
			mtf3d.setVisible(true);
			this.setVisible(false);
		}
		else if(e.getSource()==r6)
		{
			ftm3Demo ftm3d=new ftm3Demo();
			ftm3d.setVisible(true);
			this.setVisible(false);
		}
		else if(e.getSource()==r7)
		{
			ftc3Demo ftc3d=new ftc3Demo();
			ftc3d.setVisible(true);
			this.setVisible(false);
		}
		else if(e.getSource()==r8)
		{
			ctf3Demo ctf3d=new ctf3Demo();
			ctf3d.setVisible(true);
			this.setVisible(false);
		}
		else if(e.getSource()==r9)
		{
			itc3Demo itc3d=new itc3Demo();
			itc3d.setVisible(true);
			this.setVisible(false);
		}
		else if(e.getSource()==r10)
		{
			cti3Demo cti3d=new cti3Demo();
			cti3d.setVisible(true);
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
		new welDemo3();
	}
}
	