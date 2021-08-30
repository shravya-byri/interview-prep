package arrays.interviewbit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class NobleInteger {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of( 3, -10, 4, -6));
        System.out.println(Solve(A));
    }
    public static int Solve(ArrayList<Integer> A) {
        Collections.sort(A);
        System.out.println(A);

        for (int i = 0; i < A.size()-1; i++) {
            if(A.get(i) == A.get(i + 1)) {
                i++;
            }
            if (A.get(i) == A.size() - (i + 1)) {
                    return 1;
                }
            }
        if(A.get(A.size()-1) == 0) {
            return 1;
        }

        return -1;
    }

}
