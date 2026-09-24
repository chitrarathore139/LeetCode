class Solution {
    public int sum(int n){
        int sumOfDigits=0;
        while(n>0){
            sumOfDigits+=n%10;
            n=n/10;
        }
        return sumOfDigits;
    }
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=9 && i==nums[i]){
                return i;
            }else if(nums[i]>=10 && sum(nums[i])==i){
                return i;
            }
        }
        return -1;
    }
}