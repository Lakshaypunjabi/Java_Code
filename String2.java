//Access character of a String

public class String2 {
    public static void main(String[] args) {
        
        String firstName = "Tony";
        String lastName = "Stark";

        String fullName = firstName +"@"+ lastName;

        //CharAt
        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }
    }
}
