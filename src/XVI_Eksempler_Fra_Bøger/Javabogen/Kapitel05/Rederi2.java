package XVI_Eksempler_Fra_Bøger.Javabogen.Kapitel05;

/** Et rederi, der kan købes af en spiller */

public class Rederi2 extends Grund2 
{
	public Rederi2(String navn, double pris, double leje)
	{
		super(navn, pris, leje); // overfør værdierne til superklassens konstruktør
	}
}