package arrays.interviewbit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NobleInteger {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(List.of(1,1,3,3));
        System.out.println(Solve(A));
    }
    public static int Solve(ArrayList<Integer> A) {
        Collections.sort(A);
        System.out.println(A);
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == A.size()-i-1) {
                return 1;
            }
        }
        return -1;
    }

}
