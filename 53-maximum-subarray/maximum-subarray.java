class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0){
            return -1;
        }
        int currentSum = nums[0];
        int maxsofar = nums[0];
        for(int i = 1; i < nums.length; i++){
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxsofar = Math.max(maxsofar, currentSum);
        }    
        return maxsofar;
    }
}