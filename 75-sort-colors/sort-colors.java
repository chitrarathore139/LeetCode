class Solution {
    public void sortColors(int[] nums) {
        for(int i=0; i<nums.length; i++){
            int j=i-1;
            while(j>=0 && nums[i]<nums[j]) j--;
            j+=1;
            int curr = nums[i];
            while(i>j){
                nums[i]=nums[i-1];
                i--;
            }
            nums[i]=curr;
        }
    }
}