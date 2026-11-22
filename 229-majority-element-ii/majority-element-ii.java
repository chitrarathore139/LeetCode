import java.util.ArrayList;
import java.util.List;
 
class Solution {
    // Returns all elements appearing more than one-third of the time.
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int threshold = n / 3;
        List<Integer> answer = new ArrayList<>();
 
        // Test the value at every index as a possible qualifying candidate.
        for (int candidateIndex = 0; candidateIndex < n; candidateIndex++) {
            int candidate = nums[candidateIndex];
            int frequency = 0;
 
            // Count the current candidate with an index-controlled full scan.
            for (int scanIndex = 0; scanIndex < n; scanIndex++) {
                // Equal values contribute to the candidate's frequency.
                if (nums[scanIndex] == candidate) {
                    frequency++;
                }
            }
 
            // Store a qualifying candidate only once.
            if (frequency > threshold && !answer.contains(candidate)) {
                answer.add(candidate);
            }
 
            // No third value can occur more than one-third of the time.
            if (answer.size() == 2) {
                break;
            }
        }
 
        return answer;
    }
}