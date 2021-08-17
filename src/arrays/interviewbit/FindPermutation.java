package arrays.interviewbit;

import java.util.ArrayList;

public class FindPermutation {
    public static void main(String[] args) {
        int n = 7;
        String s = "DIDIID";
        System.out.println(solve(n, s));
    }

    public static ArrayList<Integer> solve(int n, String s) {
        int count = 0;
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            A.add(i);
        }
        for (char c : s.toCharArray()) {
            if (c == 'I') {
                count++;
            }
        }
        //System.out.println(s.charAt(2));
       // System.out.println(count);
        int j = n - count;
        int l = j - 1;

        if (s.charAt(0) == 'I') {
            B.add(A.get(0));
        } else {
            B.add(A.get(l));
            l--;
        }
        for (int k = 0; k < s.length(); k++) {
            if (s.charAt(k) == 'I') {
                B.add(A.get(j));
                j++;
            } else if (s.charAt(k) == 'D') {
                B.add(A.get(l));
                l--;
            }
        }
        return B;
    }
}
