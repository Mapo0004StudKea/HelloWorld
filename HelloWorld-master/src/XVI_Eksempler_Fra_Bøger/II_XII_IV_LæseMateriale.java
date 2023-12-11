package XVI_Eksempler_Fra_Bøger;

public class II_XII_IV_LæseMateriale {
}

//Indtil nu har vi kun defineret main-metoden og haft al vores programkode der.
//Ofte kan det være nyttigt at opdele programkoden i mindre stumper med hvert sit navn. Disse stumper –
// kaldet metoder – bør indeholde kode, der logisk hører sammen, f.eks. en beregning eller opgave.
// Metoder bliver behandlet i kapitel Fejl: Henvisningskilde ikke fundet og Fejl: Henvisningskilde ikke fundet,
// men lad os se på dem allerede nu.
//Herunder definérer vi metoden hils(), der hilser på person med et bestemt navn:
/**
public class Metoder1
{
  public static void hils(String navn)
  {
    System.out.println("Kære "+navn+", du aner ikke hvor glad jeg er for at");
    System.out.println("møde en med "+navn.length()+" bogstaver i sit navn!");
  }

  public static void main(String[] arg)
  {
    hils("Bo");
    hils("Jacob");
    hils("Christoffer");
  }
}

Kære Bo, du aner ikke hvor glad jeg er for at
møde en med 2 bogstaver i sit navn!
Kære Jacob, du aner ikke hvor glad jeg er for at
møde en med 5 bogstaver i sit navn!
Kære Christoffer, du aner ikke hvor glad jeg er for at
møde en med 11 bogstaver i sit navn!
*/
//En metode kan have flere kommaseparerede parametre og kan returnere én variabel.
// Ovenfor fik hils() parameteren navn (af type String) overført.
//I nedenstående eksempel er der to metoder ud over main():
// En til at gange et tal med 10 og en til at dividere et tal med et andet tal.
//Metoden gangMedTi() får en variabel tal (af type int) som parameter og returnerer en int.
//Metoden dividér() får tæller og nævner overført og returnerer en double med resultatet.
/**
public class Metoder2
{
  //              returtype   metodenavn  (parametertype variabelnavn)
  public static   int         gangMedTi   (int           tal)
  {
    int resultat;
    resultat = tal*10;      // lav mellemregning
    return resultat;        // returnér resultatet
  }

  public static double dividér (double tæller, double nævner)
  {
    return tæller / nævner; // returnér resultatet, uden en mellemregning
  }

  public static void main(String[] arg)
  {
    for( int x = 1; x<=5; x++)
    {
      int tidobbelt = gangMedTi(x);
      System.out.print( "Det tidobbelte er " + tidobbelt );

      double tredjedel = dividér(tidobbelt, 3);
      System.out.println( " og en tredjedel af dette er " + tredjedel );
    }
  }
}
*/
//Det tidobbelte er 10 og en tredjedel af dette er 3.3333333333333335
//Det tidobbelte er 20 og en tredjedel af dette er 6.666666666666667
//Det tidobbelte er 30 og en tredjedel af dette er 10.0
//Det tidobbelte er 40 og en tredjedel af dette er 13.333333333333334
//Det tidobbelte er 50 og en tredjedel af dette er 16.666666666666668

//En metode, der returnerer en værdi, skal indeholde nøgleordet "return",
//som får programudførslen til at hoppe tilbage til kalderen (i dette tilfælde main()) med resultatet.
//Hvis en metode ikke skal returnere noget resultat, erklæres den med returtype "void".

//Man kan godt undlade at benytte returværdien fra en metode (så vil resultatet bare blive smidt væk).
// Følgende definition af main() gør ingenting:
/**
  public static void main(String[] arg)
  {
    for( int x = 1; x<=10; x++)
    {
      gangMedTi(x);
    }
  }
*/
//Eksempel: Finde primtal

//Herunder har vi primtalsprogrammet igen, men denne gang undersøger vi primtal i intervallet 10 til 20. Hver gang vi finder et primtal, tæller vi antalPrimtal op, så vi til sidst kan skrive præcist, hvor mange primtal, der er i intervallet.
/**
public class Metoder3Primtal
{
  public static boolean erPrimtal(int talDerSkalUndersøges)
  {
    int faktor = 2;

    while (talDerSkalUndersøges % faktor > 0) faktor++;

    if (faktor < talDerSkalUndersøges)
    {
      System.out.println(talDerSkalUndersøges + " har faktoren "+faktor);
      return false;
    } else {
      System.out.println(talDerSkalUndersøges + " er et primtal.");
      return true;
    }
  }
*/
/**
  public static void main(String[] arg)
  {
    int antalPrimtal = 0;

    int tal;
    for (tal = 10; tal<20; tal++)
    {
      boolean erPrim = erPrimtal(tal);
      if ( erPrim ) antalPrimtal = antalPrimtal + 1;
    }

    System.out.println("Antal primtal i alt: " + antalPrimtal);
  }
}
*/
//10 har faktoren 2
//11 er et primtal.
//12 har faktoren 2
//13 er et primtal.
//14 har faktoren 2
//15 har faktoren 3
//16 har faktoren 2
//17 er et primtal.
//18 har faktoren 2
//19 er et primtal.
//Antal primtal i alt: 4

//Ovenstående afsnit er ikke omfattet af Åben Dokumentslicens, men af de almindelige regler omkring ophavsretsret.
