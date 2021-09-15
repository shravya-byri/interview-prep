package maths;

import java.util.ArrayList;

public class PrimeSum {
    public static void main(String[] args) {
        System.out.println(solve(28));
    }
    public static ArrayList<Integer> solve(int A) {
        ArrayList<Integer> res = new ArrayList<>();
        int Num = 2;
        while(Num < A) {
            if (isPrime(Num)) {
                if (isPrime(A - Num)) {
                    res.add(Num);
                    res.add(A - Num);
                    break;
                }
                else Num++;
            } else Num++;
        }
        return res;
    }
    public static boolean isPrime(int N) {
            // Corner case
            if (N <= 1)
                return false;
            for (int i = 2; i <= Math.sqrt(N); i++)
                if (N % i == 0)
                    return false;

            return true;
        }
}

