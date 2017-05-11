import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ftc3Demo extends JFrame implements ActionListener
{
	JLabel l1,l2,l3;
	Font f,f1;
	JTextField t1,t2;
	JButton b1,b2;
	public ftc3Demo()
	{
	setLayout(null);
	setTitle("welcome ftc3page");
	setSize(1400,700);
	setVisible(true);
	f=new Font("monotype corsiva",Font.BOLD,50);
	f1=new Font("chiller",Font.BOLD,35);
	l1=new JLabel("WELCOME IN FOOT TO CENTIMETRE CONVERTER");
	l3=new JLabel("CENTIMETRE:");
	l2=new JLabel("FOOT:");
	t1=new JTextField();
	t2=new JTextField();
	t2.setEditable(false);
	b1=new JButton("..OK..");
	b2=new JButton("Back in main page");
	add(l1);add(l2);add(l3);add(b1);add(b2);add(t1);add(t2);
	l1.setFont(f);b1.setFont(f);b2.setFont(f);l2.setFont(f1);l3.setFont(f1);
	l1.setBounds(100,20,1200,50);
	l2.setBounds(20,150,200,30);
	l3.setBounds(20,250,230,30);
	t1.setBounds(180,150,200,30);
	t2.setBounds(210,250,200,30);
	b1.setBounds(50,600,200,50);
	b2.setBounds(400,600,500,50);
	b1.addActionListener(this);
	b2.addActionListener(this);
	l1.setForeground(Color.blue);
	l2.setForeground(Color.red);
	l3.setForeground(Color.pink);
	b1.setForeground(Color.yellow);
	b2.setForeground(Color.magenta);
	}
	public void actionPerformed(ActionEvent e)
	{
		
		try{
			double a=Double.parseDouble(t1.getText());
			double b;
			if(e.getSource()==b1)	
			{
				b=a*(30.48);
				t2.setText(String.valueOf(b));
			}
			else
			{
				welDemo3 wd3=new welDemo3();
				wd3.setVisible(true);
				this.setVisible(false);
			}
		}catch(Exception ae)
		{
			t2.setText("invalid input");
		}
	}
	public static void main(String[] arg)
	{
		ftc3Demo ftc3d=new ftc3Demo();
	}
} 