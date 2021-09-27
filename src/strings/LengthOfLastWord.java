package strings;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String S = "Hello World Palm Villas ";
        System.out.println(solve(S));
    }
    public static int solve(String S) {
        int count = 0;
        int count1 = 0;
        int last = 0;
        String t = "";
        int frontSpaces = 0;
        int backSpaces = 0;

        for(int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == ' ') {
                count++;
            }
        }
        for ( int i = 0; i < S.length(); i++) {
           if ( S.charAt(i) == ' ') {
               count1++;
               if ( count1 == count) {
                  last = i+1;
               }

           }
        }
      // System.out.println(S.length());
        return S.length() - last;
    }


}
