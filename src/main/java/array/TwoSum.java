package array;

import java.util.HashMap;

public class TwoSum {
    /*

    Given an array of integers nums and an integer target,
    return indices of the two nums such that they add up to target.
    You may assume that each input would have exactly one solution,
    and you may not use the same element twice.
        Examples
            Input: nums = [2,7,11,15], target = 9
            [7,2,-3,-6]
            Output: [0,1]
            Output: Because nums[0] + nums[1] == 9, we return [0, 1]

            Input: nums = [3,2,4], target = 6
            [-3,-4,-2]
            Output: [1,2]


     */

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){

            Integer diff = (Integer)(target - nums[i]);
            if(hash.containsKey(diff)){
                int toReturn[] = {hash.get(diff), i};
                return toReturn;
            }

            hash.put(nums[i], i);

        }

        return null;

    }


    public static void main(String[] args) {

        int[] nums = {2,7,11,15};

        System.out.println(twoSum(nums,9));
    }
}
