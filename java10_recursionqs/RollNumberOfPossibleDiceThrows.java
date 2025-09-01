package java10_recursionqs;

import java.util.ArrayList;
import java.util.List;

public class RollNumberOfPossibleDiceThrows {
    public static void main(String[] args) {
        // int[] arr = {1,2,3,4,5,6};
        System.out.println(PossibleOutComes( 4, new ArrayList<>(), new ArrayList<>()));
    }

    static List<List<Integer>> PossibleOutComes( int target, List<List<Integer>> Allanswers, List<Integer> IndividualAnswers) {
        if ( target == 0 || target < 0) {
            Allanswers.add(new ArrayList<>(IndividualAnswers));
            return Allanswers;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            IndividualAnswers.add(i);
            PossibleOutComes( target - i, Allanswers, IndividualAnswers);
            // System.out.println(IndividualAnswers + " ----> IndividualAnswers before ");
            // System.out.println("Index to be removed ----> " + (IndividualAnswers.size() -1));
            IndividualAnswers.remove(IndividualAnswers.size() -1);
            // System.out.println(IndividualAnswers + " ----> IndividualAnswers");
        }
        return Allanswers;
    }
}
