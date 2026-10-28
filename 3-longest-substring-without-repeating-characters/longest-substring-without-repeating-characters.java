class Solution {
    public int lengthOfLongestSubstring(String s) {
        Queue<Character> q = new LinkedList<>();
        int maxLen = 0;
        int len = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            while (q.contains(ch)) {
                q.poll();
                len--;
            }

            q.offer(ch);
            len++;

            maxLen = Math.max(maxLen, len);
        }

        return maxLen;
    }
}