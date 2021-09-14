package maths;

public class StepByStep {
    public static void main(String[] args) {
      System.out.println( solve(42));
    }
    public static int solve(int A) {
        int target = Math.abs(A);
        if(target==0) return 0;
        int sum = 0, steps = 0;
        while(sum < target)
        {
            sum+=steps;
            steps++;
        }

        while((sum-target)%2==1){
            sum+=steps;
            steps++;
        }
        return steps-1;
    }
}
