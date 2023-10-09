package XII_Abstraktion_og_delegering.Live_Programming.test.DiceGame;

public class OneHundred {
    Player p1=new Player("Bjarke");
    Player p2=new Player("Martin");

    void play(){
        System.out.println(p1.name+"\t"+p2.name);
        while (p1.points<100 && p2.points<100){
            p1.turn();
            p2.turn();
            System.out.println(p1.points+"\t\t"+ p2.points);
        }
    }

    public static void main(String[] args) {
        OneHundred game=new OneHundred();
        game.play();
    }
}
