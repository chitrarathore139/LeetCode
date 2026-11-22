import java.util.*;

class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(nums);

    for (int low = 0; low < nums.length - 2; low++) {

      if (low > 0 && nums[low] == nums[low - 1]) {
        continue;
      }

      int i = low + 1;
      int high = nums.length - 1;

      while (i < high) {
        int sum = nums[low] + nums[i] + nums[high];

        if (sum == 0) {
          list.add(Arrays.asList(nums[low], nums[i], nums[high]));

          i++;
          high--;

          while (i < high && nums[i] == nums[i - 1]) {
            i++;
          }

          while (i < high && nums[high] == nums[high + 1]) {
            high--;
          }
        }
        else if (sum < 0) {
          i++;
        }
        else {
          high--;
        }
      }
    }

    return list;
  }
}