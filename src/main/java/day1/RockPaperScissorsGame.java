package day1;
import java.util.*;
public class RockPaperScissorsGame {
    public static String playRound(String playerMove, String computerMove) {
        if (playerMove.equalsIgnoreCase(computerMove)) return "Draw";
        if ((playerMove.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Scissors")) ||
            (playerMove.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Rock")) ||
            (playerMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Paper"))) return "Player Wins";
        return "Computer Wins";
    }
    public static void main(String[] args) {
        String[] moves = {"Rock","Paper","Scissors"};
        Random random = new Random();
        String[] player = {"Rock","Paper","Scissors","Rock","Paper"};
        int wins=0, losses=0, draws=0;
        System.out.println("Round | Player Move | Computer Move | Result");
        for (int i=0;i<player.length;i++) {
            String computer = moves[random.nextInt(3)];
            String result = playRound(player[i], computer);
            if (result.equals("Player Wins")) wins++; else if (result.equals("Computer Wins")) losses++; else draws++;
            System.out.println((i+1)+" | "+player[i]+" | "+computer+" | "+result);
        }
        System.out.printf("Wins: %d | Losses: %d | Draws: %d | Win %% = %.1f%%%n", wins, losses, draws, wins*100.0/player.length);
    }
}
