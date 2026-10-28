class Solution {
  public int lengthOfLongestSubstring(String s) {
    Set<Character> set = new HashSet<>();
    int maxLen = 0;
    int len = 0;
    int left = 0;

    for (int i = 0; i < s.length(); i++) {
      while (set.contains(s.charAt(i))) {
        set.remove(s.charAt(left));
        left++;
        len--;
      }

      set.add(s.charAt(i));
      len++;

      if (maxLen < len) {
        maxLen = len;
      }
    }

    return maxLen;
  }
}