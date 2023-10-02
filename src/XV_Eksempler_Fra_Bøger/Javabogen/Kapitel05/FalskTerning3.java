package XV_Eksempler_Fra_Bøger.Javabogen.Kapitel05;

import XV_Eksempler_Fra_Bøger.Javabogen.Kapitel04.Terning;

public class FalskTerning3 extends Terning
{
	public void kast ()
	{
		super.kast(); // kald den oprindelige kast-metode

		// blev det 1 eller 2? Så lav det om til en 6'er!
		if ( getVærdi() <= 2 ) setVærdi(6);
	}
}