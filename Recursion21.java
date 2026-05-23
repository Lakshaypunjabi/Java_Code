//Print all Subsets of a Set of first n natural numbers

import java.util.*;
public class Recursion21 {
    public static void printSubsets(ArrayList<Integer>Subset){

        for(int i=0; i<Subset.size(); i++){
            System.out.print(Subset.get(i));//Print all Elements
        }
        System.out.println();
    }
    public static void findSubsets(int n, ArrayList<Integer>Subset){
        if(n == 0){
            printSubsets(Subset);
            return;
        }

        //Add hoga 
        Subset.add(n);
        findSubsets(n-1, Subset);

        //Add nhi hoga
        Subset.remove(Subset.size()-1);
        findSubsets(n-1, Subset);
    }
    public static void main(String[] args){
        int n=3;
        ArrayList<Integer> Subset= new ArrayList<>();
        findSubsets(n , Subset);
    }
}
