package Kap51;

public class Katze extends Haustiere
{
	
	public Katze(String name, double futtervorrat)
	{
		super(name,futtervorrat);
		System.out.println("VorratKatze:" + this.futtervorrat);
	}
	
	public void friss()
	{
		System.out.println("Name: " + name + " Vorrat: " + futtervorrat);
		futtervorrat -= 0.5;
	}
	
	public void sprich()
	{
		System.out.println("Miau!");
		
	}
}
