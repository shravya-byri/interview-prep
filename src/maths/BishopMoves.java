package maths;

public class BishopMoves {
    public static void main(String[] args) {
        System.out.println(movesOfBishop(4,4));
    }
    public static int movesOfBishop(int A, int B){
        int res;
        res = Math.min(8-A,8-B)+ Math.min(A-1,8-B)+ Math.min(A-1,B-1)+ Math.min(8-A, B-1);
        return res;
    }
}
