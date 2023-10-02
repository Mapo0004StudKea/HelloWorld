package XV_Eksempler_Fra_Bøger.Javabogen.Kapitel02;

public class Dyreinternat
{
	public static void main(String[] arg) 
	{
		int antalHunde, antalKatte, antalDyr;
		antalHunde = 5;
		antalKatte = 8; 

		//udregn summen
		antalDyr = antalHunde + antalKatte;

		// udskriv resultatet
		System.out.println("Antal dyr: " + antalDyr);

		antalHunde	= 10;

		// antalDyr er uændret
		System.out.println("Antal dyr nu: " + antalDyr);
	}
}