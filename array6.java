//Find the missing number in array

public class array6 {
    public static void missingNumber(int arr[], int n){
        int totalSum = n*(n+1)/2;
        int arrSum = 0;

        for(int i=0;i<arr.length;i++){
            arrSum += arr[i];
            
        }
        int missing = totalSum - arrSum;
        System.out.println("Missing number is:" + missing); 
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6,7};
       
        int n=7;

        missingNumber(arr, n);

       
    }
}