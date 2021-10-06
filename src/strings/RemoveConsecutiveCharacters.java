package strings;

public class RemoveConsecutiveCharacters {
    public static void main(String[] args) {
        String A = "aaabbbppaacbbq";
        int B = 2;
        System.out.println(solve(A,B));
    }
    public static String solve(String A, int B) {
        StringBuilder S = new StringBuilder();
        int count = 0;
        for ( int i = 1; i < A.length(); i++) {
            if(A.charAt(i-1) == A.charAt(i)) {
                count++;
                if (i == A.length()-1 && count != B-1) {
                    while (count >= 0) {
                        S.append(A.charAt(i-1));
                        count--;
                    }
                }
            } else {
                if(count != B-1) {
                    while (count >= 0) {
                        S.append(A.charAt(i-1));
                        count--;
                    }
                }
                count = 0;
            }
        }
        if ( A.charAt(A.length()-1) != A.charAt(A.length()-2) && B != 1) S.append(A.charAt(A.length()-1));
        return S.toString();
    }
}
