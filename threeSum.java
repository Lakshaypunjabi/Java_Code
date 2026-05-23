import java.util.*;
class threeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();

         for (int i = 0; i < n - 2; i++) {
            int low = i + 1;
            int high = n - 1;

            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];

                if (sum == 0) {
                    set.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    high--;
                } else if (sum < 0) {
                    low++;
                } else {
                    high--;
                }
            }
        }

        return new ArrayList<>(set);
    
    }
    public static void main(String[] args){
        int nums[] = {-1, 0, 1, 2, -1, -4};
        threeSum(nums);
    }
}