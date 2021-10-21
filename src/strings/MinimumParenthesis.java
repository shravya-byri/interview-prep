package strings;

public class MinimumParenthesis {
    public static void main(String[] args) {
        String S = ")())(";
        System.out.println(solve(S));
    }
    public static int solve(String A) {
        int k = 0;
        int count = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '(') {
                count++;
            } else {
                if (A.charAt(i) == ')') {
                    if (count == k) {
                        k++;
                        count = k;
                    } else{
                        count--;
                    }
                }

            }

        }
        return count;
    }
}
