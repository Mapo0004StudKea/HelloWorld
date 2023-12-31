package XVI_Eksempler_Fra_Bøger.Javabogen.Kapitel05;

import XVI_Eksempler_Fra_Bøger.Javabogen.Kapitel04.Boks3;

public class Boks3medDensitet extends Boks3
{
	private double densitet;

	public Boks3medDensitet()
	{
		// super(); kaldes automatisk hvis intet andet angives
		densitet = 10.0;
	}

	public Boks3medDensitet(double lgd, double b,	
					double h, double densitet)
	{
		// vælg en anden konstruktør i superklassen 
		// end den uden parametre
		super(lgd,b,h); 
		this.densitet = densitet;
	}

	public double vægt()
	{
		// superklassen udregner volumen for os
		return volumen() * densitet; 
	}
}