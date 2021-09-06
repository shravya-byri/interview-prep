package maths;

import java.util.ArrayList;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }
    public  static ArrayList<String> fizzBuzz(int A) {
        ArrayList<String> array = new ArrayList<>();
        for(int i = 1; i <= A; i++) {
            if(i % 3 == 0 && i % 5 != 0) {
                array.add("Fizz");
            } else if ( i % 5 == 0 && i % 3 != 0) {
                array.add("Buzz");
            } else if(i % 3 == 0){
                array.add("FizzBuzz");
            } else array.add(String.valueOf(i));
        }

        return array;

    }
}
