import java.util.Arrays;
class Solution {
    public int[] transformArray(int[] nums) {
        int ans[]= new int[nums.length];
        int even=0;
        for(int num: nums){
            if(num%2==0) even++;
        }
        for (int i = even; i < nums.length; i++) {
            ans[i] = 1;
        }
        return ans;
    }
}