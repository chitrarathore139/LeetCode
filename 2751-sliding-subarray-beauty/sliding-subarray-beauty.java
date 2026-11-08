class Solution {

    public int findBeauty(int[] freq, int x){
        int count=0;
        for(int i=0;i<50;i++){
            count+=freq[i];
            if(count>=x){
                return i-50;
            }
        }
        return 0;
    }

    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int n=nums.length;
        int freq[]=new int[101];
        int ans[]= new int[n-k+1];
        for(int i=0;i<k;i++){
            freq[nums[i]+50]++;
        }

        ans[0]= findBeauty(freq,x);

        for(int i=k;i<n;i++){
            freq[nums[i-k]+50]--;
            freq[nums[i]+50]++;
            ans[i-k+1]= findBeauty(freq,x);
        }
        return ans;
    }
}