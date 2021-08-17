package arrays.interviewbit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayWithSquares {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(List.of(-6,-3,-1,2,4,5,7));
        System.out.println(squaresInArray(A));
    }
    public static ArrayList<Integer> squaresInArray(ArrayList<Integer>A) {
        ArrayList<Integer> B = new ArrayList<Integer>();
        int countOfNegativeIntegers = 0;
       while(A.get(countOfNegativeIntegers) < 0) {
           countOfNegativeIntegers++;
       }
       System.out.println(countOfNegativeIntegers);
        for ( int i = 0; i < A.size(); i++) {
                A.set(i,A.get(i) * A.get(i));
        }
        System.out.println(A);
        int i = countOfNegativeIntegers-1, j = countOfNegativeIntegers;
       while( i >= 0 && j < A.size()) {
           if(A.get(i) <= A.get(j)) {
               B.add(A.get(i));
               i--;
           } else if ( A.get(j) < A.get(i)) {
               B.add(A.get(j));
               j++;
           }
       }
       if (i < 0) {
           while (j < A.size()) {
               B.add(A.get(j));
               j++;
           }
       } else {
           while (i >= 0) {
               B.add(A.get(i));
               i--;
           }
       }
       return B;
    }
}
