import java.util.*;

import javax.swing.event.InternalFrameAdapter;
public class Hashing2 {
    public static void main(String[] args) {

        //Country(key) , Population(value )
        HashMap<String,Integer> map = new HashMap<>();

        //Insertion
        map.put("China",120 );
        map.put("US", 30);
        map.put("India", 150);

        System.out.println(map);

        //Change the Value
        map.put("China", 130);
        System.out.println(map);

        //Searching
        if(map.containsKey("China")){
            System.out.println("key is present in the map");
        }
        else{
            System.out.println("key is not present im the map");
        }

        //Value
        System.out.println(map.get("China"));//Key exists
        System.out.println(map.get("Indonesia"));//Key doesn't exist

        //Iteration(Method 1)
        for(Map.Entry<String,Integer> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //Iteration(Method 2)
        Set<String> keys = map.keySet();
        for(String Key : keys){
            System.out.println(Key+" "+map.get(Key));
        }

        //Removing
        map.remove("China");
        System.out.println(map);
    }    
}
