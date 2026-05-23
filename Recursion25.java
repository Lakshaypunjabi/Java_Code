//we are a given string S, we need to find the count of all contiguous substrings starting and ending with same character to solve using recursion in java

public class Recursion25 {
    public static int countSubstrs(String str,int i, int j, int n){
        if(n == 1 || n <= 0){
            return n;
        }

        int res = countSubstrs(str , i+1 , j , n-1)+countSubstrs(str , i, j-1 , n-1)-countSubstrs(str, i+1 , j-1 , n-2);

        if(str.charAt(i) == str.charAt(j)){
            res++;
        }

        return res ;
        
    }
    public static void main(String[] args) {
        String str = "abcab";
        int n = str.length();
        System.out.println(countSubstrs(str, 0, n-1, n));
    } 
}
