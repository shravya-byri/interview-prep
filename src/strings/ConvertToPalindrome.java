package strings;

import java.util.*;

public class ConvertToPalindrome {
    public static void main(String[] args) {
        String A = "phmjjmap";
        System.out.println(solve(A));
    }
    public static int solve(String A) {
        char[] array;
        array = A.toCharArray();
        HashMap<Character,Integer> count = new HashMap<>();
        for(int i = 0; i < A.length(); i++) {
            if(count.get(array[i]) == null) {
                count.put(array[i],1);
            } else count.put(array[i],count.get(array[i])+1);
        }
        int rep = 0;
            for(Map.Entry<Character,Integer> entry : count.entrySet()) {
                if(entry.getValue() % 2 != 0) {
                    rep++;
                }
            }
            System.out.println(count);
            if ( A.length() % 2 != 0) {
                if (rep > 1) return 0;
                else return 1;
            } else {
                if(rep > 2) return 0;
                else return 1;
            }
    }
}

