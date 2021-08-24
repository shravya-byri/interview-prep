package arrays.interviewbit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 3;
       System.out.println(solution(n));
        //Solve(n);
    }
    public static ArrayList<Integer> solution(int n) {
        ArrayList<ArrayList<Integer>> m = new ArrayList<>();
        ArrayList<Integer> k = new ArrayList<>();
        m = Solve(n+1);
        k = m.get(n);
        return k;

    }
    public static ArrayList<ArrayList<Integer>> Solve(int n) {
        ArrayList<Integer> one = new ArrayList<>();
        ArrayList<Integer> two = new ArrayList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        one.add(1);
        two.add(1);
        two.add(1);
        ArrayList<Integer> prev = new ArrayList<>(two);

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                res.add(one);
            } else if (i == 2) {
                res.add(two);
            } else {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(1);
                for (int j = 0; j < prev.size() - 1; j++) {
                    temp.add( prev.get(j) + prev.get(j+1) );
                }
                temp.add(1);
                prev = new ArrayList<>(temp);
                res.add(temp);
            }
        }
        return res;
    }
}
