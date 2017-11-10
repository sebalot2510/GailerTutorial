package Kap59;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Zahlenschloss extends JFrame implements ActionListener 
{
	JButton button0, button1, button2, button3, button4, button5, button6,
			button7, button8, button9;
	
	private String s = "";
	
	public Zahlenschloss(String title)
	{
		super(title);
		
		button0 = new JButton("0");
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5 = new JButton("5");
		button6 = new JButton("6");
		button7 = new JButton("7");
		button8 = new JButton("8");
		button9 = new JButton("9");
		
		setLayout(new FlowLayout());
		
		button0.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		
		add(button0);
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		add(button6);
		add(button7);
		add(button8);
		add(button9);
		
		button0.setActionCommand("0");
		button1.setActionCommand("1");
		button2.setActionCommand("2");
		button3.setActionCommand("3");
		button4.setActionCommand("4");
		button5.setActionCommand("5");
		button6.setActionCommand("6");
		button7.setActionCommand("7");
		button8.setActionCommand("8");
		button9.setActionCommand("9");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		s= s + e.getActionCommand();
		
		if (s.length() == 3)
		{
			if (s.equals("735"))
			{
				System.exit(0);
			}
			else
			{
				getContentPane().setBackground(Color.red);
				s = "";
			}				
		}
	}
	
	public static void main(String[] args)
	{
		Zahlenschloss z = new Zahlenschloss("Zahlenschloss");
		
		z.setSize(1024,768);
		z.setVisible(true);
	}
}
