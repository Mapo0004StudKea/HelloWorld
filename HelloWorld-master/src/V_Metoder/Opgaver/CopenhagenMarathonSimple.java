package V_Metoder.Opgaver;

public class CopenhagenMarathonSimple {
    public static void main(String[] args) {
        String name = "flint";
        bekræftelse("bob", 1552, 'A');
        bekræftelse("Niels", 1552, 'B');
        bekræftelse("Flemming", 1552, 'C');
        bekræftelse(name , 1999, 'D');
    }
    public static void bekræftelse(String deltarensNavn, int startnummer, char startgruppe) {
        System.out.println("Dear "+deltarensNavn+"!");
        System.out.println("We are happy to receive your registration.");
        System.out.println("Your start number is: "+startnummer);
        System.out.println("You start in group: "+startgruppe);
        System.out.println("Please check in 10 minutes before start.");

    }
}
