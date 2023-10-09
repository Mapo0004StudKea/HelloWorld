package XII_Abstraktion_og_delegering.Opgaver.DiceGame;

public class OneHundred {
    Player p1 = new Player("");
    Player p2 = new Player("");
    Player p3 = new Player("");



    void Play() {
        System.out.println(p1.Name+"    "+p2.Name+"    "+p3.Name);
        while (p1.Points<100 && p2.Points<100 && p3.Points<100) {
            p1.turn();
            p2.turn();
            p3.turn();
            System.out.println(p1.Points+"      "+p2.Points+"       "+ p3.Points);
        }
        if (p1.Points < p2.Points && p1.Points < p3.Points) {
            System.out.println("Vinderen er: "+p1.Name);
            System.out.println("Det har taget: "+p1.turn()+" runder");
        } else if (p2.Points < p1.Points && p2.Points < p1.Points) {
            System.out.println("Vinderen er: "+p2.Name);
            System.out.println("Det har taget: "+p2.turn()+" runder");
        } else if (p3.Points < p1.Points && p3.Points < p2.Points) {
            System.out.println("Vinderen er: "+p3.Name);
            System.out.println("Det har taget: "+p3.turn()+" runder");
        } else {
            System.out.println("Ingen vinder");
            System.out.println("Det har taget: "+p1.turn()+" runder");
        }
    }

    public static void main(String[] args) {
        OneHundred game = new OneHundred();
        game.Play();

    }
}
