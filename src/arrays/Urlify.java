package arrays;

import java.util.Arrays;

public class Urlify {
    public static void main(String[] args) {
        String s = "an apple pie cinema      ";
        char[] a = s.toCharArray();
        urlify(a);
        System.out.println(Arrays.toString(a));
    }
    static void swap(char[] arr, int i, int j){
        char t = arr[i];
          arr[i] = arr[j];
          arr[j] = t;
    }
    static void urlify(char[] a) {
        int i = a.length - 1;
        int j = a.length - 1;
        int spaces = 0;
        while (a[j] == ' ') {
            j--;
        }
        int t = j;
        while (t > 0) {
            if(a[t] == ' ')
                spaces++;
            t--;
        }
        while (spaces > 0) {
            while (a[j] != ' ') {
                swap(a, i, j);
                j--;
                i--;
            }
            spaces--;
            a[i] = '0';
            i--;
            a[i] = '2';
            i--;
            a[i] = '%';
            i--;
            j--;
        }
    }
}
