package java10_recursionqs;

public class SkipaLetterInaString {
    public static void main(String[] args) {
        String str = "baccad";
        String answer = new String();
        // char letter = a;
        System.out.println(skip(str, 'a', 0, answer));
    }

    static String skip(String str, char letter, int index, String answer) {
        if(index == str.length()) {
            return answer;
        }
        if ( letter != str.charAt(index)) {
            answer += str.charAt(index);
        }
        return skip(str, letter, index + 1, answer);
    }
}
