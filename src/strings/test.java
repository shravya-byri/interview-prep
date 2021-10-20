package strings;

public class test {
    public static void main(String[] args) {
        String A = "abbca";
        System.out.println(solve(A));
    }
    public static int solve(String A) {

        int l = A.length(), prev=0;
        long res=0;
        boolean flag=true;
        for(int i = 0; i < l; i++) {
            char c = A.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                res+=(i-prev++);
            }else {
                res+=prev;
            }
            res%=1000000007;
            // System.out.println(i+":"+res);
        }
        return (int)res;

    }
}