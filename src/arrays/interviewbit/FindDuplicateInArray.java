package arrays.interviewbit;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class FindDuplicateInArray {
    public static void main(String[] args) {
        ArrayList<Integer> M = new ArrayList<>(List.of(3,4,1,4,1));
       System.out.println(duplicateArray(M));
    }
    public static int duplicateArray(ArrayList<Integer> M) {
        int S = M.size();
        ArrayList<Integer> N = new ArrayList<>();
        for (int i = 0; i < S; i++) {
            N.add(-1);
        }
        for(int i = 0; i < S;i++) {
            if (N.get(M.get(i)-1) == -1) {
                N.set(M.get(i) - 1, 0);
            }else{
                return M.get(i);
            }
        }

        return -1;
    }
}
