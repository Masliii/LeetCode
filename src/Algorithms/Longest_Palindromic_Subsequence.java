package Algorithms;

public class Longest_Palindromic_Subsequence {

    public static void main(String[] args) {
        String str = "ac" ;
        String res = longestPalindrome(str);
        System.out.println(res);
    }

    public static String longestPalindrome(String s) {

        if(s == null || s.length() == 0 || s.length() == 1){
            return s;
        }

        char[] chars = s.toCharArray();
        int length = chars.length;

        int left = 0;
        int right = 0;
        int leftMax = 0;
        int max = 1;

        for(int i = 0;i < length-1;i++){
            left = i;
            right = length-1;
            while(left<right){
                if(isString(chars,left,right)){
                    if(max < right-left+1) {
                        max = right - left + 1;
                        leftMax = left;
                    }
                    break;
                }
                right--;
            }
        }
        //public String(char value[], int offset, int count)
        return new String(chars,leftMax,max);

    }

    private static boolean isString(char[] chars, int left, int right) {

        while(left<right){
            if(chars[left] == chars[right]){
                left ++;
                right --;
            }else{
                return false;
            }
        }

        return true;
    }
}
