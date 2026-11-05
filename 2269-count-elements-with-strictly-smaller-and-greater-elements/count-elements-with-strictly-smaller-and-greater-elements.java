class Solution {
  public int countElements(int[] nums) {
    int smallest = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    for (int num : nums) {
      if (num > max) {
        max = num;
      }
      if (num < smallest) {
        smallest = num;
      }
    }

    int count = 0;

    for (int num : nums) {
      if (num > smallest && num < max) {
        count++;
      }
    }

    return count;
  }
}