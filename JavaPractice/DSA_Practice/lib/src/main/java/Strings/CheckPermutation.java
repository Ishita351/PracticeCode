package Strings;
import java.util.Arrays;

public class CheckPermutation {
    public static String sortString(String str){
        char[] content= str.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }
    static boolean permutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        return sortString(s1).equals(sortString(s2));
    }
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        String s3 = "hello";
        String s4 = "olleh";

        System.out.println( permutation(s1, s2)); // true
        System.out.println(permutation(s1, s3));  // false
        System.out.println(permutation(s4, s3));  // true
    }
}
