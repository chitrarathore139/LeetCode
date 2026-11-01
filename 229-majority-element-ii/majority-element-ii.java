import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int threshold= n/3;
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
            if(e.getValue() > threshold){
                ans.add(e.getKey());
            }
        }
        return ans;
    }
}