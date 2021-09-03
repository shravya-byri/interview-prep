package maths;

public class GridUniquePaths {
    public static void main(String[] args) {
        int A = 1,B = 1;
        System.out.println(uniqueGridPaths(A,B));
    }
    public static int uniqueGridPaths(int A, int B) {
        if ( A == 1 || B == 1) return 1;
        else
        return uniqueGridPaths(A-1,B) + uniqueGridPaths(A,B-1);
    }
}
