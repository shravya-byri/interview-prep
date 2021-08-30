package arrays.interviewbit;

import java.util.ArrayList;
import java.util.List;

public class InfiniteGrid {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(1,1,1,8));
        ArrayList<Integer> B = new ArrayList<>(List.of(1,5,2,3));
        System.out.println(minNoOfSteps(A,B));
    }
    public static int minNoOfSteps(ArrayList<Integer> A, ArrayList<Integer> B) {
        int count = 0;
        int X_curr = A.get(0);
        int Y_curr = B.get(0);
        int X_dest;
        int Y_dest;
        for(int i = 1; i < A.size(); i++) {
            X_dest = A.get(i);
            Y_dest = B.get(i);
            count = count + Math.max(Math.abs(X_curr-X_dest),Math.abs(Y_curr-Y_dest));
            X_curr = X_dest;
            Y_curr = Y_dest;

        }
        return count;

    }
}