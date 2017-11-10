package Kap60;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextBsp1 extends JFrame 
{
	JTextField text;
	JLabel label;
	
	public TextBsp1(String title)
	{
		super(title);
		
		text = new JTextField(15);
		label = new JLabel("Gib deinen Namen ein:");
		
		setLayout (new FlowLayout());
		
		add(label);
		add(text);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	public static void main(String[] args)
	{
		TextBsp1 bsp = new TextBsp1("Textfeld");
		bsp.setSize(1024,768);
		bsp.setVisible(true);
		
	}
}
