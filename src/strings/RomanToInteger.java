package strings;

import java.security.PublicKey;
import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        String A = "LXIX";
        System.out.println(solve(A));
    }
    public static int solve(String A){
        int ans = 0;
        HashMap<Character,Integer> roman = new HashMap<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);
        int i = 0;
        while(i < A.length()-1) {
            if(roman.get(A.charAt(i)) >= roman.get(A.charAt(i+1))) {
                ans = ans + roman.get(A.charAt(i));
            } else ans = ans - roman.get(A.charAt(i));
            i++;
        }
        ans = ans + roman.get(A.charAt(A.length()-1));
        return ans;

    }

}
