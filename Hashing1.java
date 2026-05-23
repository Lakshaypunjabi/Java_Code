import java.util.HashSet;
import java.util.Iterator;
public class Hashing1 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        //Insert(ADD)
        set.add(1);
        set.add(2);
        set.add(3);
        //set.add(1);

        //Size
        System.out.println("Size of set is:"+set.size());

        //Search(Contains)
        if(set.contains(1)){
            System.out.println("Set Contains 1");
        }
        if(!set.contains(6)){
            System.out.println("does not contain 6");
        }

        //Delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("does not contains 1");
        }

        //Print All the Elements
        System.out.println(set);

        //Iteration

        //Method 1
        // Iterator it = set.iterator();

        // while (it.hasNext()) {
        //    System.out.println(it.next());
        // } 

        //Method 2
        for(Integer it : set){
            System.out.println(it);
        }

        //isEmpty
        if(!set.isEmpty()){
            System.out.println("Set is not Empty");
        }

    }
}
