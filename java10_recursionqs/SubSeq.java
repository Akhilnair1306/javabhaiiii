package java10_recursionqs;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        String up = "abc";
        // Subsequence("", up, new ArrayList<String>());
        // System.out.println(SubSequenceinArrayList("", up, new ArrayList<>()));
        System.out.println(SubSequenceinArrayListWithoutArgument("", up));
    }

    static void Subsequence( String p, String up) {
        if ( up == "") {
            System.err.println(p);
            return;
        }

        Subsequence(p, up.substring(1));
        Subsequence( p + up.charAt(0), up.substring(1));
    }

    static ArrayList<String> SubSequenceinArrayList(String p , String up, ArrayList<String> answer) {
        if (up == "") {
            if ( p!= "") {
                answer.add(p);
            }
            return answer;
        }
        SubSequenceinArrayList(p, up.substring(1), answer);
        SubSequenceinArrayList(p + up.charAt(0), up.substring(1), answer);
        return answer;
    }

    static ArrayList<String> SubSequenceinArrayListWithoutArgument ( String p, String up) {
        ArrayList<String> list= new ArrayList<>();
        if (up == "") {
            list.add(p);
            return list;
        }

        ArrayList<String> left = SubSequenceinArrayListWithoutArgument(p, up.substring(1));
        ArrayList<String> right = SubSequenceinArrayListWithoutArgument(p + up.charAt(0), up.substring(1));

        left.addAll(right);
        return left;
    }
}
