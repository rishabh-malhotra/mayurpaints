package scientific.calculator;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FirstJFrame extends JFrame implements ActionListener
{
    public FirstJFrame() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Scientific Calculator");
        setPreferredSize(new java.awt.Dimension(1380, 800));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scientific/calculator/Image/abc.jpg"))); // NOI18N

        jMenuBar1.setPreferredSize(new java.awt.Dimension(118, 30));

        jMenu1.setText("Calculator");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu1.setIconTextGap(5);
        jMenu1.setPreferredSize(new java.awt.Dimension(80, 20));
        jMenu1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jMenu1ComponentAdded(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem1.setText("Standard");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem2.setText("Scientific");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("About");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu2.setIconTextGap(5);
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem3.setText("Application");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(988, 988, 988)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addGap(588, 588, 588))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
   int x, y, tfvalue, detail, value_xy, valuex, mod, mod2, npr, npr2, ncr, ncr2;
   double d, result, result2, root, root2;
   String a, b="", c,  conResult, pi="3.14", labelvalue, labelvalue2="", Final4="";
   char ch='a', ch2;
   Label l1, l2, l3, l4, l5, l6, l7, l8,l9, l10, l11, l12, l13, l14;
   TextArea tarea;
   
   
   
    public void Standard()
    {  
        x = 1;
        Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26;
         
        b1 = new Button("1");
        b2 = new Button("2");		
	b3 = new Button("3");
	b4 = new Button("4");
	b5 = new Button("5");
	b6 = new Button("6");
	b7 = new Button("7");
	b8 = new Button("8");		
	b9 = new Button("9");
	b10 = new Button("0");
	b11 = new Button("+");
	b12 = new Button("-");
	b13 = new Button("*");
	b14 = new Button("/");		
	b15 = new Button("=");
	b16 = new Button("Clear");
        b17 = new Button("%");
	b18 = new Button(".");		
	b19 = new Button("±");
	b20 = new Button("√");
	b21 = new Button("x²");
	b22 = new Button("x³");
	b23 = new Button("Clear All");
	b24 = new Button("X");		
	b25 = new Button("1/x");
        b26 = new Button("Clear H");
        
         b1.setFont(new Font("Arial", Font.BOLD, 25));
         b2.setFont(new Font("Arial", Font.BOLD, 25));
         b3.setFont(new Font("Arial", Font.BOLD, 25));
         b4.setFont(new Font("Arial", Font.BOLD, 25));
         b5.setFont(new Font("Arial", Font.BOLD, 25));
         b6.setFont(new Font("Arial", Font.BOLD, 25));
         b7.setFont(new Font("Arial", Font.BOLD, 25));
         b8.setFont(new Font("Arial", Font.BOLD, 25));
         b9.setFont(new Font("Arial", Font.BOLD, 25));
        b10.setFont(new Font("Arial", Font.BOLD, 25));
        b11.setFont(new Font("Arial", Font.PLAIN, 30));
        b12.setFont(new Font("Arial", Font.PLAIN, 30));
        b13.setFont(new Font("Arial", Font.PLAIN, 30));
        b14.setFont(new Font("Arial", Font.PLAIN, 30));
        b15.setFont(new Font("Arial", Font.PLAIN, 30));
        b16.setFont(new Font("Arial", Font.PLAIN, 20));
        b17.setFont(new Font("Arial", Font.PLAIN, 20));
        b18.setFont(new Font("Arial", Font.PLAIN, 30));
        b19.setFont(new Font("Arial", Font.PLAIN, 25));
        b20.setFont(new Font("Arial", Font.PLAIN, 25));
        b21.setFont(new Font("Arial", Font.PLAIN, 25));
        b22.setFont(new Font("Arial", Font.PLAIN, 25));
        b23.setFont(new Font("Arial", Font.PLAIN, 20));
        b24.setFont(new Font("Arial", Font.PLAIN, 20));
        b25.setFont(new Font("Arial", Font.PLAIN, 20));
        b26.setFont(new Font("Arial", Font.BOLD, 15));
        
        
         b1.setBounds(210,510,200,80);	
	 b2.setBounds(410,510,200,80);
	 b3.setBounds(610,510,200,80);
	 b4.setBounds(210,430,200,80);
	 b5.setBounds(410,430,200,80);		
	 b6.setBounds(610,430,200,80);	
         b7.setBounds(210,350,200,80);
	 b8.setBounds(410,350,200,80);
	 b9.setBounds(610,350,200,80);
	b10.setBounds(410,590,200,80);		
	b11.setBounds(810,270,200,80);	
	b12.setBounds(810,350,200,80);
	b13.setBounds(810,430,200,80);
	b14.setBounds(810,510,200,80);
	b15.setBounds(810,590,200,80);	
	b16.setBounds(410,270,200,80);
        b17.setBounds(10,270,200,80);
	b18.setBounds(610,590,200,80);
	b19.setBounds(210,590,200,80);
	b20.setBounds(10,350,200,80);		
	b21.setBounds(10,430,200,80);	
	b22.setBounds(10,510,200,80);
	b23.setBounds(210,270,200,80);
	b24.setBounds(610,270,200,80);
	b25.setBounds(10,590,200,80);
        b26.setBounds(1280,10,60,30);
        
        add(b1);
	add(b2);
	add(b3);
	add(b4);
	add(b5);
	add(b6);
	add(b7);
	add(b8);
	add(b9);
	add(b10);
	add(b11);
	add(b12);
	add(b13);
	add(b14);
	add(b15);
	add(b16);
        add(b17);
	add(b18);
	add(b19);
	add(b20);
	add(b21);
	add(b22);
	add(b23);
	add(b24);
	add(b25);
        add(b26);
        
        b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);		
	b6.addActionListener(this);
	b7.addActionListener(this);
	b8.addActionListener(this);
	b9.addActionListener(this);
	b10.addActionListener(this);		
	b11.addActionListener(this);
	b12.addActionListener(this);
	b13.addActionListener(this);
	b14.addActionListener(this);
	b15.addActionListener(this);
	b16.addActionListener(this);
        b17.addActionListener(this);
	b18.addActionListener(this);
	b19.addActionListener(this);
	b20.addActionListener(this);		
	b21.addActionListener(this);
	b22.addActionListener(this);
	b23.addActionListener(this);
	b24.addActionListener(this);
	b25.addActionListener(this);
        b26.addActionListener(this);      
    }
    
    
    
    
    
    public void TextField()
    {        
            l1 = new Label();
            l2 = new Label();
            l3 = new Label("Operation");
            l4 = new Label("Value");
            l6 = new Label();
            l7 = new Label("Output");
            l8 = new Label("History");
            
            if(tfvalue == 0)
            l5 = new Label("Standard Calculator");
            
             if(tfvalue == 1)
            l5 = new Label("Scientific Calculator");
        
            l1.setFont(new Font("Arial", Font.BOLD, 50));
            l2.setFont(new Font("Arial", Font.PLAIN, 20));
            l3.setFont(new Font("Arial", Font.BOLD, 25));
            l4.setFont(new Font("Arial", Font.BOLD, 25));
            l5.setFont(new Font("Arial", Font.BOLD, 30));
            l6.setFont(new Font("Arial", Font.BOLD, 50));
            l7.setFont(new Font("Arial", Font.BOLD, 25));
            l8.setFont(new Font("Arial", Font.BOLD, 25));
        
            l1.setBackground(Color.LIGHT_GRAY);
            l2.setBackground(Color.LIGHT_GRAY);           
            l6.setBackground(Color.LIGHT_GRAY);            
        
            l1.setBounds(150,160,350,60);
            l2.setBounds(150,70,850,60);
            l3.setBounds(10,70,120,60);
            l4.setBounds(10,160,120,60);
            l5.setBounds(350,0,300,60);
            l6.setBounds(650,160,350,60);
            l7.setBounds(550,160,90,60);
            l8.setBounds(1037,0,100,50);
        
            add(l1);
            add(l2);
            add(l3);
            add(l4);
            add(l5);
            add(l6);
            add(l7);
            add(l8);      
    }
     
    
    
    
    
    
    public void textArea()
    {
        tarea = new TextArea();
        tarea.setBackground(Color.LIGHT_GRAY);
        tarea.setFont(new Font("Arial", Font.PLAIN, 20));
        tarea.setBounds(1035,50,320,625);
        add(tarea);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        String s = ae.getActionCommand();    
        if (s.equals("1") || s.equals("2") || s.equals("3") || s.equals("4") || s.equals("5") || s.equals("6") || s.equals("7") || s.equals("8") || s.equals("9") || s.equals("0") || s.equals("."))
	{
                ch2 = ch;
                
                l1.setText(s);
                a = l1.getText();
                b = b+a;
                l1.setText(b);           
        } 

	if (s.equals("+"))
	{
            l1.setText("");            
            c = b;
            b = "";
            ch = '+';
            l2.setText(c+ch);
            labelvalue = l2.getText();
            labelvalue2 = labelvalue2+labelvalue;
            l2.setText(labelvalue2);
            
            result = Double.parseDouble(c);
            
            if (ch2 == '+')
            result2 = result2 + result;
            
            if (ch2 == '-')
            result2 = result2 - result;
            
            if (ch2 == '/')
            result2 = result2 / result;
            
            if (ch2 == '*')
            result2 = result2 * result;
            
            if (ch2 == 'a')
            result2 = result;
            
            l6.setText(""+result2);            
	}

	if (s.equals("-"))
	{
            l1.setText("");
            c = b;
            b = "";
            ch = '-';	
            l2.setText(c+ch);
            labelvalue = l2.getText();
            labelvalue2 = labelvalue2+labelvalue;
            l2.setText(labelvalue2);
            
            result = Double.parseDouble(c);
            
            if (ch2 == '+')
            result2 = result2 + result;
            
            if (ch2 == '-')
            result2 = result2 - result;
            
            if (ch2 == '/')
            result2 = result2 / result;
            
            if (ch2 == '*')
            result2 = result2 * result;
            
            if (ch2 == 'a')
            result2 = result;
            
            l6.setText(""+result2); 
          
	}

        if (s.equals("*"))
	{
            l1.setText("");
            c = b;
            b = "";
            ch = '*';	
            l2.setText(c+ch);
            labelvalue = l2.getText();
            labelvalue2 = labelvalue2+labelvalue;
            l2.setText(labelvalue2);
            
            result = Double.parseDouble(c);
            
            if (ch2 == '+')
            result2 = result2 + result;
            
            if (ch2 == '-')
            result2 = result2 - result;
            
            if (ch2 == '/')
            result2 = result2 / result;
            
            if (ch2 == '*')
            result2 = result2 * result;
            
            if (ch2 == 'a')
            result2 = result;
            
            l6.setText(""+result2); 
           
	}

	if (s.equals("/"))
	{
            l1.setText("");
            c = b;
            b = "";
            ch = '/';
            l2.setText(c+ch);
            labelvalue = l2.getText();
            labelvalue2 = labelvalue2+labelvalue;
            l2.setText(labelvalue2);
            
            result = Double.parseDouble(c);
            
            if (ch2 == '+')
            result2 = result2 + result;
            
            if (ch2 == '-')
            result2 = result2 - result;
            
            if (ch2 == '/')
            result2 = result2 / result;
            
            if (ch2 == '*')
            result2 = result2 * result;
            
            if (ch2 == 'a')
            result2 = result;
            
            l6.setText(""+result2); 
        
	}
			
	if (s.equals("="))
	{	
                l2.setText(b);
                labelvalue = l2.getText();
                labelvalue2 = labelvalue2+labelvalue;
                l2.setText(labelvalue2);
                /*
                if(ch=='+')
                d = Double.parseDouble(c) + Double.parseDouble(b);            
				
                if(ch=='-')
                d = Double.parseDouble(c) - Double.parseDouble(b);
			
                if(ch=='*')
                d = Double.parseDouble(c) * Double.parseDouble(b);
				
                if(ch=='/')
                d = Double.parseDouble(c) / Double.parseDouble(b);      
            */
                
            result = Double.parseDouble(b);
            
            if (ch2 == '+')
            result2 = result2 + result;
            
            if (ch2 == '-')
            result2 = result2 - result;
            
            if (ch2 == '/')
            result2 = result2 / result;
            
            if (ch2 == '*')
            result2 = result2 * result;
            
            if (ch2 == 'a')
            result2 = result;
            
            if (value_xy == 1)
            {
                int sum = 1;
                for (int i=0;i<(Integer.parseInt(b));i++)
                {
                    sum = sum * valuex;
                }
                
                result2 = sum;
            }
            
            if (mod2 == 1)
            {
                result2 = mod % (Integer.parseInt(b));
            }
            
            if (root2 == 1)
            {
                result2 = Math.pow(root, (1/Double.parseDouble(b)));
            }
            
            if(npr2 == 1)
            {
                int sum = 1;
                for (int i=1;i<=npr;i++)
                {
                    sum = sum*i;          
                }
                
                int sum2 = 1;
                for (int i=1;i<=(npr-Integer.parseInt(b));i++)
                {
                    sum2 = sum2 * i;
                }
                
                result2 = sum / sum2;
            }
            
            if(ncr2 == 1)
            {
                int sum = 1;
                for (int i=1;i<=ncr;i++)
                {
                    sum = sum*i;          
                }
                
                int sum2 = 1;
                for (int i=1;i<=(Integer.parseInt(b));i++)
                {
                    sum2 = sum2 * i;
                }
                
                int sum3 = 1;
                for (int i=1;i<=(ncr-Integer.parseInt(b));i++)
                {
                    sum3 = sum3 * i;
                }
                
                result2 = sum / (sum2 * sum3);
            }
            
            l6.setText(""+result2); 
	
            String Final1 = l2.getText();
            String Final2 = l6.getText();
            
            String Final3 = Final1 + "\n" + "="+ Final2;
            Final4 = Final4 + "\n\n" + Final3;
            
            tarea.setText(Final4);
            
            l2.setText("");
            labelvalue2 = "";
            l1.setText("");
            b = "";
	}
        
        
        if (s.equals("Clear H"))
        {
            Final4 = "";
            tarea.setText(Final4);
        }
        
        if (s.equals("Clear All"))
	{
            l1.setText("");
            b = "";	
            l2.setText("");
            labelvalue2 = "";
            l6.setText("");
            result2 = 0;
            ch = 'a';
	}
        
        if (s.equals("Clear"))
	{
            l1.setText("");
            b = "";	
	}
        
        if (s.equals("X"))
	{
            int reminder = Integer.parseInt(b) / 10;
            b = String.valueOf(reminder);
            l1.setText(b);
	}
        
        if (s.equals("±"))
        {
            if(Integer.parseInt(b)<0)
            {
                l1.setText("-");
                a = l1.getText();
                b = String.valueOf((-1) * Integer.parseInt(b));
                l1.setText(b);
            }  
            else
            {
                l1.setText("-");
                a = l1.getText();
                b = a+b;
                l1.setText(b);                
            }            
        }
        
        
        
        
        if(s.equals("√"))
        {
            l1.setText("");           
            l2.setText(b);
            labelvalue = l2.getText();
            labelvalue2 = '√' + labelvalue2 + labelvalue;
            l2.setText(labelvalue2);
            
            l6.setText(""+Math.sqrt(Double.parseDouble(b)));
            
            String Final1 = l2.getText();
            String Final2 = l6.getText();
            
            String Final3 = Final1 + "\n" + "="+ Final2;
            Final4 = Final4 + "\n\n" + Final3;
            
            tarea.setText(Final4);
        }
        
        if(s.equals("x²"))
        {
            l1.setText("");
            l2.setText(b);
            labelvalue = l2.getText();
            labelvalue2 = "Squar of " + labelvalue2 + labelvalue;
            l2.setText(labelvalue2);
            
            l6.setText(""+Double.parseDouble(b) * Double.parseDouble(b));
            
            String Final1 = l2.getText();
            String Final2 = l6.getText();
            
            String Final3 = Final1 + "\n" + "="+ Final2;
            Final4 = Final4 + "\n\n" + Final3;
            
            tarea.setText(Final4);
        }
        
        if(s.equals("x³"))
        {
            l1.setText("");
            l2.setText(b);
            labelvalue = l2.getText();
            labelvalue2 = "cube of " + labelvalue2 + labelvalue;
            l2.setText(labelvalue2);
            
            l6.setText(""+Double.parseDouble(b) * Double.parseDouble(b) * Double.parseDouble(b));
            
            String Final1 = l2.getText();
            String Final2 = l6.getText();
            
            String Final3 = Final1 + "\n" + "="+ Final2;
            Final4 = Final4 + "\n\n" + Final3;
            
            tarea.setText(Final4);
        }
        
        if(s.equals("1/x"))
        {
            l1.setText("");
            l2.setText(b);
            labelvalue = l2.getText();
            labelvalue2 = "1" + '/' + labelvalue2 + labelvalue;
            l2.setText(labelvalue2);
            
            l6.setText(""+1 / Double.parseDouble(b));
            
            String Final1 = l2.getText();
            String Final2 = l6.getText();
            
            String Final3 = Final1 + "\n" + "="+ Final2;
            Final4 = Final4 + "\n\n" + Final3;
            
            tarea.setText(Final4);
        }
        
        if(s.equals("%"))
        {
            l1.setText("");           
            l2.setText(b);
            labelvalue = l2.getText();
            labelvalue2 = labelvalue2 + labelvalue + '*' + 100;
            l2.setText(labelvalue2);
            
            l6.setText(""+Double.parseDouble(c) / Double.parseDouble(b) * 100);
            
            String Final1 = l2.getText();
            String Final2 = l6.getText();
            
            String Final3 = Final1 + "\n" + "="+ Final2;
            Final4 = Final4 + "\n\n" + Final3;
            
            tarea.setText(Final4);
        }
        
        
        
        
       
        if(s.equals("sin"))
        {
            l1.setText("");
            l2.setText(b);
            labelvalue = l2.getText();
            labelvalue2 = "Sin " + '(' + labelvalue2 + labelvalue + ')';
            l2.setText(labelvalue2);
            
            l6.setText(""+Math.sin(Math.toRadians(Double.parseDouble(b))));
            
            String Final1 = l2.getText();
            String Final2 = l6.getText();
            
            String Final3 = Final1 + "\n" + "="+ Final2;
            Final4 = Final4 + "\n\n" + Final3;
            
            tarea.setText(Final4);
        }
        
        if(s.equals("cos"))
        {
            l1.setText("");
            l2.setText(b);
            labelvalue = l2.getText();
            labelvalue2 = "Cos " + '(' + labelvalue2 + labelvalue + ')';
            l2.setText(labelvalue2);
            
            l6.setText(""+Math.cos(Math.toRadians(Double.parseDouble(b))));
            
            String Final1 = l2.getText();
            String Final2 = l6.getText();
            
            String Final3 = Final1 + "\n" + "="+ Final2;
            Final4 = Final4 + "\n\n" + Final3;
            
            tarea.setText(Final4);
        }
        
        if(s.equals("tan"))
        {
            l1.setText("");
            l2.setText(b);
            labelvalue = l2.getText();
            labelvalue2 = "tan " + '(' + labelvalue2 + labelvalue + ')';
            l2.setText(labelvalue2);
            
            l6.setText(""+Math.tan(Math.toRadians(Double.parseDouble(b))));
            
            String Final1 = l2.getText();
            String Final2 = l6.getText();
            
            String Final3 = Final1 + "\n" + "="+ Final2;
            Final4 = Final4 + "\n\n" + Final3;
            
            tarea.setText(Final4);
        }
        
        if(s.equals("sin(inv)"))
        {
            l1.setText("");
            l2.setText(b);
            labelvalue = l2.getText();
            labelvalue2 = "Sin inverse of" + '(' + labelvalue2 + labelvalue + ')';
            l2.setText(labelvalue2);
            
            l6.setText(""+Math.toDegrees(Math.asin((Double.parseDouble(b)))));
            
            String Final1 = l2.getText();
            String Final2 = l6.getText();
            
            String Final3 = Final1 + "\n" + "="+ Final2;
            Final4 = Final4 + "\n\n" + Final3;
            
            tarea.setText(Final4);
        }
        
        if(s.equals("cos(inv)"))
        {
            l1.setText("");
            l2.setText(b);
            labelvalue = l2.getText();
            labelvalue2 = "Cos inverse of" + '(' + labelvalue2 + labelvalue + ')';
            l2.setText(labelvalue2);
            
            l6.setText(""+Math.toDegrees(Math.acos((Double.parseDouble(b)))));
            
            String Final1 = l2.getText();
            String Final2 = l6.getText();
            
            String Final3 = Final1 + "\n" + "="+ Final2;
            Final4 = Final4 + "\n\n" + Final3;
            
            tarea.setText(Final4);
        }
        
        if(s.equals("tan(inv)"))
        {
            l1.setText("");
            l2.setText(b);
            labelvalue = l2.getText();
            labelvalue2 = "tan inverse of" + '(' + labelvalue2 + labelvalue + ')';
            l2.setText(labelvalue2);
            
            l6.setText(""+Math.toDegrees(Math.atan((Double.parseDouble(b)))));
            
            String Final1 = l2.getText();
            String Final2 = l6.getText();
            
            String Final3 = Final1 + "\n" + "="+ Final2;
            Final4 = Final4 + "\n\n" + Final3;
            
            tarea.setText(Final4);
        }
       
        
        
        
        
        
        
        
        if(s.equals("log"))
        {
            l1.setText("");
            l2.setText(b);
            labelvalue = l2.getText();
            labelvalue2 = "log " + '(' + labelvalue2 + labelvalue + ')';
            l2.setText(labelvalue2);
            
            l6.setText(""+Math.log10(Double.parseDouble(b)));
            
            String Final1 = l2.getText();
            String Final2 = l6.getText();
            
            String Final3 = Final1 + "\n" + "="+ Final2;
            Final4 = Final4 + "\n\n" + Final3;
            
            tarea.setText(Final4);
        }
        
        if(s.equals("ln"))
        {
            l1.setText("");
            l2.setText(b);
            labelvalue = l2.getText();
            labelvalue2 = "ln " + '(' + labelvalue2 + labelvalue + ')';
            l2.setText(labelvalue2);
            
            l6.setText(""+Math.log(Double.parseDouble(b)));
            
            String Final1 = l2.getText();
            String Final2 = l6.getText();
            
            String Final3 = Final1 + "\n" + "="+ Final2;
            Final4 = Final4 + "\n\n" + Final3;
            
            tarea.setText(Final4);
        }
        
        if(s.equals("e˟"))
        {
            l1.setText("");
            l2.setText(b);
            labelvalue = l2.getText();
            labelvalue2 = "e˟ " + '(' + labelvalue2 + labelvalue + ')';
            l2.setText(labelvalue2);
            
            l6.setText(""+Math.exp(Double.parseDouble(b)));
            
            String Final1 = l2.getText();
            String Final2 = l6.getText();
            
            String Final3 = Final1 + "\n" + "="+ Final2;
            Final4 = Final4 + "\n\n" + Final3;
            
            tarea.setText(Final4);
        }
        
        if(s.equals("xʸ"))
        {
            valuex = Integer.parseInt(b);
            value_xy = 1;
            
            l1.setText(""); 
            
            l2.setText(b);
            labelvalue = l2.getText();
            labelvalue2 = "Pow of" + '(' + labelvalue2 + labelvalue + ')' + " is ";
            l2.setText(labelvalue2);
            b = "";
        }
        
        if(s.equals("("))
        {
            l1.setText(s);
                a = l1.getText();
                b = b+a;
                l1.setText(b);
        }
        
        if(s.equals(")"))
        {
            l1.setText(s);
                a = l1.getText();
                b = b+a;
                l1.setText(b);
        }
        
        if(s.equals("10˟"))
        {
          int sum = 1;
          for (int i=0;i<(Integer.parseInt(b));i++)
          {
              sum = sum * 10;
          }
          
            l1.setText("");
            l2.setText(b);
            labelvalue = l2.getText();
            labelvalue2 = "10˟ " + '(' + labelvalue2 + labelvalue + ')';
            l2.setText(labelvalue2);
           
            l6.setText(""+sum);
            
            String Final1 = l2.getText();
            String Final2 = l6.getText();
            
            String Final3 = Final1 + "\n" + "="+ Final2;
            Final4 = Final4 + "\n\n" + Final3;
            
            tarea.setText(Final4);
        }
        
        if(s.equals("Π"))
        {    
            ch2 = ch;
            b = pi;
            l1.setText(b);
        }
        
        if(s.equals("n!"))
        {
            int sum = 1;
            for (int i=1;i<=(Integer.parseInt(b));i++)
            {
                sum = sum*i;          
            }
                          
            l1.setText("");
            l2.setText(b);
            labelvalue = l2.getText();
            labelvalue2 = labelvalue2 + labelvalue + '!';
            l2.setText(labelvalue2);
           
            l6.setText(""+sum);
            
            String Final1 = l2.getText();
            String Final2 = l6.getText();
            
            String Final3 = Final1 + "\n" + "="+ Final2;
            Final4 = Final4 + "\n\n" + Final3;
            
            tarea.setText(Final4);
        }
        
        if(s.equals("Mod"))
        {
            mod = Integer.parseInt(b);
            mod2 = 1;
            
            l1.setText(""); 
            
            l2.setText(b);
            labelvalue = l2.getText();
            labelvalue2 = labelvalue2 + labelvalue + " Mod ";
            l2.setText(labelvalue2);
            b = "";
        }
        
        if (s.equals("ʸ√x"))
        {
            root = Double.parseDouble(b);
            root2 = 1;
            
            l1.setText(""); 
            
            l2.setText(b);
            labelvalue = l2.getText();
            labelvalue2 = labelvalue2 + labelvalue + " y root ";
            l2.setText(labelvalue2);
            b = "";
        }
        
        if (s.equals("nPr"))
        {
            npr = Integer.parseInt(b);
            npr2 = 1;
            
            l1.setText("");
            l2.setText(b);
            labelvalue = l2.getText();
            labelvalue2 = labelvalue2 + labelvalue + " r Parmutation ";
            l2.setText(labelvalue2);
            b = "";
        }
        
        if (s.equals("nCr"))
        {
            ncr = Integer.parseInt(b);
            ncr2 = 1;
            
            l1.setText("");
            l2.setText(b);
            labelvalue = l2.getText();
            labelvalue2 = labelvalue2 + labelvalue + " r Combination ";
            l2.setText(labelvalue2);
            b = "";
        }
        
        if (s.equals("deg"))
        {
            l1.setText("");
            l2.setText(b);
            labelvalue = l2.getText();
            labelvalue2 ="Degrees" + "(" +labelvalue2 + labelvalue + ")";
            l2.setText(labelvalue2);
            
            l6.setText(""+Math.toDegrees(Double.parseDouble(b)));
            
            String Final1 = l2.getText();
            String Final2 = l6.getText();
            
            String Final3 = Final1 + "\n" + "="+ Final2;
            Final4 = Final4 + "\n\n" + Final3;
            
            tarea.setText(Final4);
        }
    }
    
    
    
    
   
    
    
    
    public void Scientific()
    {
        x = 2;
        Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,
                b26,b27,b28,b29,b30,b31,b32,b33,b34,b35,b36,b37,b38,b39,b40,b41,b42,b43,b44,b45,b46;
         
        b1 = new Button("1");
        b2 = new Button("2");		
	b3 = new Button("3");
	b4 = new Button("4");
	b5 = new Button("5");
	b6 = new Button("6");
	b7 = new Button("7");
	b8 = new Button("8");		
	b9 = new Button("9");
	b10 = new Button("0");
	b11 = new Button("+");
	b12 = new Button("-");
	b13 = new Button("*");
	b14 = new Button("/");		
	b15 = new Button("=");
	b16 = new Button("Clear");
        b17 = new Button("%");
	b18 = new Button(".");		
	b19 = new Button("±");
	b20 = new Button("√");
	b21 = new Button("x²");
	b22 = new Button("x³");
	b23 = new Button("Clear All");
	b24 = new Button("X");		
	b25 = new Button("1/x");
        b26 = new Button("xʸ");
        b27 = new Button("ʸ√x");
        b28 = new Button("10˟");
        b29 = new Button("e˟");
        b30 = new Button("Π");
        b31 = new Button("sin");
        b32 = new Button("sin(inv)");
        b33 = new Button("log");
        b34 = new Button("ln");
        b35 = new Button("n!");
        b36 = new Button("cos");
        b37 = new Button("cos(inv)");
        b38 = new Button("deg");
        b39 = new Button("nCr");
        b40 = new Button("(");
        b41 = new Button("tan");
        b42 = new Button("tan(inv)");
        b43 = new Button("Mod");
        b44 = new Button("nPr");
        b45 = new Button(")");
        b46 = new Button("Clear H");
                
        b1.setFont(new Font("Arial", Font.BOLD, 25));
        b2.setFont(new Font("Arial", Font.BOLD, 25));
        b3.setFont(new Font("Arial", Font.BOLD, 25));
        b4.setFont(new Font("Arial", Font.BOLD, 25));
        b5.setFont(new Font("Arial", Font.BOLD, 25));
        b6.setFont(new Font("Arial", Font.BOLD, 25));
        b7.setFont(new Font("Arial", Font.BOLD, 25));
        b8.setFont(new Font("Arial", Font.BOLD, 25));
        b9.setFont(new Font("Arial", Font.BOLD, 25));
        b10.setFont(new Font("Arial", Font.BOLD, 25));
        b11.setFont(new Font("Arial", Font.PLAIN, 30));
        b12.setFont(new Font("Arial", Font.PLAIN, 30));
        b13.setFont(new Font("Arial", Font.PLAIN, 30));
        b14.setFont(new Font("Arial", Font.PLAIN, 30));
        b15.setFont(new Font("Arial", Font.PLAIN, 30));
        b16.setFont(new Font("Arial", Font.PLAIN, 20));
        b17.setFont(new Font("Arial", Font.PLAIN, 20));
        b18.setFont(new Font("Arial", Font.PLAIN, 30));
        b19.setFont(new Font("Arial", Font.PLAIN, 25));
        b20.setFont(new Font("Arial", Font.PLAIN, 25));
        b21.setFont(new Font("Arial", Font.PLAIN, 25));
        b22.setFont(new Font("Arial", Font.PLAIN, 25));
        b23.setFont(new Font("Arial", Font.PLAIN, 20));
        b24.setFont(new Font("Arial", Font.PLAIN, 20));
        b25.setFont(new Font("Arial", Font.PLAIN, 20));
        b26.setFont(new Font("Arial", Font.PLAIN, 25));
        b27.setFont(new Font("Arial", Font.PLAIN, 25));
        b28.setFont(new Font("Arial", Font.PLAIN, 20));
        b29.setFont(new Font("Arial", Font.PLAIN, 20));
        b30.setFont(new Font("Arial", Font.PLAIN, 25));
        b31.setFont(new Font("Arial", Font.PLAIN, 20));
        b32.setFont(new Font("Arial", Font.PLAIN, 20));
        b33.setFont(new Font("Arial", Font.PLAIN, 20));
        b34.setFont(new Font("Arial", Font.PLAIN, 20));
        b35.setFont(new Font("Arial", Font.PLAIN, 20));
        b36.setFont(new Font("Arial", Font.PLAIN, 20));
        b37.setFont(new Font("Arial", Font.PLAIN, 20));
        b38.setFont(new Font("Arial", Font.PLAIN, 20));
        b39.setFont(new Font("Arial", Font.PLAIN, 20));
        b40.setFont(new Font("Arial", Font.PLAIN, 20));
        b41.setFont(new Font("Arial", Font.PLAIN, 20));
        b42.setFont(new Font("Arial", Font.PLAIN, 20));
        b43.setFont(new Font("Arial", Font.PLAIN, 20));
        b44.setFont(new Font("Arial", Font.PLAIN, 20));
        b45.setFont(new Font("Arial", Font.PLAIN, 20));
        b46.setFont(new Font("Arial", Font.BOLD, 15));
        
        
        b1.setBounds(560,510,110,80);	
        b2.setBounds(670,510,110,80);
	b3.setBounds(780,510,110,80);
	b4.setBounds(560,430,110,80);
	b5.setBounds(670,430,110,80);		
	b6.setBounds(780,430,110,80);	
        b7.setBounds(560,350,110,80);
	b8.setBounds(670,350,110,80);
	b9.setBounds(780,350,110,80);
	b10.setBounds(670,590,110,80);		
	b11.setBounds(890,270,110,80);	
	b12.setBounds(890,350,110,80);
	b13.setBounds(890,430,110,80);
	b14.setBounds(890,510,110,80);
	b15.setBounds(890,590,110,80);	
	b16.setBounds(670,270,110,80);
        b17.setBounds(10,270,110,80);
	b18.setBounds(780,590,110,80);
	b19.setBounds(560,590,110,80);
	b20.setBounds(10,350,110,80);		
	b21.setBounds(10,430,110,80);	
	b22.setBounds(10,510,110,80);
	b23.setBounds(560,270,110,80);
	b24.setBounds(780,270,110,80);
	b25.setBounds(10,590,110,80);
        
        b26.setBounds(120,270,110,80);	
	b27.setBounds(120,350,110,80);
	b28.setBounds(120,430,110,80);
	b29.setBounds(120,510,110,80);
	b30.setBounds(120,590,110,80);		
	b31.setBounds(230,270,110,80);	
        b32.setBounds(230,350,110,80);
	b33.setBounds(230,430,110,80);
	b34.setBounds(230,510,110,80);
	b35.setBounds(230,590,110,80);		
	b36.setBounds(340,270,110,80);	
	b37.setBounds(340,350,110,80);
	b38.setBounds(340,430,110,80);
	b39.setBounds(340,510,110,80);
	b40.setBounds(340,590,110,80);	
	b41.setBounds(450,270,110,80);
        b42.setBounds(450,350,110,80);
	b43.setBounds(450,430,110,80);
	b44.setBounds(450,510,110,80);
	b45.setBounds(450,590,110,80);
        b46.setBounds(1280,10,60,30);
        
        add(b1);
	add(b2);
	add(b3);
	add(b4);
	add(b5);
	add(b6);
	add(b7);
	add(b8);
	add(b9);
	add(b10);
	add(b11);
	add(b12);
	add(b13);
	add(b14);
	add(b15);
	add(b16);
        add(b17);
	add(b18);
	add(b19);
	add(b20);
	add(b21);
	add(b22);
	add(b23);
	add(b24);
	add(b25);
        add(b26);
	add(b27);
	add(b28);
	add(b29);
	add(b30);
	add(b31);
	add(b32);
	add(b33);
	add(b34);
	add(b35);
	add(b36);
	add(b37);
	add(b38);
	add(b39);
	add(b40);
	add(b41);
        add(b42);
	add(b43);
	add(b44);
	add(b45);
        add(b46);
            
        b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);		
	b6.addActionListener(this);
	b7.addActionListener(this);
	b8.addActionListener(this);
	b9.addActionListener(this);
	b10.addActionListener(this);		
	b11.addActionListener(this);
	b12.addActionListener(this);
	b13.addActionListener(this);
	b14.addActionListener(this);
	b15.addActionListener(this);
	b16.addActionListener(this);
        b17.addActionListener(this);
	b18.addActionListener(this);
	b19.addActionListener(this);
	b20.addActionListener(this);		
	b21.addActionListener(this);
	b22.addActionListener(this);
	b23.addActionListener(this);
	b24.addActionListener(this);
	b25.addActionListener(this);
        b26.addActionListener(this);		
	b27.addActionListener(this);
	b28.addActionListener(this);
	b29.addActionListener(this);
	b30.addActionListener(this);
	b31.addActionListener(this);
	b32.addActionListener(this);
        b33.addActionListener(this);
	b34.addActionListener(this);
	b35.addActionListener(this);
	b36.addActionListener(this);		
	b37.addActionListener(this);
	b38.addActionListener(this);
	b39.addActionListener(this);
	b40.addActionListener(this);
	b41.addActionListener(this);
        b42.addActionListener(this);
	b43.addActionListener(this);
	b44.addActionListener(this);
	b45.addActionListener(this);
        b46.addActionListener(this);       
    }
   
   
    
    
    
    @Override
    public void paint(Graphics g)
    {    
        super.paint(g);            
        if(tfvalue == 0 || tfvalue == 1)
        {
            super.paint(g);
            //g.drawLine (0,30,1380,30);
            g.drawLine (0,60,1380,60);
            g.drawLine (1028,60,1028,320);
            g.setColor (Color.gray);
            g.drawRect(0,318,1028,420);
            g.fillRect(0,318,1028,420);
        }
       
        if(tfvalue == 2)
        {
            super.paint(g);
            //g.drawLine (0,10,1380,10);
            g.setColor (Color.GRAY);
            g.drawRect(30,90,1320,620);
            g.fillRect(30,90,1320,620);
            g.drawLine (0,60,1380,60);
            
            
            g.setColor (Color.white);
            g.drawRect(40,100,1300,600);
            g.fillRect(40,100,1300,600);
            g.setColor (Color.BLACK);
            g.drawRect(300,350,700,5);
            g.fillRect(300,350,700,5);
        }
        
        if(tfvalue == 3)
        {
            //g.drawLine (0,10,1380,10);
            g.drawLine(0, 60, 1380, 60);
            g.setColor (Color.GRAY);
            g.drawRect(20,80,1340,10);
            g.fillRect(20,80,1340,10);
            
            g.drawRect(20,80,10,640);
            g.fillRect(20,80,10,640);
            
            g.drawRect(20,710,1340,10);
            g.fillRect(20,710,1340,10);
            
            g.drawRect(1350,80,10,640);
            g.fillRect(1350,80,10,640);
            
            g.drawRect(1003,90,350,148);          
        }
    }
    
    
    
    
    
    public void about()
    {
        if (detail == 1)
        {
            l9 = new Label("********** Java Project **********");
            l9.setFont(new Font("Arial", Font.BOLD, 50));
        //l9.setBackground(Color.white);
            l9.setBounds(300,330,720,100);
            add(l9);
        
            l10 = new Label("NIELIT");
            l10.setFont(new Font("Arial", Font.BOLD, 125));
            //l10.setBackground(Color.white);
            l10.setBounds(450,130,400,100);
            add(l10);
        
            l11 = new Label("National Institute of Electronics and Information Technology");
            l11.setFont(new Font("Arial", Font.BOLD, 40));
        //l11.setBackground(Color.GRAY);
            l11.setBounds(100,580,1150,60);
            add(l11);
        }
        
        if (detail == 2)
        {
            l9 = new Label("Java Project");
            l9.setFont(new Font("Arial", Font.BOLD, 50));
            l9.setBackground(Color.white);
            l9.setBounds(500,50,400,70);           
            add(l9);
        
            l10 = new Label("on");
            l10.setFont(new Font("Arial", Font.BOLD, 50));
            l10.setBackground(Color.white);
            l10.setBounds(630,120,100,70);
            add(l10);
        
            l11 = new Label("Scientific Calculator");
            l11.setFont(new Font("Arial", Font.BOLD, 60));
            l11.setBackground(Color.white);
            l11.setBounds(350,210,700,70);
            add(l11);
            
            l12 = new Label("By :-      Rishabh Malhotra, Kunal Verma , Vineet Agarwal");
            l12.setFont(new Font("Arial", Font.BOLD, 25));
            l12.setBackground(Color.white);
            l12.setBounds(100,420,700,60);
            add(l12);
            
            l13 = new Label("              Maharaja Surajmal Institute Of Technology");
            l13.setFont(new Font("Arial", Font.BOLD, 25));
            l13.setBackground(Color.white);
            l13.setBounds(100,480,1200,60);
            add(l13);
            
            l14 = new Label("              Computer Science");
            l14.setFont(new Font("Arial", Font.BOLD, 25));
            l14.setBackground(Color.white);
            l14.setBounds(100,540,1200,60);
            add(l14);
        }
    }
    
    
    
    
    
    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        tfvalue = 0;
        getContentPane().removeAll();
        TextField();
        textArea();
        Standard();   
        this.revalidate();
        this.repaint(); 
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        tfvalue = 1;
        getContentPane().removeAll();
        TextField();
        textArea();
        Scientific();
        this.revalidate();
        this.repaint();      
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenu1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jMenu1ComponentAdded
      
    }//GEN-LAST:event_jMenu1ComponentAdded

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
       
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        getContentPane().removeAll();
        detail = 2;
        tfvalue = 2;
        getContentPane().removeAll();
        about();
        this.revalidate();
        this.repaint(); 
    }//GEN-LAST:event_jMenuItem3ActionPerformed

   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String args[]) 
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FirstJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FirstJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    // End of variables declaration//GEN-END:variables

    
}
