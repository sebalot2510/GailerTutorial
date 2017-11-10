package Kap60;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Repeat extends JFrame implements ActionListener
{
	final String GEHEIM = "Test";
	
	JTextField text, text2;
	JLabel label, label2;
	JButton button;
	int zaehler = 0;
	
	
	public Repeat(String title)
	{
		super(title);
		
		text = new JTextField(15);
		label = new JLabel("Gib das Geheimwort ein:");
		
		text2 = new JTextField(15);
		label2 = new JLabel("Wort ist...");
		text2.setEditable(false);
		
		button = new JButton("Tauschen");
		
		
		setLayout (new FlowLayout());
		
		add(label);
		add(text);
		add(label2);
		add(text2);
		add(button);
		
		text.addActionListener(this);
		button.addActionListener(this);
		button.setActionCommand("b");
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		//pack();
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getActionCommand().equals("b"))
		{	
			String s = text.getText();
			text.setText(text2.getText());
			text2.setText(s);
			
		}
		else
		{
			if ( text.getText().equals(GEHEIM) )
			{
				zaehler = 0;
				text2.setText("Richtig!");
			}
			else 
			{
				zaehler++;
				text2.setText("Falsch!");
				if (zaehler == 3)
					System.exit(0);
			}
		
		
		}
		
		
	}
	
	public static void main(String[] args)
	{
		Repeat repeat = new Repeat("Repeat");
		repeat.setSize(1920,1080);
		repeat.setVisible(true);
		
	}
}
