package org.example;

public class Sol5 {
    public int maxSubArray(int[] nums) {
        int maxCurrent = nums[0];
        int maxSum = nums[0];
        for (int i=1; i< nums.length; i++){
            maxCurrent = Math.max(maxCurrent + nums[i],nums[i]);
            maxSum = Math.max(maxSum, maxCurrent);
        }
        return maxSum;
    }
}

