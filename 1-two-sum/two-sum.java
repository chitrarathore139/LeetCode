class Solution {
  public int[] twoSum(int[] nums, int target) {
    int low = 0;
    int high = nums.length - 1;

    while (low < nums.length) {
      if (nums[low] + nums[high] == target) {
        return new int[]{low, high};
      }

      high--;

      if (high == low) {
        low++;
        high = nums.length - 1;
      }
    }

    return new int[]{};
  }
}