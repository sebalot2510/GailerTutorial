package Kap56;

import javax.swing.JFrame;
import java.awt.*;

public class ZweiTestFrames 
{
	public static void main(String[] args)
	{
		JFrame master = new JFrame("Programm beenden");
		JFrame temp = new JFrame("Temp");
		
		master.setVisible(true);
		master.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		master.setSize(1024,768);
		
		temp.setVisible(true);
		temp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		temp.setSize(800,600);
	}
}
