package maths;

public class GCD {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        System.out.println(solution(a,b));
    }
    public static int solution(int a, int b) {
        int m = Math.max(a,b);
        int n = Math.min(a,b);
        int rem = Integer.MAX_VALUE;
        while ( rem > 0) {
            rem = m % n;
            if (rem == 0) return n;
            m = n;
            n = rem;
        }
        return 1;
    }
}
