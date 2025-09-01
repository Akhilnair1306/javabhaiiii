package java10_recursionqs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode17 {
    //https://leetcode.com/problems/letter-combinations-of-a-phone-number/
    public static void main(String[] args) {
        String digits = "234";
        System.out.println(letterCombinations(digits));
    }

    static List<String> letterCombinations(String digits) {
         // List<String> characters = new ArrayList<>();
        // characters = ["", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"];
        if( digits.length() == 0){
            return new ArrayList<>();
        }
        Map<Character, String> map = new HashMap<>();
        map.put('1', "");
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        char[] arr = digits.toCharArray();
        List<String> values = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            String value = map.get(arr[i]);
            values.add(value);
        }

        List<String> answer = new ArrayList<>();
        CombinationsAnswer( "", values, 0, answer);
        // finalAnswer.removeIf(s-> s.trim().isEmpty());
        return answer;

    }

    static void CombinationsAnswer( String result, List<String> values, int index1, List<String> answer){
          if ( index1 > values.size() - 1){
            answer.add(result);
            return;
        }
        String mappingChar =  values.get(index1);
        for(int index = 0 ; index < mappingChar.length(); index++) {
            // result += mappingChar.charAt(index);
            CombinationsAnswer(result + mappingChar.charAt(index), values, index1 + 1, answer);
            // result = result.substring(0,index1);
        }

        return;
    }
}
