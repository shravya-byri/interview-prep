package maths;

import java.util.ArrayList;
import java.util.Collections;

public class NextSmallerNumber {
    public static void main(String[] args) {
        System.out.println(solve("23745"));
    }
    public static String solve(String A) {
        ArrayList<Character> ch = new ArrayList<>();
        for (int i = 0; i < A.length(); i++) {
            ch.add(A.charAt(i));
        }
        Collections.sort(ch);
        for ( char c : ch) {
            System.out.println(c);
        }
      return  A;
    }
}
