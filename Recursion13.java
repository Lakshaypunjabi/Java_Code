//Remove duplicate of a String

public class Recursion13 {
    public static String removeDuplicate(String str, int idx, boolean present[]){
        if(idx == str.length()){
            return " ";
        }
        
        char currChar = str.charAt(idx);

        if(present[currChar - 'a'] == true){
            return removeDuplicate(str, idx+1, present);
        }else{
            present[currChar - 'a'] = true;
            return currChar + removeDuplicate(str, idx+1, present);
        }
    }   
    public static void main(String[] args) {
        String str = "abbccda";
        boolean present[] = new boolean[str.length()];
        System.out.println(removeDuplicate(str, 0, present));
    } 
}
