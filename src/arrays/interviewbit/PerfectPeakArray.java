package arrays.interviewbit;

import java.util.ArrayList;
import java.util.List;

public class PerfectPeakArray {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(9488, 25784, 5652, 9861, 31311, 8611, 1671, 7129, 28183, 2743, 11059, 4473, 7927, 21287, 2259, 7214, 32529));
        System.out.println(solve(A));
    }
    public static int solve(ArrayList<Integer> A) {
        for(int i = 1; i < A.size()-1; i++) {
            if (leftElementsAreLess(A,i) && rightsElementsAreMore(A,i)) {
                return 1;
            }
        }
        return 0;
    }
    public static boolean leftElementsAreLess(ArrayList<Integer> A, int i) {
        int m = i;
        while( m > 0) {
            if ( A.get(m-1) < A.get(i)){
                m--;
            } else return false;
        }
        return true;
    }
    public static boolean rightsElementsAreMore(ArrayList<Integer> A, int i) {
        int n = i;
        while( n < A.size()-1) {
            if(A.get(n+1) > A.get(i)) {
                n++;
            } else return false;
        }
        return true;
    }
}
