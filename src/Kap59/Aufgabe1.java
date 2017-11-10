package Kap59;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Aufgabe1 extends JFrame implements ActionListener 
{
	JButton redButton, greenButton, blueButton, greyButton;
	
	//Konstruktor
	public Aufgabe1(String title)
	{
		super(title);
		redButton = new JButton("red");
		greenButton = new JButton("green");
		blueButton = new JButton("blue");
		greyButton = new JButton("grey");
		
		redButton.setActionCommand("red");
		greenButton.setActionCommand("green");
		blueButton.setActionCommand("blue");
		greyButton.setActionCommand("grey");
		
		redButton.addActionListener(this);
		greenButton.addActionListener(this);
		blueButton.addActionListener(this);
		greyButton.addActionListener(this);
		
		setLayout(new FlowLayout());
		
		add(redButton);
		add(greenButton);
		add(blueButton);
		add(greyButton);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args)
	{
		Aufgabe1 demo = new Aufgabe1("Zwei Buttons");
		
		demo.setSize(1024,768);
		demo.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if (e.getActionCommand().equals("red"))
			getContentPane().setBackground(Color.red);
		if (e.getActionCommand().equals("green"))
			getContentPane().setBackground(Color.green);
		if (e.getActionCommand().equals("blue"))
			getContentPane().setBackground(Color.blue);
		if (e.getActionCommand().equals("grey"))
			getContentPane().setBackground(Color.darkGray);
		repaint();
		
	}
}
