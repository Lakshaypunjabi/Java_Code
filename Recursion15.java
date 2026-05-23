//Print all the Unique subsequence of a String 

import java.util.HashSet;

public class Recursion15 {
    public static void Subsequences(String str, int idx, String newString,HashSet<String> set){

        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        char currChar = str.charAt(idx);

        //Choose
        Subsequences(str, idx+1, newString + currChar, set);

        //dont Choose
        Subsequences(str, idx+1, newString, set);

    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        Subsequences(str, 0, "",set);
    }
}

