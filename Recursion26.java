public class Recursion26 {
    public static int findDuplicate(int arr[], int idx){
        if(idx == arr.length - 1){//base case
            return -1;
        }

        //kaam
        int currentNum= arr[idx];

        for(int i=idx+1 ;i<arr.length;i++){
            if(currentNum == arr[i]){
                return currentNum;
            }
        }

        //check the next element(Recursively)
       return findDuplicate(arr, idx+1);
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,4};
        System.out.println(findDuplicate(arr, 0));
    }
}
