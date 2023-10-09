package XVI_Eksempler_Fra_Bøger.Javabogen.Kapitel05;

import XVI_Eksempler_Fra_Bøger.Javabogen.Kapitel04.Terning;

public class FalskTerning2 extends Terning
{
	public int snydeværdi;

	public void sætSnydeværdi(int nySnydeværdi)
	{
		snydeværdi = nySnydeværdi;
	}

	public void kast()
	{
		//System.out.println("[kast() på FalskTerning2] ");

		int værdi = (int) (6*Math.random() + 1);

		// 1 eller 2? Så lav det om til snydeværdi!
		if ( værdi <= 2 ) værdi = snydeværdi;

		setVærdi(værdi); // sæt værdien på terningen 
	}
}