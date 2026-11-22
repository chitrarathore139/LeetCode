
import java.util.*;

class Solution {
  public List<List<Integer>> fourSum(int[] nums, int target) {
    List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(nums);
    if (nums == null || nums.length < 4) {
            return list;
    }
    int n = nums.length;
    for (int low = 0; low < n - 3; low++) {
      if (low > 0 && nums[low] == nums[low - 1]) {
        continue;
      }
      for (int i = low + 1; i < n - 2; i++) {
        if (i > low + 1 && nums[i] == nums[i - 1]) {
          continue;
        }
        int j = i + 1;
        int high = n - 1;
        while (j < high) {
          long sum = (long) nums[low] + nums[i] + nums[j] + nums[high];
          if (sum == target) {
            list.add(Arrays.asList(nums[low], nums[i], nums[j], nums[high]));
            j++;
            high--;
            while (j < high && nums[j] == nums[j - 1]) {
              j++;
            }
            while (j < high && nums[high] == nums[high + 1]) {
              high--;
            }
          }
          else if (sum < target) {
            j++;
          }
          else {
            high--;
          }
        }
      }
    }
    return list;
  }
}