package arrays;

import java.util.Locale;

public class OneAway {
    public static void main(String[] args) {
        String s1 = "pale";
        String s2 = "alep";
        System.out.println(isOneEditAway(s1.toLowerCase(), s2.toLowerCase()));

    }
    static boolean isOneEditAway(String s1, String s2){
        int counter = 0;
        int i = 0;
        int j = 0;
        if (s1.length() == s2.length()){
            while(i < s1.length() &&  j < s2.length()){
                if (s1.charAt(i) != s2.charAt(j)){
                    counter++;
                }
                i++;
                j++;

            }

        } else if (s1.length() - s2.length() == 1){
            while ( i < s1.length() && j < s2.length()) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    i++;
                    j++;
                } else {
                    i++;
                    counter++;
                }

            }

        } else if(s2.length() - s1.length() == 1){
            while( i < s1.length() && j < s2.length()){
                if (s2.charAt(j) == s1.charAt(i)) {
                    i++;
                    j++;
                } else {
                    j++;
                    counter++;
                }

            }

        } else {
            return false;
        }
        return counter <= 1;
    }
}
