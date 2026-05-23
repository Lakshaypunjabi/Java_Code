//Reverse an array 

public class array5 {
    public static void reverseArray(int arr[], int len){
        for(int i=0;i<len/2;i++){

            //Swapping
            int temp = arr[i];
            arr[i] = arr[len-i-1];
            arr[len-i-1] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int len = arr.length;

        reverseArray(arr, len);

        System.out.println("Reverse array");
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
