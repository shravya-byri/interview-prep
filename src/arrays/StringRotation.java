package arrays;

public class StringRotation {
    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "terbottlewat";
        System.out.println(isRotated(s1, s2));
    }
    static boolean isRotated(String s1, String s2) {
        String t = s2 + s2;
        return t.contains(s1);
    }
}
