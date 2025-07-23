package java10_recursionqs;

public class SkipWordInaString {
    //bcdappledgh --> Input
    //bcddgh --> Output
    public static void main(String[] args) {
        String str = "bcdappledgh";
        String tobeSkipped = "apple";
        StringBuilder answer = new StringBuilder();
        System.out.println(SkipWord(str, answer, tobeSkipped));
        
    }

    static String SkipWord(String str, StringBuilder answer, String tobeSkipped ) {
        if( str == "") {
            return answer.toString();
        }

        if (str.startsWith(tobeSkipped)) {
            return SkipWord(str.substring(tobeSkipped.length()), answer, tobeSkipped);
        } else {
            answer.append(str.charAt(0));
            return SkipWord(str.substring(1), answer, tobeSkipped);
        }

        // if ( tobeSkipped.charAt(index) == str.charAt(0)) {
        //     while ( index != tobeSkipped.length()) {
        //         if (tobeSkipped.charAt(index) == str.charAt(0)) {
        //             index++;
        //         } else {
        //             answer.append(str.charAt(0));
        //             break;
        //         }
        //         // return SkipWord(str.substring(1), answer, tobeSkipped, index);
        //         str.substring(1);
        //     }
        // }
        // answer.append(str.charAt(0));
        // System.out.println(answer.toString());
        // return SkipWord(str.substring(1), answer, tobeSkipped, 0);
        // }
    }
}
