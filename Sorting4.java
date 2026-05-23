//Merge Sorting

public class Sorting4 {
    public static void conquer(int arr[],int si,int mid,int ei){
        int merged[] = new int[ei - si + 1];   //temporary array
        int idx1 = si;                         //Iterator for left part
        int idx2 = mid+1;                      //Iterator for right part
        int x = 0;                             ////Iterator for temp arr

        while(idx1 <= mid && idx2 <= ei ){
            if(arr[idx1] <= arr[idx2]){
                merged[x++] = arr[idx1++];
            }
            else{
                merged[x++] = arr[idx2++];
            }
        }
        
        //left part
        while(idx1 <= mid){
            merged[x++] = arr[idx1++];
        }
        //right part
         while(idx2 <= ei){
            merged[x++] = arr[idx2++];
        }

        //Copy temp to original arr
        for(int i= 0,j= si ; i<merged.length;i++,j++){
            arr[j] = merged[i];
        }

    }    

    public static void divide(int arr[],int si, int ei){
        if(si >= ei){
            return;
        }

        int mid = si + (ei - si)/2;//(si+ei)/2
        divide(arr, si, mid);      //left part
        divide(arr, mid+1 , ei);   //right prt
        conquer(arr, si, mid, ei);
    }

    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length;

        divide(arr, 0, n-1);

        //Print
        for(int i=0 ; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}


//Time complexity:O(nlogn)