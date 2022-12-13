package misc;

import java.util.HashMap;
import java.util.Map;

public class Reverse {
    public static void main(String[] args) {
//        System.out.println("hello");
//        String k = reverse("abc");
//        System.out.println(k);
//        int k = firstUniqChar("aabb");
//        Boolean k = isPalindrome(121);
//        int[] res = twoSum()
        //int[] k  = new int[]{0,0,1,1,1,2,2,3,3,4};
        String res = longestCommonPrefix1(new String[] {"fl","flow","fleet"});
        //int res = removeDuplicates(k);
        System.out.println(res);
    }
    public static String reverse(String str) {
        String[] strar = str.split("");
        StringBuilder sb = new StringBuilder();
        for(int i = strar.length - 1 ; i > -1 ; i--) {
            sb.append(strar[i]);
        }
        return sb.toString();
    }
    public static void reverseRec(String str) {
        if(str == null || str.length() <= 1) {
            System.out.println(str);
        } else {
            System.out.println(str.charAt(str.length() -1));
            reverseRec(str.substring(0,str.length()-1));
        }
    }
    public static int firstUniqChar(String s) {
        String orig = s;
        for(int i = 0 ; i < s.length() ; ) {
            if(s.substring(i+1,s.length()).contains(String.valueOf(s.charAt(i)))) {
                s = s.replace(String.valueOf(s.charAt(i)),"");
                continue;
            } else {
                if(s.length() == 0) return -1;
                return orig.indexOf(s.charAt(i));
            }
        }return -1;
    }
    public static int firstUniqChar1(String s) {
        HashMap<Character,Integer> hs = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++) {
            hs.put(s.charAt(i),hs.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i = 0 ; i < hs.size() ; i++) {
            if(hs.get(s.charAt(i)) == 1) return i;
        }return -1;
    }
    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        if(String.valueOf(str.charAt(0)).equals("-")) return false;
        for(int i = 0 ; i < str.length()/2 ; i++) {
            if (String.valueOf(str.charAt(i)).equals(String.valueOf(str.charAt(str.length() - i - 1))))
                continue;
            else return false;
        }
        return true;
    }
    public static boolean isPalindrome1(int x) {
        //12321
        if(x < 0  || x != 0 && x%10 == 0) return false;
        int revert = 0;
        while(x > revert) {
            revert = revert * 10 + x % 10;
            x /= 10;
        }
        return x == revert || x == revert/10;
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i+1 ; j < nums.length ; j++) {
                if(nums[i]+nums[j] == target) {
                    return new int[] {i,j};
                }
            }
        } return null;
    }
    public int[] twoSum1(int[] nums, int target) {
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++) {
            hm.put(nums[i],i);
        }
        for(int i = 0 ; i < nums.length ; i++) {
            int complement = target - nums[i] ;
            if(hm.containsKey(complement) && hm.get(complement) != i)
                return new int[] {i,hm.get(complement)};
        }return null;
    }
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++) {
            int complement = target - nums[i] ;
            if(hm.containsKey(complement) && hm.get(complement) != i)
                return new int[] {i,hm.get(complement)};
            hm.put(nums[i],i);
        }return null;
    }
    public static int removeDuplicates(int[] nums) {
        int i = 0 ;
        for(int j = 1 ; j < nums.length ; j++) {
            if(nums[i] == nums[j]) continue;
            else {
                nums[i+1] = nums[j];
            }
            i++;
        }return i+1;
    }
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int i = 0; int len = 1;
        if(strs.length == 1) return strs[0];
        int min = 0;
        for(int k = 0 ; k < strs.length ; k++) {
            if(strs[k].length()==0) return "";
            if(strs[k].length() < strs[min].length()) min = k;
        }
        for(int j = 1 ; j < strs.length ; j++) {
            if(i == strs[min].length()) break;
            if(strs[0].charAt(i) == strs[j].charAt(i)) {
                len++;
                if(len == strs.length && i < strs[0].length()) {
                    sb.append(strs[0].charAt(i));len = 1;i++;j=0;
                }
                if(i == strs[0].length() || i == strs[j+1].length()) break;
            } else break;
        }return sb.toString();
    }

    public static String longestCommonPrefix1(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        return longestCommonPrefix1(strs, 0 , strs.length - 1);
    }

    private static String longestCommonPrefix1(String[] strs, int l, int r) {
        if (l == r) {
            return strs[l];
        }
        else {
            int mid = (l + r)/2;
            String lcpLeft =   longestCommonPrefix1(strs, l , mid);
            String lcpRight =  longestCommonPrefix1(strs, mid + 1,r);
            return commonPrefix(lcpLeft, lcpRight);
        }
    }

    static String commonPrefix(String left,String right) {
        int min = Math.min(left.length(), right.length());
        for (int i = 0; i < min; i++) {
            if ( left.charAt(i) != right.charAt(i) )
                return left.substring(0, i);
        }
        return left.substring(0, min);
    }


}
