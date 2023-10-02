package XVIII_Løsninger;
/* PROG1 exercise: Guess a number, part A. User guesses a number
 * Solution
 * See Liang 4.2
 * Bjørn Christensen 5/1-2008
 */

import javax.swing.JOptionPane;

public class GuessANumber_1 {

    public static void main(String[] args) {
        System.out.println("Gues a number 1");
        int myNumber=(int)(Math.random()*100)+1;        // myNumber in [1,100]
        int yourGuess;
        int numberOfGuesses = 0;
        //System.out.println("myNumber=" + myNumber);

        do {
            numberOfGuesses++;
            String s=JOptionPane.showInputDialog("Guess a number in [1,100]");
            yourGuess=Integer.parseInt(s);
            if (yourGuess<myNumber)
                JOptionPane.showMessageDialog(null,"Too low !");
            else if (yourGuess>myNumber)
                JOptionPane.showMessageDialog(null,"Too high !");
            
        } while(yourGuess!=myNumber);
        JOptionPane.showMessageDialog(null,
                "Great !\nYou made it in " + numberOfGuesses + " guesses");
    }
}
