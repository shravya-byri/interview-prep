package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HotelBookingsPossible {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(1,3,5));
        ArrayList<Integer> D = new ArrayList<>(List.of(2,5,8));
        int C = 1;
        System.out.println(isPossible(A,D,C));
    }
    public static boolean isPossible(ArrayList<Integer> A,ArrayList<Integer> D, int C) {

        Collections.sort(A);
        Collections.sort(D); /* sorting: arrival times will be sorted, departure time sorted mens the same person
        need not go. any other person can go. just that the room should be available before other room is occupies*/
         for(int i = C; i < A.size(); i++) {
             if(A.get(i) <= D.get(i-C)) {
                 return false;
             }
         }
        return true;
    }
}
