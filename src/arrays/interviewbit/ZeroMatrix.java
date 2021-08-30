package arrays.interviewbit;

import java.util.ArrayList;
import java.util.List;

public class ZeroMatrix {
    public static void main(String[] args) {


    ArrayList<Integer> A = new ArrayList<Integer>(List.of(1,0,1));
    ArrayList<Integer> B = new ArrayList<Integer>(List.of(1,1,1));
    ArrayList<Integer> C = new ArrayList<Integer>(List.of(1,1,1));
    ArrayList<ArrayList<Integer>> M = new ArrayList<ArrayList<Integer>>(List.of(A,B,C));
    System.out.println(M);

  }
  public static void Solution(ArrayList<ArrayList<Integer>> M) {
        int i = M.size();
        ArrayList<Integer> k  = M.get(0);
        int j = k.size();

  }
}
