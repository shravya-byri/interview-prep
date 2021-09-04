package maths;

public class ExcelColumn {

    public static void main(String[] args) {
        System.out.println(titleToNumber("ABCD"));
    }

    static public int titleToNumber(String A) {
        char[] s = A.toCharArray();
        int[] a = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            a[i] =  (int) s[i] - 64;
        }
        int sum = 0;
        for (int i = 0;i < a.length; i++) {
            sum += Math.pow(26, a.length - i - 1) * a[i];
        }
        return sum;
    }
}
