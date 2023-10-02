package XV_Eksempler_Fra_Bøger;

public class II_XII_V_Læsemateriale {
    //Som beskrevet i appendiks 0.11.5 kan flere logiske udtryk kombineres til ét udtryk med && (og), || (eller) og ! (ikke). Linjen
/**
if (0<=n && n<=100 && n%2==0) System.out.println("n er OK");
*/
    //vil udskrive "n er OK", hvis n er lige og mellem 0 og 100.
    //Man negerer et udtryk med ! foran:
/**
            if (!(0<=n && n<=100 && n%2==0)) System.out.println("n er ikke OK");
*/
    //Man kan lege en del med logisk aritmetik. Her er et par måder at skrive det samme udtryk:
/**
            if (!(0<=n  &&   n<=100  &&   n%2==0)) ...

            if (!(0<=n) || !(n<=100) || !(n%2==0)) ...

            if (   0>n  ||    n>100  ||   n%2!=0) ...
*/
    //Ovenstående afsnit er ikke omfattet af Åben Dokumentslicens, men af de almindelige regler omkring ophavsretsret.
}
