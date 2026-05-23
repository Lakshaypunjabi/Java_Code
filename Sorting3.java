//Sorting for Insertion Sort

class Sorting3 {
   public static void printArray(int arr[]) {
       for(int i=0; i<arr.length; i++) {
           System.out.print(arr[i]+" ");
       }
       System.out.println();
   }


   public static void main(String args[]) {
       int arr[] = {7, 8, 1, 3, 2};
    
         //Time Complexity : O(n^2)
         
         for(int i=1; i<arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1; 

            //finding out the correct position to insert
            while(prev >= 0 && arr[prev] > curr) {
                //Keep swapping
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion code
             arr[prev+1] = curr;
        }
        printArray(arr);
   }
}
