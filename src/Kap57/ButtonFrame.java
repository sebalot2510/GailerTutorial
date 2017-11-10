package Kap57;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ButtonFrame extends JFrame implements ActionListener
{
	
	JButton bChange;
	
	//Konstruktor
	public ButtonFrame(String title)
	{
		super(title);
		setLayout(new FlowLayout());
		
		bChange = new JButton("Klick mich");
		bChange.addActionListener(this);
		add(bChange);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//Methoden
	
	//Schnittstellenmethoden
	public void actionPerformed(ActionEvent evt)
	{
		getContentPane().setBackground(Color.blue);
		repaint();
	}
}
