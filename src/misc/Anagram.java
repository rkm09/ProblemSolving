package misc;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String in1 = "!low-salt!";
        String in2 = "owls-lat!!";
        boolean res = isAnagram1(in1,in2);
        System.out.println(res);
    }
    public static boolean isAnagram1(String in1, String in2) {
        if(in1.length() != in2.length()) return false;
        char[] ch1 = in1.toCharArray();
        char[] ch2 = in2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }
}
