/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package condemo;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ftm4Demo extends JFrame implements ActionListener
{
	JLabel l1,l2,l3;
	Font f,f1;
	JTextField t1,t2;
	JButton b1,b2;
	public ftm4Demo()
	{
	setLayout(null);
	setTitle("welcome ftm4page");
	setSize(1400,700);
	setVisible(true);
	f=new Font("monotype corsiva",Font.BOLD,45);
	f1=new Font("chiller",Font.BOLD,35);
	l1=new JLabel("WELCOME IN SQUARE_FOOT TO SQUARE_METRE CONVERTER");
	l3=new JLabel("METRE:");
	l2=new JLabel("FOOT:");
	t1=new JTextField();
	t2=new JTextField();
	t2.setEditable(false);
	b1=new JButton("..OK..");
	b2=new JButton("Back in main page");
	add(l1);add(l2);add(l3);add(b1);add(b2);add(t1);add(t2);
	l1.setFont(f);b1.setFont(f);b2.setFont(f);l2.setFont(f1);l3.setFont(f1);
	l1.setBounds(20,20,1380,45);
	l2.setBounds(20,150,200,30);
	l3.setBounds(20,250,200,30);
	t1.setBounds(240,150,200,30);
	t2.setBounds(240,250,200,30);
	b1.setBounds(50,600,200,45);
	b2.setBounds(400,600,500,45);
	b1.addActionListener(this);
	b2.addActionListener(this);
	l1.setForeground(Color.red);
	l2.setForeground(Color.magenta);
	l3.setForeground(Color.pink);
	b1.setForeground(Color.blue);
	b2.setForeground(Color.yellow);
	}
	public void actionPerformed(ActionEvent e)
	{
		
		try{
			double a=Double.parseDouble(t1.getText());
			double b;
			if(e.getSource()==b1)	
			{
				b=a*(0.0929);
				t2.setText(String.valueOf(b));
			}
			else
			{
				welDemo4 wd4=new welDemo4();
				wd4.setVisible(true);
				this.setVisible(false);
			}
		}catch(Exception ae)
		{
			t2.setText("invalid input");
		}
	}
	public static void main(String[] arg)
	{
		ftm4Demo ftm4d=new ftm4Demo();
	}
} 