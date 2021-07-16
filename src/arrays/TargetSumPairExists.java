package arrays;

import java.util.HashMap;

public class TargetSumPairExists {
    public static boolean doesTargetSumExistBruteForce(int[] a, int targetSum) {
        for(int i = 0; i < a.length; i++){
            for(int j = i; j < a.length; j++){
                if (a[i] + a [j] == targetSum){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean targetSumExist(int[] a, int targetSum) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i = 0; i < a.length; i++) {
            if (h.get(a[i]) == null) {
                if (h.get(targetSum-a[i]) != null){
                    return true;
                }
                h.put(a[i], a[i]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,-2,5,0};
        int t = 11;
        System.out.println(doesTargetSumExistBruteForce(a,t));

    }
}
