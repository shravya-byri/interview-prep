package maths;

public class ExcelColumnTitle {
    public static void main(String[] args) {
       System.out.println( solve(189307));
    }
    public static String solve(int A) {
        String res = "";
        while ( A > 0) {
            int  c = 'A' + (A-1) % 26;
            res =  (char)c + res;
            //System.out.println(c);
            A = (A - 1)/26;
        }
        return res;

    }
}
