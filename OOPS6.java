//Access Modifiers in java

class Account{
    public String name;
    protected String email;
    private String password;

    //Getters & Setters
    
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String pass ){
        this.password = pass;
    }
}
public class OOPS6 {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Lakshay";
        account1.email ="lakshaylaksh01@gmail.com";
        account1.setPassword("abcd");
        System.out.println(account1.getPassword());
    }
}
