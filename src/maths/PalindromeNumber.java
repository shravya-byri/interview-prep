package maths;

public class PalindromeNumber {
    public static void main(String[] args) {
        int A = -111;
        System.out.println(solution(A));
    }
    public static int solution(int A) {
        int num = A;
        int rev = 0;
        if(A < 10) return 0;
        while(A>0) {
            rev = rev*10 + (A % 10);
            A = A/10;
            //System.out.println(rev);
        }
        if ( num == rev) return 1;
        else return 0;
    }
}
