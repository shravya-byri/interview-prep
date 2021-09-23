package maths;

import java.util.ArrayList;
import java.util.List;

public class NumberOfLengthNAndValueLessThanK {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(0,1,3,4,6,7));
        System.out.println(solve(A,4,59172));
    }
    public static int solve(ArrayList<Integer> A, int B, int C) {
        if (A.size() == 0) {
            return 0;
        }
        int temp = C, noOfDigitsInC = 0, ans = 0;
        while(temp > 0) {
            noOfDigitsInC++;
            temp = temp/10;
        }
        if ( noOfDigitsInC < B) return 0;

        else if ( B < noOfDigitsInC) {
            if ( A.get(0) == 0) {
                ans =  (A.size()-1) * (int) Math.pow(A.size(),B-1);
            } else {
                ans = (int) Math.pow(A.size(),B);
            }
            if ( B == 1 && A.get(0) == 0) ans++;
            return ans;
        } else {
            if (B == 1) {
                for (int i = 0; i < A.size(); i++) {
                    if (A.get(i) < C) {
                        ans++;
                    }
                }
            } else {
                int[] elementsOfC = new int[B];
                for(int i = B-1; i >= 0; i--) {
                    elementsOfC[i] = C%10;
                    C = C/10;
                }
                 int count = 0;
                 for( int i = 0; i < A.size(); i++) {
                     if ( A.get(i) == 0) continue;
                     if ( A.get(i) > elementsOfC[0]) break;
                     count++;
                 }
                 ans += (count) * (int) Math.pow(A.size(),B-1);
                 int flag = 0,j = 0;
                 for ( int i = 0; i < A.size(); i++) {
                     if (A.get(i) == elementsOfC[j]) flag = 1;
                 }
                     j++;
                 while(flag == 1 && j<= B-1) {
                     flag = 0;
                     int countx = 0;
                     for(int i = 0; i <A.size(); i++) {
                         if(A.get(i) > elementsOfC[j]) {
                             countx++;
                         }
                         if(A.get(i) == elementsOfC[j]) {
                             flag = 1;
                         }
                     }
                     ans -=((countx)* ((int) Math.pow(A.size(),B-j-1)));
                     j++;
                 }
                 if (j == B && flag ==1) ans--;
            }

        }
        return ans;
    }
}
