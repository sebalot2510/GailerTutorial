package Kap51;

public class Hund extends Haustiere
{
	
	public Hund(String name, double futtervorrat)
	{
		super(name,futtervorrat);
		System.out.println("VorratKatze:" + this.futtervorrat);
	}
	
	public void friss()
	{
		System.out.println("Name: " + name + " Vorrat: " + futtervorrat);
		futtervorrat--;
	}
	
	public void sprich()
	{
		System.out.println("Wau!");
		
	}
}
