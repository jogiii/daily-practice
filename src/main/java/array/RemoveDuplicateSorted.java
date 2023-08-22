package array;

public class RemoveDuplicateSorted {

    /*
    Given a sorted array nums, remove the duplicates in-place such that each element
    appears only once and returns the new length. Do not allocate extra space for another array;
     you must do this by modifying the input array in-place with O(1) extra memory.
    Example:
        Input: nums = [1, 1, 2]
        Output: 2
     */

    public static int removeDuplicates(int[] nums) {
//        int n = nums.length;
//        int count =0;
//        int temp;
//        for(int i=0;i<n-1;i++){
//            if(nums[i]==nums[i+1]){
//               temp = nums[i+1];
//               nums[i+1] = nums[n-1];
//               nums[n-1] =temp;
//                count++;
//            }
//
//        }
//        return n - count;
        if (nums.length == 0) {
            return 0;
        }

        int j =1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[j] = nums[i+1];
                j++;
            }


        }
        return j;
    }

    public static void main(String[] args) {
        int[]  nums = {0,0,1,1,1,2,2,3,3,4};
       int count= removeDuplicates(nums);
        System.out.println(count);
    }

}
