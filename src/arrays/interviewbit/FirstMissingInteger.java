package arrays.interviewbit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FirstMissingInteger {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(List.of(2,6,7,9));
        System.out.println(solution(A));
    }

    public static int solution(ArrayList<Integer> A) {
        int n = A.size();
        for (int i = 0; i < n; i++) {
            int currPos = A.get(i)-1;
            while( 1 <= A.get(i) && A.get(i) <= n && A.get(i) != A.get(currPos)){
                swap(A,i,currPos);
                currPos = A.get(i)-1;
            }

        }
        for ( int i = 0; i < n; i++) {
            if(A.get(i) != i+1) {
                return i+1;
            }
        }

        return n+1;
    }

    public static void swap(ArrayList<Integer> A, int l, int r) {
        int temp;
        temp = A.get(l);
        A.set(l, A.get(r));
        A.set(r, temp);
    }
}
