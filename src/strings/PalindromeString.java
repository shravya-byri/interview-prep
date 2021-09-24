package strings;

import java.util.Locale;

public class PalindromeString {
    public static void main(String[] args) {
        String S = "A man, a plan, a canal: Panama";
        System.out.println(solve(S));
    }
    public static int solve(String A) {
        A = A.toLowerCase(Locale.ROOT);
        A = removeNonAlphanumeric(A);
        int j = A.length()-1;
        for(int i = 0; i < A.length(); i++) {
            if ( A.charAt(i) == A.charAt(j)) {
                j--;
            } else return 0;
        }

        return 1;
    }
   public static String  removeNonAlphanumeric(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        return str;
    }
}
