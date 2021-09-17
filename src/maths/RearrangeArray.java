package maths;

import java.util.ArrayList;
import java.util.List;

public class RearrangeArray {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(List.of(4,0,2,1,3));
        solve(A);
    }
    public static void solve(ArrayList<Integer> A) {
        int N = A.size();
        int bindedval;
        for(int i = 0; i < A.size(); i++) {
            bindedval = A.get(i) + (A.get(A.get(i))%N)*N;
            A.set(i,bindedval);
        }
        for(int i = 0; i < A.size(); i++) {
            int newval = A.get(i)/N;
            A.set(i,newval);
        }
        System.out.println(A);

    }
}
