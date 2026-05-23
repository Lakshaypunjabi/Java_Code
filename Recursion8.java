//Tower of Hanoi Problem

public class Recursion8 {
    public static void towerofHanoi(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println("transfer disk" + n + "from" + src + "to" + dest);
            return ;
        }

        //transfer top n-1 from src to helper using dest as a "helper"
        towerofHanoi(n-1, src, dest, helper);   //Step 1

        //transfer nth from src to dest
        System.out.println("transfer disk" + n + "from" + src  + "to" + dest);  //Step 2

        //transfer top n-1 from helper to dest using src as a "helper"
        towerofHanoi(n-1, helper, src, dest);   //Step 3
    }
    public static void main(String[] args) {
        int n=3;
        towerofHanoi(n,"S","H","D");
    }
}
