package IV_Løkker.Live_Programming;

import javax.swing.*;
import java.util.Random;

public class DicemanLoop {
    public static void main(String[] args) {
        Random gen = new Random();
        String activity = "";
        int dice;
        boolean keepGoing = true;
        System.out.println("Dicemann Loop");
        int answer;
        while (keepGoing) {

            dice = gen.nextInt(6) + 1; //intervallet [1, 6]
            if (dice == 1) {
                activity = "Breakfast";
            } else if (dice == 2) {
                activity = "Study";
            } else if (dice == 3) {
                activity = "Go swimming";
            } else if (dice == 4) {
                activity = "Go out fishing";
            } else if (dice == 5) {
                activity = "Call your mother";
            } else if (dice == 6) {
                activity = "Back to sleep";
            }
            System.out.println(activity);
            //if (dice == 6) keepGoing = false;
            answer=JOptionPane.showConfirmDialog(null, activity+"\n Try again ?", "Diceman Loop", JOptionPane.YES_NO_OPTION);
            if (answer==JOptionPane.NO_OPTION) keepGoing=false;
        }



            System.out.println("Goodbye");
        }
    }
