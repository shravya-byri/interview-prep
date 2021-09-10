package maths;

public class PowerOfTwoIntegers {
    public static void main(String[] args) {
        System.out.println(solve(18));

    }
    public static boolean solve(int n) {
        int p ,a;
        for ( a = 1; a <= Math.sqrt(n); a++) {
            p = (int) (Math.log(n)/Math.log(a));
            if(Math.pow(a,p) == n) {

                return true;
            }
        }

        return false;
    }
}
