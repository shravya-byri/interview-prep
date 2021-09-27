package arrays;

import java.util.ArrayList;
import java.util.List;

public class MaxSumContiguous {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(-2, 1, -3, 4, -1, 2, 1, -5, 4));
        System.out.println(solve(A));
    }
    public static int solve(ArrayList<Integer> A) {
        int curr = A.get(0);
        int max = A.get(0);
       for(int  i = 1; i < A.size(); i++) {
           max = Math.max(A.get(i), max+A.get(i));
           if( curr < max) {
               curr = max;
           }
       }


        return curr;
    }
}
