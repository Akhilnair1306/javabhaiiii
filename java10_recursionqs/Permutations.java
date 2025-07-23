package java10_recursionqs;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        String str = "abcd";
        // List<List<String>> answer = new ArrayList<>();
        // System.out.println(Perm("", answer, str));
        Perm("", str);
        System.out.println(Perm1("", str));
    }

    static void Perm(String proc,String str) {
        if (str == "") {
            // return answer;
            System.out.println(proc);
            return;
        }
        int loops = proc.length() + 1;
        for (int i = 0; i < loops; i++) {
            // if ( proc.length() == 0) {
            //     Perm(str.charAt(0) + proc, answer, str.substring(1));
            // }
            Perm(proc.substring(0, i) + str.charAt(0) + proc.substring(i, proc.length()), str.substring(1));
        }
    }
    static List<String> Perm1(String proc,String str) {
        List<String> answer = new ArrayList<>();
        if (str == "") {
            answer.add(proc);
            return answer;
            // System.out.println(proc);
            // return;
        }
        int loops = proc.length() + 1;
        for (int i = 0; i < loops; i++) {
            // if ( proc.length() == 0) {
            //     Perm(str.charAt(0) + proc, answer, str.substring(1));
            // }
            List<String> step = Perm1(proc.substring(0, i) + str.charAt(0) + proc.substring(i, proc.length()), str.substring(1));
            answer.addAll(step);
        }
        return answer;
    }
}
