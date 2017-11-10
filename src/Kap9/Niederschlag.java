package Kap9;

public class Niederschlag 
{
	public static void main (String[] args)
	{
		int april = 12;
		int mai = 14;
		int juni = 8;
		
		double durchschnitt;
		
		durchschnitt = (april + mai + juni) / 3.0;
		
		System.out.println("Niederschlag im April:" + '\t' + april);
		System.out.println("Niederschlag im Mai:" + '\t' + mai);
		System.out.println("Niederschlag im juni:" + '\t' + juni);
		
		System.out.println("Durchschnitt:" + '\t' + '\t' + durchschnitt);
	}
}
