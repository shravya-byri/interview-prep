package arrays.interviewbit;

import java.util.ArrayList;
import java.util.List;

public class MaxMin {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(-5, -4, -3, -1, -2,10));
        System.out.println(solve(A));
    }
    public static int solve(ArrayList<Integer> A) {
        int min = 999999, max = -999999;
        for (int i = 0; i < A.size(); i++) {
            if (min > A.get(i)) {
                min = A.get(i);
            }
            if (max < A.get(i)) {
                max = A.get(i);
            }
        }
        return min + max;
    }
}
