package arrays;

import java.util.HashMap;
import java.util.Map;

public class PalindromePermutation {
    public static void main(String[] args) {
        String s = "nitinammal";
        System.out.println(isPalindromePermutation(s.toLowerCase()));
    }

    static boolean isPalindromePermutation(String s){
        HashMap<Character, Integer> h = new HashMap();
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) != ' ') {
                if (h.get(s.charAt(i)) == null) {
                    h.put(s.charAt(i), 1);
                } else {
                    h.put(s.charAt(i), h.get(s.charAt(i))+1);
                }
            }
        }
        int spaces = 0;
        for(int j = 0; j < s.length(); j++){
            if(s.charAt(j) == ' ' ){
                spaces++;
            }
        }
        int newlength = s.length()- spaces;
        int oddValuesCount = 0;

        for (Map.Entry<Character, Integer> e : h.entrySet()) {
            if (e.getValue() % 2 != 0) {
                oddValuesCount++;
            }
        }
        if ((newlength) % 2 != 0) {
                if(oddValuesCount%2 != 0) {
                    return true;
                } else return false;
        } else {
            if (oddValuesCount!=0) {
                return false;
            } else return true;
        }
    }

}
