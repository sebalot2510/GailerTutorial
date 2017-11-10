package Kap30;

public class HalloTester 
{

	public static void main ( String[] args )
	{
	    HalloObjekt einObjekt = new HalloObjekt("Hallo");

	    einObjekt.sprich();
	    
	    einObjekt.morgengruss();
	    
	    einObjekt.abendgruss();
	    
	    HalloObjekt gruss = new HalloObjekt();
	    
	    gruss.sprechen();
	    
	    HalloObjekt test = new HalloObjekt(einObjekt);
	    
	    test.sprich();
	}
}