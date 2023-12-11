package XVI_Eksempler_Fra_Bøger.Javabogen.Kapitel05;

import XVI_Eksempler_Fra_Bøger.Javabogen.Kapitel04.Terning;

public class Snydespil2medPolymorfi
{
	public static void main(String[] arg)
	{
		FalskTerning2 ft = new FalskTerning2();
		ft.sætSnydeværdi(4);

		Terning t;
		t = ft;
		                                   // punkt A
		for (int i=0; i<3; i++)
		{
			t.kast();
			System.out.println("t=" + t);
		}
	}
}