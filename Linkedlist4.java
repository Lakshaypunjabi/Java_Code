//Take elements(numbers in the range of 1-50) of a Linked List as input from the user. 
//Delete all nodes which have values greater than 25

import java.util.LinkedList;
import java.util.Scanner;

public class Linkedlist4 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        Scanner sc = new Scanner(System.in);

        //Input
        for(int i=0; i<=10; i++){
            list.add(i, sc.nextInt());
        }
        sc.close();
        System.out.println(list);

        //Output
        for(int i= list.size() - 1;i>=0;i--){
            if((int) list.get(i) > 25){
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
