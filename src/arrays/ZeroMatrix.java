package arrays;

import java.util.Arrays;

public class ZeroMatrix {
    public static void main(String[] args) {
        int[][] a = { {1,2,3}, {4,0,6},{7,8,9} };
        zeroPut(a);
        printMatrix(a);

    }
    static void printMatrix(int[][] a) {
        for (int r = 0; r < a.length; r++) {
            for (int c = 0;c < a[0].length; c++) {
                System.out.print(a[r][c] + " ");
            }
            System.out.println("  ");
        }
    }
    static void zeroPut(int[][] a){

        for (int r = 0; r < a.length; r++){
            for (int c = 0; c < a[0].length; c++){
                int t = 0;
                int m = 0;
                if(a[r][c] == 0){
                    a[r][0] = 0;
                    a[0][c] = 0;
                }
            }
        }
        for( int c = 0; c < a[0].length; c++){
            if (a[0][c] == 0) {
                for (int r=0; r<a.length; r++) {
                    a[r][c] = 0;
                }
            }
        }
        for( int r = 0; r < a.length; r++){
            if (a[r][0] == 0) {
                for (int c=0; c<a[0].length; c++) {
                    a[r][c] = 0;
                }
            }
        }

    }
}
