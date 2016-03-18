package Rules;

import java.util.Random;

public class PlayerStart {
    public void randomlySelectingStartingPlayer(){
        Random number = new Random();
        int generatedNumber = number.nextInt(2);

        if (generatedNumber == 1) {
            System.out.println("Player 1 goes first");
        }
        else{
            System.out.println("Player 2 goes first");
        }
    }
}
