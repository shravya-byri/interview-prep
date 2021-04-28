package arrays;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] a = { {1,2,3}, {4,5,6},{7,8,9} };
        int[][] b = { {1,2,3}, {4,5,6},{7,8,9} };
        printMatrix(a);
        rotateAnti(a);
        rotateClock(b);
    }
    static void rotateClock(int[][] a){
        System.out.println("rotate clock wise");
        transpose(a);
        mirror(a);
        printMatrix(a);
    }
    static void rotateAnti(int[][] a){
        System.out.println(("Rotate anti clockwise"));
        transpose(a);
        mirrorVertical(a);
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
    static void mirror(int[][] a) {
        int m;
        for (int r = 0; r < a.length; r++){
            for( int c = 0; c < (a[0].length)/2; c++){
                m = a[r][c];
                a[r][c] = a[r][(a[0].length-1)-c];
                a[r][(a[0].length-1)-c] = m;
            }
        }

    }
    static void mirrorVertical(int[][] a) {
        int m;
        for (int c = 0; c < a[0].length; c++){
            for( int r = 0; r < (a.length)/2; r++){
                m = a[r][c];
                a[r][c] = a[(a.length-1)-r] [c];
                a[(a.length-1)-r][c] = m;
            }
        }

    }
    static void transpose(int[][] a) {
        int t;
        for( int r = 0; r < a.length; r++){
            for (int c = 0; c < a[0].length; c++){
                if ( c < r) {
                    t = a[r][c];
                    a[r][c] = a[c][r];
                    a[c][r] = t;
                }
            }
        }

    }
}
