import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans= new ArrayList<>();
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i : nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            if(e.getValue() > nums.length/3){
                ans.add(e.getKey());
            }
        }
        return ans;
    }
}