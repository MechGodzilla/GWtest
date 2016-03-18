package Rules;

public class WinConditions {
    public void winMatchConditions(int enemyScore, int playerScore){
        if (enemyScore >= playerScore){
            System.out.println("You have lost this round");
        }
        else{
            System.out.println("You have won this round");
        }

    }

    public void winGameConditions(int playerWins) {
        if (playerWins == 0 ) {
            System.out.println("You have won the game ");
        } else {
            System.out.println("You have lost the game");
        }
    }
}
