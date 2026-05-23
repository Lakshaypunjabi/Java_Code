//Print the Subsequence of a String

public class Recursion14 {
    public static void Subsequences(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        
        char currChar = str.charAt(idx);

        //Choose a is part of this
        Subsequences(str, idx+1, newString + currChar);

        //don't Choose a is part of this
        Subsequences(str, idx+1, newString);
    }
    public static void main(String[] args) {
        String str = "abc";
        Subsequences(str, 0, "");
    }
}
