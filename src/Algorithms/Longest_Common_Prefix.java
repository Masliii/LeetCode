package Algorithms;

public class Longest_Common_Prefix {

    public static void main(String[] args) {
        String[] strs = {"fluwer","fluo","dfluoswa"};
        String s = longestCommonPrefix(strs);
        System.out.println("Hello World!"+s);
    }


    public static String longestCommonPrefix(String[] strs) {

        if(strs.length == 0){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }

        int shortest = strs[0].length();
        for(String s : strs){
            if(s.length() < shortest){
                shortest = s.length();
            }
        }

        StringBuffer sb = new StringBuffer();

        int index = 0;
        while(index < strs.length){
            for(int i = 0;i<strs.length;i++){
                if(i < strs.length - 1){
                    if(strs[i].charAt(index) != strs[i+1].charAt(index)){
                        return sb.toString();
                    }
                }
                if(i == strs.length - 1){
                    sb.append(strs[i].charAt(index));
                }
            }

            index++;
        }
        return sb.toString();
    }
}

