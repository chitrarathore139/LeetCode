class Solution {
  public int maxSubArray(int[] nums) {
    int currentSum = 0;
    int maxsofar = Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; i++) {
      currentSum += nums[i];
      maxsofar = Math.max(maxsofar, currentSum);
      if(currentSum < 0){
        currentSum = 0;
      }
    }
    return maxsofar;
  }
}