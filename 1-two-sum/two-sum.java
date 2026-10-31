import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int l = 0, r = nums.length - 1;
        while(l <= r){
            if(map.containsKey(target - nums[l])){
                return new int[] {l, map.get(target - nums[l])};
            }
            map.put(nums[l], l);
            if(map.containsKey(target - nums[r])){
                return new int[] {r, map.get(target - nums[r])};
            }
            map.put(nums[r], r);
            l++;
            r--;
        }
        return new int[] {};
    }
}