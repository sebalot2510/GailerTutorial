package Kap56;

import javax.swing.*;
import java.awt.*;

public class MeinFrame extends JFrame 
{
	JLabel label;
	JLabel label2;
	
	//Konstruktor
	
	public MeinFrame(String title)
	{
		super(title);
		setSize(1024,768);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new FlowLayout());
		
		label = new JLabel ("Hello Swing!");
		add(label);
		
		label2 = new JLabel("Zweites Label");
		add(label2);
		
	}
}
