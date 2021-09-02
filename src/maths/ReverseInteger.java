package maths;

public class ReverseInteger {
    public static void main(String[] args) {
        int A = Integer.MAX_VALUE+1;
        System.out.println(reversedNumber(A));
    }

    public static int reversedNumber(int A) {
        int K = 0;

        while (A != 0) {
            int pop = A % 10;
            A = A / 10;
             if ( K > (Integer.MAX_VALUE/10) || K == Integer.MAX_VALUE/10 && pop > 7) return 0;
             if (K < Integer.MIN_VALUE/10 || K == Integer.MAX_VALUE/10 && pop < -8) return 0;
            K = K * 10 + pop;


        }
        return K;

    }
}
