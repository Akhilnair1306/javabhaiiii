package java_sattebaazi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Deck deck1 = new Deck();
        System.out.println(deck1.getCards());

        deck1.shuffleDeck();
        System.out.println(deck1.getCards());

        User user1 = new User("Akhil");
        user1.drawCard(deck1);
        user1.getCardsUser();

        User user2 = new User("Kunnal");
        user2.drawCard(deck1);
        user2.getCardsUser();

        List<User> players = new ArrayList<>();
        players.add(user1);
        players.add(user2);

        Game game = new Game(players, 10);
        game.betOrPass();
        // deck1.addDeck();
        // System.out.println(deck1.getCards());
        
    }

    
}
