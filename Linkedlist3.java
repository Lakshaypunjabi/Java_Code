//Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3).
// Search for the number 7 & display its index.


import java.util.LinkedList;

public class Linkedlist3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(3);

        int element = 7;

        int ans = -1;
        for(int i=0;i<list.size();i++){

            int LLElement = list.get(i);

            if(LLElement == element){
                ans = i;
                break;
            }
        }

        if(ans == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index:"+ans);
        }
    }
    
}
