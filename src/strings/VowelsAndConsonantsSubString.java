package strings;

import java.util.ArrayList;
import java.util.Locale;

public class VowelsAndConsonantsSubString {
    public static void main(String[] args) {
        String  A = "abec";
        System.out.println(solve(A));
    }
    public static int solve(String A) {
        int count = 0;
        int count1 = 0;
        ArrayList<Integer> PlaceOfVowel = new ArrayList<>();
        ArrayList<Integer> PlaceOfConsonant = new ArrayList<>();
        char z;
        for ( int i = 0; i < A.length(); i++) {
            z = A.charAt(i);
            if (z == 'a' || z == 'e' || z == 'i' || z == 'o' || z == 'u') {
                PlaceOfVowel.add(i);
            } else {
                PlaceOfConsonant.add(i);
            }
        }
        for ( int i = 0; i < PlaceOfVowel.size(); i++) {
            for ( int j = 0; j < PlaceOfConsonant.size(); j++) {
                if ( PlaceOfVowel.get(i) < PlaceOfConsonant.get(j)) {
                    count++;
                } if (PlaceOfConsonant.get(j) < PlaceOfVowel.get(i)){
                    count1++;
                }
            }
        }
        System.out.println(PlaceOfConsonant);
        System.out.println(PlaceOfVowel);
        return (count+count1) % (1000000000+7);
    }
}
