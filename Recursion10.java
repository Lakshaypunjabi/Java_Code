//Find the first and last occurence of an element in String

public class Recursion10 {
    public static int first = -1;         //Invalid value
    public static int last = -1;          //Invalid value

    public static void findOccurence(String str, int idx, char element){
        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currchar = str.charAt(idx);
        if(currchar == element){
            if(first == -1){
                first = idx;
            }else{
                last = idx;
            }
        }
        findOccurence(str, idx+1, element);
    }

    public static void main(String[] args) {
        String str = "abaacdaefaah";
        findOccurence(str,0, 'a');
    }
}
