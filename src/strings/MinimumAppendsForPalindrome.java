package strings;

public class MinimumAppendsForPalindrome {
    public static void main(String[] args) {
        String A = "oqycntornscygodzdctxnhoc";
        System.out.println(solve(A));
    }
    public static int solve(String A) {
        int ans = 0;
        int i = 0, j = A.length()-1;
        while(i <= j) {
            if (A.charAt(i) == A.charAt(j)) {
                j--;
                i++;
            } else {
                if ( j == A.length()-1) {
                    i++;
                }
                j = A.length()-1;
                i = ans + 1;
                ans = i;
            }
        }

        return ans;
    }
}
