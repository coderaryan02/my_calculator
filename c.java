import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// main menu 

class my_frame extends JFrame implements ActionListener
{
	Container c;
	JLabel label1,label2,label3;
	ImageIcon icon1,icon2,icon3,icon4,icon5;
	Color color1,color2;
	JButton b1,b2,b3;
	Font f1,f2;
    
	my_frame()
	{	
		setLocation(450,10);
		setSize(500,650);                 // frame design
		setResizable(false);
		setTitle("CALCULATOR");
		
		ImageIcon icon1=new ImageIcon("C:/jdk-9/bin/graphics/calculator/icon.png");
		setIconImage(icon1.getImage());      //frame icon
		
		c=getContentPane();
		     // container
		c.setLayout(null);
		
		color1=new Color(131, 149, 167);
		c.setBackground(color1);
		
		ImageIcon icon2=new ImageIcon("C:/jdk-9/bin/graphics/calculator/calculator.png");
		label1=new JLabel(icon2);
		label1.setBounds(120,30,icon2.getIconWidth(),icon2.getIconHeight());
		c.add(label1);
		
		label2=new JLabel("CALCULATOR");
		f1=new Font("arial",Font.BOLD,21); 
		label2.setFont(f1);
		label2.setBounds(180,210,150,160);
		label2.setForeground(Color.WHITE);
		c.add(label2);
		
		label3=new JLabel("   THEME   ");
		color2=new Color(199, 236, 238);
		f2=new Font("Algerian",Font.ITALIC,30); 
		label3.setFont(f2);
		label3.setBounds(10,350,150,160);
		label3.setForeground(color2);
		c.add(label3);
		
		ImageIcon icon3=new ImageIcon("C:/jdk-9/bin/graphics/calculator/t1.png");
		ImageIcon icon4=new ImageIcon("C:/jdk-9/bin/graphics/calculator/t2.jpg");
		ImageIcon icon5=new ImageIcon("C:/jdk-9/bin/graphics/calculator/t3.jpg");
		
		b1=new JButton(icon3);
		b1.setBounds(30,470,icon3.getIconWidth(),icon3.getIconHeight());
		b1.setEnabled(true);
		b1.setVisible(true);
		c.add(b1);
		
		b2=new JButton(icon4);
		b2.setBounds(190,470,icon3.getIconWidth(),icon3.getIconHeight());
		b2.setEnabled(true);
		b2.setVisible(true);
		c.add(b2);
		
		b3=new JButton(icon5);
		b3.setBounds(350,470,icon3.getIconWidth(),icon3.getIconHeight());
		b3.setEnabled(true);
		b3.setVisible(true);
		c.add(b3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public  void actionPerformed(ActionEvent e)
	{
		int x;
		if(b1==e.getSource())
		{
			my_frame1 frame1= new my_frame1();
		}
		if(b2==e.getSource())
		{
			x=2;
		}
		if(b3==e.getSource())
		{
			x=3;
		}
	}
}

//theme 1

class my_frame1 extends JFrame implements ActionListener
{
	Container c;
	JLabel label1,label2,label3;
	ImageIcon icon1,icon2,icon3,icon4,icon5;
	Color color1,color2,color3,color4,color5;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19;
	JTextField tf1;
	Font f1,f2,f3;
	String op="A",op1;
	int x=0,y=0,flag=0;
	float fx=0,fy=0;
    
	my_frame1()
	{	
		setLocation(450,10);
		setSize(500,650);                 // frame design
		setResizable(false);
		setTitle("CALCULATOR");
		
		ImageIcon icon1=new ImageIcon("C:/jdk-9/bin/graphics/calculator/icon.png");
		setIconImage(icon1.getImage());      //frame icon
		
		c=getContentPane();
		     // container
		c.setLayout(null);
		
		
		
		color1=new Color(6, 9, 17);
		c.setBackground(color1);
		
		tf1=new JTextField("0");
		tf1.setBounds(30,50,420,70);
		color2=new Color(29,9,52);
		tf1.setBackground(color2);
		tf1.setForeground(Color.YELLOW);
		tf1.setHorizontalAlignment(JTextField.RIGHT);
		Font f1=new Font("Lucida Bright",Font.BOLD,50);
		tf1.setFont(f1);
		tf1.setEditable(false);
		c.add(tf1);
		
		// buttons
		
		color3=new Color(255, 218, 121);
		color4=new Color(19, 15, 64);
		Font f2=new Font("Lucida Bright",Font.BOLD,30);
		
		b1=new JButton("1");
		b1.setVisible(true);
		b1.setEnabled(true);
		b1.setForeground(color3);
		b1.setBackground(color4);
		b1.setBounds(32,350,70,70);
		b1.setFont(f2);
		c.add(b1);
		
		b2=new JButton("2");
		b2.setVisible(true);
		b2.setEnabled(true);
		b2.setForeground(color3);
		b2.setBackground(color4);
		b2.setBounds(135,350,70,70);
		b2.setFont(f2);
		c.add(b2);
		
		b3=new JButton("3");
		b3.setVisible(true);
		b3.setEnabled(true);
		b3.setForeground(color3);
		b3.setBackground(color4);
		b3.setBounds(255,350,70,70);
		b3.setFont(f2);
		c.add(b3);
		
		b4=new JButton("4");
		b4.setVisible(true);
		b4.setEnabled(true);
		b4.setForeground(color3);
		b4.setBackground(color4);
		b4.setBounds(32,250,70,70);
		b4.setFont(f2);
		c.add(b4);
		
		b5=new JButton("5");
		b5.setVisible(true);
		b5.setEnabled(true);
		b5.setForeground(color3);
		b5.setBackground(color4);
		b5.setBounds(135,250,70,70);
		b5.setFont(f2);
		c.add(b5);
		
		b6=new JButton("6");
		b6.setVisible(true);
		b6.setEnabled(true);
		b6.setForeground(color3);
		b6.setBackground(color4);
		b6.setBounds(255,250,70,70);
		b6.setFont(f2);
		c.add(b6);
		
		b7=new JButton("7");
		b7.setVisible(true);
		b7.setEnabled(true);
		b7.setForeground(color3);
		b7.setBackground(color4);
		b7.setBounds(32,150,70,70);
		b7.setFont(f2);
		c.add(b7);
		
		b8=new JButton("8");
		b8.setVisible(true);
		b8.setEnabled(true);
		b8.setForeground(color3);
		b8.setBackground(color4);
		b8.setBounds(135,150,70,70);
		b8.setFont(f2);
		c.add(b8);
		
		b9=new JButton("9");
		b9.setVisible(true);
		b9.setEnabled(true);
		b9.setForeground(color3);
		b9.setBackground(color4);
		b9.setBounds(255,150,70,70);
		b9.setFont(f2);
		c.add(b9);
		
		b10=new JButton("0");
		b10.setVisible(true);
		b10.setEnabled(true);
		b10.setForeground(color3);
		b10.setBackground(color4);
		b10.setBounds(32,450,70,70);
		b10.setFont(f2);
		c.add(b10);
		
		b11=new JButton("DEL");
		b11.setVisible(true);
		b11.setEnabled(true);
		b11.setForeground(Color.WHITE);
		Color color5=new Color(111, 10, 211);
		b11.setBackground(color5);
		b11.setBounds(360,150,90,70);
		Font f3=new Font("Lucida Bright",Font.BOLD,20);
		b11.setFont(f3);
		c.add(b11);
		
		b12=new JButton("+");
		b12.setVisible(true);
		b12.setEnabled(true);
		b12.setForeground(color3);
		b12.setBackground(color4);
		b12.setBounds(360,250,90,70);
		b12.setFont(f2);
		c.add(b12);
		
		b13=new JButton("-");
		b13.setVisible(true);
		b13.setEnabled(true);
		b13.setForeground(color3);
		b13.setBackground(color4);
		b13.setBounds(360,350,90,70);
		b13.setFont(f2);
		c.add(b13);
		
		b14=new JButton("%");
		b14.setVisible(true);
		b14.setEnabled(true);
		b14.setForeground(color3);
		b14.setBackground(color4);
		b14.setBounds(135,450,70,70);
		b14.setFont(f2);
		c.add(b14);
		
		b15=new JButton("/");
		b15.setVisible(true);
		b15.setEnabled(true);
		b15.setForeground(color3);
		b15.setBackground(color4);
		b15.setBounds(255,450,70,70);
		b15.setFont(f2);
		c.add(b15);
		
		b16=new JButton("x");
		b16.setVisible(true);
		b16.setEnabled(true);
		b16.setForeground(color3);
		b16.setBackground(color4);
		b16.setBounds(360,450,90,70);
		b16.setFont(f2);
		c.add(b16);
		
		b17=new JButton("RESET");
		b17.setVisible(true);
		b17.setEnabled(true);
		b17.setForeground(Color.WHITE);
		b17.setBackground(color5);
		b17.setBounds(32,540,177,60);
		b17.setFont(f2);
		c.add(b17);
		
		b18=new JButton("=");
		b18.setVisible(true);
		b18.setEnabled(true);
		b18.setForeground(Color.WHITE);
		b18.setBackground(Color.CYAN);
		b18.setBounds(255,540,193,60);
		b18.setFont(f2);
		c.add(b18);
		
		ImageIcon ico=new ImageIcon("");
		b19=new JButton("=");
		b19.setVisible(true);
		b19.setEnabled(true);
		b19.setForeground(Color.WHITE);
		b19.setBackground(Color.CYAN);
		b19.setBounds(255,540,193,60);
		b19.setFont(f2);
		c.add(b19);
		
		
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
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public  void actionPerformed(ActionEvent e)
	{
		
		try
		{
			if(b1==e.getSource())
			{
				x=Integer.parseInt(tf1.getText());
				x=x*10+1;
				String ch =Integer.toString(x);
				tf1.setText(ch);
			}
			if(b2==e.getSource())
			{
				x=Integer.parseInt(tf1.getText());
				x=x*10+2;
				String ch =Integer.toString(x);
				tf1.setText(ch);
			}
			if(b3==e.getSource())
			{
				x=Integer.parseInt(tf1.getText());
				x=x*10+3;
				String ch =Integer.toString(x);
				tf1.setText(ch);				
			}
			if(b4==e.getSource())
			{
				x=Integer.parseInt(tf1.getText());
				x=x*10+4;
				String ch =Integer.toString(x);
				tf1.setText(ch);
			}
			if(b5==e.getSource())
			{
				x=Integer.parseInt(tf1.getText());
				x=x*10+5;
				String ch =Integer.toString(x);
				tf1.setText(ch);
			}
			if(b6==e.getSource())
			{
				x=Integer.parseInt(tf1.getText());
				x=x*10+6;
				String ch =Integer.toString(x);
				tf1.setText(ch);
			}
			if(b7==e.getSource())
			{
				x=Integer.parseInt(tf1.getText());
				x=x*10+7;
				String ch =Integer.toString(x);
				tf1.setText(ch);
			}
			if(b8==e.getSource())
			{
				x=Integer.parseInt(tf1.getText());
				x=x*10+8;
				String ch =Integer.toString(x);
				tf1.setText(ch);
			}
			if(b9==e.getSource())
			{
				x=Integer.parseInt(tf1.getText());
				x=x*10+9;
				String ch =Integer.toString(x);
				tf1.setText(ch);
			}
			if(b10==e.getSource())
			{
				x=Integer.parseInt(tf1.getText());
				x=x*10;
				String ch =Integer.toString(x);
				tf1.setText(ch);
			}
			
			
			if(b11==e.getSource())
			{
				x=Integer.parseInt(tf1.getText());
				x=x/10;
				String ch =Integer.toString(x);
				tf1.setText(ch);
			}
			
			
			if(b12==e.getSource())
			{
				if(op=="A")
				{
					y=Integer.parseInt(tf1.getText());
					op=b12.getText();
					op1=b12.getText();
					x=0;
					String ch =Integer.toString(x);
					tf1.setText(ch);
				}
				else 
				{
					if(op1=="+")
					{
						x=Integer.parseInt(tf1.getText());
						y=x+y;
						x=0;
						String ch1 =Integer.toString(x);
						tf1.setText(ch1);
						op1=b12.getText();
					}
					else if(op1=="-")
					{
						x=Integer.parseInt(tf1.getText());
						y=y-x;
						x=0;
						String ch1 =Integer.toString(x);
						tf1.setText(ch1);
						op1=b12.getText();
					}
					else if(op1=="x")
					{
						x=Integer.parseInt(tf1.getText());
						y=y*x;
						x=0;
						String ch1 =Integer.toString(x);
						tf1.setText(ch1);
						op1=b12.getText();
					}
					else if(op1=="%")
					{
						x=Integer.parseInt(tf1.getText());
						y=y%x;
						x=0;
						String ch1 =Integer.toString(x);
						tf1.setText(ch1);
						op1=b12.getText();
					}
					else if(op1=="/")
					{
						x=Integer.parseInt(tf1.getText());
						y=y/x;
						x=0;
						String ch1 =Integer.toString(x);
						tf1.setText(ch1);
						op1=b12.getText();
					}
				}
			}
			
			if(b13==e.getSource())
			{
				if(op=="A")
				{
					y=Integer.parseInt(tf1.getText());
					op=b13.getText();
					op1=b13.getText();
					x=0;
					String ch =Integer.toString(x);
					tf1.setText(ch);
				}
				else 
				{
					if(op1=="+")
					{
						x=Integer.parseInt(tf1.getText());
						y=x+y;
						x=0;
						String ch1 =Integer.toString(x);
						tf1.setText(ch1);
						op1=b13.getText();
					}
					else if(op1=="-")
					{
						x=Integer.parseInt(tf1.getText());
						y=y-x;
						x=0;
						String ch1 =Integer.toString(x);
						tf1.setText(ch1);
						op1=b13.getText();
					}
					else if(op1=="x")
					{
						x=Integer.parseInt(tf1.getText());
						y=y*x;
						x=0;
						String ch1 =Integer.toString(x);
						tf1.setText(ch1);
						op1=b13.getText();
					}
					else if(op1=="%")
					{
						x=Integer.parseInt(tf1.getText());
						y=y%x;
						x=0;
						String ch1 =Integer.toString(x);
						tf1.setText(ch1);
						op1=b13.getText();
					}
					else if(op1=="/")
					{
						x=Integer.parseInt(tf1.getText());
						y=y/x;
						x=0;
						String ch1 =Integer.toString(x);
						tf1.setText(ch1);
						op1=b13.getText();
					}
				}
			}
			
			if(b14==e.getSource())
			{
				if(op=="A")
				{
					y=Integer.parseInt(tf1.getText());
					op=b14.getText();
					op1=b14.getText();
					x=0;
					String ch =Integer.toString(x);
					tf1.setText(ch);
				}
				else 
				{
					if(op1=="+")
					{
						x=Integer.parseInt(tf1.getText());
						y=x+y;
						x=0;
						String ch1 =Integer.toString(x);
						tf1.setText(ch1);
						op1=b14.getText();
					}
					else if(op1=="-")
					{
						x=Integer.parseInt(tf1.getText());
						y=y-x;
						x=0;
						String ch1 =Integer.toString(x);
						tf1.setText(ch1);
						op1=b14.getText();
					}
					else if(op1=="x")
					{
						x=Integer.parseInt(tf1.getText());
						y=y*x;
						x=0;
						String ch1 =Integer.toString(x);
						tf1.setText(ch1);
						op1=b14.getText();
					}
					else if(op1=="%")
					{
						x=Integer.parseInt(tf1.getText());
						y=y%x;
						x=0;
						String ch1 =Integer.toString(x);
						tf1.setText(ch1);
						op1=b14.getText();
					}
					else if(op1=="/")
					{
						x=Integer.parseInt(tf1.getText());
						y=y/x;
						x=0;
						String ch1 =Integer.toString(x);
						tf1.setText(ch1);
						op1=b14.getText();
					}
				}
			}
			
			if(b15==e.getSource())
			{
				if(op=="A")
				{
					y=Integer.parseInt(tf1.getText());
					op=b15.getText();
					op1=b15.getText();
					x=0;
					String ch =Integer.toString(x);
					tf1.setText(ch);
				}
				else 
				{
					if(op1=="+")
					{
						x=Integer.parseInt(tf1.getText());
						y=x+y;
						x=0;
						String ch1 =Integer.toString(x);
						tf1.setText(ch1);
						op1=b15.getText();
					}
					else if(op1=="-")
					{
						x=Integer.parseInt(tf1.getText());
						y=y-x;
						x=0;
						String ch1 =Integer.toString(x);
						tf1.setText(ch1);
						op1=b15.getText();
					}
					else if(op1=="x")
					{
						x=Integer.parseInt(tf1.getText());
						y=y*x;
						x=0;
						String ch1 =Integer.toString(x);
						tf1.setText(ch1);
						op1=b15.getText();
					}
					else if(op1=="%")
					{
						x=Integer.parseInt(tf1.getText());
						y=y%x;
						x=0;
						String ch1 =Integer.toString(x);
						tf1.setText(ch1);
						op1=b15.getText();
					}
					else if(op1=="/")
					{
						x=Integer.parseInt(tf1.getText());
						y=y/x;
						x=0;
						String ch1 =Integer.toString(x);
						tf1.setText(ch1);
						op1=b15.getText();
					}
				}
			}
			
			if(b16==e.getSource())
			{
				if(op=="A")
				{
					y=Integer.parseInt(tf1.getText());
					op=b16.getText();
					op1=b16.getText();
					x=0;
					String ch =Integer.toString(x);
					tf1.setText(ch);
				}
				else 
				{
					if(op1=="+")
					{
						x=Integer.parseInt(tf1.getText());
						y=x+y;
						x=0;
						String ch1 =Integer.toString(x);
						tf1.setText(ch1);
						op1=b16.getText();
					}
					else if(op1=="-")
					{
						x=Integer.parseInt(tf1.getText());
						y=y-x;
						x=0;
						String ch1 =Integer.toString(x);
						tf1.setText(ch1);
						op1=b16.getText();
					}
					else if(op1=="x")
					{
						x=Integer.parseInt(tf1.getText());
						y=y*x;
						x=0;
						String ch1 =Integer.toString(x);
						tf1.setText(ch1);
						op1=b16.getText();
					}
					else if(op1=="%")
					{
						x=Integer.parseInt(tf1.getText());
						y=y%x;
						x=0;
						String ch1 =Integer.toString(x);
						tf1.setText(ch1);
						op1=b16.getText();
					}
					else if(op1=="/")
					{
						x=Integer.parseInt(tf1.getText());
						y=y/x;
						x=0;
						String ch1 =Integer.toString(x);
						tf1.setText(ch1);
						op1=b16.getText();
					}
				}
			}
			
			if(b17==e.getSource())
			{
				x=Integer.parseInt(tf1.getText());
				x=0;
				y=0;
				String ch =Integer.toString(x);
				tf1.setText(ch);
				op="A";
			}
			
			if(b18==e.getSource())
			{
				if(op1=="+")
				{
					x=Integer.parseInt(tf1.getText());
					y=x+y;
				}
				else if(op1=="-")
				{
					x=Integer.parseInt(tf1.getText());
					y=y-x;
				}
				else if(op1=="x")
				{
					x=Integer.parseInt(tf1.getText());
					y=x*y;
				}
				else if(op1=="/")
				{
					x=Integer.parseInt(tf1.getText());
					y=y/x;
				}
				else if(op1=="%")
				{
					x=Integer.parseInt(tf1.getText());
					y=y%x;
				}
				op1=b18.getText();
				String ch =Integer.toString(y);
				x=0;
				y=0;
				
				if(op!="A")
				{
					tf1.setText(ch);
				}
				op="A";
			}
		}
		catch(NumberFormatException e1){}
		catch(ArithmeticException e2){}
	}
}





class my_calculator
{
	public static void main(String str[])
	{
		my_frame frame= new my_frame();
	}
}