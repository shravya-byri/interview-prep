package arrays.interviewbit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MaxDistance {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(List.of(1,2,5,1,9));
        System.out.println(solve(A));
    }
    public static int solve(ArrayList<Integer> A) {
        HashMap<Integer, List<Integer>> positions = new HashMap<>();
        for (int i = 0; i< A.size(); i++) {
            if (positions.get(A.get(i)) == null) {
                positions.put(A.get(i), new ArrayList<>());
            }
            positions.get(A.get(i)).add(i);
        }

        Collections.sort(A);
        ArrayList<Integer> dupes = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            dupes.add(positions.get(A.get(i)).get(0));
            positions.get(A.get(i)).remove(0);
        }
        System.out.println(dupes);
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for (int i=0; i<dupes.size(); i++) {
            min = Math.min(min, dupes.get(i));
            ans = Math.max(ans, dupes.get(i) - min);
        }

        return ans;
    }
}
