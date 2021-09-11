package maths;

public class TrailingZeroesInfFactorial {
    public static void main(String[] args) {
        System.out.println(numberOf5(9247));

    }

    public static int numberOf5(int A) {
        int y = 1;
        int sum = 0;
        while ( A/(int) Math.pow(5, y) >= 1) {
            sum = sum + A/(int) Math.pow(5, y);
            y++;
        }
        return sum;
    }

}
