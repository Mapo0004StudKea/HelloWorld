package XV_Eksempler_Fra_Bøger.Javabogen.Kapitel02;

public class Alder2
{
	public static void main(String[] arg) 
	{
		int alder;
		alder = 15;

		if (alder >= 18)
			System.out.println("Du er myndig.");
		else
			System.out.println("Du er ikke myndig.");

		System.out.println("Du er " + alder + " år.");
	}
}