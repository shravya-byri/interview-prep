public class test1 {
    public static void main(String[] args) {
        String A = "aabababa";
        String B = "ba";
        System.out.println(solve(A,B)) ;
    }
    public static int solve(String A, String B) {
        for ( int i = 0; i < A.length(); i = i + B.length()) {
            if (isPresent(A,B,i,i+B.length()-1)){
                return i+1;
            }

        }
        return -1;


    }
    public static boolean isPresent(String A, String B,int start, int end) {
        int j = 0;
        int i = 0;
        for(i = start; i < end; i++) {
            if (A.charAt(i) == B.charAt(j)) {
                j++;
            } else return false;
        }
        return true;


    }

}
