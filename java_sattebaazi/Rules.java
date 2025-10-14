package java_sattebaazi;

import java.util.List;

public class Rules {
    private List<User> users;

    public Rules(List<User> users) {
        this.users = users;
    }

    private int compareHands(User u1, User u2) {
        HandRank h1 = evaluateHandRank(u1.getCards());
        HandRank h2 = evaluateHandRank(u2.getCards());
        return(h1.compareTo(h2));
    }

    class HandRank implements Comparable<HandRank> {
        int category;
        List<Integer> values;

        public HandRank(int category, List<Integer> values) {
            this.category = category;
            this.values = values;
        }

        @Override 
        public int compareTo(HandRank other) {
            if ( this.category != other.category) {
                return Integer.compare(this.category, other.category);
            }

            for (int i = 0; i < this.values.size(); i++) {
                if (!this.values.get(i).equals(other.values.get(i))) {
                    return Integer.compare(this.values.get(i), other.values.get(i));
                }
            }
            return 0;
        }
    }
    private HandRank evaluateHandRank(List<Card> cards) {
        List<Integer> ranks = cards
                              .stream().map(Card::getRank)
                              .sorted((a,b) -> b -a)
                              .toList();
        boolean sameSuit = cards.stream().map(Card::getSuit).distinct().count() == 1;
        boolean consecutive = isConsecutive(ranks);

        if ( ranks.get(0).equals(ranks.get(1)) && ranks.get(1).equals(ranks.get(2))) {
            return new HandRank(6, ranks);
        }

        if (sameSuit && consecutive) {
            return new HandRank(5, ranks);
        }

        if (consecutive) {
            return new HandRank(4, ranks);
        }

        if (sameSuit) {
            return new HandRank(3, ranks);
        }

        if ( ranks.get(0).equals(ranks.get(1)) || ranks.get(1).equals(ranks.get(2))) {
            return new HandRank(2, ranks);
        }

        return new HandRank(1, ranks);
    } 

    private boolean isConsecutive(List<Integer> ranks) {
        if(ranks.contains(14) && ranks.contains(2) && ranks.contains(3)) {
            return true;
        }

        return (ranks.get(0) - 1 == ranks.get(1) && ranks.get(1) - 1 == ranks.get(2));
    }

    public User determineWinner() {
    User winner = null;
    for (User u : users) {
        if (u.isUserPlaying()) {
            if (winner == null) {
                winner = u;
            } else {
                if (compareHands(u, winner) > 0) {
                    winner = u;
                }
            }
        }
    }
    return winner;
}

}
