package XV_Eksempler_Fra_Bøger.Javabogen.Kapitel04;

public class Boks2
{
	private double længde;
	private double bredde;
	private double højde;

	public void sætMål(double lgd, double b, double h)
	{
		if (lgd>0 && b>0 && h>0)
		{
			længde = lgd;
			bredde = b;
			højde  = h;
		} else {
 			System.out.println("Ugyldige mål. Bruger standardmål.");
			længde = 10.0;
			bredde = 10.0;
			højde  = 10.0;
		}
	}
	public void sætMassefylde(double m, double v, double p) {

	}
	public double volumen()
	{
		double vol;
		vol = længde*bredde*højde;
		return vol; 
	}
/*
	public double massefylde() {
		//m = V * p, V = m/P, p = m/V
		double m;
		//masse =
		//return;
	}

 */
}