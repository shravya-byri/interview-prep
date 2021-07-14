package arrays;

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
    public static void main(String[] args) {
        int[] a = {1,2,3,4,-2,5,0};
        int t = 7;
        System.out.println(doesTargetSumExistBruteForce(a,t));

    }
}
