import java.util.Arrays;
class Solution {
    public int[] transformArray(int[] nums) {
        int ans[]= new int[nums.length];
        int odd=0;
        int even=0;
        for(int num: nums){
            if(num%2==0){
                even++;
            }
            else
            odd++;
        }
        int index=0;
        while(even>0){
            ans[index]=0;
            even--;
            index++;
        }
        while(odd>0){
            ans[index]=1;
            odd--;
            index++;
        }
        return ans;
    }
}