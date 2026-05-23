//Quick Sorting
public class Sorting5 {
    public static int partition(int arr[] , int low, int high){
        int pivot = arr[high];
        int i = low-1;//To make a place foR element smaller then pivot
        
        for(int j=low; j<high; j++){
            if(arr[j] <= pivot){
                i++;

                //Swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        //Swap with Pivot
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }
    public static void quickSort(int arr[] , int low, int high){
        if(low < high){
            int pidx = partition(arr, low, high);

            quickSort(arr, low, pidx-1);//Left part
            quickSort(arr, pidx+1, high);//right part
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length;

        quickSort(arr, 0 , n-1);

        //Print
        for(int i=0 ; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}

//Time complexity average case:O(nlogn)
//Time complexity worst case:O(n^2)
//Space Complexity:O(1)