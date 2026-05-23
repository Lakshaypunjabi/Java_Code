//Fora given integer array of size N.You have to find  all the occurences(indices)
//of a given element(key) and print them. Use recursive function to solve this problem

public class Recursion22 {
    public static void allOccurences(int arr[],int key, int i){
        if(i == arr.length){//Base case
            return;
        }

        //Kaam
        if(arr[i] == key){
            System.out.print(i+" ");
        }
        allOccurences(arr, key, i+1);

    }
    public static void main(String[] args) {
        int arr[]= {3,2,4,5,6,2,7,2,2};
        allOccurences(arr, 2, 0);
        System.out.println();
    }
}
