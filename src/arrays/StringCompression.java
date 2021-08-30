package arrays;

public class StringCompression {
    public static void main(String[] args) {
        String s = "aabbcccccccc";
        System.out.println(updateCompressedString(s));
    }
    static String updateCompressedString(String s){
//        String s2 = "";
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;
        int count = 0;
        while(j < s.length()){
            if (s.charAt(i) == s.charAt(j)) {
                count++;
                j++;
            }else {
                sb.append(s.charAt(i) + count);
//                s2 = s2 + s.charAt(i)+ count;
                i = j;
                count = 0;
            }
        }
        if (count > 0) {
//            s2 = s2 + s.charAt(j-1) + count;
            sb.append(s.charAt(j-1) + count);
        }

        if (s.length() > sb.length()){
            return sb.toString();
        } else return s;

    }
}
