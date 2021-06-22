package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SumOfElementsRec {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,3,4,6,7,8,8,5,2,9));
        System.out.println(sumList(a,a.size()-1));

    }
    public static int sumList(ArrayList<Integer> a, int i)  {


        if (i < 0) return 0;
        else
        return sumList(a,i-1) + a.get(i);
    }





}
