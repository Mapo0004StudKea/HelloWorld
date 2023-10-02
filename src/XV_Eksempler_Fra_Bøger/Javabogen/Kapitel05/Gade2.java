package XV_Eksempler_Fra_Bøger.Javabogen.Kapitel05;

/** En gade, der købes af en spiller og bebygges */

public class Gade2 extends Grund2
{
	int antalHuse;                             // antal huse og pris
	double huspris;

	public Gade2(String navn, double pris, double leje, double huspris)
	{
		super(navn, pris, leje);                 // kald Grund2's konstruktør
		this.huspris=huspris;
		antalHuse = 0;
	}

	public double beregnLeje()                 // tilsidesæt Grund2's beregnLeje()
	{
		return grundleje + antalHuse * huspris;
	}

	public void landet(Spiller sp)
	{
		super.landet(sp);                        // brug gamle landet()
		if (sp==ejer)
		{                                        // eget felt; byg hus?
			if (antalHuse<5 && sp.konto>huspris && sp.spørgsmål("købe hus for "+pris))
			{                                     // byg et hus
				ejer.transaktion( -huspris );
				antalHuse = antalHuse + 1;
				sp.besked("Du bygger hus på "+navn+" for "+huspris);
			}
		}
	}
}