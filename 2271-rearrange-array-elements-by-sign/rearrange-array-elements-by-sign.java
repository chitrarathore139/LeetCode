class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> listOdd=new ArrayList<>();
        ArrayList<Integer> listEven=new ArrayList<>();
        int[] ans= new int[nums.length];
        for(int i: nums){
            if(i<0){
                listOdd.add(i);
            }
            else{
                listEven.add(i);
            }
        }
        int j=0;
        for(int i=0;i<nums.length;i+=2){
            ans[i]=listEven.get(j);
            ans[i+1]=listOdd.get(j);
            j++;
        }
        return ans;
    }
}