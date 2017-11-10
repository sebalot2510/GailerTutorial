package Kap59;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ZweiButtons extends JFrame implements ActionListener 
{
	JButton redButton;
	JButton greenButton;
	
	//Konstruktor
	public ZweiButtons(String title)
	{
		super(title);
		redButton = new JButton("red");
		greenButton = new JButton("green");
		
		redButton.setActionCommand("red");
		greenButton.setActionCommand("green");
		
		
		redButton.addActionListener(this);
		greenButton.addActionListener(this);
		
		setLayout(new FlowLayout());
		
		add(redButton);
		add(greenButton);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args)
	{
		ZweiButtons demo = new ZweiButtons("Zwei Buttons");
		
		demo.setSize(1024,768);
		demo.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if (e.getActionCommand().equals("red"))//Ohne setActionCommand() (siehe oben) wird der Name des Buttons mitgegeben
			getContentPane().setBackground(Color.red);
		else
			getContentPane().setBackground(Color.green);
		
		repaint();
		
	}
}
