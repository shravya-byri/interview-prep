package maths;

public class hhh {
    public static void main(String[] args) {
        System.out.println(solve(42));
    }
    public static int solve(int A) {
    int step = 1;
    int curr_pos = 0;
    while ( curr_pos != A) {
        curr_pos = curr_pos + step;
        if ( curr_pos > A) {
            curr_pos = curr_pos - 2*step;
        }

        step++;
    }
    return step-1;
  }
}
