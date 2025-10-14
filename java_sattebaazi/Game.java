package java_sattebaazi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    private List<User> users;
    private int minBet;
    private int TotalBet = 0;

    public Game (List<User> users, int minBet) {
        this.users = users;
        this.minBet = minBet;
    }

    public void betOrPass () {
        Scanner scanner = new Scanner(System.in);
        int currentPlayerIndex = 0;
        // int initialbetAmt = 10;
        // int betAmt;
        while (users.stream().filter(User:: isUserPlaying).count() > 1) {
            User currentPlayer= users.get(currentPlayerIndex);
            if ( !currentPlayer.isUserPlaying()) {
                currentPlayerIndex = (currentPlayerIndex + 1) % users.size();
                continue;
            }
            // System.out.println(users);
            // System.out.println(currentPlayerIndex);
        System.out.println(currentPlayer.getName() +" is going to play");
        System.out.println("Choose 1 option to play");
        System.out.println("1.Blind");
        System.out.println("2.Seen");
        int firstchoice = scanner.nextInt();
        switch (firstchoice) {
            case 1:
                break;
            case 2:
            currentPlayer.getCardsUser();
            // System.out.println("Loser");    
            // isUserPlaying = false;
            break;
            default:
            System.out.println("Enter a valid choice");
            continue;
            // break;
        }
        // System.out.println(TotalBet);
        System.out.println("Enter a choice");
        System.out.println("1.Place a Bet");
        System.out.println("2.Fold");
        System.out.println("3.Show");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter a bet amount");
                int betAmt = scanner.nextInt();
                if (betAmt < minBet) {
                    System.out.println("bet must be atleast " + minBet);
                }
                // betAmt = initialbetAmt;
                minBet = betAmt;
                TotalBet += betAmt;
                break;
            case 2:
            currentPlayer.pack();
            // System.out.println("Loser");    
            // isUserPlaying = false;
            break;
            case 3:
            Rules rules = new Rules(users);
            User winner = rules.determineWinner();
            System.out.println("Winner is: " + winner.getName());
            System.out.println("won a bet of" + TotalBet);
            return;
            // currentPlayer.getCardsUser();
            default:
            System.out.println("Enter a valid choice");
            continue;
            // break;
        }
        currentPlayerIndex = (currentPlayerIndex + 1) % users.size();
        
        }

        users.stream().filter(User:: isUserPlaying).forEach(
            winner -> System.out.println(winner.getName() + " wins!!")
        );
        scanner.close();
       
    }
}
