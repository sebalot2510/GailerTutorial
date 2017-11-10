package Kap57;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Buttonquitter extends JFrame implements ActionListener 
{
	
	JButton bQuit = new JButton("Klick zum Beenden");
	
	public Buttonquitter(String title)
	{
		super(title);
		setLayout(new FlowLayout());
		
		bQuit.addActionListener(this);
		add(bQuit);
		
	}

	public static void main(String[] args) {
		
		Buttonquitter frame = new Buttonquitter("Button Quitter");

	    frame.setSize( 1600, 900 );

	    frame.setVisible( true );

	}
	
	public void actionPerformed(ActionEvent e)
	{
		System.exit(0);
	}

}
