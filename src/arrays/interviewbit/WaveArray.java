package arrays.interviewbit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class WaveArray {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(-5, 6, -4, -3, -1, -2,10));
       // System.out.println(A);
        System.out.println(wave(A));
    }
    public static ArrayList<Integer> wave(ArrayList<Integer> A) {
        Collections.sort(A);
        System.out.println(A);
        for ( int i = 0; i < A.size()-1; i++ ) {
            swap(A, i, i+1);
            i++;
        }
        return A;
    }
    public static void swap(ArrayList<Integer> ar, int l, int r) {
        int temp;
        temp = ar.get(l);
        ar.set(l, ar.get(r));
        ar.set(r, temp);
    }

}
