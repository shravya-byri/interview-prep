package arrays.interviewbit;

import java.util.ArrayList;
import java.util.List;

public class BothSides {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(List.of(5, 3, 2, -1, 4, 10));
        int b = 5;
        System.out.println(maxFromBothSides(a, b));

    }

    static int maxFromBothSides(ArrayList<Integer> a, int b) {
        int i = 0, j = a.size()-1;
        int sum = 0;
        int sum1 = 0;
        int b1 = b;
        int max_sum;
        while (b > 0) {
            sum = sum + a.get(i);
            i++;
            b--;
        }
        max_sum = sum;
        while (b1 > 0 && i >= 0) {
            sum = sum - a.get(--i) + a.get(j--);
            b1--;
            if (sum > max_sum) {
                max_sum = sum;
            }

        }
        return max_sum;
    }
}
