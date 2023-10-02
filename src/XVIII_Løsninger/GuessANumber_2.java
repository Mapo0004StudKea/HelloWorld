package XVIII_Løsninger;
/* PROG1 exercise: Guess a number, part B. Program guesses a number
 * Solution
 * See Liang 4.2 for Messageboxes
 * Bjørn Christensen 5/1-2008
 */

import javax.swing.JOptionPane;

public class GuessANumber_2 {
    public static void main(String[] args) {
        int low = 0;
        int high = 100;
        int myGuess;
        int option;
        int count=0;

        JOptionPane.showMessageDialog(null, 
                "Please think of a number in [" + low + "," + high + "]");
        do {
            count++;
            myGuess = (low+high)/2;
            String s = "My guess is " + myGuess + ". Is it too low ? \n";
            s = s + "Yes - means guess is too low \n";
            s = s + "No - means guess is too high \n";
            s = s + "Cancel - means guess is OK";
            option = JOptionPane.showConfirmDialog(null, s);

            if (option==JOptionPane.YES_OPTION)
                low=myGuess+1;
            if (option==JOptionPane.NO_OPTION)
                high=myGuess;
            
        } while (option!=JOptionPane.CANCEL_OPTION);
        
        JOptionPane.showMessageDialog(null, 
                "I made it in only " + count + " guesses !");
    }
}
