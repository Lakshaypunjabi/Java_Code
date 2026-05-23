//Sorting for Bubble Sort: 

class Sorting1 {

    //Time Complexity:O(n^2)
    //bubble sort
    public static void bubbleSort(int arr[]){
    for(int i=0; i<arr.length-1; i++) {
        for(int j=0; j<arr.length-i-1; j++) {
            if(arr[j] > arr[j+1]) {
                //swap
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}

   public static void printArray(int arr[]) {
       for(int i=0; i<arr.length; i++) {
           System.out.print(arr[i]+" ");
       }
       System.out.println();
   }


   public static void main(String args[]) { 
       int arr[] = {7, 8, 1, 3, 2};


        bubbleSort(arr);
        printArray(arr);
   }
}
