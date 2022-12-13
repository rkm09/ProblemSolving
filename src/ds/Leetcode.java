package ds;

import java.util.Arrays;

public class Leetcode {

    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        int[] res = plusOne(arr);
        System.out.println(Arrays.toString(res));
    }

    public static int[] plusOne(int[] digits) {
        int lastIndex = digits.length - 1;
        if (digits[lastIndex] != 9) {
            digits[lastIndex] = digits[lastIndex] + 1;
            return digits;
        } else {
            for (int i = lastIndex ; i >= 0; i--) {
                if(digits[i] == 9){digits[i] = 0;}
                else {
                    digits[i] = digits[i]+1; break;
                }
            }
        }
        if(digits[0] == 0) {
            int[] result = new int[digits.length+1];
            result[0] = 1;
            for(int i = 1 ; i < result.length ; i++) {
                result[i] = 0;
            }
            return result;
        }
        return digits;
    }
}
