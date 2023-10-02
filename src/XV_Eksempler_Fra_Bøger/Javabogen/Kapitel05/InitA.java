package XV_Eksempler_Fra_Bøger.Javabogen.Kapitel05;

import java.awt.Point;
public class InitA
{
	public InitA()
	{
	  p.x = 10;                                  // p2  (udføres efter p1)
	}

	Point p = new Point();                       // p1  (udføres først)
}