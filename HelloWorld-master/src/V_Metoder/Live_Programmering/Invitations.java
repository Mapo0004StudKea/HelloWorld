package V_Metoder.Live_Programmering;

public class Invitations {

    public static void main(String[] args) {
        printInvitation("Ole", "Fodbold");
        printInvitation("Pia", "Kage");
        printInvitation("Ulla", "PS5");
    }
    static void printInvitation(String Name, String gave) {
        System.out.println("Kære "+Name);
        System.out.println("Det ville glæde mig meget at se dig til min fødselsdag.");
        System.out.println("Onsdag d. 6/6 kl. 14:00");
        System.out.println("venlig hilsen");
        System.out.println("Bjørn");
        System.out.println("PS. medbring "+gave+"\n");
    }
}
