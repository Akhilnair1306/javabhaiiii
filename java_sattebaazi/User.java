package java_sattebaazi;

import java.util.ArrayList;
import java.util.List;
// import java.util.Scanner;

class User {
    private String name;
    private List<Card> pack1;
    private boolean isUserPlaying;

    public User(String name) {
        pack1 = new ArrayList<>();
        this.name = name;
        this.isUserPlaying = true;
    }

    public void drawCard (Deck deck) {
        for (int i = 0; i < 3; i++) {
            pack1.add(deck.drawCard());
        }
    }

    public void getCardsUser( ) {
        System.out.println(pack1);
    }

    public String getName () {
        return name;
    }

    public boolean isUserPlaying () {
        return isUserPlaying;
    }

    public void pack() {
        System.out.println(name + " packed. Loser");
        isUserPlaying = false;
    }
    public List<Card> getCards() {
    return pack1;
}


}
